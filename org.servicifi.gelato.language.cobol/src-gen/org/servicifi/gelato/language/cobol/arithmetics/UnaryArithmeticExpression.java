/**
 */
package org.servicifi.gelato.language.cobol.arithmetics;

import org.servicifi.gelato.language.cobol.operators.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression#getChild <em>Child</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression#getUnaryOperator <em>Unary Operator</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getUnaryArithmeticExpression()
 * @model
 * @generated
 */
public interface UnaryArithmeticExpression extends PowerArithmeticExpressionChild {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(UnaryArithmeticExpressionChild)
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getUnaryArithmeticExpression_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnaryArithmeticExpressionChild getChild();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(UnaryArithmeticExpressionChild value);

	/**
	 * Returns the value of the '<em><b>Unary Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Operator</em>' containment reference.
	 * @see #setUnaryOperator(UnaryOperator)
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getUnaryArithmeticExpression_UnaryOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnaryOperator getUnaryOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression#getUnaryOperator <em>Unary Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Operator</em>' containment reference.
	 * @see #getUnaryOperator()
	 * @generated
	 */
	void setUnaryOperator(UnaryOperator value);

} // UnaryArithmeticExpression
