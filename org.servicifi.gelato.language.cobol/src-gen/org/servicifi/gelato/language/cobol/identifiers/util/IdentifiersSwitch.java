/**
 */
package org.servicifi.gelato.language.cobol.identifiers.util;

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

import org.servicifi.gelato.language.cobol.identifiers.*;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;
import org.servicifi.gelato.language.cobol.operands.Operand;
import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;
import org.servicifi.gelato.language.cobol.operands.ReplacementOperand;

import org.servicifi.gelato.language.cobol.references.ElementReference;
import org.servicifi.gelato.language.cobol.references.Qualifiable;
import org.servicifi.gelato.language.cobol.references.Reference;

import org.servicifi.gelato.language.cobol.water.AcceptStatementWater;
import org.servicifi.gelato.language.cobol.water.CICSStatementWater;
import org.servicifi.gelato.language.cobol.water.DataDescriptorWater;
import org.servicifi.gelato.language.cobol.water.FileDescriptorWater;
import org.servicifi.gelato.language.cobol.water.IOControlParagraphWater;
import org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater;
import org.servicifi.gelato.language.cobol.water.InvokeStatementWater;
import org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater;
import org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater;
import org.servicifi.gelato.language.cobol.water.SQLStatementWater;
import org.servicifi.gelato.language.cobol.water.SelectStatementWater;
import org.servicifi.gelato.language.cobol.water.SortPhraseWater;
import org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater;
import org.servicifi.gelato.language.cobol.water.UseStatementWater;
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
 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage
 * @generated
 */
