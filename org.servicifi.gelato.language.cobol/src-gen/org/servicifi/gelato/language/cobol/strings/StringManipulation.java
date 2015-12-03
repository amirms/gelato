/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Manipulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.StringManipulation#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getStringManipulation()
 * @model abstract="true"
 * @generated
 */
public interface StringManipulation extends org.servicifi.gelato.language.cobol.strings.String {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.strings.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getStringManipulation_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

} // StringManipulation
