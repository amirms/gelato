/**
 */
package org.servicifi.gelato.language.cobol.arithmetics;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operators.AdditiveOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression#getAdditiveOperators <em>Additive Operators</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getAdditiveArithmeticExpression()
 * @model
 * @generated
 */
public interface AdditiveArithmeticExpression extends RangeExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getAdditiveArithmeticExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AdditiveArithmeticExpressionChild> getChildren();

	/**
	 * Returns the value of the '<em><b>Additive Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operators.AdditiveOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Operators</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getAdditiveArithmeticExpression_AdditiveOperators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AdditiveOperator> getAdditiveOperators();

} // AdditiveArithmeticExpression
