/**
 */
package org.servicifi.gelato.language.kernel.statements;

import org.servicifi.gelato.language.kernel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.Return#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getReturn()
 * @generated
 */
public interface Return extends Statement {
	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(Expression)
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getReturn_ReturnValue()
	 * @generated
	 */
	Expression getReturnValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.statements.Return#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(Expression value);

} // Return
