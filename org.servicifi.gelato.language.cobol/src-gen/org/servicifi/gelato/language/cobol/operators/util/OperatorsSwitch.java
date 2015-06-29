/**
 */
package org.servicifi.gelato.language.cobol.operators.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.operators.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.operators.OperatorsPackage
 * @generated
 */
public class OperatorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperatorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorsSwitch() {
		if (modelPackage == null) {
			modelPackage = OperatorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OperatorsPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.ADDITIVE_OPERATOR: {
				AdditiveOperator additiveOperator = (AdditiveOperator)theEObject;
				T result = caseAdditiveOperator(additiveOperator);
				if (result == null) result = caseOperator(additiveOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.MULTIPLICATIVE_OPERATOR: {
				MultiplicativeOperator multiplicativeOperator = (MultiplicativeOperator)theEObject;
				T result = caseMultiplicativeOperator(multiplicativeOperator);
				if (result == null) result = caseOperator(multiplicativeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseOperator(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.LOGICAL_OPERATOR: {
				LogicalOperator logicalOperator = (LogicalOperator)theEObject;
				T result = caseLogicalOperator(logicalOperator);
				if (result == null) result = caseOperator(logicalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.RELATIONAL_OPERATOR: {
				RelationalOperator relationalOperator = (RelationalOperator)theEObject;
				T result = caseRelationalOperator(relationalOperator);
				if (result == null) result = caseOperator(relationalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.CONDITION_OR: {
				ConditionOr conditionOr = (ConditionOr)theEObject;
				T result = caseConditionOr(conditionOr);
				if (result == null) result = caseLogicalOperator(conditionOr);
				if (result == null) result = caseOperator(conditionOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.CONDITION_AND: {
				ConditionAnd conditionAnd = (ConditionAnd)theEObject;
				T result = caseConditionAnd(conditionAnd);
				if (result == null) result = caseLogicalOperator(conditionAnd);
				if (result == null) result = caseOperator(conditionAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.MULTIPLICATION: {
				Multiplication multiplication = (Multiplication)theEObject;
				T result = caseMultiplication(multiplication);
				if (result == null) result = caseMultiplicativeOperator(multiplication);
				if (result == null) result = caseOperator(multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.SIGN_OPERATOR: {
				SignOperator signOperator = (SignOperator)theEObject;
				T result = caseSignOperator(signOperator);
				if (result == null) result = caseOperator(signOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.POSITIVE: {
				Positive positive = (Positive)theEObject;
				T result = casePositive(positive);
				if (result == null) result = caseSignOperator(positive);
				if (result == null) result = caseOperator(positive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.NEGATIVE: {
				Negative negative = (Negative)theEObject;
				T result = caseNegative(negative);
				if (result == null) result = caseSignOperator(negative);
				if (result == null) result = caseOperator(negative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseMultiplicativeOperator(division);
				if (result == null) result = caseOperator(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.ADDITION: {
				Addition addition = (Addition)theEObject;
				T result = caseAddition(addition);
				if (result == null) result = caseAdditiveOperator(addition);
				if (result == null) result = caseUnaryOperator(addition);
				if (result == null) result = caseOperator(addition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.SUBTRACTION: {
				Subtraction subtraction = (Subtraction)theEObject;
				T result = caseSubtraction(subtraction);
				if (result == null) result = caseAdditiveOperator(subtraction);
				if (result == null) result = caseUnaryOperator(subtraction);
				if (result == null) result = caseOperator(subtraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.GREATER_THAN_OR_EQUAL: {
				GreaterThanOrEqual greaterThanOrEqual = (GreaterThanOrEqual)theEObject;
				T result = caseGreaterThanOrEqual(greaterThanOrEqual);
				if (result == null) result = caseRelationalOperator(greaterThanOrEqual);
				if (result == null) result = caseOperator(greaterThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T result = caseGreaterThan(greaterThan);
				if (result == null) result = caseRelationalOperator(greaterThan);
				if (result == null) result = caseOperator(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseRelationalOperator(lessThan);
				if (result == null) result = caseOperator(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.LESS_THAN_OR_EQUAL: {
				LessThanOrEqual lessThanOrEqual = (LessThanOrEqual)theEObject;
				T result = caseLessThanOrEqual(lessThanOrEqual);
				if (result == null) result = caseRelationalOperator(lessThanOrEqual);
				if (result == null) result = caseOperator(lessThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseRelationalOperator(equal);
				if (result == null) result = caseOperator(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.POWER: {
				Power power = (Power)theEObject;
				T result = casePower(power);
				if (result == null) result = caseOperator(power);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.NEGATE: {
				Negate negate = (Negate)theEObject;
				T result = caseNegate(negate);
				if (result == null) result = caseOperator(negate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.THROUGH: {
				Through through = (Through)theEObject;
				T result = caseThrough(through);
				if (result == null) result = caseOperator(through);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.CLASS_OPERATOR: {
				ClassOperator classOperator = (ClassOperator)theEObject;
				T result = caseClassOperator(classOperator);
				if (result == null) result = caseOperator(classOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.ZERO: {
				Zero zero = (Zero)theEObject;
				T result = caseZero(zero);
				if (result == null) result = caseSignOperator(zero);
				if (result == null) result = caseOperator(zero);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.CLASS_NAME: {
				ClassName className = (ClassName)theEObject;
				T result = caseClassName(className);
				if (result == null) result = caseClassOperator(className);
				if (result == null) result = caseOperator(className);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.ALPHABETIC: {
				Alphabetic alphabetic = (Alphabetic)theEObject;
				T result = caseAlphabetic(alphabetic);
				if (result == null) result = caseClassOperator(alphabetic);
				if (result == null) result = caseOperator(alphabetic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.DBCS: {
				DBCS dbcs = (DBCS)theEObject;
				T result = caseDBCS(dbcs);
				if (result == null) result = caseClassOperator(dbcs);
				if (result == null) result = caseOperator(dbcs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.NUMERIC: {
				Numeric numeric = (Numeric)theEObject;
				T result = caseNumeric(numeric);
				if (result == null) result = caseClassOperator(numeric);
				if (result == null) result = caseOperator(numeric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.ALPHABETIC_UPPER: {
				AlphabeticUpper alphabeticUpper = (AlphabeticUpper)theEObject;
				T result = caseAlphabeticUpper(alphabeticUpper);
				if (result == null) result = caseClassOperator(alphabeticUpper);
				if (result == null) result = caseOperator(alphabeticUpper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.ALPHABETIC_LOWER: {
				AlphabeticLower alphabeticLower = (AlphabeticLower)theEObject;
				T result = caseAlphabeticLower(alphabeticLower);
				if (result == null) result = caseClassOperator(alphabeticLower);
				if (result == null) result = caseOperator(alphabeticLower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.KANJI: {
				Kanji kanji = (Kanji)theEObject;
				T result = caseKanji(kanji);
				if (result == null) result = caseClassOperator(kanji);
				if (result == null) result = caseOperator(kanji);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.EQUAL_PHRASE: {
				EqualPhrase equalPhrase = (EqualPhrase)theEObject;
				T result = caseEqualPhrase(equalPhrase);
				if (result == null) result = caseEqual(equalPhrase);
				if (result == null) result = caseRelationalOperator(equalPhrase);
				if (result == null) result = caseOperator(equalPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.EQUAL_SIGN: {
				EqualSign equalSign = (EqualSign)theEObject;
				T result = caseEqualSign(equalSign);
				if (result == null) result = caseEqual(equalSign);
				if (result == null) result = caseRelationalOperator(equalSign);
				if (result == null) result = caseOperator(equalSign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.LT_PHRASE: {
				LTPhrase ltPhrase = (LTPhrase)theEObject;
				T result = caseLTPhrase(ltPhrase);
				if (result == null) result = caseLessThan(ltPhrase);
				if (result == null) result = caseRelationalOperator(ltPhrase);
				if (result == null) result = caseOperator(ltPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.LT_SIGN: {
				LTSign ltSign = (LTSign)theEObject;
				T result = caseLTSign(ltSign);
				if (result == null) result = caseLessThan(ltSign);
				if (result == null) result = caseRelationalOperator(ltSign);
				if (result == null) result = caseOperator(ltSign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.LTEQ_PHRASE: {
				LTEQPhrase lteqPhrase = (LTEQPhrase)theEObject;
				T result = caseLTEQPhrase(lteqPhrase);
				if (result == null) result = caseLessThanOrEqual(lteqPhrase);
				if (result == null) result = caseRelationalOperator(lteqPhrase);
				if (result == null) result = caseOperator(lteqPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.LTEQ_SIGN: {
				LTEQSign lteqSign = (LTEQSign)theEObject;
				T result = caseLTEQSign(lteqSign);
				if (result == null) result = caseLessThanOrEqual(lteqSign);
				if (result == null) result = caseRelationalOperator(lteqSign);
				if (result == null) result = caseOperator(lteqSign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.GT_PHRASE: {
				GTPhrase gtPhrase = (GTPhrase)theEObject;
				T result = caseGTPhrase(gtPhrase);
				if (result == null) result = caseGreaterThan(gtPhrase);
				if (result == null) result = caseRelationalOperator(gtPhrase);
				if (result == null) result = caseOperator(gtPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.GT_SIGN: {
				GTSign gtSign = (GTSign)theEObject;
				T result = caseGTSign(gtSign);
				if (result == null) result = caseGreaterThan(gtSign);
				if (result == null) result = caseRelationalOperator(gtSign);
				if (result == null) result = caseOperator(gtSign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.GTEQ_PHRASE: {
				GTEQPhrase gteqPhrase = (GTEQPhrase)theEObject;
				T result = caseGTEQPhrase(gteqPhrase);
				if (result == null) result = caseGreaterThanOrEqual(gteqPhrase);
				if (result == null) result = caseRelationalOperator(gteqPhrase);
				if (result == null) result = caseOperator(gteqPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperatorsPackage.GTEQ_SIGN: {
				GTEQSign gteqSign = (GTEQSign)theEObject;
				T result = caseGTEQSign(gteqSign);
				if (result == null) result = caseGreaterThanOrEqual(gteqSign);
				if (result == null) result = caseRelationalOperator(gteqSign);
				if (result == null) result = caseOperator(gteqSign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveOperator(AdditiveOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicativeOperator(MultiplicativeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOperator(LogicalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalOperator(RelationalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionOr(ConditionOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionAnd(ConditionAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sign Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sign Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignOperator(SignOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositive(Positive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegative(Negative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtraction(Subtraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOrEqual(GreaterThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanOrEqual(LessThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePower(Power object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegate(Negate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Through</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Through</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrough(Through object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassOperator(ClassOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zero</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zero</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZero(Zero object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassName(ClassName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabetic(Alphabetic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBCS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBCS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBCS(DBCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeric(Numeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetic Upper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetic Upper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabeticUpper(AlphabeticUpper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetic Lower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetic Lower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabeticLower(AlphabeticLower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kanji</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kanji</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKanji(Kanji object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualPhrase(EqualPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal Sign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal Sign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualSign(EqualSign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LT Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LT Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTPhrase(LTPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LT Sign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LT Sign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTSign(LTSign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTEQ Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTEQ Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTEQPhrase(LTEQPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTEQ Sign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTEQ Sign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTEQSign(LTEQSign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GT Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GT Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTPhrase(GTPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GT Sign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GT Sign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTSign(GTSign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTEQ Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTEQ Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTEQPhrase(GTEQPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTEQ Sign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTEQ Sign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTEQSign(GTEQSign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OperatorsSwitch
