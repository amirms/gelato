/**
 */
package org.servicifi.gelato.language.cobol.strings.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.strings.StringsPackage
 * @generated
 */
public class StringsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StringsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StringsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringsSwitch<Adapter> modelSwitch =
		new StringsSwitch<Adapter>() {
			@Override
			public Adapter caseTallying(Tallying object) {
				return createTallyingAdapter();
			}
			@Override
			public Adapter caseStringManipulation(StringManipulation object) {
				return createStringManipulationAdapter();
			}
			@Override
			public Adapter caseManipulatedStrings(ManipulatedStrings object) {
				return createManipulatedStringsAdapter();
			}
			@Override
			public Adapter caseString(org.servicifi.gelato.language.cobol.strings.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseConcatenatingStrings(ConcatenatingStrings object) {
				return createConcatenatingStringsAdapter();
			}
			@Override
			public Adapter caseSplittedString(SplittedString object) {
				return createSplittedStringAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseReplacement(Replacement object) {
				return createReplacementAdapter();
			}
			@Override
			public Adapter caseOccurrence(Occurrence object) {
				return createOccurrenceAdapter();
			}
			@Override
			public Adapter caseTallyingOccurrence(TallyingOccurrence object) {
				return createTallyingOccurrenceAdapter();
			}
			@Override
			public Adapter caseReplacementOccurrence(ReplacementOccurrence object) {
				return createReplacementOccurrenceAdapter();
			}
			@Override
			public Adapter caseAnyCharacter(AnyCharacter object) {
				return createAnyCharacterAdapter();
			}
			@Override
			public Adapter caseSpecificCharacter(SpecificCharacter object) {
				return createSpecificCharacterAdapter();
			}
			@Override
			public Adapter caseAnyCharacterBySpecificCharacter(AnyCharacterBySpecificCharacter object) {
				return createAnyCharacterBySpecificCharacterAdapter();
			}
			@Override
			public Adapter caseSpecificCharacterBySpecificCharacter(SpecificCharacterBySpecificCharacter object) {
				return createSpecificCharacterBySpecificCharacterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.Tallying <em>Tallying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.Tallying
	 * @generated
	 */
	public Adapter createTallyingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.StringManipulation <em>String Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.StringManipulation
	 * @generated
	 */
	public Adapter createStringManipulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.ManipulatedStrings <em>Manipulated Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.ManipulatedStrings
	 * @generated
	 */
	public Adapter createManipulatedStringsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings <em>Concatenating Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings
	 * @generated
	 */
	public Adapter createConcatenatingStringsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.SplittedString <em>Splitted String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.SplittedString
	 * @generated
	 */
	public Adapter createSplittedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.Replacement <em>Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.Replacement
	 * @generated
	 */
	public Adapter createReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.Occurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.Occurrence
	 * @generated
	 */
	public Adapter createOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.TallyingOccurrence <em>Tallying Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.TallyingOccurrence
	 * @generated
	 */
	public Adapter createTallyingOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence <em>Replacement Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence
	 * @generated
	 */
	public Adapter createReplacementOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.AnyCharacter <em>Any Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.AnyCharacter
	 * @generated
	 */
	public Adapter createAnyCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacter <em>Specific Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.SpecificCharacter
	 * @generated
	 */
	public Adapter createSpecificCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter <em>Any Character By Specific Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter
	 * @generated
	 */
	public Adapter createAnyCharacterBySpecificCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter <em>Specific Character By Specific Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter
	 * @generated
	 */
	public Adapter createSpecificCharacterBySpecificCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StringsAdapterFactory
