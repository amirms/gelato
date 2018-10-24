/**
 */
package org.servicifi.gelato.language.cobol.arithmetics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getPowerArithmeticExpression()
 * @model
 * @generated
 */
public interface PowerArithmeticExpression extends MultiplicativeArithmeticExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage#getPowerArithmeticExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PowerArithmeticExpressionChild> getChildren();

} // PowerArithmeticExpression
