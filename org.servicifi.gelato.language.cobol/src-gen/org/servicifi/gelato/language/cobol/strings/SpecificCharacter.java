/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacter#getTallying <em>Tallying</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getSpecificCharacter()
 * @model
 * @generated
 */
public interface SpecificCharacter extends Tallying {
	/**
	 * Returns the value of the '<em><b>Tallying</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tallying</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tallying</em>' containment reference.
	 * @see #setTallying(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getSpecificCharacter_Tallying()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryOperand getTallying();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacter#getTallying <em>Tallying</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tallying</em>' containment reference.
	 * @see #getTallying()
	 * @generated
	 */
	void setTallying(PrimaryOperand value);

} // SpecificCharacter
