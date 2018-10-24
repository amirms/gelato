/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisType;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaching Definitions Analysis Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisConfigurationImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReachingDefinitionsAnalysisConfigurationImpl extends AnalysisConfigurationImpl implements ReachingDefinitionsAnalysisConfiguration {
	private Map<Variable, EList<Long>> assignments;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ReachingDefinitionsAnalysisConfigurationImpl() {
		super();
		
		setDirection(AnalysisDirection.FORWARDS);
		setAnalysisType(AnalysisType.MUST);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Variable, EList<Long>> getAssignments() {
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignments(Map<Variable, EList<Long>> newAssignments) {
		Map<Variable, EList<Long>> oldAssignments = assignments;
		assignments = newAssignments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__ASSIGNMENTS, oldAssignments, assignments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__ASSIGNMENTS:
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
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__ASSIGNMENTS:
				setAssignments((Map<Variable, EList<Long>>)newValue);
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
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__ASSIGNMENTS:
				setAssignments((Map<Variable, EList<Long>>)null);
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
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__ASSIGNMENTS:
				return assignments != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (assignments: ");
		result.append(assignments);
		result.append(')');
		return result.toString();
	}

	// Precondition: Names must be unique
	@Override
	public EList<AnalysisResult> kill(LabellableElement e) {
		EList<AnalysisResult> res = new UniqueEList<>();

//		if (e instanceof DefinitionExpression) {
//			// LHS is a data item
//			DefinitionExpression definitonVariable = (DefinitionExpression) e;
//			Variable v = definitonVariable.getDefinedVariable();
//			res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
//			if (assignments.containsKey(v)) {
//				for (Long i : assignments.get(v)) {
//					res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, i));
//				}
//			}
//
//		}
		// else if (e instanceof ProcedureCall) {
		// Variable v = ((ProcedureCall) e).getReturnVal();
		// res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v,
		// -1));
		// if (assignments.containsKey(v)) {
		// for (Long i : assignments.get(v)) {
		// res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v,
		// i));
		// }
		// }
		// }
//		else
			if (e instanceof DefinitionExpression) {
			// Order matters
			EList<Variable> vars = ((DefinitionExpression) e).getDefinedVariables();
			for (Variable v : vars) {
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
//		if (e instanceof AssignmentStatement) {
//			DataItem v = (DataItem) ((AssignmentStatement) e).getTarget();
//			res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
//			if (assignments.containsKey(v)) {
//				assignments.get(v).add(e.getLabel());
//			} else {
//				EList<Long> i = new BasicEList<>(1);
//				i.add(e.getLabel());
//				assignments.put(v, i);
//			}
//		}
		// else if (e instanceof ProcedureCall) {
		// Variable v = ((ProcedureCall) e).getReturnVal();
		// res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v,
		// -1));
		// if (assignments.containsKey(v)) {
		// assignments.get(v).add(e.getLabel());
		// }
		// else {
		// EList<Long> i = new BasicEList<>(1);
		// i.add(e.getLabel());
		// assignments.put(v, i);
		// }
		// }
//		else 
		if (e instanceof UsageExpression) {
			// Order matters
			EList<Variable> vars = ((UsageExpression) e).getUsedVariables();
			for (Variable v : vars) {
				res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
				if (assignments.containsKey(v)) {
					assignments.get(v).add(e.getLabel());
				} else {
					EList<Long> i = new BasicEList<>(1);
					i.add(e.getLabel());
					assignments.put(v, i);
				}
			}
		}
		return res;
	}

} //ReachingDefinitionsAnalysisConfigurationImpl
