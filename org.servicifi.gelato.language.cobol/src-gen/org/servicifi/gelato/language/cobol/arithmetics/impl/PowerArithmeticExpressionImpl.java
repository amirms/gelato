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
import org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.impl.PowerArithmeticExpressionImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerArithmeticExpressionImpl extends MultiplicativeArithmeticExpressionChildImpl implements PowerArithmeticExpression {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerArithmeticExpressionChild> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerArithmeticExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmeticsPackage.Literals.POWER_ARITHMETIC_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerArithmeticExpressionChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<PowerArithmeticExpressionChild>(PowerArithmeticExpressionChild.class, this, ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION__CHILDREN:
				return getChildren();
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
			case ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends PowerArithmeticExpressionChild>)newValue);
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
			case ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION__CHILDREN:
				getChildren().clear();
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
			case ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PowerArithmeticExpressionImpl
