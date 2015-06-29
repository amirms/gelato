/**
 */
package org.servicifi.gelato.language.cobol.specialnames;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.commons.CommonsPackage;

import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

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
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesFactory
 * @model kind="package"
 * @generated
 */
public interface SpecialnamesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specialnames";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/specialnames";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specialnames";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecialnamesPackage eINSTANCE = org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SpecialNameImpl <em>Special Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialNameImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSpecialName()
	 * @generated
	 */
	int SPECIAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAME__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAME__ALIASES_TO = ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAME__ALIASES_FROM = ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM;

	/**
	 * The number of structural features of the '<em>Special Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAME_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.ConditionNameImpl <em>Condition Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.ConditionNameImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getConditionName()
	 * @generated
	 */
	int CONDITION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__ALIASES_TO = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__ALIASES_FROM = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.OnStatusImpl <em>On Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.OnStatusImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getOnStatus()
	 * @generated
	 */
	int ON_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_STATUS__NAME = CONDITION_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_STATUS__ALIASES_TO = CONDITION_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_STATUS__ALIASES_FROM = CONDITION_NAME__ALIASES_FROM;

	/**
	 * The number of structural features of the '<em>On Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_STATUS_FEATURE_COUNT = CONDITION_NAME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.OffStatusImpl <em>Off Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.OffStatusImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getOffStatus()
	 * @generated
	 */
	int OFF_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFF_STATUS__NAME = CONDITION_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFF_STATUS__ALIASES_TO = CONDITION_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFF_STATUS__ALIASES_FROM = CONDITION_NAME__ALIASES_FROM;

	/**
	 * The number of structural features of the '<em>Off Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFF_STATUS_FEATURE_COUNT = CONDITION_NAME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.AlphabetNameImpl <em>Alphabet Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.AlphabetNameImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getAlphabetName()
	 * @generated
	 */
	int ALPHABET_NAME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_NAME__NAME = SPECIAL_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_NAME__ALIASES_TO = SPECIAL_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_NAME__ALIASES_FROM = SPECIAL_NAME__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_NAME__TYPE = SPECIAL_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alphabet Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_NAME_FEATURE_COUNT = SPECIAL_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.MnemonicNameImpl <em>Mnemonic Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.MnemonicNameImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getMnemonicName()
	 * @generated
	 */
	int MNEMONIC_NAME = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_NAME__NAME = SPECIAL_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_NAME__ALIASES_TO = SPECIAL_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_NAME__ALIASES_FROM = SPECIAL_NAME__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_NAME__ENVIRONMENT = SPECIAL_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mnemonic Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_NAME_FEATURE_COUNT = SPECIAL_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.UPSISwitchIsImpl <em>UPSI Switch Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.UPSISwitchIsImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getUPSISwitchIs()
	 * @generated
	 */
	int UPSI_SWITCH_IS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSI_SWITCH_IS__NAME = MNEMONIC_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSI_SWITCH_IS__ALIASES_TO = MNEMONIC_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSI_SWITCH_IS__ALIASES_FROM = MNEMONIC_NAME__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSI_SWITCH_IS__ENVIRONMENT = MNEMONIC_NAME__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Condition Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSI_SWITCH_IS__CONDITION_NAMES = MNEMONIC_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UPSI Switch Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSI_SWITCH_IS_FEATURE_COUNT = MNEMONIC_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.AlphabetTypeImpl <em>Alphabet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.AlphabetTypeImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getAlphabetType()
	 * @generated
	 */
	int ALPHABET_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Alphabet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.PredefinedAlphabetTypeImpl <em>Predefined Alphabet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.PredefinedAlphabetTypeImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getPredefinedAlphabetType()
	 * @generated
	 */
	int PREDEFINED_ALPHABET_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_ALPHABET_TYPE__VALUE = ALPHABET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predefined Alphabet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_ALPHABET_TYPE_FEATURE_COUNT = ALPHABET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.ExplicitAlphabetTypeImpl <em>Explicit Alphabet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.ExplicitAlphabetTypeImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getExplicitAlphabetType()
	 * @generated
	 */
	int EXPLICIT_ALPHABET_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ALPHABET_TYPE__RANGE = ALPHABET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explicit Alphabet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ALPHABET_TYPE_FEATURE_COUNT = ALPHABET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.CodeNameAlphabetTypeImpl <em>Code Name Alphabet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.CodeNameAlphabetTypeImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getCodeNameAlphabetType()
	 * @generated
	 */
	int CODE_NAME_ALPHABET_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NAME_ALPHABET_TYPE__VALUE = ALPHABET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Name Alphabet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NAME_ALPHABET_TYPE_FEATURE_COUNT = ALPHABET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.CurrencySignImpl <em>Currency Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.CurrencySignImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getCurrencySign()
	 * @generated
	 */
	int CURRENCY_SIGN = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SIGN__NAME = SPECIAL_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SIGN__ALIASES_TO = SPECIAL_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SIGN__ALIASES_FROM = SPECIAL_NAME__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Picture Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SIGN__PICTURE_SYMBOL = SPECIAL_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SIGN__CURRENCY = SPECIAL_NAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Currency Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_SIGN_FEATURE_COUNT = SPECIAL_NAME_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.ClassNameImpl <em>Class Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.ClassNameImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getClassName()
	 * @generated
	 */
	int CLASS_NAME = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_NAME__NAME = SPECIAL_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_NAME__ALIASES_TO = SPECIAL_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_NAME__ALIASES_FROM = SPECIAL_NAME__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_NAME__RANGE = SPECIAL_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_NAME_FEATURE_COUNT = SPECIAL_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SystemDeviceIsImpl <em>System Device Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SystemDeviceIsImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSystemDeviceIs()
	 * @generated
	 */
	int SYSTEM_DEVICE_IS = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEVICE_IS__NAME = MNEMONIC_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEVICE_IS__ALIASES_TO = MNEMONIC_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEVICE_IS__ALIASES_FROM = MNEMONIC_NAME__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEVICE_IS__ENVIRONMENT = MNEMONIC_NAME__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>System Device Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEVICE_IS_FEATURE_COUNT = MNEMONIC_NAME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterImpl <em>Symbolic Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSymbolicCharacter()
	 * @generated
	 */
	int SYMBOLIC_CHARACTER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_CHARACTER__NAME = SPECIAL_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_CHARACTER__ALIASES_TO = SPECIAL_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_CHARACTER__ALIASES_FROM = SPECIAL_NAME__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Integers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_CHARACTER__INTEGERS = SPECIAL_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbolic Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_CHARACTER_FEATURE_COUNT = SPECIAL_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SpecialNameStatementImpl <em>Special Name Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialNameStatementImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSpecialNameStatement()
	 * @generated
	 */
	int SPECIAL_NAME_STATEMENT = 16;

	/**
	 * The number of structural features of the '<em>Special Name Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAME_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterStatementImpl <em>Symbolic Character Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterStatementImpl
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSymbolicCharacterStatement()
	 * @generated
	 */
	int SYMBOLIC_CHARACTER_STATEMENT = 15;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_CHARACTER_STATEMENT__TARGET = SPECIAL_NAME_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbolic Characters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS = SPECIAL_NAME_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alphabet Name Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE = SPECIAL_NAME_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Symbolic Character Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_CHARACTER_STATEMENT_FEATURE_COUNT = SPECIAL_NAME_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetTypes <em>Predefined Alphabet Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetTypes
	 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getPredefinedAlphabetTypes()
	 * @generated
	 */
	int PREDEFINED_ALPHABET_TYPES = 17;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.SpecialName <em>Special Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialName
	 * @generated
	 */
	EClass getSpecialName();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.ConditionName <em>Condition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.ConditionName
	 * @generated
	 */
	EClass getConditionName();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.OnStatus <em>On Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Status</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.OnStatus
	 * @generated
	 */
	EClass getOnStatus();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.OffStatus <em>Off Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Off Status</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.OffStatus
	 * @generated
	 */
	EClass getOffStatus();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.AlphabetName <em>Alphabet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphabet Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.AlphabetName
	 * @generated
	 */
	EClass getAlphabetName();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.specialnames.AlphabetName#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.AlphabetName#getType()
	 * @see #getAlphabetName()
	 * @generated
	 */
	EReference getAlphabetName_Type();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs <em>UPSI Switch Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UPSI Switch Is</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs
	 * @generated
	 */
	EClass getUPSISwitchIs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs#getConditionNames <em>Condition Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Names</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs#getConditionNames()
	 * @see #getUPSISwitchIs()
	 * @generated
	 */
	EReference getUPSISwitchIs_ConditionNames();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.AlphabetType <em>Alphabet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphabet Type</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.AlphabetType
	 * @generated
	 */
	EClass getAlphabetType();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType <em>Predefined Alphabet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Alphabet Type</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType
	 * @generated
	 */
	EClass getPredefinedAlphabetType();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType#getValue()
	 * @see #getPredefinedAlphabetType()
	 * @generated
	 */
	EAttribute getPredefinedAlphabetType_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.ExplicitAlphabetType <em>Explicit Alphabet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Alphabet Type</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.ExplicitAlphabetType
	 * @generated
	 */
	EClass getExplicitAlphabetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.specialnames.ExplicitAlphabetType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.ExplicitAlphabetType#getRange()
	 * @see #getExplicitAlphabetType()
	 * @generated
	 */
	EReference getExplicitAlphabetType_Range();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType <em>Code Name Alphabet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Name Alphabet Type</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType
	 * @generated
	 */
	EClass getCodeNameAlphabetType();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType#getValue()
	 * @see #getCodeNameAlphabetType()
	 * @generated
	 */
	EAttribute getCodeNameAlphabetType_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.CurrencySign <em>Currency Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Sign</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.CurrencySign
	 * @generated
	 */
	EClass getCurrencySign();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.specialnames.CurrencySign#getPictureSymbol <em>Picture Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture Symbol</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.CurrencySign#getPictureSymbol()
	 * @see #getCurrencySign()
	 * @generated
	 */
	EAttribute getCurrencySign_PictureSymbol();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.specialnames.CurrencySign#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.CurrencySign#getCurrency()
	 * @see #getCurrencySign()
	 * @generated
	 */
	EReference getCurrencySign_Currency();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.ClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.ClassName
	 * @generated
	 */
	EClass getClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.specialnames.ClassName#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.ClassName#getRange()
	 * @see #getClassName()
	 * @generated
	 */
	EReference getClassName_Range();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.MnemonicName <em>Mnemonic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mnemonic Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.MnemonicName
	 * @generated
	 */
	EClass getMnemonicName();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.specialnames.MnemonicName#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.MnemonicName#getEnvironment()
	 * @see #getMnemonicName()
	 * @generated
	 */
	EReference getMnemonicName_Environment();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs <em>System Device Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Device Is</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs
	 * @generated
	 */
	EClass getSystemDeviceIs();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter <em>Symbolic Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Character</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter
	 * @generated
	 */
	EClass getSymbolicCharacter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter#getIntegers <em>Integers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integers</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter#getIntegers()
	 * @see #getSymbolicCharacter()
	 * @generated
	 */
	EReference getSymbolicCharacter_Integers();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement <em>Symbolic Character Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Character Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement
	 * @generated
	 */
	EClass getSymbolicCharacterStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement#getSymbolicCharacters <em>Symbolic Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbolic Characters</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement#getSymbolicCharacters()
	 * @see #getSymbolicCharacterStatement()
	 * @generated
	 */
	EReference getSymbolicCharacterStatement_SymbolicCharacters();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement#getAlphabetNameReference <em>Alphabet Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alphabet Name Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement#getAlphabetNameReference()
	 * @see #getSymbolicCharacterStatement()
	 * @generated
	 */
	EReference getSymbolicCharacterStatement_AlphabetNameReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.specialnames.SpecialNameStatement <em>Special Name Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Name Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialNameStatement
	 * @generated
	 */
	EClass getSpecialNameStatement();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetTypes <em>Predefined Alphabet Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Predefined Alphabet Types</em>'.
	 * @see org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetTypes
	 * @generated
	 */
	EEnum getPredefinedAlphabetTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecialnamesFactory getSpecialnamesFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SpecialNameImpl <em>Special Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialNameImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSpecialName()
		 * @generated
		 */
		EClass SPECIAL_NAME = eINSTANCE.getSpecialName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.ConditionNameImpl <em>Condition Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.ConditionNameImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getConditionName()
		 * @generated
		 */
		EClass CONDITION_NAME = eINSTANCE.getConditionName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.OnStatusImpl <em>On Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.OnStatusImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getOnStatus()
		 * @generated
		 */
		EClass ON_STATUS = eINSTANCE.getOnStatus();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.OffStatusImpl <em>Off Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.OffStatusImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getOffStatus()
		 * @generated
		 */
		EClass OFF_STATUS = eINSTANCE.getOffStatus();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.AlphabetNameImpl <em>Alphabet Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.AlphabetNameImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getAlphabetName()
		 * @generated
		 */
		EClass ALPHABET_NAME = eINSTANCE.getAlphabetName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHABET_NAME__TYPE = eINSTANCE.getAlphabetName_Type();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.UPSISwitchIsImpl <em>UPSI Switch Is</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.UPSISwitchIsImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getUPSISwitchIs()
		 * @generated
		 */
		EClass UPSI_SWITCH_IS = eINSTANCE.getUPSISwitchIs();

		/**
		 * The meta object literal for the '<em><b>Condition Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPSI_SWITCH_IS__CONDITION_NAMES = eINSTANCE.getUPSISwitchIs_ConditionNames();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.AlphabetTypeImpl <em>Alphabet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.AlphabetTypeImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getAlphabetType()
		 * @generated
		 */
		EClass ALPHABET_TYPE = eINSTANCE.getAlphabetType();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.PredefinedAlphabetTypeImpl <em>Predefined Alphabet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.PredefinedAlphabetTypeImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getPredefinedAlphabetType()
		 * @generated
		 */
		EClass PREDEFINED_ALPHABET_TYPE = eINSTANCE.getPredefinedAlphabetType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDEFINED_ALPHABET_TYPE__VALUE = eINSTANCE.getPredefinedAlphabetType_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.ExplicitAlphabetTypeImpl <em>Explicit Alphabet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.ExplicitAlphabetTypeImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getExplicitAlphabetType()
		 * @generated
		 */
		EClass EXPLICIT_ALPHABET_TYPE = eINSTANCE.getExplicitAlphabetType();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLICIT_ALPHABET_TYPE__RANGE = eINSTANCE.getExplicitAlphabetType_Range();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.CodeNameAlphabetTypeImpl <em>Code Name Alphabet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.CodeNameAlphabetTypeImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getCodeNameAlphabetType()
		 * @generated
		 */
		EClass CODE_NAME_ALPHABET_TYPE = eINSTANCE.getCodeNameAlphabetType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_NAME_ALPHABET_TYPE__VALUE = eINSTANCE.getCodeNameAlphabetType_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.CurrencySignImpl <em>Currency Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.CurrencySignImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getCurrencySign()
		 * @generated
		 */
		EClass CURRENCY_SIGN = eINSTANCE.getCurrencySign();

		/**
		 * The meta object literal for the '<em><b>Picture Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_SIGN__PICTURE_SYMBOL = eINSTANCE.getCurrencySign_PictureSymbol();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_SIGN__CURRENCY = eINSTANCE.getCurrencySign_Currency();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.ClassNameImpl <em>Class Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.ClassNameImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getClassName()
		 * @generated
		 */
		EClass CLASS_NAME = eINSTANCE.getClassName();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_NAME__RANGE = eINSTANCE.getClassName_Range();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.MnemonicNameImpl <em>Mnemonic Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.MnemonicNameImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getMnemonicName()
		 * @generated
		 */
		EClass MNEMONIC_NAME = eINSTANCE.getMnemonicName();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MNEMONIC_NAME__ENVIRONMENT = eINSTANCE.getMnemonicName_Environment();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SystemDeviceIsImpl <em>System Device Is</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SystemDeviceIsImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSystemDeviceIs()
		 * @generated
		 */
		EClass SYSTEM_DEVICE_IS = eINSTANCE.getSystemDeviceIs();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterImpl <em>Symbolic Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSymbolicCharacter()
		 * @generated
		 */
		EClass SYMBOLIC_CHARACTER = eINSTANCE.getSymbolicCharacter();

		/**
		 * The meta object literal for the '<em><b>Integers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_CHARACTER__INTEGERS = eINSTANCE.getSymbolicCharacter_Integers();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterStatementImpl <em>Symbolic Character Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterStatementImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSymbolicCharacterStatement()
		 * @generated
		 */
		EClass SYMBOLIC_CHARACTER_STATEMENT = eINSTANCE.getSymbolicCharacterStatement();

		/**
		 * The meta object literal for the '<em><b>Symbolic Characters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS = eINSTANCE.getSymbolicCharacterStatement_SymbolicCharacters();

		/**
		 * The meta object literal for the '<em><b>Alphabet Name Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE = eINSTANCE.getSymbolicCharacterStatement_AlphabetNameReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.impl.SpecialNameStatementImpl <em>Special Name Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialNameStatementImpl
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getSpecialNameStatement()
		 * @generated
		 */
		EClass SPECIAL_NAME_STATEMENT = eINSTANCE.getSpecialNameStatement();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetTypes <em>Predefined Alphabet Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetTypes
		 * @see org.servicifi.gelato.language.cobol.specialnames.impl.SpecialnamesPackageImpl#getPredefinedAlphabetTypes()
		 * @generated
		 */
		EEnum PREDEFINED_ALPHABET_TYPES = eINSTANCE.getPredefinedAlphabetTypes();

	}

} //SpecialnamesPackage
