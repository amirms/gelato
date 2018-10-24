/**
 */
package org.servicifi.gelato.language.cobol.conditions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionsPackage;

import org.servicifi.gelato.language.cobol.operators.LogicalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Or Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionImpl#getLogicalOperators <em>Logical Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalOrExpressionImpl extends ConditionImpl implements ConditionalOrExpression {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalOrExpressionChild> children;

	/**
	 * The cached value of the '{@link #getLogicalOperators() <em>Logical Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalOperator> logicalOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalOrExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionsPackage.Literals.CONDITIONAL_OR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalOrExpressionChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ConditionalOrExpressionChild>(ConditionalOrExpressionChild.class, this, ConditionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalOperator> getLogicalOperators() {
		if (logicalOperators == null) {
			logicalOperators = new EObjectContainmentEList<LogicalOperator>(LogicalOperator.class, this, ConditionsPackage.CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS);
		}
		return logicalOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS:
				return ((InternalEList<?>)getLogicalOperators()).basicRemove(otherEnd, msgs);
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
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN:
				return getChildren();
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS:
				return getLogicalOperators();
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
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ConditionalOrExpressionChild>)newValue);
				return;
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS:
				getLogicalOperators().clear();
				getLogicalOperators().addAll((Collection<? extends LogicalOperator>)newValue);
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
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN:
				getChildren().clear();
				return;
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS:
				getLogicalOperators().clear();
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
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS:
				return logicalOperators != null && !logicalOperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalOrExpressionImpl
