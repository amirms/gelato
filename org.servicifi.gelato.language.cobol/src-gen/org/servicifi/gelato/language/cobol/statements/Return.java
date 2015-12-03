/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Return#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Return#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends Statement, ErrorHandled {
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
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getReturn_FileName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileNameReference getFileName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Return#getFileName <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' containment reference.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(FileNameReference value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getReturn_Output()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierReference getOutput();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Return#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(IdentifierReference value);

} // Return
