/**
 */
package org.servicifi.gelato.language.cobol.arithmetics;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operators.MultiplicativeOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression#getMultiplicativeOperators <em>Multiplicative Operators</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getMultiplicativeArithmeticExpression()
 * @model
 * @generated
 */
public interface MultiplicativeArithmeticExpression extends AdditiveArithmeticExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getMultiplicativeArithmeticExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MultiplicativeArithmeticExpressionChild> getChildren();

	/**
	 * Returns the value of the '<em><b>Multiplicative Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operators.MultiplicativeOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicative Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicative Operators</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getMultiplicativeArithmeticExpression_MultiplicativeOperators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MultiplicativeOperator> getMultiplicativeOperators();

} // MultiplicativeArithmeticExpression
