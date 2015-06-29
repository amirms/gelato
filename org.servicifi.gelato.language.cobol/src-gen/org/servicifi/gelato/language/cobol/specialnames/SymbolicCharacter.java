/**
 */
package org.servicifi.gelato.language.cobol.specialnames;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.literals.IntegerLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbolic Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter#getIntegers <em>Integers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getSymbolicCharacter()
 * @model
 * @generated
 */
public interface SymbolicCharacter extends SpecialName {
	/**
	 * Returns the value of the '<em><b>Integers</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.literals.IntegerLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integers</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getSymbolicCharacter_Integers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IntegerLiteral> getIntegers();

} // SymbolicCharacter
