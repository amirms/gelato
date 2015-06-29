/**
 */
package org.servicifi.gelato.language.cobol.strings;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.strings.StringsFactory
 * @model kind="package"
 * @generated
 */
public interface StringsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "strings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/strings";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "strings";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StringsPackage eINSTANCE = org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getString()
	 * @generated
	 */
	int STRING = 3;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.StringManipulationImpl <em>String Manipulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringManipulationImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getStringManipulation()
	 * @generated
	 */
	int STRING_MANIPULATION = 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MANIPULATION__LOCATIONS = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Manipulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_MANIPULATION_FEATURE_COUNT = STRING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.TallyingImpl <em>Tallying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.TallyingImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getTallying()
	 * @generated
	 */
	int TALLYING = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLYING__LOCATIONS = STRING_MANIPULATION__LOCATIONS;

	/**
	 * The number of structural features of the '<em>Tallying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLYING_FEATURE_COUNT = STRING_MANIPULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.ManipulatedStringsImpl <em>Manipulated Strings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.ManipulatedStringsImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getManipulatedStrings()
	 * @generated
	 */
	int MANIPULATED_STRINGS = 2;

	/**
	 * The feature id for the '<em><b>Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATED_STRINGS__STRINGS = STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATED_STRINGS__DELIMITER = STRING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manipulated Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATED_STRINGS_FEATURE_COUNT = STRING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.ConcatenatingStringsImpl <em>Concatenating Strings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.ConcatenatingStringsImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getConcatenatingStrings()
	 * @generated
	 */
	int CONCATENATING_STRINGS = 4;

	/**
	 * The feature id for the '<em><b>Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATING_STRINGS__STRINGS = MANIPULATED_STRINGS__STRINGS;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATING_STRINGS__DELIMITER = MANIPULATED_STRINGS__DELIMITER;

	/**
	 * The number of structural features of the '<em>Concatenating Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATING_STRINGS_FEATURE_COUNT = MANIPULATED_STRINGS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.SplittedStringImpl <em>Splitted String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.SplittedStringImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getSplittedString()
	 * @generated
	 */
	int SPLITTED_STRING = 5;

	/**
	 * The feature id for the '<em><b>Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_STRING__STRINGS = MANIPULATED_STRINGS__STRINGS;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_STRING__DELIMITER = MANIPULATED_STRINGS__DELIMITER;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_STRING__COUNTER = MANIPULATED_STRINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Splitted String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_STRING_FEATURE_COUNT = MANIPULATED_STRINGS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.LocationImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__INITIAL = 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__BASE = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.ReplacementImpl <em>Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.ReplacementImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getReplacement()
	 * @generated
	 */
	int REPLACEMENT = 7;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT__LOCATIONS = STRING_MANIPULATION__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT__TARGET = STRING_MANIPULATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_FEATURE_COUNT = STRING_MANIPULATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.OccurrenceImpl <em>Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.OccurrenceImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getOccurrence()
	 * @generated
	 */
	int OCCURRENCE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.TallyingOccurrenceImpl <em>Tallying Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.TallyingOccurrenceImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getTallyingOccurrence()
	 * @generated
	 */
	int TALLYING_OCCURRENCE = 9;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLYING_OCCURRENCE__LOCATIONS = TALLYING__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLYING_OCCURRENCE__TYPE = TALLYING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occurrences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLYING_OCCURRENCE__OCCURRENCES = TALLYING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tallying Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLYING_OCCURRENCE_FEATURE_COUNT = TALLYING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.ReplacementOccurrenceImpl <em>Replacement Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.ReplacementOccurrenceImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getReplacementOccurrence()
	 * @generated
	 */
	int REPLACEMENT_OCCURRENCE = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_OCCURRENCE__TYPE = OCCURRENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_OCCURRENCE__LOCATIONS = OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_OCCURRENCE__TARGET = OCCURRENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occurrences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_OCCURRENCE__OCCURRENCES = OCCURRENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Replacement Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_OCCURRENCE_FEATURE_COUNT = OCCURRENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.AnyCharacterImpl <em>Any Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.AnyCharacterImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getAnyCharacter()
	 * @generated
	 */
	int ANY_CHARACTER = 11;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_CHARACTER__LOCATIONS = TALLYING__LOCATIONS;

	/**
	 * The number of structural features of the '<em>Any Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_CHARACTER_FEATURE_COUNT = TALLYING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.SpecificCharacterImpl <em>Specific Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.SpecificCharacterImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getSpecificCharacter()
	 * @generated
	 */
	int SPECIFIC_CHARACTER = 12;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CHARACTER__LOCATIONS = TALLYING__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Tallying</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CHARACTER__TALLYING = TALLYING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CHARACTER_FEATURE_COUNT = TALLYING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.AnyCharacterBySpecificCharacterImpl <em>Any Character By Specific Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.AnyCharacterBySpecificCharacterImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getAnyCharacterBySpecificCharacter()
	 * @generated
	 */
	int ANY_CHARACTER_BY_SPECIFIC_CHARACTER = 13;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_CHARACTER_BY_SPECIFIC_CHARACTER__LOCATIONS = REPLACEMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_CHARACTER_BY_SPECIFIC_CHARACTER__TARGET = REPLACEMENT__TARGET;

	/**
	 * The number of structural features of the '<em>Any Character By Specific Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_CHARACTER_BY_SPECIFIC_CHARACTER_FEATURE_COUNT = REPLACEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.impl.SpecificCharacterBySpecificCharacterImpl <em>Specific Character By Specific Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.impl.SpecificCharacterBySpecificCharacterImpl
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getSpecificCharacterBySpecificCharacter()
	 * @generated
	 */
	int SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER = 14;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__LOCATIONS = REPLACEMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__TARGET = REPLACEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__SOURCE = REPLACEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Character By Specific Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER_FEATURE_COUNT = REPLACEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.Positions <em>Positions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.Positions
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getPositions()
	 * @generated
	 */
	int POSITIONS = 15;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.strings.Occurrences <em>Occurrences</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.strings.Occurrences
	 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getOccurrences()
	 * @generated
	 */
	int OCCURRENCES = 16;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.Tallying <em>Tallying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tallying</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Tallying
	 * @generated
	 */
	EClass getTallying();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.StringManipulation <em>String Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Manipulation</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.StringManipulation
	 * @generated
	 */
	EClass getStringManipulation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.strings.StringManipulation#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.StringManipulation#getLocations()
	 * @see #getStringManipulation()
	 * @generated
	 */
	EReference getStringManipulation_Locations();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.ManipulatedStrings <em>Manipulated Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manipulated Strings</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.ManipulatedStrings
	 * @generated
	 */
	EClass getManipulatedStrings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.strings.ManipulatedStrings#getStrings <em>Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strings</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.ManipulatedStrings#getStrings()
	 * @see #getManipulatedStrings()
	 * @generated
	 */
	EReference getManipulatedStrings_Strings();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.strings.ManipulatedStrings#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delimiter</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.ManipulatedStrings#getDelimiter()
	 * @see #getManipulatedStrings()
	 * @generated
	 */
	EReference getManipulatedStrings_Delimiter();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings <em>Concatenating Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenating Strings</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings
	 * @generated
	 */
	EClass getConcatenatingStrings();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.SplittedString <em>Splitted String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splitted String</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.SplittedString
	 * @generated
	 */
	EClass getSplittedString();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.strings.SplittedString#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.SplittedString#getCounter()
	 * @see #getSplittedString()
	 * @generated
	 */
	EReference getSplittedString_Counter();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.strings.Location#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Location#getPosition()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.strings.Location#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Location#isInitial()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Initial();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.strings.Location#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Location#getBase()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Base();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.Replacement <em>Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replacement</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Replacement
	 * @generated
	 */
	EClass getReplacement();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.strings.Replacement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Replacement#getTarget()
	 * @see #getReplacement()
	 * @generated
	 */
	EReference getReplacement_Target();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.Occurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Occurrence
	 * @generated
	 */
	EClass getOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.strings.Occurrence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Occurrence#getType()
	 * @see #getOccurrence()
	 * @generated
	 */
	EAttribute getOccurrence_Type();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.TallyingOccurrence <em>Tallying Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tallying Occurrence</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.TallyingOccurrence
	 * @generated
	 */
	EClass getTallyingOccurrence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.strings.TallyingOccurrence#getOccurrences <em>Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occurrences</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.TallyingOccurrence#getOccurrences()
	 * @see #getTallyingOccurrence()
	 * @generated
	 */
	EReference getTallyingOccurrence_Occurrences();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence <em>Replacement Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replacement Occurrence</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence
	 * @generated
	 */
	EClass getReplacementOccurrence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence#getOccurrences <em>Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occurrences</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence#getOccurrences()
	 * @see #getReplacementOccurrence()
	 * @generated
	 */
	EReference getReplacementOccurrence_Occurrences();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.AnyCharacter <em>Any Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Character</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.AnyCharacter
	 * @generated
	 */
	EClass getAnyCharacter();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacter <em>Specific Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Character</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.SpecificCharacter
	 * @generated
	 */
	EClass getSpecificCharacter();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacter#getTallying <em>Tallying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tallying</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.SpecificCharacter#getTallying()
	 * @see #getSpecificCharacter()
	 * @generated
	 */
	EReference getSpecificCharacter_Tallying();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter <em>Any Character By Specific Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Character By Specific Character</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter
	 * @generated
	 */
	EClass getAnyCharacterBySpecificCharacter();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter <em>Specific Character By Specific Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Character By Specific Character</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter
	 * @generated
	 */
	EClass getSpecificCharacterBySpecificCharacter();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter#getSource()
	 * @see #getSpecificCharacterBySpecificCharacter()
	 * @generated
	 */
	EReference getSpecificCharacterBySpecificCharacter_Source();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.strings.Positions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Positions</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Positions
	 * @generated
	 */
	EEnum getPositions();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.strings.Occurrences <em>Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Occurrences</em>'.
	 * @see org.servicifi.gelato.language.cobol.strings.Occurrences
	 * @generated
	 */
	EEnum getOccurrences();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StringsFactory getStringsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.TallyingImpl <em>Tallying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.TallyingImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getTallying()
		 * @generated
		 */
		EClass TALLYING = eINSTANCE.getTallying();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.StringManipulationImpl <em>String Manipulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringManipulationImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getStringManipulation()
		 * @generated
		 */
		EClass STRING_MANIPULATION = eINSTANCE.getStringManipulation();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_MANIPULATION__LOCATIONS = eINSTANCE.getStringManipulation_Locations();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.ManipulatedStringsImpl <em>Manipulated Strings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.ManipulatedStringsImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getManipulatedStrings()
		 * @generated
		 */
		EClass MANIPULATED_STRINGS = eINSTANCE.getManipulatedStrings();

		/**
		 * The meta object literal for the '<em><b>Strings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIPULATED_STRINGS__STRINGS = eINSTANCE.getManipulatedStrings_Strings();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIPULATED_STRINGS__DELIMITER = eINSTANCE.getManipulatedStrings_Delimiter();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.ConcatenatingStringsImpl <em>Concatenating Strings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.ConcatenatingStringsImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getConcatenatingStrings()
		 * @generated
		 */
		EClass CONCATENATING_STRINGS = eINSTANCE.getConcatenatingStrings();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.SplittedStringImpl <em>Splitted String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.SplittedStringImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getSplittedString()
		 * @generated
		 */
		EClass SPLITTED_STRING = eINSTANCE.getSplittedString();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLITTED_STRING__COUNTER = eINSTANCE.getSplittedString_Counter();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.LocationImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__POSITION = eINSTANCE.getLocation_Position();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__INITIAL = eINSTANCE.getLocation_Initial();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__BASE = eINSTANCE.getLocation_Base();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.ReplacementImpl <em>Replacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.ReplacementImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getReplacement()
		 * @generated
		 */
		EClass REPLACEMENT = eINSTANCE.getReplacement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACEMENT__TARGET = eINSTANCE.getReplacement_Target();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.OccurrenceImpl <em>Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.OccurrenceImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getOccurrence()
		 * @generated
		 */
		EClass OCCURRENCE = eINSTANCE.getOccurrence();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURRENCE__TYPE = eINSTANCE.getOccurrence_Type();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.TallyingOccurrenceImpl <em>Tallying Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.TallyingOccurrenceImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getTallyingOccurrence()
		 * @generated
		 */
		EClass TALLYING_OCCURRENCE = eINSTANCE.getTallyingOccurrence();

		/**
		 * The meta object literal for the '<em><b>Occurrences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALLYING_OCCURRENCE__OCCURRENCES = eINSTANCE.getTallyingOccurrence_Occurrences();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.ReplacementOccurrenceImpl <em>Replacement Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.ReplacementOccurrenceImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getReplacementOccurrence()
		 * @generated
		 */
		EClass REPLACEMENT_OCCURRENCE = eINSTANCE.getReplacementOccurrence();

		/**
		 * The meta object literal for the '<em><b>Occurrences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACEMENT_OCCURRENCE__OCCURRENCES = eINSTANCE.getReplacementOccurrence_Occurrences();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.AnyCharacterImpl <em>Any Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.AnyCharacterImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getAnyCharacter()
		 * @generated
		 */
		EClass ANY_CHARACTER = eINSTANCE.getAnyCharacter();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.SpecificCharacterImpl <em>Specific Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.SpecificCharacterImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getSpecificCharacter()
		 * @generated
		 */
		EClass SPECIFIC_CHARACTER = eINSTANCE.getSpecificCharacter();

		/**
		 * The meta object literal for the '<em><b>Tallying</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_CHARACTER__TALLYING = eINSTANCE.getSpecificCharacter_Tallying();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.AnyCharacterBySpecificCharacterImpl <em>Any Character By Specific Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.AnyCharacterBySpecificCharacterImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getAnyCharacterBySpecificCharacter()
		 * @generated
		 */
		EClass ANY_CHARACTER_BY_SPECIFIC_CHARACTER = eINSTANCE.getAnyCharacterBySpecificCharacter();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.impl.SpecificCharacterBySpecificCharacterImpl <em>Specific Character By Specific Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.impl.SpecificCharacterBySpecificCharacterImpl
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getSpecificCharacterBySpecificCharacter()
		 * @generated
		 */
		EClass SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER = eINSTANCE.getSpecificCharacterBySpecificCharacter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__SOURCE = eINSTANCE.getSpecificCharacterBySpecificCharacter_Source();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.Positions <em>Positions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.Positions
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getPositions()
		 * @generated
		 */
		EEnum POSITIONS = eINSTANCE.getPositions();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.strings.Occurrences <em>Occurrences</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.strings.Occurrences
		 * @see org.servicifi.gelato.language.cobol.strings.impl.StringsPackageImpl#getOccurrences()
		 * @generated
		 */
		EEnum OCCURRENCES = eINSTANCE.getOccurrences();

	}

} //StringsPackage
