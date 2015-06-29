/**
 */
package org.servicifi.gelato.language.kernel.analyses.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.servicifi.gelato.language.kernel.analyses.AnalysesFactory;
import org.servicifi.gelato.language.kernel.analyses.AnalysesPackage;
import org.servicifi.gelato.language.kernel.analyses.AnalysisDirection;
import org.servicifi.gelato.language.kernel.analyses.AnalysisResult;
import org.servicifi.gelato.language.kernel.analyses.AnalysisType;
import org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsAnalysis;
import org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsResult;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.containers.Start;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.expressions.Expression;
import org.servicifi.gelato.language.kernel.flows.Flow;
import org.servicifi.gelato.language.kernel.flows.ProcedureFlow;
import org.servicifi.gelato.language.kernel.flows.RegularFlow;
import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.statements.AssignmentStatement;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.language.kernel.statements.ReturnSite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaching Definitions Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsAnalysisImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReachingDefinitionsAnalysisImpl extends AnalysisImpl implements ReachingDefinitionsAnalysis {
	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected Map<DataItem, EList<Long>> assignments = new HashMap<>();
	//may need to consider a map Variable X Procedure -> List of Longs
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReachingDefinitionsAnalysisImpl() {
		super();
	}
	
	
	protected ReachingDefinitionsAnalysisImpl(EList<Flow> cfg) {
		super(cfg, AnalysisDirection.FORWARDS, AnalysisType.MUST);
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.REACHING_DEFINITIONS_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<DataItem, EList<Long>> getAssignments() {
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignments(Map<DataItem, EList<Long>> newAssignments) {
		Map<DataItem, EList<Long>> oldAssignments = assignments;
		assignments = newAssignments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS__ASSIGNMENTS, oldAssignments, assignments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS__ASSIGNMENTS:
				return getAssignments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS__ASSIGNMENTS:
				setAssignments((Map<DataItem, EList<Long>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS__ASSIGNMENTS:
				setAssignments((Map<DataItem, EList<Long>>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS__ASSIGNMENTS:
				return assignments != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (assignments: ");
		result.append(assignments);
		result.append(')');
		return result.toString();
	}
	
	//Precondition: Names must be unique
	@Override
	public EList<AnalysisResult> kill(LabellableElement e) {
		EList<AnalysisResult> res = new UniqueEList<>();

		if (e instanceof AssignmentStatement) {
					//LHS is a variable
					DataItem v = (DataItem)((AssignmentStatement) e).getTarget();
					res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
					if (assignments.containsKey(v)) {
						for (Long i : assignments.get(v)) {
							res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, i));
						}
					}
					
				}
//				else if (e instanceof ProcedureCall) {
//					//actual parameters
//					EList<Parameter> parameters = ((ProcedureCall) e).getParameters();
//					for (Parameter p : parameters) 
//						if (p.isByReference()){
//							Variable t = (Variable) p.getTarget();
//							Variable v = p.getCorrespondingArgument();
//							
//							res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(t, -1));
//							if (assignments.containsKey(v)) {
//								for (Long i : assignments.get(v)) {
//									res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(t, i));
//								}
//							}
//					}
//				}
				else if (e instanceof Expression) {
					//Order matters
					EList<DataItem> vars = ((Expression) e).getDefinedVariables();
					for(DataItem v : vars) {
						res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
						if (assignments.containsKey(v)) {
							for (Long i : assignments.get(v)) {
								res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, i));
							}
						}
					}
				}
				return res;
	}
			
	@Override
	public EList<AnalysisResult> gen(LabellableElement e) {
		EList<AnalysisResult> res = new UniqueEList<>();
				if (e instanceof AssignmentStatement) {
					DataItem v = (DataItem)((AssignmentStatement) e).getTarget();
					res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, e.getLabel()));
					//res.add(new ReachingDefinitionsResult(id, e.getLabel()));
					if (assignments.containsKey(v)) {
//						System.out.println("adding " + e.getLabel() + " to variable " + v);
						assignments.get(v).add(e.getLabel());
					}
					else {
						EList<Long> i = new BasicEList<>(1);
						i.add(e.getLabel());
						assignments.put(v, i);
					}
				}
//				else if (e instanceof ProcedureCall) {
//					EList<Parameter> parameters = ((ProcedureCall) e).getParameters();
//					for (Parameter p : parameters) 
//						if(p.isByReference()){
//							Variable t = (Variable) p.getTarget();  //t at the call site
//							Variable v = p.getCorrespondingArgument(); // the formal parameters
//							
//							res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(t, e.getLabel()));
//							if (assignments.containsKey(v)) {
//								assignments.get(t).add(e.getLabel());
//							}
//							else {
//								EList<Long> i = new BasicEList<>(1);
//								i.add(e.getLabel());
//								assignments.put(t, i);
//							}
//					}
//				}
				else if (e instanceof Expression) {
					//Order matters
					EList<DataItem> vars = ((Expression) e).getDefinedVariables();
					for(DataItem v : vars) {
						res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, e.getLabel()));
						if (assignments.containsKey(v)) {
							assignments.get(v).add(e.getLabel());
						}
						else {
							EList<Long> i = new BasicEList<>(1);
							i.add(e.getLabel());
							assignments.put(v, i);
						}
					}
				}
				return res;
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
//				EObject container = workElement.eContainer();
//				while (!(container instanceof Procedure))
//					container = container.eContainer();
				ProcedureCall call = (ProcedureCall)returnsite.eContainer();
				Procedure callee = (Procedure) call.getTarget();
				
				//Assuming parameters match
				for (int i = 0 ; i < callee.getParameters().size(); i++){
					
					DataItem a = callee.getParameters().get(i);
					
					//replace in the x and add to result
					//go through all the results to find the ones corresponding to each argument variable
					for (int j=0; j < x.size(); j++){
					
						ReachingDefinitionsResult result = (ReachingDefinitionsResult)x.get(j);
						
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
		for (AnalysisResult ar : kill(e)) {
			res.remove(ar);
		}
		res.addAll(gen(e));
		//TreeSet or UniqueEList
		res = new UniqueEList<>(res);
		getExitTable().put(e, res);
		return res;
	}


	@Override
	public EList<LabellableElement> getAllNodesWithDirection(
			LabellableElement e, AnalysisDirection dir) {
		// TODO Auto-generated method stub
		return null;
	}


} //ReachingDefinitionsAnalysisImpl
