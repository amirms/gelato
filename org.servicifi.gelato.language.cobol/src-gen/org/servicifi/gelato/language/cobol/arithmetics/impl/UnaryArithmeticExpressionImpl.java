/**
 */
package org.servicifi.gelato.language.cobol.arithmetics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage;
import org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild;

import org.servicifi.gelato.language.cobol.operators.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionImpl#getUnaryOperator <em>Unary Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryArithmeticExpressionImpl extends PowerArithmeticExpressionChildImpl implements UnaryArithmeticExpression {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected UnaryArithmeticExpressionChild child;

	/**
	 * The cached value of the '{@link #getUnaryOperator() <em>Unary Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOperator()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperator unaryOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryArithmeticExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmeticsPackage.Literals.UNARY_ARITHMETIC_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryArithmeticExpressionChild getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(UnaryArithmeticExpressionChild newChild, NotificationChain msgs) {
		UnaryArithmeticExpressionChild oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(UnaryArithmeticExpressionChild newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator getUnaryOperator() {
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryOperator(UnaryOperator newUnaryOperator, NotificationChain msgs) {
		UnaryOperator oldUnaryOperator = unaryOperator;
		unaryOperator = newUnaryOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR, oldUnaryOperator, newUnaryOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryOperator(UnaryOperator newUnaryOperator) {
		if (newUnaryOperator != unaryOperator) {
			NotificationChain msgs = null;
			if (unaryOperator != null)
				msgs = ((InternalEObject)unaryOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR, null, msgs);
			if (newUnaryOperator != null)
				msgs = ((InternalEObject)newUnaryOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR, null, msgs);
			msgs = basicSetUnaryOperator(newUnaryOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR, newUnaryOperator, newUnaryOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD:
				return basicSetChild(null, msgs);
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR:
				return basicSetUnaryOperator(null, msgs);
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
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD:
				return getChild();
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR:
				return getUnaryOperator();
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
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD:
				setChild((UnaryArithmeticExpressionChild)newValue);
				return;
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR:
				setUnaryOperator((UnaryOperator)newValue);
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
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD:
				setChild((UnaryArithmeticExpressionChild)null);
				return;
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR:
				setUnaryOperator((UnaryOperator)null);
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
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD:
				return child != null;
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR:
				return unaryOperator != null;
		}
		return super.eIsSet(featureID);
	}

} //UnaryArithmeticExpressionImpl
