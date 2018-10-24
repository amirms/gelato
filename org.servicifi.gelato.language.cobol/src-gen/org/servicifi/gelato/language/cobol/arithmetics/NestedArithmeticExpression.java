/**
 */
package org.servicifi.gelato.language.cobol.arithmetics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getNestedArithmeticExpression()
 * @model
 * @generated
 */
public interface NestedArithmeticExpression extends PrimaryExpression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ArithmeticExpression)
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getNestedArithmeticExpression_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpression getExpression();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ArithmeticExpression value);

} // NestedArithmeticExpression
