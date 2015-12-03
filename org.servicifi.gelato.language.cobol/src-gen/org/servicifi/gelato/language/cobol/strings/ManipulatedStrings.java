/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manipulated Strings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.ManipulatedStrings#getStrings <em>Strings</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.ManipulatedStrings#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getManipulatedStrings()
 * @model abstract="true"
 * @generated
 */
public interface ManipulatedStrings extends org.servicifi.gelato.language.cobol.strings.String {
	/**
	 * Returns the value of the '<em><b>Strings</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.PrimaryOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strings</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getManipulatedStrings_Strings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PrimaryOperand> getStrings();

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' containment reference.
	 * @see #setDelimiter(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage#getManipulatedStrings_Delimiter()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryOperand getDelimiter();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.strings.ManipulatedStrings#getDelimiter <em>Delimiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' containment reference.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(PrimaryOperand value);

} // ManipulatedStrings
