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
import org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysis;
import org.servicifi.gelato.analysis.framework.flows.Flow;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.expressions.Expression;
import org.servicifi.gelato.language.kernel.statements.AssignmentStatement;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Reaching Definitions Analysis</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisImpl#getAssignments
 * <em>Assignments</em>}</li>
 * </ul>
 *
 */
public class ReachingDefinitionsAnalysisImpl extends AnalysisImpl implements ReachingDefinitionsAnalysis {
	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected Map<DataItem, EList<Long>> assignments;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ReachingDefinitionsAnalysisImpl() {
		super();
	}

	protected ReachingDefinitionsAnalysisImpl(EList<Flow> cfg) {
		super(cfg, AnalysisDirection.FORWARDS);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.REACHING_DEFINITIONS_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map<DataItem, EList<Long>> getAssignments() {
		return assignments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignments(Map<DataItem, EList<Long>> newAssignments) {
		Map<DataItem, EList<Long>> oldAssignments = assignments;
		assignments = newAssignments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS__ASSIGNMENTS, oldAssignments, assignments));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

		if (e instanceof AssignmentStatement) {
			// LHS is a data item
			DataItem v = (DataItem) ((AssignmentStatement) e).getTarget();
			res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
			if (assignments.containsKey(v)) {
				for (Long i : assignments.get(v)) {
					res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, i));
				}
			}

		}
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
		else if (e instanceof Expression) {
			// Order matters
			EList<DataItem> vars = ((Expression) e).getDefinedVariables();
			for (DataItem v : vars) {
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
			DataItem v = (DataItem) ((AssignmentStatement) e).getTarget();
			res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
			if (assignments.containsKey(v)) {
				assignments.get(v).add(e.getLabel());
			} else {
				EList<Long> i = new BasicEList<>(1);
				i.add(e.getLabel());
				assignments.put(v, i);
			}
		}
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
		else if (e instanceof Expression) {
			// Order matters
			EList<DataItem> vars = ((Expression) e).getUsedVariables();
			for (DataItem v : vars) {
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
} // ReachingDefinitionsAnalysisImpl
