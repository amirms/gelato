/**
 */
package org.servicifi.gelato.language.cobol.strings.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.strings.SpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.StringsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.impl.SpecificCharacterImpl#getTallying <em>Tallying</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificCharacterImpl extends TallyingImpl implements SpecificCharacter {
	/**
	 * The cached value of the '{@link #getTallying() <em>Tallying</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTallying()
	 * @generated
	 * @ordered
	 */
	protected PrimaryOperand tallying;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificCharacterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringsPackage.Literals.SPECIFIC_CHARACTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryOperand getTallying() {
		return tallying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTallying(PrimaryOperand newTallying, NotificationChain msgs) {
		PrimaryOperand oldTallying = tallying;
		tallying = newTallying;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringsPackage.SPECIFIC_CHARACTER__TALLYING, oldTallying, newTallying);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTallying(PrimaryOperand newTallying) {
		if (newTallying != tallying) {
			NotificationChain msgs = null;
			if (tallying != null)
				msgs = ((InternalEObject)tallying).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringsPackage.SPECIFIC_CHARACTER__TALLYING, null, msgs);
			if (newTallying != null)
				msgs = ((InternalEObject)newTallying).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringsPackage.SPECIFIC_CHARACTER__TALLYING, null, msgs);
			msgs = basicSetTallying(newTallying, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringsPackage.SPECIFIC_CHARACTER__TALLYING, newTallying, newTallying));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StringsPackage.SPECIFIC_CHARACTER__TALLYING:
				return basicSetTallying(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StringsPackage.SPECIFIC_CHARACTER__TALLYING:
				return getTallying();
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
			case StringsPackage.SPECIFIC_CHARACTER__TALLYING:
				setTallying((PrimaryOperand)newValue);
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
			case StringsPackage.SPECIFIC_CHARACTER__TALLYING:
				setTallying((PrimaryOperand)null);
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
			case StringsPackage.SPECIFIC_CHARACTER__TALLYING:
				return tallying != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificCharacterImpl
