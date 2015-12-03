/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.servicifi.gelato.language.cobol.operators.Negate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negated Abbreviated Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression#getChild <em>Child</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression#getNegateOperator <em>Negate Operator</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getNegatedAbbreviatedConditionalExpression()
 * @model
 * @generated
 */
public interface NegatedAbbreviatedConditionalExpression extends AbbreviatedConditionalExpressionChild {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(NegatedAbbreviatedConditionalExpressionChild)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getNegatedAbbreviatedConditionalExpression_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NegatedAbbreviatedConditionalExpressionChild getChild();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(NegatedAbbreviatedConditionalExpressionChild value);

	/**
	 * Returns the value of the '<em><b>Negate Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negate Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negate Operator</em>' containment reference.
	 * @see #setNegateOperator(Negate)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getNegatedAbbreviatedConditionalExpression_NegateOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Negate getNegateOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression#getNegateOperator <em>Negate Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negate Operator</em>' containment reference.
	 * @see #getNegateOperator()
	 * @generated
	 */
	void setNegateOperator(Negate value);

} // NegatedAbbreviatedConditionalExpression
