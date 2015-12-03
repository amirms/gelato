/**
 */
package org.servicifi.gelato.language.cobol.files;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.FileStatus#getFileStatus <em>File Status</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.FileStatus#getVsamFileStatus <em>Vsam File Status</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getFileStatus()
 * @model
 * @generated
 */
public interface FileStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>File Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Status</em>' containment reference.
	 * @see #setFileStatus(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getFileStatus_FileStatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IdentifierReference getFileStatus();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.files.FileStatus#getFileStatus <em>File Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Status</em>' containment reference.
	 * @see #getFileStatus()
	 * @generated
	 */
	void setFileStatus(IdentifierReference value);

	/**
	 * Returns the value of the '<em><b>Vsam File Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vsam File Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vsam File Status</em>' containment reference.
	 * @see #setVsamFileStatus(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getFileStatus_VsamFileStatus()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierReference getVsamFileStatus();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.files.FileStatus#getVsamFileStatus <em>Vsam File Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vsam File Status</em>' containment reference.
	 * @see #getVsamFileStatus()
	 * @generated
	 */
	void setVsamFileStatus(IdentifierReference value);

} // FileStatus
