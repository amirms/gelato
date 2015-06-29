/**
 */
package org.servicifi.gelato.language.cobol.specialnames;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage
 * @generated
 */
public interface SpecialnamesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecialnamesFactory eINSTANCE = org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>On Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Status</em>'.
	 * @generated
	 */
	OnStatus createOnStatus();

	/**
	 * Returns a new object of class '<em>Off Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Off Status</em>'.
	 * @generated
	 */
	OffStatus createOffStatus();

	/**
	 * Returns a new object of class '<em>Alphabet Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alphabet Name</em>'.
	 * @generated
	 */
	AlphabetName createAlphabetName();

	/**
	 * Returns a new object of class '<em>UPSI Switch Is</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UPSI Switch Is</em>'.
	 * @generated
	 */
	UPSISwitchIs createUPSISwitchIs();

	/**
	 * Returns a new object of class '<em>Predefined Alphabet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predefined Alphabet Type</em>'.
	 * @generated
	 */
	PredefinedAlphabetType createPredefinedAlphabetType();

	/**
	 * Returns a new object of class '<em>Explicit Alphabet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explicit Alphabet Type</em>'.
	 * @generated
	 */
	ExplicitAlphabetType createExplicitAlphabetType();

	/**
	 * Returns a new object of class '<em>Code Name Alphabet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Name Alphabet Type</em>'.
	 * @generated
	 */
	CodeNameAlphabetType createCodeNameAlphabetType();

	/**
	 * Returns a new object of class '<em>Currency Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency Sign</em>'.
	 * @generated
	 */
	CurrencySign createCurrencySign();

	/**
	 * Returns a new object of class '<em>Class Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Name</em>'.
	 * @generated
	 */
	ClassName createClassName();

	/**
	 * Returns a new object of class '<em>System Device Is</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Device Is</em>'.
	 * @generated
	 */
	SystemDeviceIs createSystemDeviceIs();

	/**
	 * Returns a new object of class '<em>Symbolic Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbolic Character</em>'.
	 * @generated
	 */
	SymbolicCharacter createSymbolicCharacter();

	/**
	 * Returns a new object of class '<em>Symbolic Character Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbolic Character Statement</em>'.
	 * @generated
	 */
	SymbolicCharacterStatement createSymbolicCharacterStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpecialnamesPackage getSpecialnamesPackage();

} //SpecialnamesFactory
