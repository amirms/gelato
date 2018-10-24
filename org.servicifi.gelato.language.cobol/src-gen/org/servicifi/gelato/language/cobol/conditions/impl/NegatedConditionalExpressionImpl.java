/**
 */
package org.servicifi.gelato.language.cobol.conditions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.conditions.ConditionsPackage;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild;

import org.servicifi.gelato.language.cobol.operators.Negate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negated Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionImpl#getNegateOperator <em>Negate Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegatedConditionalExpressionImpl extends ConditionalAndExpressionChildImpl implements NegatedConditionalExpression {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected NegatedConditionalExpressionChild child;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegatedConditionalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionsPackage.Literals.NEGATED_CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegatedConditionalExpressionChild getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(NegatedConditionalExpressionChild newChild, NotificationChain msgs) {
		NegatedConditionalExpressionChild oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(NegatedConditionalExpressionChild newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD, newChild, newChild));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR, oldNegateOperator, newNegateOperator);
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
				msgs = ((InternalEObject)negateOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR, null, msgs);
			if (newNegateOperator != null)
				msgs = ((InternalEObject)newNegateOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR, null, msgs);
			msgs = basicSetNegateOperator(newNegateOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR, newNegateOperator, newNegateOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD:
				return basicSetChild(null, msgs);
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR:
				return basicSetNegateOperator(null, msgs);
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
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD:
				return getChild();
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR:
				return getNegateOperator();
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
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD:
				setChild((NegatedConditionalExpressionChild)newValue);
				return;
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR:
				setNegateOperator((Negate)newValue);
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
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD:
				setChild((NegatedConditionalExpressionChild)null);
				return;
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR:
				setNegateOperator((Negate)null);
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
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD:
				return child != null;
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR:
				return negateOperator != null;
		}
		return super.eIsSet(featureID);
	}

} //NegatedConditionalExpressionImpl
