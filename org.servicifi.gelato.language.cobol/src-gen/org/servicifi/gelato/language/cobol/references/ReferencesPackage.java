/**
 */
package org.servicifi.gelato.language.cobol.references;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.commons.CommonsPackage;

import org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage;

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
 * @see org.servicifi.gelato.language.cobol.references.ReferencesFactory
 * @model kind="package"
 * @generated
 */
public interface ReferencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "references";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/references";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "references";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferencesPackage eINSTANCE = org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferenceableElementImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getReferenceableElement()
	 * @generated
	 */
	int REFERENCEABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT__ALIASES_TO = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT__ALIASES_FROM = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Referenceable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.ElementReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getElementReference()
	 * @generated
	 */
	int ELEMENT_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__TARGET = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.SpecialNamesConditionNameReferenceImpl <em>Special Names Condition Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.SpecialNamesConditionNameReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getSpecialNamesConditionNameReference()
	 * @generated
	 */
	int SPECIAL_NAMES_CONDITION_NAME_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_CONDITION_NAME_REFERENCE__TARGET = ELEMENT_REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_CONDITION_NAME_REFERENCE__QUALIFIER = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Special Names Condition Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_CONDITION_NAME_REFERENCE_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.FileNameReferenceImpl <em>File Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.FileNameReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getFileNameReference()
	 * @generated
	 */
	int FILE_NAME_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_REFERENCE__TARGET = ELEMENT_REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_REFERENCE__QUALIFIER = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_REFERENCE_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.IndexNameReferenceImpl <em>Index Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.IndexNameReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getIndexNameReference()
	 * @generated
	 */
	int INDEX_NAME_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME_REFERENCE__MODIFIER = IdentifiersPackage.IDENTIFIER_REFERENCE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME_REFERENCE__TARGET = IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME_REFERENCE__QUALIFIER = IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Subscripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME_REFERENCE__SUBSCRIPTS = IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME_REFERENCE__QUALIFIERS = IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS;

	/**
	 * The number of structural features of the '<em>Index Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME_REFERENCE_FEATURE_COUNT = IdentifiersPackage.IDENTIFIER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.MnemonicNameReferenceImpl <em>Mnemonic Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.MnemonicNameReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getMnemonicNameReference()
	 * @generated
	 */
	int MNEMONIC_NAME_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_NAME_REFERENCE__TARGET = ELEMENT_REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_NAME_REFERENCE__QUALIFIER = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mnemonic Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_NAME_REFERENCE_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.AlphabetNameReferenceImpl <em>Alphabet Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.AlphabetNameReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getAlphabetNameReference()
	 * @generated
	 */
	int ALPHABET_NAME_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_NAME_REFERENCE__TARGET = ELEMENT_REFERENCE__TARGET;

	/**
	 * The number of structural features of the '<em>Alphabet Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_NAME_REFERENCE_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.ConditionNameImpl <em>Condition Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.ConditionNameImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getConditionName()
	 * @generated
	 */
	int CONDITION_NAME = 8;

	/**
	 * The number of structural features of the '<em>Condition Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.QualifiableImpl <em>Qualifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.QualifiableImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getQualifiable()
	 * @generated
	 */
	int QUALIFIABLE = 9;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE__QUALIFIER = 0;

	/**
	 * The number of structural features of the '<em>Qualifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.ConditionNameReferenceImpl <em>Condition Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.ConditionNameReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getConditionNameReference()
	 * @generated
	 */
	int CONDITION_NAME_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME_REFERENCE__MODIFIER = IdentifiersPackage.IDENTIFIER_REFERENCE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME_REFERENCE__TARGET = IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME_REFERENCE__QUALIFIER = IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Subscripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME_REFERENCE__SUBSCRIPTS = IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME_REFERENCE__QUALIFIERS = IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS;

	/**
	 * The number of structural features of the '<em>Condition Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME_REFERENCE_FEATURE_COUNT = IdentifiersPackage.IDENTIFIER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.DataNameReferenceImpl <em>Data Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.DataNameReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getDataNameReference()
	 * @generated
	 */
	int DATA_NAME_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME_REFERENCE__MODIFIER = IdentifiersPackage.IDENTIFIER_REFERENCE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME_REFERENCE__TARGET = IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME_REFERENCE__QUALIFIER = IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Subscripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME_REFERENCE__SUBSCRIPTS = IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME_REFERENCE__QUALIFIERS = IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS;

	/**
	 * The number of structural features of the '<em>Data Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME_REFERENCE_FEATURE_COUNT = IdentifiersPackage.IDENTIFIER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.references.impl.IdentifierReferenceQualifierImpl <em>Identifier Reference Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.references.impl.IdentifierReferenceQualifierImpl
	 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getIdentifierReferenceQualifier()
	 * @generated
	 */
	int IDENTIFIER_REFERENCE_QUALIFIER = 12;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_QUALIFIER__QUALIFIER = QUALIFIABLE__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_QUALIFIER__TARGET = QUALIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier Reference Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_QUALIFIER_FEATURE_COUNT = QUALIFIABLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.ReferenceableElement <em>Referenceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenceable Element</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.ReferenceableElement
	 * @generated
	 */
	EClass getReferenceableElement();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesTo <em>Aliases To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aliases To</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesTo()
	 * @see #getReferenceableElement()
	 * @generated
	 */
	EReference getReferenceableElement_AliasesTo();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesFrom <em>Aliases From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aliases From</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesFrom()
	 * @see #getReferenceableElement()
	 * @generated
	 */
	EReference getReferenceableElement_AliasesFrom();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.ElementReference
	 * @generated
	 */
	EClass getElementReference();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.cobol.references.ElementReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.ElementReference#getTarget()
	 * @see #getElementReference()
	 * @generated
	 */
	EReference getElementReference_Target();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference <em>Special Names Condition Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Names Condition Name Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference
	 * @generated
	 */
	EClass getSpecialNamesConditionNameReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.FileNameReference <em>File Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Name Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.FileNameReference
	 * @generated
	 */
	EClass getFileNameReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.IndexNameReference <em>Index Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Name Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.IndexNameReference
	 * @generated
	 */
	EClass getIndexNameReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.MnemonicNameReference <em>Mnemonic Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mnemonic Name Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.MnemonicNameReference
	 * @generated
	 */
	EClass getMnemonicNameReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.AlphabetNameReference <em>Alphabet Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphabet Name Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.AlphabetNameReference
	 * @generated
	 */
	EClass getAlphabetNameReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.ConditionName <em>Condition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.ConditionName
	 * @generated
	 */
	EClass getConditionName();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.Qualifiable <em>Qualifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifiable</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.Qualifiable
	 * @generated
	 */
	EClass getQualifiable();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.references.Qualifiable#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.Qualifiable#getQualifier()
	 * @see #getQualifiable()
	 * @generated
	 */
	EReference getQualifiable_Qualifier();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.ConditionNameReference <em>Condition Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Name Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.ConditionNameReference
	 * @generated
	 */
	EClass getConditionNameReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.DataNameReference <em>Data Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Name Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.DataNameReference
	 * @generated
	 */
	EClass getDataNameReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier <em>Identifier Reference Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Reference Qualifier</em>'.
	 * @see org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier
	 * @generated
	 */
	EClass getIdentifierReferenceQualifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReferencesFactory getReferencesFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferenceableElementImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getReferenceableElement()
		 * @generated
		 */
		EClass REFERENCEABLE_ELEMENT = eINSTANCE.getReferenceableElement();

		/**
		 * The meta object literal for the '<em><b>Aliases To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCEABLE_ELEMENT__ALIASES_TO = eINSTANCE.getReferenceableElement_AliasesTo();

		/**
		 * The meta object literal for the '<em><b>Aliases From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCEABLE_ELEMENT__ALIASES_FROM = eINSTANCE.getReferenceableElement_AliasesFrom();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.ElementReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getElementReference()
		 * @generated
		 */
		EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_REFERENCE__TARGET = eINSTANCE.getElementReference_Target();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.SpecialNamesConditionNameReferenceImpl <em>Special Names Condition Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.SpecialNamesConditionNameReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getSpecialNamesConditionNameReference()
		 * @generated
		 */
		EClass SPECIAL_NAMES_CONDITION_NAME_REFERENCE = eINSTANCE.getSpecialNamesConditionNameReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.FileNameReferenceImpl <em>File Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.FileNameReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getFileNameReference()
		 * @generated
		 */
		EClass FILE_NAME_REFERENCE = eINSTANCE.getFileNameReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.IndexNameReferenceImpl <em>Index Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.IndexNameReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getIndexNameReference()
		 * @generated
		 */
		EClass INDEX_NAME_REFERENCE = eINSTANCE.getIndexNameReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.MnemonicNameReferenceImpl <em>Mnemonic Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.MnemonicNameReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getMnemonicNameReference()
		 * @generated
		 */
		EClass MNEMONIC_NAME_REFERENCE = eINSTANCE.getMnemonicNameReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.AlphabetNameReferenceImpl <em>Alphabet Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.AlphabetNameReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getAlphabetNameReference()
		 * @generated
		 */
		EClass ALPHABET_NAME_REFERENCE = eINSTANCE.getAlphabetNameReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.ConditionNameImpl <em>Condition Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.ConditionNameImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getConditionName()
		 * @generated
		 */
		EClass CONDITION_NAME = eINSTANCE.getConditionName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.QualifiableImpl <em>Qualifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.QualifiableImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getQualifiable()
		 * @generated
		 */
		EClass QUALIFIABLE = eINSTANCE.getQualifiable();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIABLE__QUALIFIER = eINSTANCE.getQualifiable_Qualifier();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.ConditionNameReferenceImpl <em>Condition Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.ConditionNameReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getConditionNameReference()
		 * @generated
		 */
		EClass CONDITION_NAME_REFERENCE = eINSTANCE.getConditionNameReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.DataNameReferenceImpl <em>Data Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.DataNameReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getDataNameReference()
		 * @generated
		 */
		EClass DATA_NAME_REFERENCE = eINSTANCE.getDataNameReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.references.impl.IdentifierReferenceQualifierImpl <em>Identifier Reference Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.references.impl.IdentifierReferenceQualifierImpl
		 * @see org.servicifi.gelato.language.cobol.references.impl.ReferencesPackageImpl#getIdentifierReferenceQualifier()
		 * @generated
		 */
		EClass IDENTIFIER_REFERENCE_QUALIFIER = eINSTANCE.getIdentifierReferenceQualifier();

	}

} //ReferencesPackage
