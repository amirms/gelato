/**
 */
package org.servicifi.gelato.language.cobol.strings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.strings.AnyCharacter;
import org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings;
import org.servicifi.gelato.language.cobol.strings.Location;
import org.servicifi.gelato.language.cobol.strings.Occurrences;
import org.servicifi.gelato.language.cobol.strings.Positions;
import org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence;
import org.servicifi.gelato.language.cobol.strings.SpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.SplittedString;
import org.servicifi.gelato.language.cobol.strings.StringsFactory;
import org.servicifi.gelato.language.cobol.strings.StringsPackage;
import org.servicifi.gelato.language.cobol.strings.TallyingOccurrence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringsFactoryImpl extends EFactoryImpl implements StringsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StringsFactory init() {
		try {
			StringsFactory theStringsFactory = (StringsFactory)EPackage.Registry.INSTANCE.getEFactory(StringsPackage.eNS_URI);
			if (theStringsFactory != null) {
				return theStringsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StringsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StringsPackage.CONCATENATING_STRINGS: return createConcatenatingStrings();
			case StringsPackage.SPLITTED_STRING: return createSplittedString();
			case StringsPackage.LOCATION: return createLocation();
			case StringsPackage.TALLYING_OCCURRENCE: return createTallyingOccurrence();
			case StringsPackage.REPLACEMENT_OCCURRENCE: return createReplacementOccurrence();
			case StringsPackage.ANY_CHARACTER: return createAnyCharacter();
			case StringsPackage.SPECIFIC_CHARACTER: return createSpecificCharacter();
			case StringsPackage.ANY_CHARACTER_BY_SPECIFIC_CHARACTER: return createAnyCharacterBySpecificCharacter();
			case StringsPackage.SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER: return createSpecificCharacterBySpecificCharacter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StringsPackage.POSITIONS:
				return createPositionsFromString(eDataType, initialValue);
			case StringsPackage.OCCURRENCES:
				return createOccurrencesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StringsPackage.POSITIONS:
				return convertPositionsToString(eDataType, instanceValue);
			case StringsPackage.OCCURRENCES:
				return convertOccurrencesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcatenatingStrings createConcatenatingStrings() {
		ConcatenatingStringsImpl concatenatingStrings = new ConcatenatingStringsImpl();
		return concatenatingStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplittedString createSplittedString() {
		SplittedStringImpl splittedString = new SplittedStringImpl();
		return splittedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TallyingOccurrence createTallyingOccurrence() {
		TallyingOccurrenceImpl tallyingOccurrence = new TallyingOccurrenceImpl();
		return tallyingOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplacementOccurrence createReplacementOccurrence() {
		ReplacementOccurrenceImpl replacementOccurrence = new ReplacementOccurrenceImpl();
		return replacementOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyCharacter createAnyCharacter() {
		AnyCharacterImpl anyCharacter = new AnyCharacterImpl();
		return anyCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificCharacter createSpecificCharacter() {
		SpecificCharacterImpl specificCharacter = new SpecificCharacterImpl();
		return specificCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyCharacterBySpecificCharacter createAnyCharacterBySpecificCharacter() {
		AnyCharacterBySpecificCharacterImpl anyCharacterBySpecificCharacter = new AnyCharacterBySpecificCharacterImpl();
		return anyCharacterBySpecificCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificCharacterBySpecificCharacter createSpecificCharacterBySpecificCharacter() {
		SpecificCharacterBySpecificCharacterImpl specificCharacterBySpecificCharacter = new SpecificCharacterBySpecificCharacterImpl();
		return specificCharacterBySpecificCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positions createPositionsFromString(EDataType eDataType, String initialValue) {
		Positions result = Positions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occurrences createOccurrencesFromString(EDataType eDataType, String initialValue) {
		Occurrences result = Occurrences.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOccurrencesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringsPackage getStringsPackage() {
		return (StringsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StringsPackage getPackage() {
		return StringsPackage.eINSTANCE;
	}

} //StringsFactoryImpl
