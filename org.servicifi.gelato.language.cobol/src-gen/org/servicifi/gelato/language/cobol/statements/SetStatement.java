/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.SetStatement#getSender <em>Sender</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSetStatement()
 * @model abstract="true"
 * @generated
 */
public interface SetStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSetStatement_Sender()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryOperand getSender();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.SetStatement#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(PrimaryOperand value);

} // SetStatement
