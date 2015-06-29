/**
 */
package org.servicifi.gelato.language.cobol.conditions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.conditions.ConditionsPackage;
import org.servicifi.gelato.language.cobol.conditions.RelationalExpression;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;

import org.servicifi.gelato.language.cobol.operators.Negate;
import org.servicifi.gelato.language.cobol.operators.RelationalOperator;

import org.servicifi.gelato.language.cobol.verbs.Is;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.RelationalExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.RelationalExpressionImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.RelationalExpressionImpl#getNegateOperator <em>Negate Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.RelationalExpressionImpl#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalExpressionImpl extends NegatedConditionalExpressionChildImpl implements RelationalExpression {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleConditionChild> children;

	/**
	 * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperator relationalOperator;

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
	protected RelationalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionsPackage.Literals.RELATIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleConditionChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<SimpleConditionChild>(SimpleConditionChild.class, this, ConditionsPackage.RELATIONAL_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator getRelationalOperator() {
		return relationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationalOperator(RelationalOperator newRelationalOperator, NotificationChain msgs) {
		RelationalOperator oldRelationalOperator = relationalOperator;
		relationalOperator = newRelationalOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR, oldRelationalOperator, newRelationalOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationalOperator(RelationalOperator newRelationalOperator) {
		if (newRelationalOperator != relationalOperator) {
			NotificationChain msgs = null;
			if (relationalOperator != null)
				msgs = ((InternalEObject)relationalOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR, null, msgs);
			if (newRelationalOperator != null)
				msgs = ((InternalEObject)newRelationalOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR, null, msgs);
			msgs = basicSetRelationalOperator(newRelationalOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR, newRelationalOperator, newRelationalOperator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR, oldNegateOperator, newNegateOperator);
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
				msgs = ((InternalEObject)negateOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR, null, msgs);
			if (newNegateOperator != null)
				msgs = ((InternalEObject)newNegateOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR, null, msgs);
			msgs = basicSetNegateOperator(newNegateOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR, newNegateOperator, newNegateOperator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.RELATIONAL_EXPRESSION__IS, oldIs, newIs);
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
				msgs = ((InternalEObject)is).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.RELATIONAL_EXPRESSION__IS, null, msgs);
			if (newIs != null)
				msgs = ((InternalEObject)newIs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.RELATIONAL_EXPRESSION__IS, null, msgs);
			msgs = basicSetIs(newIs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.RELATIONAL_EXPRESSION__IS, newIs, newIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionsPackage.RELATIONAL_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				return basicSetRelationalOperator(null, msgs);
			case ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR:
				return basicSetNegateOperator(null, msgs);
			case ConditionsPackage.RELATIONAL_EXPRESSION__IS:
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
			case ConditionsPackage.RELATIONAL_EXPRESSION__CHILDREN:
				return getChildren();
			case ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				return getRelationalOperator();
			case ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR:
				return getNegateOperator();
			case ConditionsPackage.RELATIONAL_EXPRESSION__IS:
				return getIs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConditionsPackage.RELATIONAL_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends SimpleConditionChild>)newValue);
				return;
			case ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				setRelationalOperator((RelationalOperator)newValue);
				return;
			case ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR:
				setNegateOperator((Negate)newValue);
				return;
			case ConditionsPackage.RELATIONAL_EXPRESSION__IS:
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
			case ConditionsPackage.RELATIONAL_EXPRESSION__CHILDREN:
				getChildren().clear();
				return;
			case ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				setRelationalOperator((RelationalOperator)null);
				return;
			case ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR:
				setNegateOperator((Negate)null);
				return;
			case ConditionsPackage.RELATIONAL_EXPRESSION__IS:
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
			case ConditionsPackage.RELATIONAL_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
			case ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				return relationalOperator != null;
			case ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR:
				return negateOperator != null;
			case ConditionsPackage.RELATIONAL_EXPRESSION__IS:
				return is != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationalExpressionImpl
