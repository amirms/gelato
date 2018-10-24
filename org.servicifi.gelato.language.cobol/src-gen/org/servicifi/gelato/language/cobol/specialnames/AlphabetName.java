/**
 */
package org.servicifi.gelato.language.cobol.specialnames;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alphabet Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.AlphabetName#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getAlphabetName()
 * @model
 * @generated
 */
public interface AlphabetName extends SpecialName, SpecialNameStatement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AlphabetType)
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getAlphabetName_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AlphabetType getType();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.specialnames.AlphabetName#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AlphabetType value);

} // AlphabetName
