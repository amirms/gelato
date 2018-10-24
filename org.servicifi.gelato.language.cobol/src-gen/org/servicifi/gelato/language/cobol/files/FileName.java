/**
 */
package org.servicifi.gelato.language.cobol.files;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.dataitems.DataItem;
import org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute;

import org.servicifi.gelato.language.cobol.references.ReferenceableElement;

import org.servicifi.gelato.language.cobol.sentences.StatementContainer;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.FileName#getFileDescriptor <em>File Descriptor</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.FileName#getRecords <em>Records</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.FileName#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.FileName#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getFileName()
 * @model
 * @generated
 */
public interface FileName extends IncompleteElement, ReferenceableElement {
	/**
	 * Returns the value of the '<em><b>File Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.files.FileDescriptors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Descriptor</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.files.FileDescriptors
	 * @see #setFileDescriptor(FileDescriptors)
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getFileName_FileDescriptor()
	 * @model required="true"
	 * @generated
	 */
	FileDescriptors getFileDescriptor();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.files.FileName#getFileDescriptor <em>File Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Descriptor</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.files.FileDescriptors
	 * @see #getFileDescriptor()
	 * @generated
	 */
	void setFileDescriptor(FileDescriptors value);

	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.dataitems.DataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getFileName_Records()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataItem> getRecords();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getFileName_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataItemAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.sentences.StatementContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentences</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.files.FilesPackage#getFileName_Sentences()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatementContainer> getSentences();

} // FileName
