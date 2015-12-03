/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.Occurrence#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getOccurrence()
 * @model abstract="true"
 * @generated
 */
public interface Occurrence extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.strings.Occurrences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.strings.Occurrences
	 * @see #setType(Occurrences)
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getOccurrence_Type()
	 * @model
	 * @generated
	 */
	Occurrences getType();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.strings.Occurrence#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.strings.Occurrences
	 * @see #getType()
	 * @generated
	 */
	void setType(Occurrences value);

} // Occurrence
