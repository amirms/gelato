/**
 */
package org.servicifi.gelato.language.kernel.analyses.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.servicifi.gelato.language.kernel.analyses.AnalysesPackage;
import org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsResult;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaching Definitions Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsResultImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReachingDefinitionsResultImpl extends AnalysisResultImpl implements ReachingDefinitionsResult {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected org.servicifi.gelato.language.kernel.dataitems.DataItem variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReachingDefinitionsResultImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ReachingDefinitionsResultImpl(long label) {
		super(label);
	}
	
	public ReachingDefinitionsResultImpl(DataItem variable, long label) {
		super(label);
		setVariable(variable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public int compareTo(Object o) {
		ReachingDefinitionsResult res = (ReachingDefinitionsResult) o;
		//FIXME
		return (int) (getLabel() - res.getLabel());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ReachingDefinitionsResult) {
			ReachingDefinitionsResult other = (ReachingDefinitionsResult) obj;
			return this.label == other.getLabel() && getVariable().equals(other.getVariable());
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.REACHING_DEFINITIONS_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.servicifi.gelato.language.kernel.dataitems.DataItem getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (org.servicifi.gelato.language.kernel.dataitems.DataItem)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysesPackage.REACHING_DEFINITIONS_RESULT__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.servicifi.gelato.language.kernel.dataitems.DataItem basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(org.servicifi.gelato.language.kernel.dataitems.DataItem newVariable) {
		org.servicifi.gelato.language.kernel.dataitems.DataItem oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.REACHING_DEFINITIONS_RESULT__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysesPackage.REACHING_DEFINITIONS_RESULT__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysesPackage.REACHING_DEFINITIONS_RESULT__VARIABLE:
				setVariable((org.servicifi.gelato.language.kernel.dataitems.DataItem)newValue);
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
			case AnalysesPackage.REACHING_DEFINITIONS_RESULT__VARIABLE:
				setVariable((org.servicifi.gelato.language.kernel.dataitems.DataItem)null);
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
			case AnalysesPackage.REACHING_DEFINITIONS_RESULT__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%s)", getVariable(), getLabel());
	}

} //ReachingDefinitionsResultImpl
