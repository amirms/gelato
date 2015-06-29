/**
 */
package org.servicifi.gelato.language.cobol.literals.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.literals.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralsFactoryImpl extends EFactoryImpl implements LiteralsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralsFactory init() {
		try {
			LiteralsFactory theLiteralsFactory = (LiteralsFactory)EPackage.Registry.INSTANCE.getEFactory(LiteralsPackage.eNS_URI);
			if (theLiteralsFactory != null) {
				return theLiteralsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LiteralsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LiteralsPackage.ALPHANUMERIC_LITERAL: return createAlphanumericLiteral();
			case LiteralsPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case LiteralsPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case LiteralsPackage.FLOATING_DECIMAL_LITERAL: return createFloatingDecimalLiteral();
			case LiteralsPackage.ALL_LITERAL: return createAllLiteral();
			case LiteralsPackage.PSEUDO_LITERAL: return createPseudoLiteral();
			case LiteralsPackage.NATIONAL_LITERAL: return createNationalLiteral();
			case LiteralsPackage.FIXED_DECIMAL_LITERAL: return createFixedDecimalLiteral();
			case LiteralsPackage.NATIONAL_HEX_LITERAL: return createNationalHexLiteral();
			case LiteralsPackage.NULL: return createNull();
			case LiteralsPackage.ZERO: return createZero();
			case LiteralsPackage.QUOTE: return createQuote();
			case LiteralsPackage.LOW_VALUE: return createLowValue();
			case LiteralsPackage.HIGH_VALUE: return createHighValue();
			case LiteralsPackage.SPACE: return createSpace();
			case LiteralsPackage.ANY: return createAny();
			case LiteralsPackage.CHARACTERS: return createCharacters();
			case LiteralsPackage.ALPHANUMERIC_HEXA_DECIMAL_LITERAL: return createAlphanumericHexaDecimalLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LiteralsPackage.NULLS:
				return createNullsFromString(eDataType, initialValue);
			case LiteralsPackage.ZEROES:
				return createZeroesFromString(eDataType, initialValue);
			case LiteralsPackage.QUOTES:
				return createQuotesFromString(eDataType, initialValue);
			case LiteralsPackage.LOW_VALUES:
				return createLowValuesFromString(eDataType, initialValue);
			case LiteralsPackage.HIGH_VALUES:
				return createHighValuesFromString(eDataType, initialValue);
			case LiteralsPackage.SPACES:
				return createSpacesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LiteralsPackage.NULLS:
				return convertNullsToString(eDataType, instanceValue);
			case LiteralsPackage.ZEROES:
				return convertZeroesToString(eDataType, instanceValue);
			case LiteralsPackage.QUOTES:
				return convertQuotesToString(eDataType, instanceValue);
			case LiteralsPackage.LOW_VALUES:
				return convertLowValuesToString(eDataType, instanceValue);
			case LiteralsPackage.HIGH_VALUES:
				return convertHighValuesToString(eDataType, instanceValue);
			case LiteralsPackage.SPACES:
				return convertSpacesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphanumericLiteral createAlphanumericLiteral() {
		AlphanumericLiteralImpl alphanumericLiteral = new AlphanumericLiteralImpl();
		return alphanumericLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingDecimalLiteral createFloatingDecimalLiteral() {
		FloatingDecimalLiteralImpl floatingDecimalLiteral = new FloatingDecimalLiteralImpl();
		return floatingDecimalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllLiteral createAllLiteral() {
		AllLiteralImpl allLiteral = new AllLiteralImpl();
		return allLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoLiteral createPseudoLiteral() {
		PseudoLiteralImpl pseudoLiteral = new PseudoLiteralImpl();
		return pseudoLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalLiteral createNationalLiteral() {
		NationalLiteralImpl nationalLiteral = new NationalLiteralImpl();
		return nationalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedDecimalLiteral createFixedDecimalLiteral() {
		FixedDecimalLiteralImpl fixedDecimalLiteral = new FixedDecimalLiteralImpl();
		return fixedDecimalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalHexLiteral createNationalHexLiteral() {
		NationalHexLiteralImpl nationalHexLiteral = new NationalHexLiteralImpl();
		return nationalHexLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Null createNull() {
		NullImpl null_ = new NullImpl();
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zero createZero() {
		ZeroImpl zero = new ZeroImpl();
		return zero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quote createQuote() {
		QuoteImpl quote = new QuoteImpl();
		return quote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowValue createLowValue() {
		LowValueImpl lowValue = new LowValueImpl();
		return lowValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighValue createHighValue() {
		HighValueImpl highValue = new HighValueImpl();
		return highValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space createSpace() {
		SpaceImpl space = new SpaceImpl();
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characters createCharacters() {
		CharactersImpl characters = new CharactersImpl();
		return characters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphanumericHexaDecimalLiteral createAlphanumericHexaDecimalLiteral() {
		AlphanumericHexaDecimalLiteralImpl alphanumericHexaDecimalLiteral = new AlphanumericHexaDecimalLiteralImpl();
		return alphanumericHexaDecimalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nulls createNullsFromString(EDataType eDataType, String initialValue) {
		Nulls result = Nulls.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zeroes createZeroesFromString(EDataType eDataType, String initialValue) {
		Zeroes result = Zeroes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZeroesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quotes createQuotesFromString(EDataType eDataType, String initialValue) {
		Quotes result = Quotes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuotesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowValues createLowValuesFromString(EDataType eDataType, String initialValue) {
		LowValues result = LowValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLowValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighValues createHighValuesFromString(EDataType eDataType, String initialValue) {
		HighValues result = HighValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHighValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spaces createSpacesFromString(EDataType eDataType, String initialValue) {
		Spaces result = Spaces.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsPackage getLiteralsPackage() {
		return (LiteralsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LiteralsPackage getPackage() {
		return LiteralsPackage.eINSTANCE;
	}

} //LiteralsFactoryImpl
