/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Accept#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getAccept()
 * @model
 * @generated
 */
public interface Accept extends Statement, IncompleteElement {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getAccept_Receiver()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryOperand getReceiver();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Accept#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(PrimaryOperand value);

} // Accept
