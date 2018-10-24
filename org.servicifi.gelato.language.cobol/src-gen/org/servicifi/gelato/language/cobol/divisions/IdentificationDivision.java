/**
 */
package org.servicifi.gelato.language.cobol.divisions;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identification Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.divisions.IdentificationDivision#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsPackage#getIdentificationDivision()
 * @model
 * @generated
 */
public interface IdentificationDivision extends Division, IncompleteElement {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.divisions.Properties}.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.divisions.Properties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute list.
	 * @see org.servicifi.gelato.language.cobol.divisions.Properties
	 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsPackage#getIdentificationDivision_Properties()
	 * @model
	 * @generated
	 */
	EList<Properties> getProperties();

} // IdentificationDivision
