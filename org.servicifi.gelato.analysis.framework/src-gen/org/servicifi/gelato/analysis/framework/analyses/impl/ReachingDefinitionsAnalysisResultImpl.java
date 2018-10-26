/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult;
import org.servicifi.gelato.analysis.framework.commons.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Reaching Definitions Analysis Result</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisResultImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReachingDefinitionsAnalysisResultImpl extends AnalysisResultImpl
		implements ReachingDefinitionsAnalysisResult {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ReachingDefinitionsAnalysisResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ReachingDefinitionsAnalysisResultImpl(long label) {
		super(label);
	}

	public ReachingDefinitionsAnalysisResultImpl(Variable variable, long label) {
		super(label);
		setVariable(variable);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.REACHING_DEFINITIONS_ANALYSIS_RESULT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_RESULT__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_RESULT__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_RESULT__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_RESULT__VARIABLE:
				setVariable((Variable)newValue);
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
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_RESULT__VARIABLE:
				setVariable((Variable)null);
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
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_RESULT__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public int compareTo(Object arg0) {
		if (arg0 instanceof ReachingDefinitionsAnalysisResult) {
			ReachingDefinitionsAnalysisResult otherResult = (ReachingDefinitionsAnalysisResult) arg0;

			if ((otherResult.getLabel() == this.getLabel()) && (otherResult.getVariable().equals(this.getVariable()))) {
				return 0;
			}
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ReachingDefinitionsAnalysisResult) {
			ReachingDefinitionsAnalysisResult otherResult = (ReachingDefinitionsAnalysisResult) obj;
			return this.label == otherResult.getLabel() && getVariable().equals(otherResult.getVariable());
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("(%s,%s)", getVariable(), getLabel());
	}

} // ReachingDefinitionsAnalysisResultImpl
