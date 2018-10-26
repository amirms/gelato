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
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.IntraproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Start;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.RegularFlow;

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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.INTRAPROCEDURAL_ANALYSIS;
	}

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 */
//	@Override
//	public Map<Long, ExitEntryPair> performAnalysis() {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		Map<Long, ExitEntryPair> map = new HashMap<Long, ExitEntryPair>();
//		for (int i = 0; i < this.cfg.size(); i++) {
//			map = new TreeMap<>();
//			for (Flow f : this.cfg) {
//				// FIXME replace it with the factory
//				ExitEntryPair pair = new ExitEntryPairImpl(exit(f.getFrom(), i), entry(f.getFrom(), i));
//				map.put(f.getFrom().getLabel(), pair);
//			}
//		}
//
//		map.remove(1); // Thats the Program.START one
//		map.remove(2); // Thats the Program.END one
//		result = map;
//		return map;
//	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<Long, ExitEntryPair> performAnalysis() {
		
		Map<Long, ExitEntryPair> map = new HashMap<Long, ExitEntryPair>();
		Queue<LabellableElement> worklist = new LinkedList<>();
	
		//for every node in cfg, insert in the worklist
		//The first edge must be from START
		
		worklist.add((LabellableElement)cfg.get(0).getFrom());
		
		LabellableElement workElement = null;
		
		while (!worklist.isEmpty()){
			
			workElement = worklist.poll();	
			
			//get the last iteration
//			int curIteration = 0;
//			if (iterationmap.containsKey(workElement))
//				curIteration = iterationmap.get(workElement) + 1;
			
//			iterationmap.put(workElement, curIteration);
			
			EList<AnalysisResult> entry =  entry(workElement);
			EList<AnalysisResult> exit =  exit(workElement);
			
			ExitEntryPair pair = AnalysesFactory.eINSTANCE.createExitEntryPair(exit, entry);
				// Add elements to worklist
			//if old != new 
			if (map.containsKey(workElement.getLabel())){
				System.out.println("map size is: " + map.size());
				System.out.println(map.get(workElement.getLabel()));

				
				if (map.get(workElement.getLabel()).getExit().equals(pair.getExit()))
					continue;
				
			}
			
			map.put(workElement.getLabel(), pair);
			System.out.println(workElement);
			EList<LabellableElement> nodes = getAllNodesWithDirection(workElement, configuration.getDirection(), Flow.class);
			
			System.out.println(nodes.size());

			worklist.addAll(nodes);
			
		}
		//FIXME remove all start and end nodes
		map.remove(new Long(0)); // the label for the start node
		map.remove(new Long(Long.MAX_VALUE)); // the label for the start node
		result = map;
		return map;
	}
	
		
		@Override
		public EList<AnalysisResult> entry(LabellableElement e) {
			if (e instanceof Start) {
				return new UniqueEList<>();
			}
			//res must be TreeSet
			EList<AnalysisResult> res = new UniqueEList<>();
			for (LabellableElement workElement : getAllNodesWithDirection(e, AnalysisDirection.BACKWARDS, RegularFlow.class)) {
				EList<AnalysisResult> x = getExitTable().get(workElement);
				
			
				if (x == null) {
					x = new UniqueEList<>();
				}

				res.addAll(x);
				
				
				
				if (workElement instanceof ReturnSite)
					res.addAll(alphaConvert((ReturnSite) workElement));
			}
			
			//if this is entry to a procedure, 
			//first add results through translation of actual parameters (arguments) to formal parameters
			
			//FIXME in syntax definition, arguments and parameters are mixed up!
			if (e instanceof Procedure)
				for (LabellableElement workElement : getAllNodesWithDirection(e, AnalysisDirection.BACKWARDS, ProcedureFlow.class)) {
					EList<AnalysisResult> x = getExitTable().get(workElement); // this must be just before calling the procedure call
					//Consider scoping rules
					if (x == null) {
						x = new UniqueEList<>();
					}else{
						//translate actual arguments to formal parameters
						ProcedureCall call = (ProcedureCall)workElement;
						Procedure callee = (Procedure) e;
						
						
						for (int i = 0 ; i < call.getArguments().size(); i++){
							
							DataItem a = (DataItem)call.getArguments().get(i).getTarget();
							
							//replace in the x and add to result
							for (int j=0; j < x.size(); j++){
							
								ReachingDefinitionsResult result = (ReachingDefinitionsResult)x.get(j);
								
								if (result.getVariable().equals(a)){
									//remove analysis result
									x.remove(j);
									//get the ith formal parameter
									DataItem v = callee.getParameters().get(i);
									System.out.println(v);
									x.add(j, AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, result.getLabel()));
									
								}
									
							}
						}
						
					}
					res.addAll(x);
				}
				
			
			
			//join them with the current new ones
			EList<AnalysisResult> curEntry = new UniqueEList<AnalysisResult>();
			if (getEntryTable().containsKey(e))
				curEntry.addAll(getEntryTable().get(e));
			
			System.out.print("current size: " + curEntry.size());
			curEntry.addAll(res);
			System.out.println("After join size: " + curEntry.size());

			getEntryTable().put(e, curEntry);
			return res;
		}
		
		
		public EList<AnalysisResult> alphaConvert(ReturnSite returnsite) {
			EList<AnalysisResult> res = new UniqueEList<>();

			for (LabellableElement workElement : getAllNodesWithDirection(returnsite, AnalysisDirection.BACKWARDS, ProcedureFlow.class)) {
				EList<AnalysisResult> x = getExitTable().get(workElement); // this must be from the callee procedure
				//Consider scoping rules
				if (x == null) {
					x = new UniqueEList<>();
				}else{
					//rename variables and join
					//get the containing procedure of the work element
//					EObject container = workElement.eContainer();
//					while (!(container instanceof Procedure))
//						container = container.eContainer();
					ProcedureCall call = (ProcedureCall)returnsite.eContainer();
					Procedure callee = (Procedure) call.getTarget();
					
					//Assuming parameters match
					for (int i = 0 ; i < callee.getParameters().size(); i++){
						
						DataItem a = callee.getParameters().get(i);
						
						//replace in the x and add to result
						//go through all the results to find the ones corresponding to each argument variable
						for (int j=0; j < x.size(); j++){
						
							ReachingDefinitionsAnalysisResult result = (ReachingDefinitionsAnalysisResult)x.get(j);
							
							if (result.getVariable().equals(a)){
								//remove analysis result
								x.remove(j);
								//get the ith actual parameter
								DataItem v = (DataItem)call.getArguments().get(i).getTarget();
								System.out.println("Aasdasda");
								System.out.println(v);
								x.add(j, AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, result.getLabel()));
							}
								
						}
					}

				}
				
				res.addAll(x);
			}
			
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
			for (AnalysisResult ar : e.kill(configuration.eClass())) {
				res.remove(ar);
			}
			res.addAll(e.gen(configuration.eClass()));
			//TreeSet or UniqueEList
			res = new UniqueEList<>(res);
			getExitTable().put(e, res);
			return res;
		}
	
} // IntraproceduralAnalysisImpl
