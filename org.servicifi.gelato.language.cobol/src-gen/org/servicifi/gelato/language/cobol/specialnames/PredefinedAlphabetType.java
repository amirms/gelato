/**
 */
package org.servicifi.gelato.language.cobol.specialnames;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predefined Alphabet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getPredefinedAlphabetType()
 * @model
 * @generated
 */
public interface PredefinedAlphabetType extends AlphabetType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetTypes
	 * @see #setValue(PredefinedAlphabetTypes)
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getPredefinedAlphabetType_Value()
	 * @model required="true"
	 * @generated
	 */
	PredefinedAlphabetTypes getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetTypes
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PredefinedAlphabetTypes value);

} // PredefinedAlphabetType
