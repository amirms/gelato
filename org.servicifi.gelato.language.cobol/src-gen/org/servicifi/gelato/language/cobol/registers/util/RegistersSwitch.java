/**
 */
package org.servicifi.gelato.language.cobol.registers.util;

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

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;
import org.servicifi.gelato.language.cobol.operands.Operand;
import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;
import org.servicifi.gelato.language.cobol.operands.ReplacementOperand;

import org.servicifi.gelato.language.cobol.registers.*;

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
 * @see org.servicifi.gelato.language.cobol.registers.RegistersPackage
 * @generated
 */
public class RegistersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RegistersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistersSwitch() {
		if (modelPackage == null) {
			modelPackage = RegistersPackage.eINSTANCE;
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
			case RegistersPackage.REGISTER: {
				Register register = (Register)theEObject;
				T result = caseRegister(register);
				if (result == null) result = casePrimaryOperand(register);
				if (result == null) result = caseReplacementOperand(register);
				if (result == null) result = casePrimaryExpression(register);
				if (result == null) result = caseArithmeticOperand(register);
				if (result == null) result = caseOperand(register);
				if (result == null) result = caseUnaryArithmeticExpressionChild(register);
				if (result == null) result = casePowerArithmeticExpressionChild(register);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(register);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(register);
				if (result == null) result = caseRangeExpressionChild(register);
				if (result == null) result = caseArithmeticExpression(register);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(register);
				if (result == null) result = caseSimpleConditionChild(register);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(register);
				if (result == null) result = caseNegatedConditionalExpressionChild(register);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(register);
				if (result == null) result = caseConditionalAndExpressionChild(register);
				if (result == null) result = caseConditionalOrExpressionChild(register);
				if (result == null) result = caseCondition(register);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistersPackage.SHIFT_IN: {
				ShiftIn shiftIn = (ShiftIn)theEObject;
				T result = caseShiftIn(shiftIn);
				if (result == null) result = caseRegister(shiftIn);
				if (result == null) result = casePrimaryOperand(shiftIn);
				if (result == null) result = caseReplacementOperand(shiftIn);
				if (result == null) result = casePrimaryExpression(shiftIn);
				if (result == null) result = caseArithmeticOperand(shiftIn);
				if (result == null) result = caseOperand(shiftIn);
				if (result == null) result = caseUnaryArithmeticExpressionChild(shiftIn);
				if (result == null) result = casePowerArithmeticExpressionChild(shiftIn);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(shiftIn);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(shiftIn);
				if (result == null) result = caseRangeExpressionChild(shiftIn);
				if (result == null) result = caseArithmeticExpression(shiftIn);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(shiftIn);
				if (result == null) result = caseSimpleConditionChild(shiftIn);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(shiftIn);
				if (result == null) result = caseNegatedConditionalExpressionChild(shiftIn);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(shiftIn);
				if (result == null) result = caseConditionalAndExpressionChild(shiftIn);
				if (result == null) result = caseConditionalOrExpressionChild(shiftIn);
				if (result == null) result = caseCondition(shiftIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistersPackage.SHIFT_OUT: {
				ShiftOut shiftOut = (ShiftOut)theEObject;
				T result = caseShiftOut(shiftOut);
				if (result == null) result = caseRegister(shiftOut);
				if (result == null) result = casePrimaryOperand(shiftOut);
				if (result == null) result = caseReplacementOperand(shiftOut);
				if (result == null) result = casePrimaryExpression(shiftOut);
				if (result == null) result = caseArithmeticOperand(shiftOut);
				if (result == null) result = caseOperand(shiftOut);
				if (result == null) result = caseUnaryArithmeticExpressionChild(shiftOut);
				if (result == null) result = casePowerArithmeticExpressionChild(shiftOut);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(shiftOut);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(shiftOut);
				if (result == null) result = caseRangeExpressionChild(shiftOut);
				if (result == null) result = caseArithmeticExpression(shiftOut);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(shiftOut);
				if (result == null) result = caseSimpleConditionChild(shiftOut);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(shiftOut);
				if (result == null) result = caseNegatedConditionalExpressionChild(shiftOut);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(shiftOut);
				if (result == null) result = caseConditionalAndExpressionChild(shiftOut);
				if (result == null) result = caseConditionalOrExpressionChild(shiftOut);
				if (result == null) result = caseCondition(shiftOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistersPackage.ADDRESS_OF: {
				AddressOf addressOf = (AddressOf)theEObject;
				T result = caseAddressOf(addressOf);
				if (result == null) result = caseRegister(addressOf);
				if (result == null) result = casePrimaryOperand(addressOf);
				if (result == null) result = caseReplacementOperand(addressOf);
				if (result == null) result = casePrimaryExpression(addressOf);
				if (result == null) result = caseArithmeticOperand(addressOf);
				if (result == null) result = caseOperand(addressOf);
				if (result == null) result = caseUnaryArithmeticExpressionChild(addressOf);
				if (result == null) result = casePowerArithmeticExpressionChild(addressOf);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(addressOf);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(addressOf);
				if (result == null) result = caseRangeExpressionChild(addressOf);
				if (result == null) result = caseArithmeticExpression(addressOf);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(addressOf);
				if (result == null) result = caseSimpleConditionChild(addressOf);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(addressOf);
				if (result == null) result = caseNegatedConditionalExpressionChild(addressOf);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(addressOf);
				if (result == null) result = caseConditionalAndExpressionChild(addressOf);
				if (result == null) result = caseConditionalOrExpressionChild(addressOf);
				if (result == null) result = caseCondition(addressOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistersPackage.LENGTH_OF: {
				LengthOf lengthOf = (LengthOf)theEObject;
				T result = caseLengthOf(lengthOf);
				if (result == null) result = caseRegister(lengthOf);
				if (result == null) result = casePrimaryOperand(lengthOf);
				if (result == null) result = caseReplacementOperand(lengthOf);
				if (result == null) result = casePrimaryExpression(lengthOf);
				if (result == null) result = caseArithmeticOperand(lengthOf);
				if (result == null) result = caseOperand(lengthOf);
				if (result == null) result = caseUnaryArithmeticExpressionChild(lengthOf);
				if (result == null) result = casePowerArithmeticExpressionChild(lengthOf);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(lengthOf);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(lengthOf);
				if (result == null) result = caseRangeExpressionChild(lengthOf);
				if (result == null) result = caseArithmeticExpression(lengthOf);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(lengthOf);
				if (result == null) result = caseSimpleConditionChild(lengthOf);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(lengthOf);
				if (result == null) result = caseNegatedConditionalExpressionChild(lengthOf);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(lengthOf);
				if (result == null) result = caseConditionalAndExpressionChild(lengthOf);
				if (result == null) result = caseConditionalOrExpressionChild(lengthOf);
				if (result == null) result = caseCondition(lengthOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistersPackage.RETURN_CODE: {
				ReturnCode returnCode = (ReturnCode)theEObject;
				T result = caseReturnCode(returnCode);
				if (result == null) result = caseRegister(returnCode);
				if (result == null) result = casePrimaryOperand(returnCode);
				if (result == null) result = caseReplacementOperand(returnCode);
				if (result == null) result = casePrimaryExpression(returnCode);
				if (result == null) result = caseArithmeticOperand(returnCode);
				if (result == null) result = caseOperand(returnCode);
				if (result == null) result = caseUnaryArithmeticExpressionChild(returnCode);
				if (result == null) result = casePowerArithmeticExpressionChild(returnCode);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(returnCode);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(returnCode);
				if (result == null) result = caseRangeExpressionChild(returnCode);
				if (result == null) result = caseArithmeticExpression(returnCode);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(returnCode);
				if (result == null) result = caseSimpleConditionChild(returnCode);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(returnCode);
				if (result == null) result = caseNegatedConditionalExpressionChild(returnCode);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(returnCode);
				if (result == null) result = caseConditionalAndExpressionChild(returnCode);
				if (result == null) result = caseConditionalOrExpressionChild(returnCode);
				if (result == null) result = caseCondition(returnCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistersPackage.WHEN_COMPILED: {
				WhenCompiled whenCompiled = (WhenCompiled)theEObject;
				T result = caseWhenCompiled(whenCompiled);
				if (result == null) result = caseRegister(whenCompiled);
				if (result == null) result = casePrimaryOperand(whenCompiled);
				if (result == null) result = caseReplacementOperand(whenCompiled);
				if (result == null) result = casePrimaryExpression(whenCompiled);
				if (result == null) result = caseArithmeticOperand(whenCompiled);
				if (result == null) result = caseOperand(whenCompiled);
				if (result == null) result = caseUnaryArithmeticExpressionChild(whenCompiled);
				if (result == null) result = casePowerArithmeticExpressionChild(whenCompiled);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(whenCompiled);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(whenCompiled);
				if (result == null) result = caseRangeExpressionChild(whenCompiled);
				if (result == null) result = caseArithmeticExpression(whenCompiled);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(whenCompiled);
				if (result == null) result = caseSimpleConditionChild(whenCompiled);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(whenCompiled);
				if (result == null) result = caseNegatedConditionalExpressionChild(whenCompiled);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(whenCompiled);
				if (result == null) result = caseConditionalAndExpressionChild(whenCompiled);
				if (result == null) result = caseConditionalOrExpressionChild(whenCompiled);
				if (result == null) result = caseCondition(whenCompiled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegister(Register object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftIn(ShiftIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftOut(ShiftOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressOf(AddressOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthOf(LengthOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnCode(ReturnCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Compiled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Compiled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenCompiled(WhenCompiled object) {
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

} //RegistersSwitch
