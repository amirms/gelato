/**
 */
package org.servicifi.gelato.language.cobol.tables;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.references.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.IndexName#getAdditionalIndexNames <em>Additional Index Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getIndexName()
 * @model
 * @generated
 */
public interface IndexName extends NamedElement, ReferenceableElement {
	/**
	 * Returns the value of the '<em><b>Additional Index Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.tables.AdditionalIndexName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Index Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Index Names</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.tables.TablesPackage#getIndexName_AdditionalIndexNames()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionalIndexName> getAdditionalIndexNames();

} // IndexName
