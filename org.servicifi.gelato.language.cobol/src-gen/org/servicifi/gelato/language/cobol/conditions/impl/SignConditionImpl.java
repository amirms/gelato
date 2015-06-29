/**
 */
package org.servicifi.gelato.language.cobol.conditions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.conditions.ConditionsPackage;
import org.servicifi.gelato.language.cobol.conditions.SignCondition;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;

import org.servicifi.gelato.language.cobol.operators.Negate;
import org.servicifi.gelato.language.cobol.operators.SignOperator;

import org.servicifi.gelato.language.cobol.verbs.Is;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sign Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.SignConditionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.SignConditionImpl#getSignOperator <em>Sign Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.SignConditionImpl#getNegateOperator <em>Negate Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.SignConditionImpl#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignConditionImpl extends NegatedConditionalExpressionChildImpl implements SignCondition {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected SimpleConditionChild child;

	/**
	 * The cached value of the '{@link #getSignOperator() <em>Sign Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignOperator()
	 * @generated
	 * @ordered
	 */
	protected SignOperator signOperator;

	/**
	 * The cached value of the '{@link #getNegateOperator() <em>Negate Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegateOperator()
	 * @generated
	 * @ordered
	 */
	protected Negate negateOperator;

	/**
	 * The cached value of the '{@link #getIs() <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs()
	 * @generated
	 * @ordered
	 */
	protected Is is;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionsPackage.Literals.SIGN_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleConditionChild getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(SimpleConditionChild newChild, NotificationChain msgs) {
		SimpleConditionChild oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.SIGN_CONDITION__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(SimpleConditionChild newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SIGN_CONDITION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SIGN_CONDITION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SIGN_CONDITION__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignOperator getSignOperator() {
		return signOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignOperator(SignOperator newSignOperator, NotificationChain msgs) {
		SignOperator oldSignOperator = signOperator;
		signOperator = newSignOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR, oldSignOperator, newSignOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignOperator(SignOperator newSignOperator) {
		if (newSignOperator != signOperator) {
			NotificationChain msgs = null;
			if (signOperator != null)
				msgs = ((InternalEObject)signOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR, null, msgs);
			if (newSignOperator != null)
				msgs = ((InternalEObject)newSignOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR, null, msgs);
			msgs = basicSetSignOperator(newSignOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR, newSignOperator, newSignOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negate getNegateOperator() {
		return negateOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegateOperator(Negate newNegateOperator, NotificationChain msgs) {
		Negate oldNegateOperator = negateOperator;
		negateOperator = newNegateOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR, oldNegateOperator, newNegateOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegateOperator(Negate newNegateOperator) {
		if (newNegateOperator != negateOperator) {
			NotificationChain msgs = null;
			if (negateOperator != null)
				msgs = ((InternalEObject)negateOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR, null, msgs);
			if (newNegateOperator != null)
				msgs = ((InternalEObject)newNegateOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR, null, msgs);
			msgs = basicSetNegateOperator(newNegateOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR, newNegateOperator, newNegateOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Is getIs() {
		return is;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIs(Is newIs, NotificationChain msgs) {
		Is oldIs = is;
		is = newIs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.SIGN_CONDITION__IS, oldIs, newIs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs(Is newIs) {
		if (newIs != is) {
			NotificationChain msgs = null;
			if (is != null)
				msgs = ((InternalEObject)is).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SIGN_CONDITION__IS, null, msgs);
			if (newIs != null)
				msgs = ((InternalEObject)newIs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SIGN_CONDITION__IS, null, msgs);
			msgs = basicSetIs(newIs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SIGN_CONDITION__IS, newIs, newIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionsPackage.SIGN_CONDITION__CHILD:
				return basicSetChild(null, msgs);
			case ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR:
				return basicSetSignOperator(null, msgs);
			case ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR:
				return basicSetNegateOperator(null, msgs);
			case ConditionsPackage.SIGN_CONDITION__IS:
				return basicSetIs(null, msgs);
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
			case ConditionsPackage.SIGN_CONDITION__CHILD:
				return getChild();
			case ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR:
				return getSignOperator();
			case ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR:
				return getNegateOperator();
			case ConditionsPackage.SIGN_CONDITION__IS:
				return getIs();
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
			case ConditionsPackage.SIGN_CONDITION__CHILD:
				setChild((SimpleConditionChild)newValue);
				return;
			case ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR:
				setSignOperator((SignOperator)newValue);
				return;
			case ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR:
				setNegateOperator((Negate)newValue);
				return;
			case ConditionsPackage.SIGN_CONDITION__IS:
				setIs((Is)newValue);
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
			case ConditionsPackage.SIGN_CONDITION__CHILD:
				setChild((SimpleConditionChild)null);
				return;
			case ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR:
				setSignOperator((SignOperator)null);
				return;
			case ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR:
				setNegateOperator((Negate)null);
				return;
			case ConditionsPackage.SIGN_CONDITION__IS:
				setIs((Is)null);
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
			case ConditionsPackage.SIGN_CONDITION__CHILD:
				return child != null;
			case ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR:
				return signOperator != null;
			case ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR:
				return negateOperator != null;
			case ConditionsPackage.SIGN_CONDITION__IS:
				return is != null;
		}
		return super.eIsSet(featureID);
	}

} //SignConditionImpl
