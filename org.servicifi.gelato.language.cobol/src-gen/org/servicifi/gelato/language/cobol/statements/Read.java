/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Read#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Read#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Read#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getRead()
 * @model
 * @generated
 */
public interface Read extends Statement, ErrorHandled {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getRead_Receiver()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getReceiver();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Read#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Identifier value);

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' containment reference.
	 * @see #setKeyName(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getRead_KeyName()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getKeyName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Read#getKeyName <em>Key Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name</em>' containment reference.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(Identifier value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' containment reference.
	 * @see #setFileName(FileNameReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getRead_FileName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileNameReference getFileName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Read#getFileName <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' containment reference.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(FileNameReference value);

} // Read
