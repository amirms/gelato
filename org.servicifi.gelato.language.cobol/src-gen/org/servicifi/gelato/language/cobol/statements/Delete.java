/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Delete#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getDelete()
 * @model
 * @generated
 */
public interface Delete extends Statement, ErrorHandled {
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
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getDelete_FileName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileNameReference getFileName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Delete#getFileName <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' containment reference.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(FileNameReference value);

} // Delete
