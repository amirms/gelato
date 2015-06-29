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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage;
import org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression;

import org.servicifi.gelato.language.cobol.operators.Equal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.AssignmentExpressionImpl#getAssignmentOperator <em>Assignment Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.AssignmentExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.AssignmentExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends EObjectImpl implements AssignmentExpression {
	/**
	 * The cached value of the '{@link #getAssignmentOperator() <em>Assignment Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentOperator()
	 * @generated
	 * @ordered
	 */
	protected Equal assignmentOperator;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ArithmeticExpression> children;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticExpression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmeticsPackage.Literals.ASSIGNMENT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal getAssignmentOperator() {
		return assignmentOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignmentOperator(Equal newAssignmentOperator, NotificationChain msgs) {
		Equal oldAssignmentOperator = assignmentOperator;
		assignmentOperator = newAssignmentOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, oldAssignmentOperator, newAssignmentOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignmentOperator(Equal newAssignmentOperator) {
		if (newAssignmentOperator != assignmentOperator) {
			NotificationChain msgs = null;
			if (assignmentOperator != null)
				msgs = ((InternalEObject)assignmentOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, null, msgs);
			if (newAssignmentOperator != null)
				msgs = ((InternalEObject)newAssignmentOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, null, msgs);
			msgs = basicSetAssignmentOperator(newAssignmentOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, newAssignmentOperator, newAssignmentOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArithmeticExpression> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ArithmeticExpression>(ArithmeticExpression.class, this, ArithmeticsPackage.ASSIGNMENT_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ArithmeticExpression newValue, NotificationChain msgs) {
		ArithmeticExpression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ArithmeticExpression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
				return basicSetAssignmentOperator(null, msgs);
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE:
				return basicSetValue(null, msgs);
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
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
				return getAssignmentOperator();
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__CHILDREN:
				return getChildren();
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE:
				return getValue();
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
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
				setAssignmentOperator((Equal)newValue);
				return;
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ArithmeticExpression>)newValue);
				return;
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE:
				setValue((ArithmeticExpression)newValue);
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
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
				setAssignmentOperator((Equal)null);
				return;
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__CHILDREN:
				getChildren().clear();
				return;
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE:
				setValue((ArithmeticExpression)null);
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
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
				return assignmentOperator != null;
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentExpressionImpl
