/**
 */
package org.servicifi.gelato.language.cobol.operands.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression;
import org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild;

import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.Condition;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;

import org.servicifi.gelato.language.cobol.operands.*;

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
 * @see org.servicifi.gelato.language.cobol.operands.OperandsPackage
 * @generated
 */
public class OperandsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperandsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandsSwitch() {
		if (modelPackage == null) {
			modelPackage = OperandsPackage.eINSTANCE;
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
			case OperandsPackage.PRIMARY_OPERAND: {
				PrimaryOperand primaryOperand = (PrimaryOperand)theEObject;
				T result = casePrimaryOperand(primaryOperand);
				if (result == null) result = caseReplacementOperand(primaryOperand);
				if (result == null) result = casePrimaryExpression(primaryOperand);
				if (result == null) result = caseArithmeticOperand(primaryOperand);
				if (result == null) result = caseOperand(primaryOperand);
				if (result == null) result = caseUnaryArithmeticExpressionChild(primaryOperand);
				if (result == null) result = casePowerArithmeticExpressionChild(primaryOperand);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(primaryOperand);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(primaryOperand);
				if (result == null) result = caseRangeExpressionChild(primaryOperand);
				if (result == null) result = caseArithmeticExpression(primaryOperand);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(primaryOperand);
				if (result == null) result = caseSimpleConditionChild(primaryOperand);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(primaryOperand);
				if (result == null) result = caseNegatedConditionalExpressionChild(primaryOperand);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(primaryOperand);
				if (result == null) result = caseConditionalAndExpressionChild(primaryOperand);
				if (result == null) result = caseConditionalOrExpressionChild(primaryOperand);
				if (result == null) result = caseCondition(primaryOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperandsPackage.ROUNDED_IDENTIFIER: {
				RoundedIdentifier roundedIdentifier = (RoundedIdentifier)theEObject;
				T result = caseRoundedIdentifier(roundedIdentifier);
				if (result == null) result = caseArithmeticOperand(roundedIdentifier);
				if (result == null) result = caseOperand(roundedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperandsPackage.REPLACEMENT_OPERAND: {
				ReplacementOperand replacementOperand = (ReplacementOperand)theEObject;
				T result = caseReplacementOperand(replacementOperand);
				if (result == null) result = caseOperand(replacementOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperandsPackage.ENCODING: {
				Encoding encoding = (Encoding)theEObject;
				T result = caseEncoding(encoding);
				if (result == null) result = caseReplacementOperand(encoding);
				if (result == null) result = caseOperand(encoding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperandsPackage.OPERAND: {
				Operand operand = (Operand)theEObject;
				T result = caseOperand(operand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperandsPackage.ARITHMETIC_OPERAND: {
				ArithmeticOperand arithmeticOperand = (ArithmeticOperand)theEObject;
				T result = caseArithmeticOperand(arithmeticOperand);
				if (result == null) result = caseOperand(arithmeticOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryOperand(PrimaryOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rounded Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rounded Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundedIdentifier(RoundedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replacement Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replacement Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplacementOperand(ReplacementOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncoding(Encoding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperand(Operand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticOperand(ArithmeticOperand object) {
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

} //OperandsSwitch
