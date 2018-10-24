/**
 */
package org.servicifi.gelato.language.cobol.identifiers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage;
import org.servicifi.gelato.language.cobol.identifiers.Subscript;

import org.servicifi.gelato.language.cobol.operands.Operand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscript</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.impl.SubscriptImpl#getSubscript <em>Subscript</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubscriptImpl extends EObjectImpl implements Subscript {
	/**
	 * The cached value of the '{@link #getSubscript() <em>Subscript</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscript()
	 * @generated
	 * @ordered
	 */
	protected Operand subscript;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdentifiersPackage.Literals.SUBSCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand getSubscript() {
		return subscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscript(Operand newSubscript, NotificationChain msgs) {
		Operand oldSubscript = subscript;
		subscript = newSubscript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdentifiersPackage.SUBSCRIPT__SUBSCRIPT, oldSubscript, newSubscript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscript(Operand newSubscript) {
		if (newSubscript != subscript) {
			NotificationChain msgs = null;
			if (subscript != null)
				msgs = ((InternalEObject)subscript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdentifiersPackage.SUBSCRIPT__SUBSCRIPT, null, msgs);
			if (newSubscript != null)
				msgs = ((InternalEObject)newSubscript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdentifiersPackage.SUBSCRIPT__SUBSCRIPT, null, msgs);
			msgs = basicSetSubscript(newSubscript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdentifiersPackage.SUBSCRIPT__SUBSCRIPT, newSubscript, newSubscript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdentifiersPackage.SUBSCRIPT__SUBSCRIPT:
				return basicSetSubscript(null, msgs);
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
			case IdentifiersPackage.SUBSCRIPT__SUBSCRIPT:
				return getSubscript();
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
			case IdentifiersPackage.SUBSCRIPT__SUBSCRIPT:
				setSubscript((Operand)newValue);
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
			case IdentifiersPackage.SUBSCRIPT__SUBSCRIPT:
				setSubscript((Operand)null);
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
			case IdentifiersPackage.SUBSCRIPT__SUBSCRIPT:
				return subscript != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscriptImpl
