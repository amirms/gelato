/**
 */
package org.servicifi.gelato.language.cobol.literals;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.water.WaterPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsFactory
 * @model kind="package"
 * @generated
 */
public interface LiteralsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "literals";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/literals";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "literals";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LiteralsPackage eINSTANCE = org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = WaterPackage.SELECT_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.AlphanumericLiteralImpl <em>Alphanumeric Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.AlphanumericLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getAlphanumericLiteral()
	 * @generated
	 */
	int ALPHANUMERIC_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHANUMERIC_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alphanumeric Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHANUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.NumericLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNumericLiteral()
	 * @generated
	 */
	int NUMERIC_LITERAL = 8;

	/**
	 * The number of structural features of the '<em>Numeric Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.IntegerLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.DecimalLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getDecimalLiteral()
	 * @generated
	 */
	int DECIMAL_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.FigurativeConstantLiteralImpl <em>Figurative Constant Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.FigurativeConstantLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getFigurativeConstantLiteral()
	 * @generated
	 */
	int FIGURATIVE_CONSTANT_LITERAL = 4;

	/**
	 * The number of structural features of the '<em>Figurative Constant Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURATIVE_CONSTANT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.BooleanLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.FloatingDecimalLiteralImpl <em>Floating Decimal Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.FloatingDecimalLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getFloatingDecimalLiteral()
	 * @generated
	 */
	int FLOATING_DECIMAL_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DECIMAL_LITERAL__VALUE = DECIMAL_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Floating Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DECIMAL_LITERAL_FEATURE_COUNT = DECIMAL_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.AllLiteralImpl <em>All Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.AllLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getAllLiteral()
	 * @generated
	 */
	int ALL_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_LITERAL__CONSTANT = FIGURATIVE_CONSTANT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_LITERAL_FEATURE_COUNT = FIGURATIVE_CONSTANT_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.ConstantLiteralImpl <em>Constant Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.ConstantLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getConstantLiteral()
	 * @generated
	 */
	int CONSTANT_LITERAL = 9;

	/**
	 * The number of structural features of the '<em>Constant Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_LITERAL_FEATURE_COUNT = FIGURATIVE_CONSTANT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.PseudoLiteralImpl <em>Pseudo Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.PseudoLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getPseudoLiteral()
	 * @generated
	 */
	int PSEUDO_LITERAL = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pseudo Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.DBCSLiteralImpl <em>DBCS Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.DBCSLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getDBCSLiteral()
	 * @generated
	 */
	int DBCS_LITERAL = 11;

	/**
	 * The number of structural features of the '<em>DBCS Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBCS_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.NationalLiteralImpl <em>National Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.NationalLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNationalLiteral()
	 * @generated
	 */
	int NATIONAL_LITERAL = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_LITERAL__VALUE = DBCS_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>National Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_LITERAL_FEATURE_COUNT = DBCS_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.FixedDecimalLiteralImpl <em>Fixed Decimal Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.FixedDecimalLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getFixedDecimalLiteral()
	 * @generated
	 */
	int FIXED_DECIMAL_LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_DECIMAL_LITERAL__VALUE = DECIMAL_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Fixed Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_DECIMAL_LITERAL_FEATURE_COUNT = DECIMAL_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.NationalHexLiteralImpl <em>National Hex Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.NationalHexLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNationalHexLiteral()
	 * @generated
	 */
	int NATIONAL_HEX_LITERAL = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_HEX_LITERAL__VALUE = DBCS_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>National Hex Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_HEX_LITERAL_FEATURE_COUNT = DBCS_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.NullImpl <em>Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.NullImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNull()
	 * @generated
	 */
	int NULL = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL__VALUE = CONSTANT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FEATURE_COUNT = CONSTANT_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.ZeroImpl <em>Zero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.ZeroImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getZero()
	 * @generated
	 */
	int ZERO = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO__VALUE = CONSTANT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_FEATURE_COUNT = CONSTANT_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.QuoteImpl <em>Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.QuoteImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getQuote()
	 * @generated
	 */
	int QUOTE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__VALUE = CONSTANT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_FEATURE_COUNT = CONSTANT_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.LowValueImpl <em>Low Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LowValueImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getLowValue()
	 * @generated
	 */
	int LOW_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_VALUE__VALUE = CONSTANT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Low Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_VALUE_FEATURE_COUNT = CONSTANT_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.HighValueImpl <em>High Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.HighValueImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getHighValue()
	 * @generated
	 */
	int HIGH_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_VALUE__VALUE = CONSTANT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>High Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_VALUE_FEATURE_COUNT = CONSTANT_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.SpaceImpl <em>Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.SpaceImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getSpace()
	 * @generated
	 */
	int SPACE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__VALUE = CONSTANT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_FEATURE_COUNT = CONSTANT_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.AnyImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 21;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.CharactersImpl <em>Characters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.CharactersImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getCharacters()
	 * @generated
	 */
	int CHARACTERS = 22;

	/**
	 * The number of structural features of the '<em>Characters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERS_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.impl.AlphanumericHexaDecimalLiteralImpl <em>Alphanumeric Hexa Decimal Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.impl.AlphanumericHexaDecimalLiteralImpl
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getAlphanumericHexaDecimalLiteral()
	 * @generated
	 */
	int ALPHANUMERIC_HEXA_DECIMAL_LITERAL = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHANUMERIC_HEXA_DECIMAL_LITERAL__VALUE = ALPHANUMERIC_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Alphanumeric Hexa Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHANUMERIC_HEXA_DECIMAL_LITERAL_FEATURE_COUNT = ALPHANUMERIC_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.Nulls <em>Nulls</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.Nulls
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNulls()
	 * @generated
	 */
	int NULLS = 24;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.Zeroes <em>Zeroes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.Zeroes
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getZeroes()
	 * @generated
	 */
	int ZEROES = 25;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.Quotes <em>Quotes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.Quotes
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getQuotes()
	 * @generated
	 */
	int QUOTES = 26;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.LowValues <em>Low Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.LowValues
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getLowValues()
	 * @generated
	 */
	int LOW_VALUES = 27;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.HighValues <em>High Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.HighValues
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getHighValues()
	 * @generated
	 */
	int HIGH_VALUES = 28;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.literals.Spaces <em>Spaces</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.literals.Spaces
	 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getSpaces()
	 * @generated
	 */
	int SPACES = 29;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral <em>Alphanumeric Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphanumeric Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral
	 * @generated
	 */
	EClass getAlphanumericLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral#getValue()
	 * @see #getAlphanumericLiteral()
	 * @generated
	 */
	EAttribute getAlphanumericLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.DecimalLiteral <em>Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.DecimalLiteral
	 * @generated
	 */
	EClass getDecimalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.DecimalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.DecimalLiteral#getValue()
	 * @see #getDecimalLiteral()
	 * @generated
	 */
	EAttribute getDecimalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.FigurativeConstantLiteral <em>Figurative Constant Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figurative Constant Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.FigurativeConstantLiteral
	 * @generated
	 */
	EClass getFigurativeConstantLiteral();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.FloatingDecimalLiteral <em>Floating Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Decimal Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.FloatingDecimalLiteral
	 * @generated
	 */
	EClass getFloatingDecimalLiteral();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.AllLiteral <em>All Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.AllLiteral
	 * @generated
	 */
	EClass getAllLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.literals.AllLiteral#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.AllLiteral#getConstant()
	 * @see #getAllLiteral()
	 * @generated
	 */
	EReference getAllLiteral_Constant();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.NumericLiteral <em>Numeric Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.NumericLiteral
	 * @generated
	 */
	EClass getNumericLiteral();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.ConstantLiteral <em>Constant Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.ConstantLiteral
	 * @generated
	 */
	EClass getConstantLiteral();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.PseudoLiteral <em>Pseudo Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.PseudoLiteral
	 * @generated
	 */
	EClass getPseudoLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.PseudoLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.PseudoLiteral#getValue()
	 * @see #getPseudoLiteral()
	 * @generated
	 */
	EAttribute getPseudoLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.DBCSLiteral <em>DBCS Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBCS Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.DBCSLiteral
	 * @generated
	 */
	EClass getDBCSLiteral();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.NationalLiteral <em>National Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.NationalLiteral
	 * @generated
	 */
	EClass getNationalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.NationalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.NationalLiteral#getValue()
	 * @see #getNationalLiteral()
	 * @generated
	 */
	EAttribute getNationalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.FixedDecimalLiteral <em>Fixed Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Decimal Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.FixedDecimalLiteral
	 * @generated
	 */
	EClass getFixedDecimalLiteral();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.NationalHexLiteral <em>National Hex Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Hex Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.NationalHexLiteral
	 * @generated
	 */
	EClass getNationalHexLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.NationalHexLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.NationalHexLiteral#getValue()
	 * @see #getNationalHexLiteral()
	 * @generated
	 */
	EAttribute getNationalHexLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.Null <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Null
	 * @generated
	 */
	EClass getNull();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.Null#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Null#getValue()
	 * @see #getNull()
	 * @generated
	 */
	EAttribute getNull_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.Zero <em>Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zero</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Zero
	 * @generated
	 */
	EClass getZero();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.Zero#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Zero#getValue()
	 * @see #getZero()
	 * @generated
	 */
	EAttribute getZero_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.Quote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quote</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Quote
	 * @generated
	 */
	EClass getQuote();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.Quote#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Quote#getValue()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.LowValue <em>Low Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Low Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.LowValue
	 * @generated
	 */
	EClass getLowValue();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.LowValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.LowValue#getValue()
	 * @see #getLowValue()
	 * @generated
	 */
	EAttribute getLowValue_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.HighValue <em>High Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.HighValue
	 * @generated
	 */
	EClass getHighValue();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.HighValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.HighValue#getValue()
	 * @see #getHighValue()
	 * @generated
	 */
	EAttribute getHighValue_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.Space <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Space
	 * @generated
	 */
	EClass getSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.literals.Space#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Space#getValue()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.Characters <em>Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characters</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Characters
	 * @generated
	 */
	EClass getCharacters();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.literals.AlphanumericHexaDecimalLiteral <em>Alphanumeric Hexa Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphanumeric Hexa Decimal Literal</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.AlphanumericHexaDecimalLiteral
	 * @generated
	 */
	EClass getAlphanumericHexaDecimalLiteral();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.literals.Nulls <em>Nulls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nulls</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Nulls
	 * @generated
	 */
	EEnum getNulls();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.literals.Zeroes <em>Zeroes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Zeroes</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Zeroes
	 * @generated
	 */
	EEnum getZeroes();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.literals.Quotes <em>Quotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quotes</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Quotes
	 * @generated
	 */
	EEnum getQuotes();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.literals.LowValues <em>Low Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Low Values</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.LowValues
	 * @generated
	 */
	EEnum getLowValues();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.literals.HighValues <em>High Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>High Values</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.HighValues
	 * @generated
	 */
	EEnum getHighValues();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.literals.Spaces <em>Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spaces</em>'.
	 * @see org.servicifi.gelato.language.cobol.literals.Spaces
	 * @generated
	 */
	EEnum getSpaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LiteralsFactory getLiteralsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.AlphanumericLiteralImpl <em>Alphanumeric Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.AlphanumericLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getAlphanumericLiteral()
		 * @generated
		 */
		EClass ALPHANUMERIC_LITERAL = eINSTANCE.getAlphanumericLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHANUMERIC_LITERAL__VALUE = eINSTANCE.getAlphanumericLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.IntegerLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.DecimalLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getDecimalLiteral()
		 * @generated
		 */
		EClass DECIMAL_LITERAL = eINSTANCE.getDecimalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_LITERAL__VALUE = eINSTANCE.getDecimalLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.FigurativeConstantLiteralImpl <em>Figurative Constant Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.FigurativeConstantLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getFigurativeConstantLiteral()
		 * @generated
		 */
		EClass FIGURATIVE_CONSTANT_LITERAL = eINSTANCE.getFigurativeConstantLiteral();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.BooleanLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.FloatingDecimalLiteralImpl <em>Floating Decimal Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.FloatingDecimalLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getFloatingDecimalLiteral()
		 * @generated
		 */
		EClass FLOATING_DECIMAL_LITERAL = eINSTANCE.getFloatingDecimalLiteral();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.AllLiteralImpl <em>All Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.AllLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getAllLiteral()
		 * @generated
		 */
		EClass ALL_LITERAL = eINSTANCE.getAllLiteral();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_LITERAL__CONSTANT = eINSTANCE.getAllLiteral_Constant();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.NumericLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNumericLiteral()
		 * @generated
		 */
		EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.ConstantLiteralImpl <em>Constant Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.ConstantLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getConstantLiteral()
		 * @generated
		 */
		EClass CONSTANT_LITERAL = eINSTANCE.getConstantLiteral();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.PseudoLiteralImpl <em>Pseudo Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.PseudoLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getPseudoLiteral()
		 * @generated
		 */
		EClass PSEUDO_LITERAL = eINSTANCE.getPseudoLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSEUDO_LITERAL__VALUE = eINSTANCE.getPseudoLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.DBCSLiteralImpl <em>DBCS Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.DBCSLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getDBCSLiteral()
		 * @generated
		 */
		EClass DBCS_LITERAL = eINSTANCE.getDBCSLiteral();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.NationalLiteralImpl <em>National Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.NationalLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNationalLiteral()
		 * @generated
		 */
		EClass NATIONAL_LITERAL = eINSTANCE.getNationalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIONAL_LITERAL__VALUE = eINSTANCE.getNationalLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.FixedDecimalLiteralImpl <em>Fixed Decimal Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.FixedDecimalLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getFixedDecimalLiteral()
		 * @generated
		 */
		EClass FIXED_DECIMAL_LITERAL = eINSTANCE.getFixedDecimalLiteral();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.NationalHexLiteralImpl <em>National Hex Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.NationalHexLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNationalHexLiteral()
		 * @generated
		 */
		EClass NATIONAL_HEX_LITERAL = eINSTANCE.getNationalHexLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIONAL_HEX_LITERAL__VALUE = eINSTANCE.getNationalHexLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.NullImpl <em>Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.NullImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNull()
		 * @generated
		 */
		EClass NULL = eINSTANCE.getNull();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL__VALUE = eINSTANCE.getNull_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.ZeroImpl <em>Zero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.ZeroImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getZero()
		 * @generated
		 */
		EClass ZERO = eINSTANCE.getZero();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZERO__VALUE = eINSTANCE.getZero_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.QuoteImpl <em>Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.QuoteImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getQuote()
		 * @generated
		 */
		EClass QUOTE = eINSTANCE.getQuote();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__VALUE = eINSTANCE.getQuote_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.LowValueImpl <em>Low Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LowValueImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getLowValue()
		 * @generated
		 */
		EClass LOW_VALUE = eINSTANCE.getLowValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOW_VALUE__VALUE = eINSTANCE.getLowValue_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.HighValueImpl <em>High Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.HighValueImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getHighValue()
		 * @generated
		 */
		EClass HIGH_VALUE = eINSTANCE.getHighValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_VALUE__VALUE = eINSTANCE.getHighValue_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.SpaceImpl <em>Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.SpaceImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getSpace()
		 * @generated
		 */
		EClass SPACE = eINSTANCE.getSpace();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__VALUE = eINSTANCE.getSpace_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.AnyImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.CharactersImpl <em>Characters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.CharactersImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getCharacters()
		 * @generated
		 */
		EClass CHARACTERS = eINSTANCE.getCharacters();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.impl.AlphanumericHexaDecimalLiteralImpl <em>Alphanumeric Hexa Decimal Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.impl.AlphanumericHexaDecimalLiteralImpl
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getAlphanumericHexaDecimalLiteral()
		 * @generated
		 */
		EClass ALPHANUMERIC_HEXA_DECIMAL_LITERAL = eINSTANCE.getAlphanumericHexaDecimalLiteral();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.Nulls <em>Nulls</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.Nulls
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getNulls()
		 * @generated
		 */
		EEnum NULLS = eINSTANCE.getNulls();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.Zeroes <em>Zeroes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.Zeroes
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getZeroes()
		 * @generated
		 */
		EEnum ZEROES = eINSTANCE.getZeroes();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.Quotes <em>Quotes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.Quotes
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getQuotes()
		 * @generated
		 */
		EEnum QUOTES = eINSTANCE.getQuotes();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.LowValues <em>Low Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.LowValues
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getLowValues()
		 * @generated
		 */
		EEnum LOW_VALUES = eINSTANCE.getLowValues();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.HighValues <em>High Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.HighValues
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getHighValues()
		 * @generated
		 */
		EEnum HIGH_VALUES = eINSTANCE.getHighValues();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.literals.Spaces <em>Spaces</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.literals.Spaces
		 * @see org.servicifi.gelato.language.cobol.literals.impl.LiteralsPackageImpl#getSpaces()
		 * @generated
		 */
		EEnum SPACES = eINSTANCE.getSpaces();

	}

} //LiteralsPackage
