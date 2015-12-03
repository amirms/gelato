/**
 */
package org.servicifi.gelato.language.cobol.operands;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rounded Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.operands.RoundedIdentifier#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.operands.OperandsPackage#getRoundedIdentifier()
 * @model
 * @generated
 */
public interface RoundedIdentifier extends ArithmeticOperand {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.servicifi.gelato.language.cobol.operands.OperandsPackage#getRoundedIdentifier_Identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.operands.RoundedIdentifier#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

} // RoundedIdentifier
