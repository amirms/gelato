/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;

import org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisType;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.IntraproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.ReturnSite;
import org.servicifi.gelato.analysis.framework.commons.Start;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.ProcedureFlow;
import org.servicifi.gelato.analysis.framework.graphs.RegularFlow;
import org.servicifi.gelato.analysis.framework.procedures.Procedure;
import org.servicifi.gelato.analysis.framework.procedures.ProcedureCall;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Intraprocedural Analysis</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class IntraproceduralAnalysisImpl extends AnalysisImpl implements IntraproceduralAnalysis {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IntraproceduralAnalysisImpl() {
		super();
	}

	protected IntraproceduralAnalysisImpl(EList<Flow> cfg, AnalysisConfiguration configuration) {
		super(cfg, configuration);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.INTRAPROCEDURAL_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Map<Double, ExitEntryPair> performAnalysis() {

		Map<Double, ExitEntryPair> map = new HashMap<Double, ExitEntryPair>();
		Queue<LabellableElement> worklist = new LinkedList<>();

		// for every node in cfg, insert in the worklist
		// The first edge must be from START
		// TODO depends on the direction of analysis. correct?

//		System.out.println("cfg.get(0): " + cfg.get(0));

		// FIXME if direction is backwards??????
		worklist.add((LabellableElement) cfg.get(0).getTo());

		LabellableElement workElement = null;

		while (!worklist.isEmpty()) {

			workElement = worklist.poll();

			System.out.println("Polling worklist. Current element is " + workElement);

			// get the last iteration
//			int curIteration = 0;
//			if (iterationmap.containsKey(workElement))
//				curIteration = iterationmap.get(workElement) + 1;

//			iterationmap.put(workElement, curIteration);

			EList<AnalysisResult> entry = entry(workElement);
			EList<AnalysisResult> exit = exit(workElement);

			ExitEntryPair pair = AnalysesFactory.eINSTANCE.createExitEntryPair(exit, entry);
			// Add elements to worklist
			// if old != new
			if (map.containsKey(workElement.getLabel())) {
				System.out.println("map size is: " + map.size());
				System.out.println(map.get(workElement.getLabel()));

				System.out.println("Exit[" + workElement.getLabel() + "]:" + map.get(workElement.getLabel()).getExit());
				System.out.println("pair.exit:" + pair.getExit());

				// Same information, stop propagating. Nothing has changed.
				if (map.get(workElement.getLabel()).getExit().equals(pair.getExit()))
					continue;
			}

			map.put(workElement.getLabel(), pair);
//			System.out.println(workElement);
			EList<LabellableElement> nodes = getAllNodesWithDirection(workElement, configuration.getDirection(),
					Flow.class);

			System.out.println("Adding nodes: " + nodes);
//			System.out.println(nodes.size());

			worklist.addAll(nodes);
		}

		// FIXME remove all start and end nodes
		map.remove(new Double(0)); // the label for the start node
		map.remove(new Double(Double.MAX_VALUE)); // the label for the start node
		result = map;
		return map;
	}

	@Override
	public EList<AnalysisResult> entry(LabellableElement e) {
		if (e instanceof Start) {
			return new UniqueEList<>();
		}

		// res must be TreeSet
		EList<AnalysisResult> res = new UniqueEList<>();
		// TODO should this be `configuration.getDirection()`?
		// configuration.getDirection().reverse()
		// if configuration.getDirection().equals(AnalysisDirection.Forwards)
		// return AnalysisDirection.Backwards else return AnalysisDirection.Forwards

		// reverse the direction of the analysis
		AnalysisDirection direction = configuration.getDirection().equals(AnalysisDirection.BACKWARDS)
				? AnalysisDirection.FORWARDS
				: AnalysisDirection.BACKWARDS;

		for (LabellableElement workElement : getAllNodesWithDirection(e, direction, RegularFlow.class)) {
			EList<AnalysisResult> x = getExitTable().get(workElement);
			if (x == null) {
				x = new UniqueEList<>();
			}
			
			res.addAll(x);

			if (workElement instanceof ReturnSite)
				res.addAll(alphaConvert((ReturnSite) workElement, direction));
		}

		// if this is entry to a procedure,
		// first add results through translation of actual parameters (arguments) to
		// formal parameters

		// TODO
		if (e instanceof Procedure)
			for (LabellableElement workElement : getAllNodesWithDirection(e, direction, ProcedureFlow.class)) {
				EList<AnalysisResult> x = getExitTable().get(workElement); // this must be just before calling the
																			// procedure call
				// Consider scoping rules
				if (x == null) {
					x = new UniqueEList<>();
				} else {
					// translate actual arguments to formal parameters
					ProcedureCall call = (ProcedureCall) workElement;
					Procedure callee = (Procedure) e;

					call.translateActualToFormalParameters(x, callee);
				}

				res.addAll(x);
			}

		// join them with the current new ones
		// this is the meet operator
		// TODO ask the analysis meet() to join analysis results
		EList<AnalysisResult> curEntry = new UniqueEList<AnalysisResult>();
		if (getEntryTable().containsKey(e))
			curEntry.addAll(getEntryTable().get(e));

		curEntry.addAll(res);

		getEntryTable().put(e, curEntry);

		return res;
	}

	@Override
	public EList<AnalysisResult> exit(LabellableElement e) {
		if (e instanceof Start) {
			return new UniqueEList<>();
		}

		EList<AnalysisResult> res = getEntryTable().get(e);

		if (res == null) {
			res = new UniqueEList<>();
		}
		for (AnalysisResult ar : e.kill(configuration)) {
			res.remove(ar);
		}

		res.addAll(e.gen(configuration));

		// TreeSet or UniqueEList
		res = new UniqueEList<>(res);

		getExitTable().put(e, res);

		return res;
	}

	@Override
	public EList<AnalysisResult> meet(EList<EList<AnalysisResult>> exits) {
		EList<AnalysisResult> res = new UniqueEList<>();

		// TODO implemet me
		if (this.configuration.getAnalysisType().equals(AnalysisType.MUST)) {

		} else { // if it is a may analysis

		}

		return res;
	}

	public EList<AnalysisResult> alphaConvert(ReturnSite returnsite, AnalysisDirection direction) {
		EList<AnalysisResult> res = new UniqueEList<>();

		for (LabellableElement workElement : getAllNodesWithDirection(returnsite, direction, ProcedureFlow.class)) {
			EList<AnalysisResult> x = getExitTable().get(workElement); // this must be from the callee procedure
			// Consider scoping rules
			if (x == null) {
				x = new UniqueEList<>();
			} else {
				// rename variables and join
				// get the containing procedure of the work element
//					EObject container = workElement.eContainer();
//					while (!(container instanceof Procedure))
//						container = container.eContainer();
				ProcedureCall call = (ProcedureCall) returnsite.eContainer();

				call.alphaConvert(x);
			}

			res.addAll(x);
		}

		return res;
	}

} // IntraproceduralAnalysisImpl
