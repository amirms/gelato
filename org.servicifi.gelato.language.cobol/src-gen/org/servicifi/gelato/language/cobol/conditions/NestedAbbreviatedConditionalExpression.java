/**
 */
package org.servicifi.gelato.language.cobol.conditions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Abbreviated Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getNestedAbbreviatedConditionalExpression()
 * @model
 * @generated
 */
public interface NestedAbbreviatedConditionalExpression extends AbbreviatedRelationalExpressionChild {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Condition)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getNestedAbbreviatedConditionalExpression_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getExpression();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Condition value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference.
	 * @see #setRest(Condition)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getNestedAbbreviatedConditionalExpression_Rest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getRest();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression#getRest <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' containment reference.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(Condition value);

} // NestedAbbreviatedConditionalExpression
