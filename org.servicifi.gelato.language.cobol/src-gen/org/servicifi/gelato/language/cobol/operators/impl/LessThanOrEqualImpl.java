/**
 */
package org.servicifi.gelato.language.cobol.operators.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.operators.LessThanOrEqual;
import org.servicifi.gelato.language.cobol.operators.OperatorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Less Than Or Equal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.operators.impl.LessThanOrEqualImpl#isThan <em>Than</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.operators.impl.LessThanOrEqualImpl#isTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LessThanOrEqualImpl extends RelationalOperatorImpl implements LessThanOrEqual {
	/**
	 * The default value of the '{@link #isThan() <em>Than</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThan()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThan() <em>Than</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThan()
	 * @generated
	 * @ordered
	 */
	protected boolean than = THAN_EDEFAULT;

	/**
	 * The default value of the '{@link #isTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTo()
	 * @generated
	 * @ordered
	 */
	protected boolean to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanOrEqualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.LESS_THAN_OR_EQUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThan() {
		return than;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThan(boolean newThan) {
		boolean oldThan = than;
		than = newThan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.LESS_THAN_OR_EQUAL__THAN, oldThan, than));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(boolean newTo) {
		boolean oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.LESS_THAN_OR_EQUAL__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatorsPackage.LESS_THAN_OR_EQUAL__THAN:
				return isThan();
			case OperatorsPackage.LESS_THAN_OR_EQUAL__TO:
				return isTo();
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
			case OperatorsPackage.LESS_THAN_OR_EQUAL__THAN:
				setThan((Boolean)newValue);
				return;
			case OperatorsPackage.LESS_THAN_OR_EQUAL__TO:
				setTo((Boolean)newValue);
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
			case OperatorsPackage.LESS_THAN_OR_EQUAL__THAN:
				setThan(THAN_EDEFAULT);
				return;
			case OperatorsPackage.LESS_THAN_OR_EQUAL__TO:
				setTo(TO_EDEFAULT);
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
			case OperatorsPackage.LESS_THAN_OR_EQUAL__THAN:
				return than != THAN_EDEFAULT;
			case OperatorsPackage.LESS_THAN_OR_EQUAL__TO:
				return to != TO_EDEFAULT;
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
		result.append(" (than: ");
		result.append(than);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //LessThanOrEqualImpl
