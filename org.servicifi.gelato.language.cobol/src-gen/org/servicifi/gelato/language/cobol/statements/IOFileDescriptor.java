/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO File Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.IOFileDescriptor#getIoFiles <em>Io Files</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.IOFileDescriptor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getIOFileDescriptor()
 * @model
 * @generated
 */
public interface IOFileDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Io Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.statements.IOFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Files</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getIOFileDescriptor_IoFiles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IOFile> getIoFiles();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.statements.IOTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.IOTypes
	 * @see #setType(IOTypes)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getIOFileDescriptor_Type()
	 * @model required="true"
	 * @generated
	 */
	IOTypes getType();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.IOFileDescriptor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.IOTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(IOTypes value);

} // IOFileDescriptor
