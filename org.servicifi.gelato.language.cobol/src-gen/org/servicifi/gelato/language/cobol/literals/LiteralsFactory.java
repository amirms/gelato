/**
 */
package org.servicifi.gelato.language.cobol.literals;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage
 * @generated
 */
public interface LiteralsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LiteralsFactory eINSTANCE = org.servicifi.gelato.language.cobol.literals.impl.LiteralsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alphanumeric Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alphanumeric Literal</em>'.
	 * @generated
	 */
	AlphanumericLiteral createAlphanumericLiteral();

	/**
	 * Returns a new object of class '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal</em>'.
	 * @generated
	 */
	IntegerLiteral createIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Floating Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floating Decimal Literal</em>'.
	 * @generated
	 */
	FloatingDecimalLiteral createFloatingDecimalLiteral();

	/**
	 * Returns a new object of class '<em>All Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Literal</em>'.
	 * @generated
	 */
	AllLiteral createAllLiteral();

	/**
	 * Returns a new object of class '<em>Pseudo Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pseudo Literal</em>'.
	 * @generated
	 */
	PseudoLiteral createPseudoLiteral();

	/**
	 * Returns a new object of class '<em>National Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>National Literal</em>'.
	 * @generated
	 */
	NationalLiteral createNationalLiteral();

	/**
	 * Returns a new object of class '<em>Fixed Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Decimal Literal</em>'.
	 * @generated
	 */
	FixedDecimalLiteral createFixedDecimalLiteral();

	/**
	 * Returns a new object of class '<em>National Hex Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>National Hex Literal</em>'.
	 * @generated
	 */
	NationalHexLiteral createNationalHexLiteral();

	/**
	 * Returns a new object of class '<em>Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null</em>'.
	 * @generated
	 */
	Null createNull();

	/**
	 * Returns a new object of class '<em>Zero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zero</em>'.
	 * @generated
	 */
	Zero createZero();

	/**
	 * Returns a new object of class '<em>Quote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quote</em>'.
	 * @generated
	 */
	Quote createQuote();

	/**
	 * Returns a new object of class '<em>Low Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Low Value</em>'.
	 * @generated
	 */
	LowValue createLowValue();

	/**
	 * Returns a new object of class '<em>High Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>High Value</em>'.
	 * @generated
	 */
	HighValue createHighValue();

	/**
	 * Returns a new object of class '<em>Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Space</em>'.
	 * @generated
	 */
	Space createSpace();

	/**
	 * Returns a new object of class '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any</em>'.
	 * @generated
	 */
	Any createAny();

	/**
	 * Returns a new object of class '<em>Characters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characters</em>'.
	 * @generated
	 */
	Characters createCharacters();

	/**
	 * Returns a new object of class '<em>Alphanumeric Hexa Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alphanumeric Hexa Decimal Literal</em>'.
	 * @generated
	 */
	AlphanumericHexaDecimalLiteral createAlphanumericHexaDecimalLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LiteralsPackage getLiteralsPackage();

} //LiteralsFactory
