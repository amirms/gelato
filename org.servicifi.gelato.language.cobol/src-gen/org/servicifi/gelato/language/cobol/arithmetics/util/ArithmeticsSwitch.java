/**
 */
package org.servicifi.gelato.language.cobol.arithmetics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.arithmetics.*;

import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.Condition;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;

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
 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage
 * @generated
 */
public class ArithmeticsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArithmeticsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticsSwitch() {
		if (modelPackage == null) {
			modelPackage = ArithmeticsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case ArithmeticsPackage.ADDITIVE_ARITHMETIC_EXPRESSION: {
				AdditiveArithmeticExpression additiveArithmeticExpression = (AdditiveArithmeticExpression)theEObject;
				T result = caseAdditiveArithmeticExpression(additiveArithmeticExpression);
				if (result == null) result = caseRangeExpressionChild(additiveArithmeticExpression);
				if (result == null) result = caseArithmeticExpression(additiveArithmeticExpression);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(additiveArithmeticExpression);
				if (result == null) result = caseSimpleConditionChild(additiveArithmeticExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(additiveArithmeticExpression);
				if (result == null) result = caseNegatedConditionalExpressionChild(additiveArithmeticExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(additiveArithmeticExpression);
				if (result == null) result = caseConditionalAndExpressionChild(additiveArithmeticExpression);
				if (result == null) result = caseConditionalOrExpressionChild(additiveArithmeticExpression);
				if (result == null) result = caseCondition(additiveArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.ADDITIVE_ARITHMETIC_EXPRESSION_CHILD: {
				AdditiveArithmeticExpressionChild additiveArithmeticExpressionChild = (AdditiveArithmeticExpressionChild)theEObject;
				T result = caseAdditiveArithmeticExpressionChild(additiveArithmeticExpressionChild);
				if (result == null) result = caseRangeExpressionChild(additiveArithmeticExpressionChild);
				if (result == null) result = caseArithmeticExpression(additiveArithmeticExpressionChild);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(additiveArithmeticExpressionChild);
				if (result == null) result = caseSimpleConditionChild(additiveArithmeticExpressionChild);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(additiveArithmeticExpressionChild);
				if (result == null) result = caseNegatedConditionalExpressionChild(additiveArithmeticExpressionChild);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(additiveArithmeticExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(additiveArithmeticExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(additiveArithmeticExpressionChild);
				if (result == null) result = caseCondition(additiveArithmeticExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION: {
				MultiplicativeArithmeticExpression multiplicativeArithmeticExpression = (MultiplicativeArithmeticExpression)theEObject;
				T result = caseMultiplicativeArithmeticExpression(multiplicativeArithmeticExpression);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(multiplicativeArithmeticExpression);
				if (result == null) result = caseRangeExpressionChild(multiplicativeArithmeticExpression);
				if (result == null) result = caseArithmeticExpression(multiplicativeArithmeticExpression);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(multiplicativeArithmeticExpression);
				if (result == null) result = caseSimpleConditionChild(multiplicativeArithmeticExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(multiplicativeArithmeticExpression);
				if (result == null) result = caseNegatedConditionalExpressionChild(multiplicativeArithmeticExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(multiplicativeArithmeticExpression);
				if (result == null) result = caseConditionalAndExpressionChild(multiplicativeArithmeticExpression);
				if (result == null) result = caseConditionalOrExpressionChild(multiplicativeArithmeticExpression);
				if (result == null) result = caseCondition(multiplicativeArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION_CHILD: {
				MultiplicativeArithmeticExpressionChild multiplicativeArithmeticExpressionChild = (MultiplicativeArithmeticExpressionChild)theEObject;
				T result = caseMultiplicativeArithmeticExpressionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseRangeExpressionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseArithmeticExpression(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseSimpleConditionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseNegatedConditionalExpressionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(multiplicativeArithmeticExpressionChild);
				if (result == null) result = caseCondition(multiplicativeArithmeticExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION: {
				PowerArithmeticExpression powerArithmeticExpression = (PowerArithmeticExpression)theEObject;
				T result = casePowerArithmeticExpression(powerArithmeticExpression);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(powerArithmeticExpression);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(powerArithmeticExpression);
				if (result == null) result = caseRangeExpressionChild(powerArithmeticExpression);
				if (result == null) result = caseArithmeticExpression(powerArithmeticExpression);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(powerArithmeticExpression);
				if (result == null) result = caseSimpleConditionChild(powerArithmeticExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(powerArithmeticExpression);
				if (result == null) result = caseNegatedConditionalExpressionChild(powerArithmeticExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(powerArithmeticExpression);
				if (result == null) result = caseConditionalAndExpressionChild(powerArithmeticExpression);
				if (result == null) result = caseConditionalOrExpressionChild(powerArithmeticExpression);
				if (result == null) result = caseCondition(powerArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION_CHILD: {
				PowerArithmeticExpressionChild powerArithmeticExpressionChild = (PowerArithmeticExpressionChild)theEObject;
				T result = casePowerArithmeticExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseRangeExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseArithmeticExpression(powerArithmeticExpressionChild);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseSimpleConditionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseNegatedConditionalExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(powerArithmeticExpressionChild);
				if (result == null) result = caseCondition(powerArithmeticExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION_CHILD: {
				UnaryArithmeticExpressionChild unaryArithmeticExpressionChild = (UnaryArithmeticExpressionChild)theEObject;
				T result = caseUnaryArithmeticExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = casePowerArithmeticExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseRangeExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseArithmeticExpression(unaryArithmeticExpressionChild);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseSimpleConditionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseNegatedConditionalExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(unaryArithmeticExpressionChild);
				if (result == null) result = caseCondition(unaryArithmeticExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION: {
				UnaryArithmeticExpression unaryArithmeticExpression = (UnaryArithmeticExpression)theEObject;
				T result = caseUnaryArithmeticExpression(unaryArithmeticExpression);
				if (result == null) result = casePowerArithmeticExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseRangeExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseArithmeticExpression(unaryArithmeticExpression);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseSimpleConditionChild(unaryArithmeticExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseNegatedConditionalExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseConditionalAndExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseConditionalOrExpressionChild(unaryArithmeticExpression);
				if (result == null) result = caseCondition(unaryArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.PRIMARY_EXPRESSION: {
				PrimaryExpression primaryExpression = (PrimaryExpression)theEObject;
				T result = casePrimaryExpression(primaryExpression);
				if (result == null) result = caseUnaryArithmeticExpressionChild(primaryExpression);
				if (result == null) result = casePowerArithmeticExpressionChild(primaryExpression);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(primaryExpression);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(primaryExpression);
				if (result == null) result = caseRangeExpressionChild(primaryExpression);
				if (result == null) result = caseArithmeticExpression(primaryExpression);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(primaryExpression);
				if (result == null) result = caseSimpleConditionChild(primaryExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(primaryExpression);
				if (result == null) result = caseNegatedConditionalExpressionChild(primaryExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(primaryExpression);
				if (result == null) result = caseConditionalAndExpressionChild(primaryExpression);
				if (result == null) result = caseConditionalOrExpressionChild(primaryExpression);
				if (result == null) result = caseCondition(primaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION: {
				AssignmentExpression assignmentExpression = (AssignmentExpression)theEObject;
				T result = caseAssignmentExpression(assignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.RANGE_EXPRESSION: {
				RangeExpression rangeExpression = (RangeExpression)theEObject;
				T result = caseRangeExpression(rangeExpression);
				if (result == null) result = caseArithmeticExpression(rangeExpression);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(rangeExpression);
				if (result == null) result = caseSimpleConditionChild(rangeExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(rangeExpression);
				if (result == null) result = caseNegatedConditionalExpressionChild(rangeExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(rangeExpression);
				if (result == null) result = caseConditionalAndExpressionChild(rangeExpression);
				if (result == null) result = caseConditionalOrExpressionChild(rangeExpression);
				if (result == null) result = caseCondition(rangeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.RANGE_EXPRESSION_CHILD: {
				RangeExpressionChild rangeExpressionChild = (RangeExpressionChild)theEObject;
				T result = caseRangeExpressionChild(rangeExpressionChild);
				if (result == null) result = caseArithmeticExpression(rangeExpressionChild);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(rangeExpressionChild);
				if (result == null) result = caseSimpleConditionChild(rangeExpressionChild);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(rangeExpressionChild);
				if (result == null) result = caseNegatedConditionalExpressionChild(rangeExpressionChild);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(rangeExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(rangeExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(rangeExpressionChild);
				if (result == null) result = caseCondition(rangeExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.NESTED_ARITHMETIC_EXPRESSION: {
				NestedArithmeticExpression nestedArithmeticExpression = (NestedArithmeticExpression)theEObject;
				T result = caseNestedArithmeticExpression(nestedArithmeticExpression);
				if (result == null) result = casePrimaryExpression(nestedArithmeticExpression);
				if (result == null) result = caseUnaryArithmeticExpressionChild(nestedArithmeticExpression);
				if (result == null) result = casePowerArithmeticExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseRangeExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseArithmeticExpression(nestedArithmeticExpression);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseSimpleConditionChild(nestedArithmeticExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseNegatedConditionalExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseConditionalAndExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseConditionalOrExpressionChild(nestedArithmeticExpression);
				if (result == null) result = caseCondition(nestedArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmeticsPackage.ARITHMETIC_EXPRESSION: {
				ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
				T result = caseArithmeticExpression(arithmeticExpression);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(arithmeticExpression);
				if (result == null) result = caseSimpleConditionChild(arithmeticExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(arithmeticExpression);
				if (result == null) result = caseNegatedConditionalExpressionChild(arithmeticExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(arithmeticExpression);
				if (result == null) result = caseConditionalAndExpressionChild(arithmeticExpression);
				if (result == null) result = caseConditionalOrExpressionChild(arithmeticExpression);
				if (result == null) result = caseCondition(arithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveArithmeticExpression(AdditiveArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Arithmetic Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Arithmetic Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveArithmeticExpressionChild(AdditiveArithmeticExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicativeArithmeticExpression(MultiplicativeArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Arithmetic Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Arithmetic Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicativeArithmeticExpressionChild(MultiplicativeArithmeticExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerArithmeticExpression(PowerArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Arithmetic Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Arithmetic Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerArithmeticExpressionChild(PowerArithmeticExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Arithmetic Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Arithmetic Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryArithmeticExpressionChild(UnaryArithmeticExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryArithmeticExpression(UnaryArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryExpression(PrimaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentExpression(AssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeExpression(RangeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeExpressionChild(RangeExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedArithmeticExpression(NestedArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpression(ArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalOrExpressionChild(ConditionalOrExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAndExpressionChild(ConditionalAndExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviated Conditional Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviated Conditional Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbreviatedConditionalExpressionChild(AbbreviatedConditionalExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negated Abbreviated Conditional Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negated Abbreviated Conditional Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatedAbbreviatedConditionalExpressionChild(NegatedAbbreviatedConditionalExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviated Relational Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviated Relational Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbreviatedRelationalExpressionChild(AbbreviatedRelationalExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negated Conditional Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negated Conditional Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatedConditionalExpressionChild(NegatedConditionalExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Condition Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Condition Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleConditionChild(SimpleConditionChild object) {
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

} //ArithmeticsSwitch
