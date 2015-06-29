/**
 */
package org.servicifi.gelato.language.kernel.statements;

import org.servicifi.gelato.language.kernel.expressions.Expression;

import org.servicifi.gelato.language.kernel.references.ElementReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.AssignmentStatement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getAssignmentStatement()
 * @generated
 */
public interface AssignmentStatement extends Statement, ElementReference {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getAssignmentStatement_Value()
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.statements.AssignmentStatement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // AssignmentStatement
