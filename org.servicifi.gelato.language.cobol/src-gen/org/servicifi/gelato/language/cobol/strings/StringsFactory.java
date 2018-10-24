/**
 */
package org.servicifi.gelato.language.cobol.strings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage
 * @generated
 */
public interface StringsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StringsFactory eINSTANCE = org.servicifi.gelato.language.cobol.strings.impl.StringsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concatenating Strings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concatenating Strings</em>'.
	 * @generated
	 */
	ConcatenatingStrings createConcatenatingStrings();

	/**
	 * Returns a new object of class '<em>Splitted String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Splitted String</em>'.
	 * @generated
	 */
	SplittedString createSplittedString();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Tallying Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tallying Occurrence</em>'.
	 * @generated
	 */
	TallyingOccurrence createTallyingOccurrence();

	/**
	 * Returns a new object of class '<em>Replacement Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replacement Occurrence</em>'.
	 * @generated
	 */
	ReplacementOccurrence createReplacementOccurrence();

	/**
	 * Returns a new object of class '<em>Any Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Character</em>'.
	 * @generated
	 */
	AnyCharacter createAnyCharacter();

	/**
	 * Returns a new object of class '<em>Specific Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Character</em>'.
	 * @generated
	 */
	SpecificCharacter createSpecificCharacter();

	/**
	 * Returns a new object of class '<em>Any Character By Specific Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Character By Specific Character</em>'.
	 * @generated
	 */
	AnyCharacterBySpecificCharacter createAnyCharacterBySpecificCharacter();

	/**
	 * Returns a new object of class '<em>Specific Character By Specific Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Character By Specific Character</em>'.
	 * @generated
	 */
	SpecificCharacterBySpecificCharacter createSpecificCharacterBySpecificCharacter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StringsPackage getStringsPackage();

} //StringsFactory
