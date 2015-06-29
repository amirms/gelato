/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Release#getRecordName <em>Record Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Release#getSender <em>Sender</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends Statement {
	/**
	 * Returns the value of the '<em><b>Record Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Name</em>' containment reference.
	 * @see #setRecordName(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getRelease_RecordName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IdentifierReference getRecordName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Release#getRecordName <em>Record Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Name</em>' containment reference.
	 * @see #getRecordName()
	 * @generated
	 */
	void setRecordName(IdentifierReference value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getRelease_Sender()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierReference getSender();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Release#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(IdentifierReference value);

} // Release
