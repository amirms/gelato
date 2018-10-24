/**
 */
package org.servicifi.gelato.language.cobol.operators.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.operators.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorsFactoryImpl extends EFactoryImpl implements OperatorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperatorsFactory init() {
		try {
			OperatorsFactory theOperatorsFactory = (OperatorsFactory)EPackage.Registry.INSTANCE.getEFactory(OperatorsPackage.eNS_URI);
			if (theOperatorsFactory != null) {
				return theOperatorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorsFactoryImpl() {
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
			case OperatorsPackage.CONDITION_OR: return createConditionOr();
			case OperatorsPackage.CONDITION_AND: return createConditionAnd();
			case OperatorsPackage.MULTIPLICATION: return createMultiplication();
			case OperatorsPackage.POSITIVE: return createPositive();
			case OperatorsPackage.NEGATIVE: return createNegative();
			case OperatorsPackage.DIVISION: return createDivision();
			case OperatorsPackage.ADDITION: return createAddition();
			case OperatorsPackage.SUBTRACTION: return createSubtraction();
			case OperatorsPackage.POWER: return createPower();
			case OperatorsPackage.NEGATE: return createNegate();
			case OperatorsPackage.THROUGH: return createThrough();
			case OperatorsPackage.ZERO: return createZero();
			case OperatorsPackage.CLASS_NAME: return createClassName();
			case OperatorsPackage.ALPHABETIC: return createAlphabetic();
			case OperatorsPackage.DBCS: return createDBCS();
			case OperatorsPackage.NUMERIC: return createNumeric();
			case OperatorsPackage.ALPHABETIC_UPPER: return createAlphabeticUpper();
			case OperatorsPackage.ALPHABETIC_LOWER: return createAlphabeticLower();
			case OperatorsPackage.KANJI: return createKanji();
			case OperatorsPackage.EQUAL_PHRASE: return createEqualPhrase();
			case OperatorsPackage.EQUAL_SIGN: return createEqualSign();
			case OperatorsPackage.LT_PHRASE: return createLTPhrase();
			case OperatorsPackage.LT_SIGN: return createLTSign();
			case OperatorsPackage.LTEQ_PHRASE: return createLTEQPhrase();
			case OperatorsPackage.LTEQ_SIGN: return createLTEQSign();
			case OperatorsPackage.GT_PHRASE: return createGTPhrase();
			case OperatorsPackage.GT_SIGN: return createGTSign();
			case OperatorsPackage.GTEQ_PHRASE: return createGTEQPhrase();
			case OperatorsPackage.GTEQ_SIGN: return createGTEQSign();
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
			case OperatorsPackage.THROUGH_PHRASE:
				return createThroughPhraseFromString(eDataType, initialValue);
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
			case OperatorsPackage.THROUGH_PHRASE:
				return convertThroughPhraseToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOr createConditionOr() {
		ConditionOrImpl conditionOr = new ConditionOrImpl();
		return conditionOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionAnd createConditionAnd() {
		ConditionAndImpl conditionAnd = new ConditionAndImpl();
		return conditionAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positive createPositive() {
		PositiveImpl positive = new PositiveImpl();
		return positive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negative createNegative() {
		NegativeImpl negative = new NegativeImpl();
		return negative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtraction createSubtraction() {
		SubtractionImpl subtraction = new SubtractionImpl();
		return subtraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Power createPower() {
		PowerImpl power = new PowerImpl();
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negate createNegate() {
		NegateImpl negate = new NegateImpl();
		return negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Through createThrough() {
		ThroughImpl through = new ThroughImpl();
		return through;
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
	public ClassName createClassName() {
		ClassNameImpl className = new ClassNameImpl();
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alphabetic createAlphabetic() {
		AlphabeticImpl alphabetic = new AlphabeticImpl();
		return alphabetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBCS createDBCS() {
		DBCSImpl dbcs = new DBCSImpl();
		return dbcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Numeric createNumeric() {
		NumericImpl numeric = new NumericImpl();
		return numeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticUpper createAlphabeticUpper() {
		AlphabeticUpperImpl alphabeticUpper = new AlphabeticUpperImpl();
		return alphabeticUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticLower createAlphabeticLower() {
		AlphabeticLowerImpl alphabeticLower = new AlphabeticLowerImpl();
		return alphabeticLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kanji createKanji() {
		KanjiImpl kanji = new KanjiImpl();
		return kanji;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualPhrase createEqualPhrase() {
		EqualPhraseImpl equalPhrase = new EqualPhraseImpl();
		return equalPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualSign createEqualSign() {
		EqualSignImpl equalSign = new EqualSignImpl();
		return equalSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTPhrase createLTPhrase() {
		LTPhraseImpl ltPhrase = new LTPhraseImpl();
		return ltPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTSign createLTSign() {
		LTSignImpl ltSign = new LTSignImpl();
		return ltSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTEQPhrase createLTEQPhrase() {
		LTEQPhraseImpl lteqPhrase = new LTEQPhraseImpl();
		return lteqPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTEQSign createLTEQSign() {
		LTEQSignImpl lteqSign = new LTEQSignImpl();
		return lteqSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTPhrase createGTPhrase() {
		GTPhraseImpl gtPhrase = new GTPhraseImpl();
		return gtPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTSign createGTSign() {
		GTSignImpl gtSign = new GTSignImpl();
		return gtSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTEQPhrase createGTEQPhrase() {
		GTEQPhraseImpl gteqPhrase = new GTEQPhraseImpl();
		return gteqPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTEQSign createGTEQSign() {
		GTEQSignImpl gteqSign = new GTEQSignImpl();
		return gteqSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThroughPhrase createThroughPhraseFromString(EDataType eDataType, String initialValue) {
		ThroughPhrase result = ThroughPhrase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThroughPhraseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorsPackage getOperatorsPackage() {
		return (OperatorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperatorsPackage getPackage() {
		return OperatorsPackage.eINSTANCE;
	}

} //OperatorsFactoryImpl
