/**
 */
package org.servicifi.gelato.language.cobol.sections;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.files.FileName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.FileSection#getFileDescriptors <em>File Descriptors</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage#getFileSection()
 * @model
 * @generated
 */
public interface FileSection extends DataDivisionSection {
	/**
	 * Returns the value of the '<em><b>File Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.files.FileName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Descriptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Descriptors</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage#getFileSection_FileDescriptors()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileName> getFileDescriptors();

} // FileSection
