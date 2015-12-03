/**
 */
package org.servicifi.gelato.language.cobol.conditions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.conditions.Condition;
import org.servicifi.gelato.language.cobol.conditions.ConditionsPackage;
import org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Abbreviated Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.NestedAbbreviatedConditionalExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.NestedAbbreviatedConditionalExpressionImpl#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedAbbreviatedConditionalExpressionImpl extends AbbreviatedRelationalExpressionChildImpl implements NestedAbbreviatedConditionalExpression {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Condition expression;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected Condition rest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedAbbreviatedConditionalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionsPackage.Literals.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Condition newExpression, NotificationChain msgs) {
		Condition oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Condition newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getRest() {
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRest(Condition newRest, NotificationChain msgs) {
		Condition oldRest = rest;
		rest = newRest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST, oldRest, newRest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRest(Condition newRest) {
		if (newRest != rest) {
			NotificationChain msgs = null;
			if (rest != null)
				msgs = ((InternalEObject)rest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST, null, msgs);
			if (newRest != null)
				msgs = ((InternalEObject)newRest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST, null, msgs);
			msgs = basicSetRest(newRest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST, newRest, newRest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST:
				return basicSetRest(null, msgs);
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
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION:
				return getExpression();
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST:
				return getRest();
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
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION:
				setExpression((Condition)newValue);
				return;
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST:
				setRest((Condition)newValue);
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
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION:
				setExpression((Condition)null);
				return;
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST:
				setRest((Condition)null);
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
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION:
				return expression != null;
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST:
				return rest != null;
		}
		return super.eIsSet(featureID);
	}

} //NestedAbbreviatedConditionalExpressionImpl
