/**
 */
package org.servicifi.gelato.language.cobol.specialnames;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.references.AlphabetNameReference;
import org.servicifi.gelato.language.cobol.references.ElementReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbolic Character Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement#getSymbolicCharacters <em>Symbolic Characters</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement#getAlphabetNameReference <em>Alphabet Name Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getSymbolicCharacterStatement()
 * @model
 * @generated
 */
public interface SymbolicCharacterStatement extends SpecialNameStatement, ElementReference {
	/**
	 * Returns the value of the '<em><b>Symbolic Characters</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbolic Characters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolic Characters</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getSymbolicCharacterStatement_SymbolicCharacters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SymbolicCharacter> getSymbolicCharacters();

	/**
	 * Returns the value of the '<em><b>Alphabet Name Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabet Name Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabet Name Reference</em>' containment reference.
	 * @see #setAlphabetNameReference(AlphabetNameReference)
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getSymbolicCharacterStatement_AlphabetNameReference()
	 * @model containment="true"
	 * @generated
	 */
	AlphabetNameReference getAlphabetNameReference();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement#getAlphabetNameReference <em>Alphabet Name Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabet Name Reference</em>' containment reference.
	 * @see #getAlphabetNameReference()
	 * @generated
	 */
	void setAlphabetNameReference(AlphabetNameReference value);

} // SymbolicCharacterStatement
