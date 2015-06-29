/**
 */
package org.servicifi.gelato.language.cobol.arithmetics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage;
import org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild;

import org.servicifi.gelato.language.cobol.operators.MultiplicativeOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicative Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionImpl#getMultiplicativeOperators <em>Multiplicative Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicativeArithmeticExpressionImpl extends AdditiveArithmeticExpressionChildImpl implements MultiplicativeArithmeticExpression {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiplicativeArithmeticExpressionChild> children;

	/**
	 * The cached value of the '{@link #getMultiplicativeOperators() <em>Multiplicative Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicativeOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiplicativeOperator> multiplicativeOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicativeArithmeticExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmeticsPackage.Literals.MULTIPLICATIVE_ARITHMETIC_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiplicativeArithmeticExpressionChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<MultiplicativeArithmeticExpressionChild>(MultiplicativeArithmeticExpressionChild.class, this, ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiplicativeOperator> getMultiplicativeOperators() {
		if (multiplicativeOperators == null) {
			multiplicativeOperators = new EObjectContainmentEList<MultiplicativeOperator>(MultiplicativeOperator.class, this, ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS);
		}
		return multiplicativeOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				return ((InternalEList<?>)getMultiplicativeOperators()).basicRemove(otherEnd, msgs);
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
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN:
				return getChildren();
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				return getMultiplicativeOperators();
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
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends MultiplicativeArithmeticExpressionChild>)newValue);
				return;
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				getMultiplicativeOperators().clear();
				getMultiplicativeOperators().addAll((Collection<? extends MultiplicativeOperator>)newValue);
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
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN:
				getChildren().clear();
				return;
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				getMultiplicativeOperators().clear();
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
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				return multiplicativeOperators != null && !multiplicativeOperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiplicativeArithmeticExpressionImpl
