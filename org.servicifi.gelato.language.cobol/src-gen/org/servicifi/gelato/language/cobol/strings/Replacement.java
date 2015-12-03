/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.servicifi.gelato.language.cobol.operands.ReplacementOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.Replacement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getReplacement()
 * @model abstract="true"
 * @generated
 */
public interface Replacement extends StringManipulation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ReplacementOperand)
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getReplacement_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReplacementOperand getTarget();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.strings.Replacement#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ReplacementOperand value);

} // Replacement
