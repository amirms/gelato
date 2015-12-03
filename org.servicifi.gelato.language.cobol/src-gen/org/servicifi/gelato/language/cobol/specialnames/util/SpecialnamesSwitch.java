/**
 */
package org.servicifi.gelato.language.cobol.specialnames.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.references.ElementReference;
import org.servicifi.gelato.language.cobol.references.Reference;
import org.servicifi.gelato.language.cobol.references.ReferenceableElement;

import org.servicifi.gelato.language.cobol.specialnames.*;

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
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage
 * @generated
 */
public class SpecialnamesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpecialnamesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialnamesSwitch() {
		if (modelPackage == null) {
			modelPackage = SpecialnamesPackage.eINSTANCE;
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
			case SpecialnamesPackage.SPECIAL_NAME: {
				SpecialName specialName = (SpecialName)theEObject;
				T result = caseSpecialName(specialName);
				if (result == null) result = caseReferenceableElement(specialName);
				if (result == null) result = caseNamedElement(specialName);
				if (result == null) result = caseCommentable(specialName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.CONDITION_NAME: {
				ConditionName conditionName = (ConditionName)theEObject;
				T result = caseConditionName(conditionName);
				if (result == null) result = caseSpecialName(conditionName);
				if (result == null) result = caseCommentable(conditionName);
				if (result == null) result = caseReferenceableElement(conditionName);
				if (result == null) result = caseNamedElement(conditionName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.ON_STATUS: {
				OnStatus onStatus = (OnStatus)theEObject;
				T result = caseOnStatus(onStatus);
				if (result == null) result = caseConditionName(onStatus);
				if (result == null) result = caseSpecialName(onStatus);
				if (result == null) result = caseCommentable(onStatus);
				if (result == null) result = caseReferenceableElement(onStatus);
				if (result == null) result = caseNamedElement(onStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.OFF_STATUS: {
				OffStatus offStatus = (OffStatus)theEObject;
				T result = caseOffStatus(offStatus);
				if (result == null) result = caseConditionName(offStatus);
				if (result == null) result = caseSpecialName(offStatus);
				if (result == null) result = caseCommentable(offStatus);
				if (result == null) result = caseReferenceableElement(offStatus);
				if (result == null) result = caseNamedElement(offStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.ALPHABET_NAME: {
				AlphabetName alphabetName = (AlphabetName)theEObject;
				T result = caseAlphabetName(alphabetName);
				if (result == null) result = caseSpecialName(alphabetName);
				if (result == null) result = caseSpecialNameStatement(alphabetName);
				if (result == null) result = caseReferenceableElement(alphabetName);
				if (result == null) result = caseNamedElement(alphabetName);
				if (result == null) result = caseCommentable(alphabetName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.UPSI_SWITCH_IS: {
				UPSISwitchIs upsiSwitchIs = (UPSISwitchIs)theEObject;
				T result = caseUPSISwitchIs(upsiSwitchIs);
				if (result == null) result = caseMnemonicName(upsiSwitchIs);
				if (result == null) result = caseSpecialNameStatement(upsiSwitchIs);
				if (result == null) result = caseSpecialName(upsiSwitchIs);
				if (result == null) result = caseReferenceableElement(upsiSwitchIs);
				if (result == null) result = caseNamedElement(upsiSwitchIs);
				if (result == null) result = caseCommentable(upsiSwitchIs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.ALPHABET_TYPE: {
				AlphabetType alphabetType = (AlphabetType)theEObject;
				T result = caseAlphabetType(alphabetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.PREDEFINED_ALPHABET_TYPE: {
				PredefinedAlphabetType predefinedAlphabetType = (PredefinedAlphabetType)theEObject;
				T result = casePredefinedAlphabetType(predefinedAlphabetType);
				if (result == null) result = caseAlphabetType(predefinedAlphabetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.EXPLICIT_ALPHABET_TYPE: {
				ExplicitAlphabetType explicitAlphabetType = (ExplicitAlphabetType)theEObject;
				T result = caseExplicitAlphabetType(explicitAlphabetType);
				if (result == null) result = caseAlphabetType(explicitAlphabetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.CODE_NAME_ALPHABET_TYPE: {
				CodeNameAlphabetType codeNameAlphabetType = (CodeNameAlphabetType)theEObject;
				T result = caseCodeNameAlphabetType(codeNameAlphabetType);
				if (result == null) result = caseAlphabetType(codeNameAlphabetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.CURRENCY_SIGN: {
				CurrencySign currencySign = (CurrencySign)theEObject;
				T result = caseCurrencySign(currencySign);
				if (result == null) result = caseSpecialName(currencySign);
				if (result == null) result = caseSpecialNameStatement(currencySign);
				if (result == null) result = caseReferenceableElement(currencySign);
				if (result == null) result = caseNamedElement(currencySign);
				if (result == null) result = caseCommentable(currencySign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.CLASS_NAME: {
				ClassName className = (ClassName)theEObject;
				T result = caseClassName(className);
				if (result == null) result = caseSpecialName(className);
				if (result == null) result = caseSpecialNameStatement(className);
				if (result == null) result = caseReferenceableElement(className);
				if (result == null) result = caseNamedElement(className);
				if (result == null) result = caseCommentable(className);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.MNEMONIC_NAME: {
				MnemonicName mnemonicName = (MnemonicName)theEObject;
				T result = caseMnemonicName(mnemonicName);
				if (result == null) result = caseSpecialName(mnemonicName);
				if (result == null) result = caseReferenceableElement(mnemonicName);
				if (result == null) result = caseNamedElement(mnemonicName);
				if (result == null) result = caseCommentable(mnemonicName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.SYSTEM_DEVICE_IS: {
				SystemDeviceIs systemDeviceIs = (SystemDeviceIs)theEObject;
				T result = caseSystemDeviceIs(systemDeviceIs);
				if (result == null) result = caseMnemonicName(systemDeviceIs);
				if (result == null) result = caseSpecialNameStatement(systemDeviceIs);
				if (result == null) result = caseSpecialName(systemDeviceIs);
				if (result == null) result = caseReferenceableElement(systemDeviceIs);
				if (result == null) result = caseNamedElement(systemDeviceIs);
				if (result == null) result = caseCommentable(systemDeviceIs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.SYMBOLIC_CHARACTER: {
				SymbolicCharacter symbolicCharacter = (SymbolicCharacter)theEObject;
				T result = caseSymbolicCharacter(symbolicCharacter);
				if (result == null) result = caseSpecialName(symbolicCharacter);
				if (result == null) result = caseReferenceableElement(symbolicCharacter);
				if (result == null) result = caseNamedElement(symbolicCharacter);
				if (result == null) result = caseCommentable(symbolicCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT: {
				SymbolicCharacterStatement symbolicCharacterStatement = (SymbolicCharacterStatement)theEObject;
				T result = caseSymbolicCharacterStatement(symbolicCharacterStatement);
				if (result == null) result = caseSpecialNameStatement(symbolicCharacterStatement);
				if (result == null) result = caseElementReference(symbolicCharacterStatement);
				if (result == null) result = caseReference(symbolicCharacterStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecialnamesPackage.SPECIAL_NAME_STATEMENT: {
				SpecialNameStatement specialNameStatement = (SpecialNameStatement)theEObject;
				T result = caseSpecialNameStatement(specialNameStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialName(SpecialName object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>On Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnStatus(OnStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Off Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Off Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffStatus(OffStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabet Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabet Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabetName(AlphabetName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UPSI Switch Is</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UPSI Switch Is</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUPSISwitchIs(UPSISwitchIs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabetType(AlphabetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predefined Alphabet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predefined Alphabet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredefinedAlphabetType(PredefinedAlphabetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explicit Alphabet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explicit Alphabet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplicitAlphabetType(ExplicitAlphabetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Name Alphabet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Name Alphabet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeNameAlphabetType(CodeNameAlphabetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Sign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Sign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencySign(CurrencySign object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mnemonic Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mnemonic Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMnemonicName(MnemonicName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Device Is</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Device Is</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDeviceIs(SystemDeviceIs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicCharacter(SymbolicCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Character Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Character Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicCharacterStatement(SymbolicCharacterStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Name Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Name Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialNameStatement(SpecialNameStatement object) {
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

} //SpecialnamesSwitch
