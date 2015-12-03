/**
 */
package org.servicifi.gelato.language.cobol.handlers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.handlers.AtEndOfPage;
import org.servicifi.gelato.language.cobol.handlers.HandlersPackage;

import org.servicifi.gelato.language.cobol.statements.EOP;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>At End Of Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.handlers.impl.AtEndOfPageImpl#getEop <em>Eop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtEndOfPageImpl extends HandlerImpl implements AtEndOfPage {
	/**
	 * The default value of the '{@link #getEop() <em>Eop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEop()
	 * @generated
	 * @ordered
	 */
	protected static final EOP EOP_EDEFAULT = EOP.EOP;

	/**
	 * The cached value of the '{@link #getEop() <em>Eop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEop()
	 * @generated
	 * @ordered
	 */
	protected EOP eop = EOP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtEndOfPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HandlersPackage.Literals.AT_END_OF_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOP getEop() {
		return eop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEop(EOP newEop) {
		EOP oldEop = eop;
		eop = newEop == null ? EOP_EDEFAULT : newEop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HandlersPackage.AT_END_OF_PAGE__EOP, oldEop, eop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HandlersPackage.AT_END_OF_PAGE__EOP:
				return getEop();
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
			case HandlersPackage.AT_END_OF_PAGE__EOP:
				setEop((EOP)newValue);
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
			case HandlersPackage.AT_END_OF_PAGE__EOP:
				setEop(EOP_EDEFAULT);
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
			case HandlersPackage.AT_END_OF_PAGE__EOP:
				return eop != EOP_EDEFAULT;
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
		result.append(" (eop: ");
		result.append(eop);
		result.append(')');
		return result.toString();
	}

} //AtEndOfPageImpl
