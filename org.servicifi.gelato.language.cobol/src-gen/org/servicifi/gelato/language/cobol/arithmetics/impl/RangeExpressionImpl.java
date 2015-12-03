/**
 */
package org.servicifi.gelato.language.cobol.arithmetics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage;
import org.servicifi.gelato.language.cobol.arithmetics.RangeExpression;
import org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild;

import org.servicifi.gelato.language.cobol.operators.Through;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionImpl#getThroughOperator <em>Through Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeExpressionImpl extends ArithmeticExpressionImpl implements RangeExpression {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<RangeExpressionChild> children;

	/**
	 * The cached value of the '{@link #getThroughOperator() <em>Through Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughOperator()
	 * @generated
	 * @ordered
	 */
	protected Through throughOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmeticsPackage.Literals.RANGE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RangeExpressionChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<RangeExpressionChild>(RangeExpressionChild.class, this, ArithmeticsPackage.RANGE_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Through getThroughOperator() {
		return throughOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThroughOperator(Through newThroughOperator, NotificationChain msgs) {
		Through oldThroughOperator = throughOperator;
		throughOperator = newThroughOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR, oldThroughOperator, newThroughOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughOperator(Through newThroughOperator) {
		if (newThroughOperator != throughOperator) {
			NotificationChain msgs = null;
			if (throughOperator != null)
				msgs = ((InternalEObject)throughOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR, null, msgs);
			if (newThroughOperator != null)
				msgs = ((InternalEObject)newThroughOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR, null, msgs);
			msgs = basicSetThroughOperator(newThroughOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR, newThroughOperator, newThroughOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArithmeticsPackage.RANGE_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR:
				return basicSetThroughOperator(null, msgs);
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
			case ArithmeticsPackage.RANGE_EXPRESSION__CHILDREN:
				return getChildren();
			case ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR:
				return getThroughOperator();
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
			case ArithmeticsPackage.RANGE_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends RangeExpressionChild>)newValue);
				return;
			case ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR:
				setThroughOperator((Through)newValue);
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
			case ArithmeticsPackage.RANGE_EXPRESSION__CHILDREN:
				getChildren().clear();
				return;
			case ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR:
				setThroughOperator((Through)null);
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
			case ArithmeticsPackage.RANGE_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
			case ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR:
				return throughOperator != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeExpressionImpl
