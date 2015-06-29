/**
 */
package org.servicifi.gelato.language.cobol.specialnames;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Name Alphabet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getCodeNameAlphabetType()
 * @model
 * @generated
 */
public interface CodeNameAlphabetType extends AlphabetType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getCodeNameAlphabetType_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // CodeNameAlphabetType
