/**
 */
package org.servicifi.gelato.language.cobol.identifiers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage;
import org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript;

import org.servicifi.gelato.language.cobol.literals.IntegerLiteral;

import org.servicifi.gelato.language.cobol.operators.AdditiveOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Subscript</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.impl.RelativeSubscriptImpl#getAdditiveOperator <em>Additive Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.impl.RelativeSubscriptImpl#getInteger <em>Integer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeSubscriptImpl extends SubscriptImpl implements RelativeSubscript {
	/**
	 * The cached value of the '{@link #getAdditiveOperator() <em>Additive Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveOperator()
	 * @generated
	 * @ordered
	 */
	protected AdditiveOperator additiveOperator;

	/**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected IntegerLiteral integer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeSubscriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdentifiersPackage.Literals.RELATIVE_SUBSCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveOperator getAdditiveOperator() {
		return additiveOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditiveOperator(AdditiveOperator newAdditiveOperator, NotificationChain msgs) {
		AdditiveOperator oldAdditiveOperator = additiveOperator;
		additiveOperator = newAdditiveOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR, oldAdditiveOperator, newAdditiveOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveOperator(AdditiveOperator newAdditiveOperator) {
		if (newAdditiveOperator != additiveOperator) {
			NotificationChain msgs = null;
			if (additiveOperator != null)
				msgs = ((InternalEObject)additiveOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR, null, msgs);
			if (newAdditiveOperator != null)
				msgs = ((InternalEObject)newAdditiveOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR, null, msgs);
			msgs = basicSetAdditiveOperator(newAdditiveOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR, newAdditiveOperator, newAdditiveOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral getInteger() {
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteger(IntegerLiteral newInteger, NotificationChain msgs) {
		IntegerLiteral oldInteger = integer;
		integer = newInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER, oldInteger, newInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteger(IntegerLiteral newInteger) {
		if (newInteger != integer) {
			NotificationChain msgs = null;
			if (integer != null)
				msgs = ((InternalEObject)integer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER, null, msgs);
			if (newInteger != null)
				msgs = ((InternalEObject)newInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER, null, msgs);
			msgs = basicSetInteger(newInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER, newInteger, newInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR:
				return basicSetAdditiveOperator(null, msgs);
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER:
				return basicSetInteger(null, msgs);
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
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR:
				return getAdditiveOperator();
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER:
				return getInteger();
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
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR:
				setAdditiveOperator((AdditiveOperator)newValue);
				return;
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER:
				setInteger((IntegerLiteral)newValue);
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
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR:
				setAdditiveOperator((AdditiveOperator)null);
				return;
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER:
				setInteger((IntegerLiteral)null);
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
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR:
				return additiveOperator != null;
			case IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER:
				return integer != null;
		}
		return super.eIsSet(featureID);
	}

} //RelativeSubscriptImpl
