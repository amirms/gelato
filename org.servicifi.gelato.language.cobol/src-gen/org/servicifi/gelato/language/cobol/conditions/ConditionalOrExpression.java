/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operators.LogicalOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression#getLogicalOperators <em>Logical Operators</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getConditionalOrExpression()
 * @model
 * @generated
 */
public interface ConditionalOrExpression extends Condition {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getConditionalOrExpression_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalOrExpressionChild> getChildren();

	/**
	 * Returns the value of the '<em><b>Logical Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operators.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operators</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getConditionalOrExpression_LogicalOperators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LogicalOperator> getLogicalOperators();

} // ConditionalOrExpression
