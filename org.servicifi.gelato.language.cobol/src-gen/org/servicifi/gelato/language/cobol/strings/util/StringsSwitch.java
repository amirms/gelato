/**
 */
package org.servicifi.gelato.language.cobol.strings.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.strings.AnyCharacter;
import org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings;
import org.servicifi.gelato.language.cobol.strings.Location;
import org.servicifi.gelato.language.cobol.strings.ManipulatedStrings;
import org.servicifi.gelato.language.cobol.strings.Occurrence;
import org.servicifi.gelato.language.cobol.strings.Replacement;
import org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence;
import org.servicifi.gelato.language.cobol.strings.SpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.SplittedString;
import org.servicifi.gelato.language.cobol.strings.StringManipulation;
import org.servicifi.gelato.language.cobol.strings.StringsPackage;
import org.servicifi.gelato.language.cobol.strings.Tallying;
import org.servicifi.gelato.language.cobol.strings.TallyingOccurrence;

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
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage
 * @generated
 */
public class StringsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StringsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringsSwitch() {
		if (modelPackage == null) {
			modelPackage = StringsPackage.eINSTANCE;
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
			case StringsPackage.TALLYING: {
				Tallying tallying = (Tallying)theEObject;
				T result = caseTallying(tallying);
				if (result == null) result = caseStringManipulation(tallying);
				if (result == null) result = caseString(tallying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.STRING_MANIPULATION: {
				StringManipulation stringManipulation = (StringManipulation)theEObject;
				T result = caseStringManipulation(stringManipulation);
				if (result == null) result = caseString(stringManipulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.MANIPULATED_STRINGS: {
				ManipulatedStrings manipulatedStrings = (ManipulatedStrings)theEObject;
				T result = caseManipulatedStrings(manipulatedStrings);
				if (result == null) result = caseString(manipulatedStrings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.STRING: {
				org.servicifi.gelato.language.cobol.strings.String string = (org.servicifi.gelato.language.cobol.strings.String)theEObject;
				T result = caseString(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.CONCATENATING_STRINGS: {
				ConcatenatingStrings concatenatingStrings = (ConcatenatingStrings)theEObject;
				T result = caseConcatenatingStrings(concatenatingStrings);
				if (result == null) result = caseManipulatedStrings(concatenatingStrings);
				if (result == null) result = caseString(concatenatingStrings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.SPLITTED_STRING: {
				SplittedString splittedString = (SplittedString)theEObject;
				T result = caseSplittedString(splittedString);
				if (result == null) result = caseManipulatedStrings(splittedString);
				if (result == null) result = caseString(splittedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.REPLACEMENT: {
				Replacement replacement = (Replacement)theEObject;
				T result = caseReplacement(replacement);
				if (result == null) result = caseStringManipulation(replacement);
				if (result == null) result = caseString(replacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.OCCURRENCE: {
				Occurrence occurrence = (Occurrence)theEObject;
				T result = caseOccurrence(occurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.TALLYING_OCCURRENCE: {
				TallyingOccurrence tallyingOccurrence = (TallyingOccurrence)theEObject;
				T result = caseTallyingOccurrence(tallyingOccurrence);
				if (result == null) result = caseTallying(tallyingOccurrence);
				if (result == null) result = caseOccurrence(tallyingOccurrence);
				if (result == null) result = caseStringManipulation(tallyingOccurrence);
				if (result == null) result = caseString(tallyingOccurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.REPLACEMENT_OCCURRENCE: {
				ReplacementOccurrence replacementOccurrence = (ReplacementOccurrence)theEObject;
				T result = caseReplacementOccurrence(replacementOccurrence);
				if (result == null) result = caseOccurrence(replacementOccurrence);
				if (result == null) result = caseReplacement(replacementOccurrence);
				if (result == null) result = caseStringManipulation(replacementOccurrence);
				if (result == null) result = caseString(replacementOccurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.ANY_CHARACTER: {
				AnyCharacter anyCharacter = (AnyCharacter)theEObject;
				T result = caseAnyCharacter(anyCharacter);
				if (result == null) result = caseTallying(anyCharacter);
				if (result == null) result = caseStringManipulation(anyCharacter);
				if (result == null) result = caseString(anyCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.SPECIFIC_CHARACTER: {
				SpecificCharacter specificCharacter = (SpecificCharacter)theEObject;
				T result = caseSpecificCharacter(specificCharacter);
				if (result == null) result = caseTallying(specificCharacter);
				if (result == null) result = caseStringManipulation(specificCharacter);
				if (result == null) result = caseString(specificCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.ANY_CHARACTER_BY_SPECIFIC_CHARACTER: {
				AnyCharacterBySpecificCharacter anyCharacterBySpecificCharacter = (AnyCharacterBySpecificCharacter)theEObject;
				T result = caseAnyCharacterBySpecificCharacter(anyCharacterBySpecificCharacter);
				if (result == null) result = caseReplacement(anyCharacterBySpecificCharacter);
				if (result == null) result = caseStringManipulation(anyCharacterBySpecificCharacter);
				if (result == null) result = caseString(anyCharacterBySpecificCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER: {
				SpecificCharacterBySpecificCharacter specificCharacterBySpecificCharacter = (SpecificCharacterBySpecificCharacter)theEObject;
				T result = caseSpecificCharacterBySpecificCharacter(specificCharacterBySpecificCharacter);
				if (result == null) result = caseReplacement(specificCharacterBySpecificCharacter);
				if (result == null) result = caseStringManipulation(specificCharacterBySpecificCharacter);
				if (result == null) result = caseString(specificCharacterBySpecificCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tallying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tallying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTallying(Tallying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Manipulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Manipulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringManipulation(StringManipulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manipulated Strings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manipulated Strings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManipulatedStrings(ManipulatedStrings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.servicifi.gelato.language.cobol.strings.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenating Strings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenating Strings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenatingStrings(ConcatenatingStrings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Splitted String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Splitted String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplittedString(SplittedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplacement(Replacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrence(Occurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tallying Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tallying Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTallyingOccurrence(TallyingOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replacement Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replacement Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplacementOccurrence(ReplacementOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyCharacter(AnyCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificCharacter(SpecificCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Character By Specific Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Character By Specific Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyCharacterBySpecificCharacter(AnyCharacterBySpecificCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Character By Specific Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Character By Specific Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificCharacterBySpecificCharacter(SpecificCharacterBySpecificCharacter object) {
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

} //StringsSwitch
