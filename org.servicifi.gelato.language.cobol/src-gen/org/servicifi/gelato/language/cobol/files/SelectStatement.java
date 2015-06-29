/**
 */
package org.servicifi.gelato.language.cobol.files;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.SelectStatement#getFileStatus <em>File Status</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.SelectStatement#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.SelectStatement#getExternalFileNames <em>External File Names</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.SelectStatement#getFileNameReference <em>File Name Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getSelectStatement()
 * @model
 * @generated
 */
public interface SelectStatement extends IncompleteElement {
	/**
	 * Returns the value of the '<em><b>File Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Status</em>' containment reference.
	 * @see #setFileStatus(FileStatus)
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getSelectStatement_FileStatus()
	 * @model containment="true"
	 * @generated
	 */
	FileStatus getFileStatus();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.files.SelectStatement#getFileStatus <em>File Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Status</em>' containment reference.
	 * @see #getFileStatus()
	 * @generated
	 */
	void setFileStatus(FileStatus value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getSelectStatement_IsOptional()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.files.SelectStatement#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>External File Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External File Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External File Names</em>' attribute list.
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getSelectStatement_ExternalFileNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getExternalFileNames();

	/**
	 * Returns the value of the '<em><b>File Name Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name Reference</em>' containment reference.
	 * @see #setFileNameReference(FileNameReference)
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getSelectStatement_FileNameReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileNameReference getFileNameReference();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.files.SelectStatement#getFileNameReference <em>File Name Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name Reference</em>' containment reference.
	 * @see #getFileNameReference()
	 * @generated
	 */
	void setFileNameReference(FileNameReference value);

} // SelectStatement