public class IdentifiersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdentifiersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiersSwitch() {
		if (modelPackage == null) {
			modelPackage = IdentifiersPackage.eINSTANCE;
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
			case IdentifiersPackage.SUBSCRIPT: {
				Subscript subscript = (Subscript)theEObject;
				T result = caseSubscript(subscript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdentifiersPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = casePrimaryOperand(identifier);
				if (result == null) result = caseAcceptStatementWater(identifier);
				if (result == null) result = caseCICSStatementWater(identifier);
				if (result == null) result = caseSpecialNamesParagraphWater(identifier);
				if (result == null) result = caseObjectComputerParagraphWater(identifier);
				if (result == null) result = caseRepositoryParagraphWater(identifier);
				if (result == null) result = caseIOControlParagraphWater(identifier);
				if (result == null) result = caseIdentificationDivisionWater(identifier);
				if (result == null) result = caseInvokeStatementWater(identifier);
				if (result == null) result = caseSQLStatementWater(identifier);
				if (result == null) result = caseUseStatementWater(identifier);
				if (result == null) result = caseFileDescriptorWater(identifier);
				if (result == null) result = caseDataDescriptorWater(identifier);
				if (result == null) result = caseSelectStatementWater(identifier);
				if (result == null) result = caseSortPhraseWater(identifier);
				if (result == null) result = caseReplacementOperand(identifier);
				if (result == null) result = casePrimaryExpression(identifier);
				if (result == null) result = caseArithmeticOperand(identifier);
				if (result == null) result = caseWater(identifier);
				if (result == null) result = caseOperand(identifier);
				if (result == null) result = caseUnaryArithmeticExpressionChild(identifier);
				if (result == null) result = casePowerArithmeticExpressionChild(identifier);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(identifier);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(identifier);
				if (result == null) result = caseRangeExpressionChild(identifier);
				if (result == null) result = caseArithmeticExpression(identifier);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(identifier);
				if (result == null) result = caseSimpleConditionChild(identifier);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(identifier);
				if (result == null) result = caseNegatedConditionalExpressionChild(identifier);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(identifier);
				if (result == null) result = caseConditionalAndExpressionChild(identifier);
				if (result == null) result = caseConditionalOrExpressionChild(identifier);
				if (result == null) result = caseCondition(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdentifiersPackage.IDENTIFIER_REFERENCE: {
				IdentifierReference identifierReference = (IdentifierReference)theEObject;
				T result = caseIdentifierReference(identifierReference);
				if (result == null) result = caseIdentifier(identifierReference);
				if (result == null) result = caseElementReference(identifierReference);
				if (result == null) result = caseQualifiable(identifierReference);
				if (result == null) result = casePrimaryOperand(identifierReference);
				if (result == null) result = caseAcceptStatementWater(identifierReference);
				if (result == null) result = caseCICSStatementWater(identifierReference);
				if (result == null) result = caseSpecialNamesParagraphWater(identifierReference);
				if (result == null) result = caseObjectComputerParagraphWater(identifierReference);
				if (result == null) result = caseRepositoryParagraphWater(identifierReference);
				if (result == null) result = caseIOControlParagraphWater(identifierReference);
				if (result == null) result = caseIdentificationDivisionWater(identifierReference);
				if (result == null) result = caseInvokeStatementWater(identifierReference);
				if (result == null) result = caseSQLStatementWater(identifierReference);
				if (result == null) result = caseUseStatementWater(identifierReference);
				if (result == null) result = caseFileDescriptorWater(identifierReference);
				if (result == null) result = caseDataDescriptorWater(identifierReference);
				if (result == null) result = caseSelectStatementWater(identifierReference);
				if (result == null) result = caseSortPhraseWater(identifierReference);
				if (result == null) result = caseReference(identifierReference);
				if (result == null) result = caseReplacementOperand(identifierReference);
				if (result == null) result = casePrimaryExpression(identifierReference);
				if (result == null) result = caseArithmeticOperand(identifierReference);
				if (result == null) result = caseWater(identifierReference);
				if (result == null) result = caseOperand(identifierReference);
				if (result == null) result = caseUnaryArithmeticExpressionChild(identifierReference);
				if (result == null) result = casePowerArithmeticExpressionChild(identifierReference);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(identifierReference);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(identifierReference);
				if (result == null) result = caseRangeExpressionChild(identifierReference);
				if (result == null) result = caseArithmeticExpression(identifierReference);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(identifierReference);
				if (result == null) result = caseSimpleConditionChild(identifierReference);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(identifierReference);
				if (result == null) result = caseNegatedConditionalExpressionChild(identifierReference);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(identifierReference);
				if (result == null) result = caseConditionalAndExpressionChild(identifierReference);
				if (result == null) result = caseConditionalOrExpressionChild(identifierReference);
				if (result == null) result = caseCondition(identifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdentifiersPackage.ALL: {
				All all = (All)theEObject;
				T result = caseAll(all);
				if (result == null) result = caseDirectSubscript(all);
				if (result == null) result = caseSubscript(all);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdentifiersPackage.REFERENCE_MODIFIER: {
				ReferenceModifier referenceModifier = (ReferenceModifier)theEObject;
				T result = caseReferenceModifier(referenceModifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdentifiersPackage.LINAGE_COUNTER: {
				LinageCounter linageCounter = (LinageCounter)theEObject;
				T result = caseLinageCounter(linageCounter);
				if (result == null) result = caseIdentifier(linageCounter);
				if (result == null) result = caseQualifiable(linageCounter);
				if (result == null) result = casePrimaryOperand(linageCounter);
				if (result == null) result = caseAcceptStatementWater(linageCounter);
				if (result == null) result = caseCICSStatementWater(linageCounter);
				if (result == null) result = caseSpecialNamesParagraphWater(linageCounter);
				if (result == null) result = caseObjectComputerParagraphWater(linageCounter);
				if (result == null) result = caseRepositoryParagraphWater(linageCounter);
				if (result == null) result = caseIOControlParagraphWater(linageCounter);
				if (result == null) result = caseIdentificationDivisionWater(linageCounter);
				if (result == null) result = caseInvokeStatementWater(linageCounter);
				if (result == null) result = caseSQLStatementWater(linageCounter);
				if (result == null) result = caseUseStatementWater(linageCounter);
				if (result == null) result = caseFileDescriptorWater(linageCounter);
				if (result == null) result = caseDataDescriptorWater(linageCounter);
				if (result == null) result = caseSelectStatementWater(linageCounter);
				if (result == null) result = caseSortPhraseWater(linageCounter);
				if (result == null) result = caseReplacementOperand(linageCounter);
				if (result == null) result = casePrimaryExpression(linageCounter);
				if (result == null) result = caseArithmeticOperand(linageCounter);
				if (result == null) result = caseWater(linageCounter);
				if (result == null) result = caseOperand(linageCounter);
				if (result == null) result = caseUnaryArithmeticExpressionChild(linageCounter);
				if (result == null) result = casePowerArithmeticExpressionChild(linageCounter);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(linageCounter);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(linageCounter);
				if (result == null) result = caseRangeExpressionChild(linageCounter);
				if (result == null) result = caseArithmeticExpression(linageCounter);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(linageCounter);
				if (result == null) result = caseSimpleConditionChild(linageCounter);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(linageCounter);
				if (result == null) result = caseNegatedConditionalExpressionChild(linageCounter);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(linageCounter);
				if (result == null) result = caseConditionalAndExpressionChild(linageCounter);
				if (result == null) result = caseConditionalOrExpressionChild(linageCounter);
				if (result == null) result = caseCondition(linageCounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdentifiersPackage.QUALIFIER: {
				Qualifier qualifier = (Qualifier)theEObject;
				T result = caseQualifier(qualifier);
				if (result == null) result = caseElementReference(qualifier);
				if (result == null) result = caseReference(qualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdentifiersPackage.RELATIVE_SUBSCRIPT: {
				RelativeSubscript relativeSubscript = (RelativeSubscript)theEObject;
				T result = caseRelativeSubscript(relativeSubscript);
				if (result == null) result = caseSubscript(relativeSubscript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdentifiersPackage.DIRECT_SUBSCRIPT: {
				DirectSubscript directSubscript = (DirectSubscript)theEObject;
				T result = caseDirectSubscript(directSubscript);
				if (result == null) result = caseSubscript(directSubscript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscript(Subscript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierReference(IdentifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAll(All object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceModifier(ReferenceModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linage Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linage Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinageCounter(LinageCounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifier(Qualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Subscript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Subscript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeSubscript(RelativeSubscript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Subscript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Subscript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectSubscript(DirectSubscript object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Accept Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptStatementWater(AcceptStatementWater object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Repository Paragraph Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Paragraph Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryParagraphWater(RepositoryParagraphWater object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Identification Division Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Division Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentificationDivisionWater(IdentificationDivisionWater object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SQL Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLStatementWater(SQLStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseStatementWater(UseStatementWater object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Descriptor Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Descriptor Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDescriptorWater(DataDescriptorWater object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sort Phrase Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Phrase Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortPhraseWater(SortPhraseWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementReference(ElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiable(Qualifiable object) {
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

} //IdentifiersSwitch
