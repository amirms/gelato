/**
 */
package org.servicifi.gelato.language.cobol.literals.util;

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

import org.servicifi.gelato.language.cobol.labels.Label;
import org.servicifi.gelato.language.cobol.labels.StopLabel;

import org.servicifi.gelato.language.cobol.literals.*;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;
import org.servicifi.gelato.language.cobol.operands.Operand;
import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;
import org.servicifi.gelato.language.cobol.operands.ReplacementOperand;

import org.servicifi.gelato.language.cobol.water.CICSStatementWater;
import org.servicifi.gelato.language.cobol.water.FileDescriptorWater;
import org.servicifi.gelato.language.cobol.water.IOControlParagraphWater;
import org.servicifi.gelato.language.cobol.water.InvokeStatementWater;
import org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater;
import org.servicifi.gelato.language.cobol.water.SelectStatementWater;
import org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater;
import org.servicifi.gelato.language.cobol.water.Water;

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
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage
 * @generated
 */
public class LiteralsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LiteralsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsSwitch() {
		if (modelPackage == null) {
			modelPackage = LiteralsPackage.eINSTANCE;
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
			case LiteralsPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseSelectStatementWater(literal);
				if (result == null) result = caseSpecialNamesParagraphWater(literal);
				if (result == null) result = caseCICSStatementWater(literal);
				if (result == null) result = casePrimaryOperand(literal);
				if (result == null) result = caseInvokeStatementWater(literal);
				if (result == null) result = caseStopLabel(literal);
				if (result == null) result = caseWater(literal);
				if (result == null) result = caseReplacementOperand(literal);
				if (result == null) result = casePrimaryExpression(literal);
				if (result == null) result = caseArithmeticOperand(literal);
				if (result == null) result = caseLabel(literal);
				if (result == null) result = caseOperand(literal);
				if (result == null) result = caseUnaryArithmeticExpressionChild(literal);
				if (result == null) result = casePowerArithmeticExpressionChild(literal);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(literal);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(literal);
				if (result == null) result = caseRangeExpressionChild(literal);
				if (result == null) result = caseArithmeticExpression(literal);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(literal);
				if (result == null) result = caseSimpleConditionChild(literal);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(literal);
				if (result == null) result = caseNegatedConditionalExpressionChild(literal);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(literal);
				if (result == null) result = caseConditionalAndExpressionChild(literal);
				if (result == null) result = caseConditionalOrExpressionChild(literal);
				if (result == null) result = caseCondition(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.ALPHANUMERIC_LITERAL: {
				AlphanumericLiteral alphanumericLiteral = (AlphanumericLiteral)theEObject;
				T result = caseAlphanumericLiteral(alphanumericLiteral);
				if (result == null) result = caseLiteral(alphanumericLiteral);
				if (result == null) result = caseSelectStatementWater(alphanumericLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(alphanumericLiteral);
				if (result == null) result = caseCICSStatementWater(alphanumericLiteral);
				if (result == null) result = casePrimaryOperand(alphanumericLiteral);
				if (result == null) result = caseInvokeStatementWater(alphanumericLiteral);
				if (result == null) result = caseStopLabel(alphanumericLiteral);
				if (result == null) result = caseWater(alphanumericLiteral);
				if (result == null) result = caseReplacementOperand(alphanumericLiteral);
				if (result == null) result = casePrimaryExpression(alphanumericLiteral);
				if (result == null) result = caseArithmeticOperand(alphanumericLiteral);
				if (result == null) result = caseLabel(alphanumericLiteral);
				if (result == null) result = caseOperand(alphanumericLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(alphanumericLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(alphanumericLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(alphanumericLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(alphanumericLiteral);
				if (result == null) result = caseRangeExpressionChild(alphanumericLiteral);
				if (result == null) result = caseArithmeticExpression(alphanumericLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(alphanumericLiteral);
				if (result == null) result = caseSimpleConditionChild(alphanumericLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(alphanumericLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(alphanumericLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(alphanumericLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(alphanumericLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(alphanumericLiteral);
				if (result == null) result = caseCondition(alphanumericLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseNumericLiteral(integerLiteral);
				if (result == null) result = caseObjectComputerParagraphWater(integerLiteral);
				if (result == null) result = caseFileDescriptorWater(integerLiteral);
				if (result == null) result = caseIOControlParagraphWater(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = caseSelectStatementWater(integerLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(integerLiteral);
				if (result == null) result = caseCICSStatementWater(integerLiteral);
				if (result == null) result = casePrimaryOperand(integerLiteral);
				if (result == null) result = caseInvokeStatementWater(integerLiteral);
				if (result == null) result = caseStopLabel(integerLiteral);
				if (result == null) result = caseWater(integerLiteral);
				if (result == null) result = caseReplacementOperand(integerLiteral);
				if (result == null) result = casePrimaryExpression(integerLiteral);
				if (result == null) result = caseArithmeticOperand(integerLiteral);
				if (result == null) result = caseLabel(integerLiteral);
				if (result == null) result = caseOperand(integerLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(integerLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(integerLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(integerLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(integerLiteral);
				if (result == null) result = caseRangeExpressionChild(integerLiteral);
				if (result == null) result = caseArithmeticExpression(integerLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(integerLiteral);
				if (result == null) result = caseSimpleConditionChild(integerLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(integerLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(integerLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(integerLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(integerLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(integerLiteral);
				if (result == null) result = caseCondition(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.DECIMAL_LITERAL: {
				DecimalLiteral decimalLiteral = (DecimalLiteral)theEObject;
				T result = caseDecimalLiteral(decimalLiteral);
				if (result == null) result = caseNumericLiteral(decimalLiteral);
				if (result == null) result = caseLiteral(decimalLiteral);
				if (result == null) result = caseSelectStatementWater(decimalLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(decimalLiteral);
				if (result == null) result = caseCICSStatementWater(decimalLiteral);
				if (result == null) result = casePrimaryOperand(decimalLiteral);
				if (result == null) result = caseInvokeStatementWater(decimalLiteral);
				if (result == null) result = caseStopLabel(decimalLiteral);
				if (result == null) result = caseWater(decimalLiteral);
				if (result == null) result = caseReplacementOperand(decimalLiteral);
				if (result == null) result = casePrimaryExpression(decimalLiteral);
				if (result == null) result = caseArithmeticOperand(decimalLiteral);
				if (result == null) result = caseLabel(decimalLiteral);
				if (result == null) result = caseOperand(decimalLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(decimalLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(decimalLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(decimalLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(decimalLiteral);
				if (result == null) result = caseRangeExpressionChild(decimalLiteral);
				if (result == null) result = caseArithmeticExpression(decimalLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(decimalLiteral);
				if (result == null) result = caseSimpleConditionChild(decimalLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(decimalLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(decimalLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(decimalLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(decimalLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(decimalLiteral);
				if (result == null) result = caseCondition(decimalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.FIGURATIVE_CONSTANT_LITERAL: {
				FigurativeConstantLiteral figurativeConstantLiteral = (FigurativeConstantLiteral)theEObject;
				T result = caseFigurativeConstantLiteral(figurativeConstantLiteral);
				if (result == null) result = caseLiteral(figurativeConstantLiteral);
				if (result == null) result = caseSelectStatementWater(figurativeConstantLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(figurativeConstantLiteral);
				if (result == null) result = caseCICSStatementWater(figurativeConstantLiteral);
				if (result == null) result = casePrimaryOperand(figurativeConstantLiteral);
				if (result == null) result = caseInvokeStatementWater(figurativeConstantLiteral);
				if (result == null) result = caseStopLabel(figurativeConstantLiteral);
				if (result == null) result = caseWater(figurativeConstantLiteral);
				if (result == null) result = caseReplacementOperand(figurativeConstantLiteral);
				if (result == null) result = casePrimaryExpression(figurativeConstantLiteral);
				if (result == null) result = caseArithmeticOperand(figurativeConstantLiteral);
				if (result == null) result = caseLabel(figurativeConstantLiteral);
				if (result == null) result = caseOperand(figurativeConstantLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(figurativeConstantLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseRangeExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseArithmeticExpression(figurativeConstantLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseSimpleConditionChild(figurativeConstantLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(figurativeConstantLiteral);
				if (result == null) result = caseCondition(figurativeConstantLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = caseSelectStatementWater(booleanLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(booleanLiteral);
				if (result == null) result = caseCICSStatementWater(booleanLiteral);
				if (result == null) result = casePrimaryOperand(booleanLiteral);
				if (result == null) result = caseInvokeStatementWater(booleanLiteral);
				if (result == null) result = caseStopLabel(booleanLiteral);
				if (result == null) result = caseWater(booleanLiteral);
				if (result == null) result = caseReplacementOperand(booleanLiteral);
				if (result == null) result = casePrimaryExpression(booleanLiteral);
				if (result == null) result = caseArithmeticOperand(booleanLiteral);
				if (result == null) result = caseLabel(booleanLiteral);
				if (result == null) result = caseOperand(booleanLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(booleanLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(booleanLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(booleanLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(booleanLiteral);
				if (result == null) result = caseRangeExpressionChild(booleanLiteral);
				if (result == null) result = caseArithmeticExpression(booleanLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(booleanLiteral);
				if (result == null) result = caseSimpleConditionChild(booleanLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(booleanLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(booleanLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(booleanLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(booleanLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(booleanLiteral);
				if (result == null) result = caseCondition(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.FLOATING_DECIMAL_LITERAL: {
				FloatingDecimalLiteral floatingDecimalLiteral = (FloatingDecimalLiteral)theEObject;
				T result = caseFloatingDecimalLiteral(floatingDecimalLiteral);
				if (result == null) result = caseDecimalLiteral(floatingDecimalLiteral);
				if (result == null) result = caseNumericLiteral(floatingDecimalLiteral);
				if (result == null) result = caseLiteral(floatingDecimalLiteral);
				if (result == null) result = caseSelectStatementWater(floatingDecimalLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(floatingDecimalLiteral);
				if (result == null) result = caseCICSStatementWater(floatingDecimalLiteral);
				if (result == null) result = casePrimaryOperand(floatingDecimalLiteral);
				if (result == null) result = caseInvokeStatementWater(floatingDecimalLiteral);
				if (result == null) result = caseStopLabel(floatingDecimalLiteral);
				if (result == null) result = caseWater(floatingDecimalLiteral);
				if (result == null) result = caseReplacementOperand(floatingDecimalLiteral);
				if (result == null) result = casePrimaryExpression(floatingDecimalLiteral);
				if (result == null) result = caseArithmeticOperand(floatingDecimalLiteral);
				if (result == null) result = caseLabel(floatingDecimalLiteral);
				if (result == null) result = caseOperand(floatingDecimalLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(floatingDecimalLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseRangeExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseArithmeticExpression(floatingDecimalLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseSimpleConditionChild(floatingDecimalLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(floatingDecimalLiteral);
				if (result == null) result = caseCondition(floatingDecimalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.ALL_LITERAL: {
				AllLiteral allLiteral = (AllLiteral)theEObject;
				T result = caseAllLiteral(allLiteral);
				if (result == null) result = caseFigurativeConstantLiteral(allLiteral);
				if (result == null) result = caseLiteral(allLiteral);
				if (result == null) result = caseSelectStatementWater(allLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(allLiteral);
				if (result == null) result = caseCICSStatementWater(allLiteral);
				if (result == null) result = casePrimaryOperand(allLiteral);
				if (result == null) result = caseInvokeStatementWater(allLiteral);
				if (result == null) result = caseStopLabel(allLiteral);
				if (result == null) result = caseWater(allLiteral);
				if (result == null) result = caseReplacementOperand(allLiteral);
				if (result == null) result = casePrimaryExpression(allLiteral);
				if (result == null) result = caseArithmeticOperand(allLiteral);
				if (result == null) result = caseLabel(allLiteral);
				if (result == null) result = caseOperand(allLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(allLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(allLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(allLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(allLiteral);
				if (result == null) result = caseRangeExpressionChild(allLiteral);
				if (result == null) result = caseArithmeticExpression(allLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(allLiteral);
				if (result == null) result = caseSimpleConditionChild(allLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(allLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(allLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(allLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(allLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(allLiteral);
				if (result == null) result = caseCondition(allLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.NUMERIC_LITERAL: {
				NumericLiteral numericLiteral = (NumericLiteral)theEObject;
				T result = caseNumericLiteral(numericLiteral);
				if (result == null) result = caseLiteral(numericLiteral);
				if (result == null) result = caseSelectStatementWater(numericLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(numericLiteral);
				if (result == null) result = caseCICSStatementWater(numericLiteral);
				if (result == null) result = casePrimaryOperand(numericLiteral);
				if (result == null) result = caseInvokeStatementWater(numericLiteral);
				if (result == null) result = caseStopLabel(numericLiteral);
				if (result == null) result = caseWater(numericLiteral);
				if (result == null) result = caseReplacementOperand(numericLiteral);
				if (result == null) result = casePrimaryExpression(numericLiteral);
				if (result == null) result = caseArithmeticOperand(numericLiteral);
				if (result == null) result = caseLabel(numericLiteral);
				if (result == null) result = caseOperand(numericLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(numericLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(numericLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(numericLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(numericLiteral);
				if (result == null) result = caseRangeExpressionChild(numericLiteral);
				if (result == null) result = caseArithmeticExpression(numericLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(numericLiteral);
				if (result == null) result = caseSimpleConditionChild(numericLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(numericLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(numericLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(numericLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(numericLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(numericLiteral);
				if (result == null) result = caseCondition(numericLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.CONSTANT_LITERAL: {
				ConstantLiteral constantLiteral = (ConstantLiteral)theEObject;
				T result = caseConstantLiteral(constantLiteral);
				if (result == null) result = caseFigurativeConstantLiteral(constantLiteral);
				if (result == null) result = caseLiteral(constantLiteral);
				if (result == null) result = caseSelectStatementWater(constantLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(constantLiteral);
				if (result == null) result = caseCICSStatementWater(constantLiteral);
				if (result == null) result = casePrimaryOperand(constantLiteral);
				if (result == null) result = caseInvokeStatementWater(constantLiteral);
				if (result == null) result = caseStopLabel(constantLiteral);
				if (result == null) result = caseWater(constantLiteral);
				if (result == null) result = caseReplacementOperand(constantLiteral);
				if (result == null) result = casePrimaryExpression(constantLiteral);
				if (result == null) result = caseArithmeticOperand(constantLiteral);
				if (result == null) result = caseLabel(constantLiteral);
				if (result == null) result = caseOperand(constantLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(constantLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(constantLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(constantLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(constantLiteral);
				if (result == null) result = caseRangeExpressionChild(constantLiteral);
				if (result == null) result = caseArithmeticExpression(constantLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(constantLiteral);
				if (result == null) result = caseSimpleConditionChild(constantLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(constantLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(constantLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(constantLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(constantLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(constantLiteral);
				if (result == null) result = caseCondition(constantLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.PSEUDO_LITERAL: {
				PseudoLiteral pseudoLiteral = (PseudoLiteral)theEObject;
				T result = casePseudoLiteral(pseudoLiteral);
				if (result == null) result = caseLiteral(pseudoLiteral);
				if (result == null) result = caseSelectStatementWater(pseudoLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(pseudoLiteral);
				if (result == null) result = caseCICSStatementWater(pseudoLiteral);
				if (result == null) result = casePrimaryOperand(pseudoLiteral);
				if (result == null) result = caseInvokeStatementWater(pseudoLiteral);
				if (result == null) result = caseStopLabel(pseudoLiteral);
				if (result == null) result = caseWater(pseudoLiteral);
				if (result == null) result = caseReplacementOperand(pseudoLiteral);
				if (result == null) result = casePrimaryExpression(pseudoLiteral);
				if (result == null) result = caseArithmeticOperand(pseudoLiteral);
				if (result == null) result = caseLabel(pseudoLiteral);
				if (result == null) result = caseOperand(pseudoLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(pseudoLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(pseudoLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(pseudoLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(pseudoLiteral);
				if (result == null) result = caseRangeExpressionChild(pseudoLiteral);
				if (result == null) result = caseArithmeticExpression(pseudoLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(pseudoLiteral);
				if (result == null) result = caseSimpleConditionChild(pseudoLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(pseudoLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(pseudoLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(pseudoLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(pseudoLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(pseudoLiteral);
				if (result == null) result = caseCondition(pseudoLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.DBCS_LITERAL: {
				DBCSLiteral dbcsLiteral = (DBCSLiteral)theEObject;
				T result = caseDBCSLiteral(dbcsLiteral);
				if (result == null) result = caseLiteral(dbcsLiteral);
				if (result == null) result = caseSelectStatementWater(dbcsLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(dbcsLiteral);
				if (result == null) result = caseCICSStatementWater(dbcsLiteral);
				if (result == null) result = casePrimaryOperand(dbcsLiteral);
				if (result == null) result = caseInvokeStatementWater(dbcsLiteral);
				if (result == null) result = caseStopLabel(dbcsLiteral);
				if (result == null) result = caseWater(dbcsLiteral);
				if (result == null) result = caseReplacementOperand(dbcsLiteral);
				if (result == null) result = casePrimaryExpression(dbcsLiteral);
				if (result == null) result = caseArithmeticOperand(dbcsLiteral);
				if (result == null) result = caseLabel(dbcsLiteral);
				if (result == null) result = caseOperand(dbcsLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(dbcsLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(dbcsLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(dbcsLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(dbcsLiteral);
				if (result == null) result = caseRangeExpressionChild(dbcsLiteral);
				if (result == null) result = caseArithmeticExpression(dbcsLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(dbcsLiteral);
				if (result == null) result = caseSimpleConditionChild(dbcsLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(dbcsLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(dbcsLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(dbcsLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(dbcsLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(dbcsLiteral);
				if (result == null) result = caseCondition(dbcsLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.NATIONAL_LITERAL: {
				NationalLiteral nationalLiteral = (NationalLiteral)theEObject;
				T result = caseNationalLiteral(nationalLiteral);
				if (result == null) result = caseDBCSLiteral(nationalLiteral);
				if (result == null) result = caseLiteral(nationalLiteral);
				if (result == null) result = caseSelectStatementWater(nationalLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(nationalLiteral);
				if (result == null) result = caseCICSStatementWater(nationalLiteral);
				if (result == null) result = casePrimaryOperand(nationalLiteral);
				if (result == null) result = caseInvokeStatementWater(nationalLiteral);
				if (result == null) result = caseStopLabel(nationalLiteral);
				if (result == null) result = caseWater(nationalLiteral);
				if (result == null) result = caseReplacementOperand(nationalLiteral);
				if (result == null) result = casePrimaryExpression(nationalLiteral);
				if (result == null) result = caseArithmeticOperand(nationalLiteral);
				if (result == null) result = caseLabel(nationalLiteral);
				if (result == null) result = caseOperand(nationalLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(nationalLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(nationalLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(nationalLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(nationalLiteral);
				if (result == null) result = caseRangeExpressionChild(nationalLiteral);
				if (result == null) result = caseArithmeticExpression(nationalLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(nationalLiteral);
				if (result == null) result = caseSimpleConditionChild(nationalLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(nationalLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(nationalLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(nationalLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(nationalLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(nationalLiteral);
				if (result == null) result = caseCondition(nationalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.FIXED_DECIMAL_LITERAL: {
				FixedDecimalLiteral fixedDecimalLiteral = (FixedDecimalLiteral)theEObject;
				T result = caseFixedDecimalLiteral(fixedDecimalLiteral);
				if (result == null) result = caseDecimalLiteral(fixedDecimalLiteral);
				if (result == null) result = caseNumericLiteral(fixedDecimalLiteral);
				if (result == null) result = caseLiteral(fixedDecimalLiteral);
				if (result == null) result = caseSelectStatementWater(fixedDecimalLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(fixedDecimalLiteral);
				if (result == null) result = caseCICSStatementWater(fixedDecimalLiteral);
				if (result == null) result = casePrimaryOperand(fixedDecimalLiteral);
				if (result == null) result = caseInvokeStatementWater(fixedDecimalLiteral);
				if (result == null) result = caseStopLabel(fixedDecimalLiteral);
				if (result == null) result = caseWater(fixedDecimalLiteral);
				if (result == null) result = caseReplacementOperand(fixedDecimalLiteral);
				if (result == null) result = casePrimaryExpression(fixedDecimalLiteral);
				if (result == null) result = caseArithmeticOperand(fixedDecimalLiteral);
				if (result == null) result = caseLabel(fixedDecimalLiteral);
				if (result == null) result = caseOperand(fixedDecimalLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(fixedDecimalLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseRangeExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseArithmeticExpression(fixedDecimalLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseSimpleConditionChild(fixedDecimalLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(fixedDecimalLiteral);
				if (result == null) result = caseCondition(fixedDecimalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.NATIONAL_HEX_LITERAL: {
				NationalHexLiteral nationalHexLiteral = (NationalHexLiteral)theEObject;
				T result = caseNationalHexLiteral(nationalHexLiteral);
				if (result == null) result = caseDBCSLiteral(nationalHexLiteral);
				if (result == null) result = caseLiteral(nationalHexLiteral);
				if (result == null) result = caseSelectStatementWater(nationalHexLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(nationalHexLiteral);
				if (result == null) result = caseCICSStatementWater(nationalHexLiteral);
				if (result == null) result = casePrimaryOperand(nationalHexLiteral);
				if (result == null) result = caseInvokeStatementWater(nationalHexLiteral);
				if (result == null) result = caseStopLabel(nationalHexLiteral);
				if (result == null) result = caseWater(nationalHexLiteral);
				if (result == null) result = caseReplacementOperand(nationalHexLiteral);
				if (result == null) result = casePrimaryExpression(nationalHexLiteral);
				if (result == null) result = caseArithmeticOperand(nationalHexLiteral);
				if (result == null) result = caseLabel(nationalHexLiteral);
				if (result == null) result = caseOperand(nationalHexLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(nationalHexLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(nationalHexLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(nationalHexLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(nationalHexLiteral);
				if (result == null) result = caseRangeExpressionChild(nationalHexLiteral);
				if (result == null) result = caseArithmeticExpression(nationalHexLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(nationalHexLiteral);
				if (result == null) result = caseSimpleConditionChild(nationalHexLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(nationalHexLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(nationalHexLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(nationalHexLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(nationalHexLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(nationalHexLiteral);
				if (result == null) result = caseCondition(nationalHexLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.NULL: {
				Null null_ = (Null)theEObject;
				T result = caseNull(null_);
				if (result == null) result = caseConstantLiteral(null_);
				if (result == null) result = caseFigurativeConstantLiteral(null_);
				if (result == null) result = caseLiteral(null_);
				if (result == null) result = caseSelectStatementWater(null_);
				if (result == null) result = caseSpecialNamesParagraphWater(null_);
				if (result == null) result = caseCICSStatementWater(null_);
				if (result == null) result = casePrimaryOperand(null_);
				if (result == null) result = caseInvokeStatementWater(null_);
				if (result == null) result = caseStopLabel(null_);
				if (result == null) result = caseWater(null_);
				if (result == null) result = caseReplacementOperand(null_);
				if (result == null) result = casePrimaryExpression(null_);
				if (result == null) result = caseArithmeticOperand(null_);
				if (result == null) result = caseLabel(null_);
				if (result == null) result = caseOperand(null_);
				if (result == null) result = caseUnaryArithmeticExpressionChild(null_);
				if (result == null) result = casePowerArithmeticExpressionChild(null_);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(null_);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(null_);
				if (result == null) result = caseRangeExpressionChild(null_);
				if (result == null) result = caseArithmeticExpression(null_);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(null_);
				if (result == null) result = caseSimpleConditionChild(null_);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(null_);
				if (result == null) result = caseNegatedConditionalExpressionChild(null_);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(null_);
				if (result == null) result = caseConditionalAndExpressionChild(null_);
				if (result == null) result = caseConditionalOrExpressionChild(null_);
				if (result == null) result = caseCondition(null_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.ZERO: {
				Zero zero = (Zero)theEObject;
				T result = caseZero(zero);
				if (result == null) result = caseConstantLiteral(zero);
				if (result == null) result = caseFigurativeConstantLiteral(zero);
				if (result == null) result = caseLiteral(zero);
				if (result == null) result = caseSelectStatementWater(zero);
				if (result == null) result = caseSpecialNamesParagraphWater(zero);
				if (result == null) result = caseCICSStatementWater(zero);
				if (result == null) result = casePrimaryOperand(zero);
				if (result == null) result = caseInvokeStatementWater(zero);
				if (result == null) result = caseStopLabel(zero);
				if (result == null) result = caseWater(zero);
				if (result == null) result = caseReplacementOperand(zero);
				if (result == null) result = casePrimaryExpression(zero);
				if (result == null) result = caseArithmeticOperand(zero);
				if (result == null) result = caseLabel(zero);
				if (result == null) result = caseOperand(zero);
				if (result == null) result = caseUnaryArithmeticExpressionChild(zero);
				if (result == null) result = casePowerArithmeticExpressionChild(zero);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(zero);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(zero);
				if (result == null) result = caseRangeExpressionChild(zero);
				if (result == null) result = caseArithmeticExpression(zero);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(zero);
				if (result == null) result = caseSimpleConditionChild(zero);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(zero);
				if (result == null) result = caseNegatedConditionalExpressionChild(zero);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(zero);
				if (result == null) result = caseConditionalAndExpressionChild(zero);
				if (result == null) result = caseConditionalOrExpressionChild(zero);
				if (result == null) result = caseCondition(zero);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.QUOTE: {
				Quote quote = (Quote)theEObject;
				T result = caseQuote(quote);
				if (result == null) result = caseConstantLiteral(quote);
				if (result == null) result = caseFigurativeConstantLiteral(quote);
				if (result == null) result = caseLiteral(quote);
				if (result == null) result = caseSelectStatementWater(quote);
				if (result == null) result = caseSpecialNamesParagraphWater(quote);
				if (result == null) result = caseCICSStatementWater(quote);
				if (result == null) result = casePrimaryOperand(quote);
				if (result == null) result = caseInvokeStatementWater(quote);
				if (result == null) result = caseStopLabel(quote);
				if (result == null) result = caseWater(quote);
				if (result == null) result = caseReplacementOperand(quote);
				if (result == null) result = casePrimaryExpression(quote);
				if (result == null) result = caseArithmeticOperand(quote);
				if (result == null) result = caseLabel(quote);
				if (result == null) result = caseOperand(quote);
				if (result == null) result = caseUnaryArithmeticExpressionChild(quote);
				if (result == null) result = casePowerArithmeticExpressionChild(quote);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(quote);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(quote);
				if (result == null) result = caseRangeExpressionChild(quote);
				if (result == null) result = caseArithmeticExpression(quote);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(quote);
				if (result == null) result = caseSimpleConditionChild(quote);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(quote);
				if (result == null) result = caseNegatedConditionalExpressionChild(quote);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(quote);
				if (result == null) result = caseConditionalAndExpressionChild(quote);
				if (result == null) result = caseConditionalOrExpressionChild(quote);
				if (result == null) result = caseCondition(quote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.LOW_VALUE: {
				LowValue lowValue = (LowValue)theEObject;
				T result = caseLowValue(lowValue);
				if (result == null) result = caseConstantLiteral(lowValue);
				if (result == null) result = caseFigurativeConstantLiteral(lowValue);
				if (result == null) result = caseLiteral(lowValue);
				if (result == null) result = caseSelectStatementWater(lowValue);
				if (result == null) result = caseSpecialNamesParagraphWater(lowValue);
				if (result == null) result = caseCICSStatementWater(lowValue);
				if (result == null) result = casePrimaryOperand(lowValue);
				if (result == null) result = caseInvokeStatementWater(lowValue);
				if (result == null) result = caseStopLabel(lowValue);
				if (result == null) result = caseWater(lowValue);
				if (result == null) result = caseReplacementOperand(lowValue);
				if (result == null) result = casePrimaryExpression(lowValue);
				if (result == null) result = caseArithmeticOperand(lowValue);
				if (result == null) result = caseLabel(lowValue);
				if (result == null) result = caseOperand(lowValue);
				if (result == null) result = caseUnaryArithmeticExpressionChild(lowValue);
				if (result == null) result = casePowerArithmeticExpressionChild(lowValue);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(lowValue);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(lowValue);
				if (result == null) result = caseRangeExpressionChild(lowValue);
				if (result == null) result = caseArithmeticExpression(lowValue);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(lowValue);
				if (result == null) result = caseSimpleConditionChild(lowValue);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(lowValue);
				if (result == null) result = caseNegatedConditionalExpressionChild(lowValue);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(lowValue);
				if (result == null) result = caseConditionalAndExpressionChild(lowValue);
				if (result == null) result = caseConditionalOrExpressionChild(lowValue);
				if (result == null) result = caseCondition(lowValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.HIGH_VALUE: {
				HighValue highValue = (HighValue)theEObject;
				T result = caseHighValue(highValue);
				if (result == null) result = caseConstantLiteral(highValue);
				if (result == null) result = caseFigurativeConstantLiteral(highValue);
				if (result == null) result = caseLiteral(highValue);
				if (result == null) result = caseSelectStatementWater(highValue);
				if (result == null) result = caseSpecialNamesParagraphWater(highValue);
				if (result == null) result = caseCICSStatementWater(highValue);
				if (result == null) result = casePrimaryOperand(highValue);
				if (result == null) result = caseInvokeStatementWater(highValue);
				if (result == null) result = caseStopLabel(highValue);
				if (result == null) result = caseWater(highValue);
				if (result == null) result = caseReplacementOperand(highValue);
				if (result == null) result = casePrimaryExpression(highValue);
				if (result == null) result = caseArithmeticOperand(highValue);
				if (result == null) result = caseLabel(highValue);
				if (result == null) result = caseOperand(highValue);
				if (result == null) result = caseUnaryArithmeticExpressionChild(highValue);
				if (result == null) result = casePowerArithmeticExpressionChild(highValue);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(highValue);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(highValue);
				if (result == null) result = caseRangeExpressionChild(highValue);
				if (result == null) result = caseArithmeticExpression(highValue);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(highValue);
				if (result == null) result = caseSimpleConditionChild(highValue);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(highValue);
				if (result == null) result = caseNegatedConditionalExpressionChild(highValue);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(highValue);
				if (result == null) result = caseConditionalAndExpressionChild(highValue);
				if (result == null) result = caseConditionalOrExpressionChild(highValue);
				if (result == null) result = caseCondition(highValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.SPACE: {
				Space space = (Space)theEObject;
				T result = caseSpace(space);
				if (result == null) result = caseConstantLiteral(space);
				if (result == null) result = caseFigurativeConstantLiteral(space);
				if (result == null) result = caseLiteral(space);
				if (result == null) result = caseSelectStatementWater(space);
				if (result == null) result = caseSpecialNamesParagraphWater(space);
				if (result == null) result = caseCICSStatementWater(space);
				if (result == null) result = casePrimaryOperand(space);
				if (result == null) result = caseInvokeStatementWater(space);
				if (result == null) result = caseStopLabel(space);
				if (result == null) result = caseWater(space);
				if (result == null) result = caseReplacementOperand(space);
				if (result == null) result = casePrimaryExpression(space);
				if (result == null) result = caseArithmeticOperand(space);
				if (result == null) result = caseLabel(space);
				if (result == null) result = caseOperand(space);
				if (result == null) result = caseUnaryArithmeticExpressionChild(space);
				if (result == null) result = casePowerArithmeticExpressionChild(space);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(space);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(space);
				if (result == null) result = caseRangeExpressionChild(space);
				if (result == null) result = caseArithmeticExpression(space);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(space);
				if (result == null) result = caseSimpleConditionChild(space);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(space);
				if (result == null) result = caseNegatedConditionalExpressionChild(space);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(space);
				if (result == null) result = caseConditionalAndExpressionChild(space);
				if (result == null) result = caseConditionalOrExpressionChild(space);
				if (result == null) result = caseCondition(space);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.ANY: {
				Any any = (Any)theEObject;
				T result = caseAny(any);
				if (result == null) result = caseLiteral(any);
				if (result == null) result = caseSelectStatementWater(any);
				if (result == null) result = caseSpecialNamesParagraphWater(any);
				if (result == null) result = caseCICSStatementWater(any);
				if (result == null) result = casePrimaryOperand(any);
				if (result == null) result = caseInvokeStatementWater(any);
				if (result == null) result = caseStopLabel(any);
				if (result == null) result = caseWater(any);
				if (result == null) result = caseReplacementOperand(any);
				if (result == null) result = casePrimaryExpression(any);
				if (result == null) result = caseArithmeticOperand(any);
				if (result == null) result = caseLabel(any);
				if (result == null) result = caseOperand(any);
				if (result == null) result = caseUnaryArithmeticExpressionChild(any);
				if (result == null) result = casePowerArithmeticExpressionChild(any);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(any);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(any);
				if (result == null) result = caseRangeExpressionChild(any);
				if (result == null) result = caseArithmeticExpression(any);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(any);
				if (result == null) result = caseSimpleConditionChild(any);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(any);
				if (result == null) result = caseNegatedConditionalExpressionChild(any);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(any);
				if (result == null) result = caseConditionalAndExpressionChild(any);
				if (result == null) result = caseConditionalOrExpressionChild(any);
				if (result == null) result = caseCondition(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.CHARACTERS: {
				Characters characters = (Characters)theEObject;
				T result = caseCharacters(characters);
				if (result == null) result = caseLiteral(characters);
				if (result == null) result = caseSelectStatementWater(characters);
				if (result == null) result = caseSpecialNamesParagraphWater(characters);
				if (result == null) result = caseCICSStatementWater(characters);
				if (result == null) result = casePrimaryOperand(characters);
				if (result == null) result = caseInvokeStatementWater(characters);
				if (result == null) result = caseStopLabel(characters);
				if (result == null) result = caseWater(characters);
				if (result == null) result = caseReplacementOperand(characters);
				if (result == null) result = casePrimaryExpression(characters);
				if (result == null) result = caseArithmeticOperand(characters);
				if (result == null) result = caseLabel(characters);
				if (result == null) result = caseOperand(characters);
				if (result == null) result = caseUnaryArithmeticExpressionChild(characters);
				if (result == null) result = casePowerArithmeticExpressionChild(characters);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(characters);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(characters);
				if (result == null) result = caseRangeExpressionChild(characters);
				if (result == null) result = caseArithmeticExpression(characters);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(characters);
				if (result == null) result = caseSimpleConditionChild(characters);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(characters);
				if (result == null) result = caseNegatedConditionalExpressionChild(characters);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(characters);
				if (result == null) result = caseConditionalAndExpressionChild(characters);
				if (result == null) result = caseConditionalOrExpressionChild(characters);
				if (result == null) result = caseCondition(characters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.ALPHANUMERIC_HEXA_DECIMAL_LITERAL: {
				AlphanumericHexaDecimalLiteral alphanumericHexaDecimalLiteral = (AlphanumericHexaDecimalLiteral)theEObject;
				T result = caseAlphanumericHexaDecimalLiteral(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseAlphanumericLiteral(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseLiteral(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseSelectStatementWater(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseSpecialNamesParagraphWater(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseCICSStatementWater(alphanumericHexaDecimalLiteral);
				if (result == null) result = casePrimaryOperand(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseInvokeStatementWater(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseStopLabel(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseWater(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseReplacementOperand(alphanumericHexaDecimalLiteral);
				if (result == null) result = casePrimaryExpression(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseArithmeticOperand(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseLabel(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseOperand(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseUnaryArithmeticExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = casePowerArithmeticExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseRangeExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseArithmeticExpression(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseSimpleConditionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseNegatedConditionalExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(alphanumericHexaDecimalLiteral);
				if (result == null) result = caseCondition(alphanumericHexaDecimalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphanumeric Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphanumeric Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphanumericLiteral(AlphanumericLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalLiteral(DecimalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figurative Constant Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figurative Constant Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigurativeConstantLiteral(FigurativeConstantLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Decimal Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingDecimalLiteral(FloatingDecimalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllLiteral(AllLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericLiteral(NumericLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantLiteral(ConstantLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudo Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudo Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudoLiteral(PseudoLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBCS Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBCS Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBCSLiteral(DBCSLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>National Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>National Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNationalLiteral(NationalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Decimal Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedDecimalLiteral(FixedDecimalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>National Hex Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>National Hex Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNationalHexLiteral(NationalHexLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNull(Null object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Quote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuote(Quote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Low Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Low Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowValue(LowValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>High Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>High Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighValue(HighValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpace(Space object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAny(Any object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacters(Characters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphanumeric Hexa Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphanumeric Hexa Decimal Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphanumericHexaDecimalLiteral(AlphanumericHexaDecimalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWater(Water object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectStatementWater(SelectStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Names Paragraph Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Names Paragraph Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialNamesParagraphWater(SpecialNamesParagraphWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CICS Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CICS Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCICSStatementWater(CICSStatementWater object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Invoke Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeStatementWater(InvokeStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopLabel(StopLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Computer Paragraph Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Computer Paragraph Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectComputerParagraphWater(ObjectComputerParagraphWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Descriptor Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Descriptor Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDescriptorWater(FileDescriptorWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Control Paragraph Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Control Paragraph Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOControlParagraphWater(IOControlParagraphWater object) {
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

} //LiteralsSwitch
