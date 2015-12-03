/**
 */
package org.servicifi.gelato.language.cobol.references.util;

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

import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.Condition;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;
import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;
import org.servicifi.gelato.language.cobol.operands.Operand;
import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;
import org.servicifi.gelato.language.cobol.operands.ReplacementOperand;

import org.servicifi.gelato.language.cobol.references.*;

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
 * @see org.servicifi.gelato.language.cobol.references.ReferencesPackage
 * @generated
 */
public class ReferencesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReferencesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesSwitch() {
		if (modelPackage == null) {
			modelPackage = ReferencesPackage.eINSTANCE;
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
			case ReferencesPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.REFERENCEABLE_ELEMENT: {
				ReferenceableElement referenceableElement = (ReferenceableElement)theEObject;
				T result = caseReferenceableElement(referenceableElement);
				if (result == null) result = caseNamedElement(referenceableElement);
				if (result == null) result = caseCommentable(referenceableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.ELEMENT_REFERENCE: {
				ElementReference elementReference = (ElementReference)theEObject;
				T result = caseElementReference(elementReference);
				if (result == null) result = caseReference(elementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.SPECIAL_NAMES_CONDITION_NAME_REFERENCE: {
				SpecialNamesConditionNameReference specialNamesConditionNameReference = (SpecialNamesConditionNameReference)theEObject;
				T result = caseSpecialNamesConditionNameReference(specialNamesConditionNameReference);
				if (result == null) result = caseElementReference(specialNamesConditionNameReference);
				if (result == null) result = caseQualifiable(specialNamesConditionNameReference);
				if (result == null) result = caseConditionName(specialNamesConditionNameReference);
				if (result == null) result = caseReference(specialNamesConditionNameReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.FILE_NAME_REFERENCE: {
				FileNameReference fileNameReference = (FileNameReference)theEObject;
				T result = caseFileNameReference(fileNameReference);
				if (result == null) result = caseIdentifierReferenceQualifier(fileNameReference);
				if (result == null) result = caseElementReference(fileNameReference);
				if (result == null) result = caseReference(fileNameReference);
				if (result == null) result = caseQualifiable(fileNameReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.INDEX_NAME_REFERENCE: {
				IndexNameReference indexNameReference = (IndexNameReference)theEObject;
				T result = caseIndexNameReference(indexNameReference);
				if (result == null) result = caseIdentifierReference(indexNameReference);
				if (result == null) result = caseIdentifier(indexNameReference);
				if (result == null) result = caseElementReference(indexNameReference);
				if (result == null) result = caseQualifiable(indexNameReference);
				if (result == null) result = casePrimaryOperand(indexNameReference);
				if (result == null) result = caseAcceptStatementWater(indexNameReference);
				if (result == null) result = caseCICSStatementWater(indexNameReference);
				if (result == null) result = caseSpecialNamesParagraphWater(indexNameReference);
				if (result == null) result = caseObjectComputerParagraphWater(indexNameReference);
				if (result == null) result = caseRepositoryParagraphWater(indexNameReference);
				if (result == null) result = caseIOControlParagraphWater(indexNameReference);
				if (result == null) result = caseIdentificationDivisionWater(indexNameReference);
				if (result == null) result = caseInvokeStatementWater(indexNameReference);
				if (result == null) result = caseSQLStatementWater(indexNameReference);
				if (result == null) result = caseUseStatementWater(indexNameReference);
				if (result == null) result = caseFileDescriptorWater(indexNameReference);
				if (result == null) result = caseDataDescriptorWater(indexNameReference);
				if (result == null) result = caseSelectStatementWater(indexNameReference);
				if (result == null) result = caseSortPhraseWater(indexNameReference);
				if (result == null) result = caseReference(indexNameReference);
				if (result == null) result = caseReplacementOperand(indexNameReference);
				if (result == null) result = casePrimaryExpression(indexNameReference);
				if (result == null) result = caseArithmeticOperand(indexNameReference);
				if (result == null) result = caseWater(indexNameReference);
				if (result == null) result = caseOperand(indexNameReference);
				if (result == null) result = caseUnaryArithmeticExpressionChild(indexNameReference);
				if (result == null) result = casePowerArithmeticExpressionChild(indexNameReference);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(indexNameReference);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(indexNameReference);
				if (result == null) result = caseRangeExpressionChild(indexNameReference);
				if (result == null) result = caseArithmeticExpression(indexNameReference);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(indexNameReference);
				if (result == null) result = caseSimpleConditionChild(indexNameReference);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(indexNameReference);
				if (result == null) result = caseNegatedConditionalExpressionChild(indexNameReference);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(indexNameReference);
				if (result == null) result = caseConditionalAndExpressionChild(indexNameReference);
				if (result == null) result = caseConditionalOrExpressionChild(indexNameReference);
				if (result == null) result = caseCondition(indexNameReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.MNEMONIC_NAME_REFERENCE: {
				MnemonicNameReference mnemonicNameReference = (MnemonicNameReference)theEObject;
				T result = caseMnemonicNameReference(mnemonicNameReference);
				if (result == null) result = caseElementReference(mnemonicNameReference);
				if (result == null) result = caseQualifiable(mnemonicNameReference);
				if (result == null) result = caseReference(mnemonicNameReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.ALPHABET_NAME_REFERENCE: {
				AlphabetNameReference alphabetNameReference = (AlphabetNameReference)theEObject;
				T result = caseAlphabetNameReference(alphabetNameReference);
				if (result == null) result = caseElementReference(alphabetNameReference);
				if (result == null) result = caseReference(alphabetNameReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.CONDITION_NAME: {
				ConditionName conditionName = (ConditionName)theEObject;
				T result = caseConditionName(conditionName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.QUALIFIABLE: {
				Qualifiable qualifiable = (Qualifiable)theEObject;
				T result = caseQualifiable(qualifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.CONDITION_NAME_REFERENCE: {
				ConditionNameReference conditionNameReference = (ConditionNameReference)theEObject;
				T result = caseConditionNameReference(conditionNameReference);
				if (result == null) result = caseIdentifierReference(conditionNameReference);
				if (result == null) result = caseConditionName(conditionNameReference);
				if (result == null) result = caseIdentifier(conditionNameReference);
				if (result == null) result = caseElementReference(conditionNameReference);
				if (result == null) result = caseQualifiable(conditionNameReference);
				if (result == null) result = casePrimaryOperand(conditionNameReference);
				if (result == null) result = caseAcceptStatementWater(conditionNameReference);
				if (result == null) result = caseCICSStatementWater(conditionNameReference);
				if (result == null) result = caseSpecialNamesParagraphWater(conditionNameReference);
				if (result == null) result = caseObjectComputerParagraphWater(conditionNameReference);
				if (result == null) result = caseRepositoryParagraphWater(conditionNameReference);
				if (result == null) result = caseIOControlParagraphWater(conditionNameReference);
				if (result == null) result = caseIdentificationDivisionWater(conditionNameReference);
				if (result == null) result = caseInvokeStatementWater(conditionNameReference);
				if (result == null) result = caseSQLStatementWater(conditionNameReference);
				if (result == null) result = caseUseStatementWater(conditionNameReference);
				if (result == null) result = caseFileDescriptorWater(conditionNameReference);
				if (result == null) result = caseDataDescriptorWater(conditionNameReference);
				if (result == null) result = caseSelectStatementWater(conditionNameReference);
				if (result == null) result = caseSortPhraseWater(conditionNameReference);
				if (result == null) result = caseReference(conditionNameReference);
				if (result == null) result = caseReplacementOperand(conditionNameReference);
				if (result == null) result = casePrimaryExpression(conditionNameReference);
				if (result == null) result = caseArithmeticOperand(conditionNameReference);
				if (result == null) result = caseWater(conditionNameReference);
				if (result == null) result = caseOperand(conditionNameReference);
				if (result == null) result = caseUnaryArithmeticExpressionChild(conditionNameReference);
				if (result == null) result = casePowerArithmeticExpressionChild(conditionNameReference);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(conditionNameReference);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(conditionNameReference);
				if (result == null) result = caseRangeExpressionChild(conditionNameReference);
				if (result == null) result = caseArithmeticExpression(conditionNameReference);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(conditionNameReference);
				if (result == null) result = caseSimpleConditionChild(conditionNameReference);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(conditionNameReference);
				if (result == null) result = caseNegatedConditionalExpressionChild(conditionNameReference);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(conditionNameReference);
				if (result == null) result = caseConditionalAndExpressionChild(conditionNameReference);
				if (result == null) result = caseConditionalOrExpressionChild(conditionNameReference);
				if (result == null) result = caseCondition(conditionNameReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.DATA_NAME_REFERENCE: {
				DataNameReference dataNameReference = (DataNameReference)theEObject;
				T result = caseDataNameReference(dataNameReference);
				if (result == null) result = caseIdentifierReference(dataNameReference);
				if (result == null) result = caseIdentifierReferenceQualifier(dataNameReference);
				if (result == null) result = caseIdentifier(dataNameReference);
				if (result == null) result = caseElementReference(dataNameReference);
				if (result == null) result = caseQualifiable(dataNameReference);
				if (result == null) result = casePrimaryOperand(dataNameReference);
				if (result == null) result = caseAcceptStatementWater(dataNameReference);
				if (result == null) result = caseCICSStatementWater(dataNameReference);
				if (result == null) result = caseSpecialNamesParagraphWater(dataNameReference);
				if (result == null) result = caseObjectComputerParagraphWater(dataNameReference);
				if (result == null) result = caseRepositoryParagraphWater(dataNameReference);
				if (result == null) result = caseIOControlParagraphWater(dataNameReference);
				if (result == null) result = caseIdentificationDivisionWater(dataNameReference);
				if (result == null) result = caseInvokeStatementWater(dataNameReference);
				if (result == null) result = caseSQLStatementWater(dataNameReference);
				if (result == null) result = caseUseStatementWater(dataNameReference);
				if (result == null) result = caseFileDescriptorWater(dataNameReference);
				if (result == null) result = caseDataDescriptorWater(dataNameReference);
				if (result == null) result = caseSelectStatementWater(dataNameReference);
				if (result == null) result = caseSortPhraseWater(dataNameReference);
				if (result == null) result = caseReference(dataNameReference);
				if (result == null) result = caseReplacementOperand(dataNameReference);
				if (result == null) result = casePrimaryExpression(dataNameReference);
				if (result == null) result = caseArithmeticOperand(dataNameReference);
				if (result == null) result = caseWater(dataNameReference);
				if (result == null) result = caseOperand(dataNameReference);
				if (result == null) result = caseUnaryArithmeticExpressionChild(dataNameReference);
				if (result == null) result = casePowerArithmeticExpressionChild(dataNameReference);
				if (result == null) result = caseMultiplicativeArithmeticExpressionChild(dataNameReference);
				if (result == null) result = caseAdditiveArithmeticExpressionChild(dataNameReference);
				if (result == null) result = caseRangeExpressionChild(dataNameReference);
				if (result == null) result = caseArithmeticExpression(dataNameReference);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(dataNameReference);
				if (result == null) result = caseSimpleConditionChild(dataNameReference);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(dataNameReference);
				if (result == null) result = caseNegatedConditionalExpressionChild(dataNameReference);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(dataNameReference);
				if (result == null) result = caseConditionalAndExpressionChild(dataNameReference);
				if (result == null) result = caseConditionalOrExpressionChild(dataNameReference);
				if (result == null) result = caseCondition(dataNameReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencesPackage.IDENTIFIER_REFERENCE_QUALIFIER: {
				IdentifierReferenceQualifier identifierReferenceQualifier = (IdentifierReferenceQualifier)theEObject;
				T result = caseIdentifierReferenceQualifier(identifierReferenceQualifier);
				if (result == null) result = caseQualifiable(identifierReferenceQualifier);
				if (result == null) result = caseElementReference(identifierReferenceQualifier);
				if (result == null) result = caseReference(identifierReferenceQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceableElement(ReferenceableElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Special Names Condition Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Names Condition Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialNamesConditionNameReference(SpecialNamesConditionNameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileNameReference(FileNameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexNameReference(IndexNameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mnemonic Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mnemonic Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMnemonicNameReference(MnemonicNameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabet Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabet Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabetNameReference(AlphabetNameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionName(ConditionName object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Condition Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionNameReference(ConditionNameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNameReference(DataNameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Reference Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Reference Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierReferenceQualifier(IdentifierReferenceQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentable(Commentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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

} //ReferencesSwitch
