/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.literals.IntegerLiteral;

import org.servicifi.gelato.language.cobol.references.MnemonicNameReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Write#getRecordName <em>Record Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Write#getNumLines <em>Num Lines</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Write#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Write#getMnemonicName <em>Mnemonic Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Write#getSender <em>Sender</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getWrite()
 * @model
 * @generated
 */
public interface Write extends Statement, ErrorHandled {
	/**
	 * Returns the value of the '<em><b>Record Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Name</em>' containment reference.
	 * @see #setRecordName(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getWrite_RecordName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identifier getRecordName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Write#getRecordName <em>Record Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Name</em>' containment reference.
	 * @see #getRecordName()
	 * @generated
	 */
	void setRecordName(Identifier value);

	/**
	 * Returns the value of the '<em><b>Num Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Lines</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Lines</em>' containment reference.
	 * @see #setNumLines(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getWrite_NumLines()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getNumLines();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Write#getNumLines <em>Num Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Lines</em>' containment reference.
	 * @see #getNumLines()
	 * @generated
	 */
	void setNumLines(Identifier value);

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' containment reference.
	 * @see #setInteger(IntegerLiteral)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getWrite_Integer()
	 * @model containment="true"
	 * @generated
	 */
	IntegerLiteral getInteger();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Write#getInteger <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' containment reference.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(IntegerLiteral value);

	/**
	 * Returns the value of the '<em><b>Mnemonic Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mnemonic Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mnemonic Name</em>' containment reference.
	 * @see #setMnemonicName(MnemonicNameReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getWrite_MnemonicName()
	 * @model containment="true"
	 * @generated
	 */
	MnemonicNameReference getMnemonicName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Write#getMnemonicName <em>Mnemonic Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mnemonic Name</em>' containment reference.
	 * @see #getMnemonicName()
	 * @generated
	 */
	void setMnemonicName(MnemonicNameReference value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getWrite_Sender()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getSender();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Write#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Identifier value);

} // Write
