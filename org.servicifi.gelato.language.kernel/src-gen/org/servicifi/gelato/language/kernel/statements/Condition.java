/**
 */
package org.servicifi.gelato.language.kernel.statements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.Condition#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getCondition()
 * @generated
 */
public interface Condition extends StatementContainer, Conditional, Statement {
	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' containment reference.
	 * @see #setElseStatement(Statement)
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getCondition_ElseStatement()
	 * @generated
	 */
	Statement getElseStatement();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.statements.Condition#getElseStatement <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Statement</em>' containment reference.
	 * @see #getElseStatement()
	 * @generated
	 */
	void setElseStatement(Statement value);

} // Condition
