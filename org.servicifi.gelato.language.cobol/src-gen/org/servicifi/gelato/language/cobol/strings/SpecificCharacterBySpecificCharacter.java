/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.servicifi.gelato.language.cobol.operands.ReplacementOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Character By Specific Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getSpecificCharacterBySpecificCharacter()
 * @model
 * @generated
 */
public interface SpecificCharacterBySpecificCharacter extends Replacement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ReplacementOperand)
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getSpecificCharacterBySpecificCharacter_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReplacementOperand getSource();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ReplacementOperand value);

} // SpecificCharacterBySpecificCharacter
