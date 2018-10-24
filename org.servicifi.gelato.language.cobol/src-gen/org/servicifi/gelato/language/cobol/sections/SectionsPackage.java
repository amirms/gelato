/**
 */
package org.servicifi.gelato.language.cobol.sections;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.commons.CommonsPackage;

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
 * @see org.servicifi.gelato.language.cobol.sections.SectionsFactory
 * @model kind="package"
 * @generated
 */
public interface SectionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sections";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/sections";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sections";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SectionsPackage eINSTANCE = org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SENTENCES = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PARAGRAPHS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SEGMENT_NUMBER = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.DataDivisionSectionImpl <em>Data Division Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.DataDivisionSectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getDataDivisionSection()
	 * @generated
	 */
	int DATA_DIVISION_SECTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION_SECTION__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION_SECTION__SENTENCES = SECTION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION_SECTION__PARAGRAPHS = SECTION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION_SECTION__SEGMENT_NUMBER = SECTION__SEGMENT_NUMBER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION_SECTION__STATEMENTS = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION_SECTION__RECORDS = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Division Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.WorkingStorageSectionImpl <em>Working Storage Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.WorkingStorageSectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getWorkingStorageSection()
	 * @generated
	 */
	int WORKING_STORAGE_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_STORAGE_SECTION__NAME = DATA_DIVISION_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_STORAGE_SECTION__SENTENCES = DATA_DIVISION_SECTION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_STORAGE_SECTION__PARAGRAPHS = DATA_DIVISION_SECTION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_STORAGE_SECTION__SEGMENT_NUMBER = DATA_DIVISION_SECTION__SEGMENT_NUMBER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_STORAGE_SECTION__STATEMENTS = DATA_DIVISION_SECTION__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_STORAGE_SECTION__RECORDS = DATA_DIVISION_SECTION__RECORDS;

	/**
	 * The number of structural features of the '<em>Working Storage Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_STORAGE_SECTION_FEATURE_COUNT = DATA_DIVISION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.LocalStorageSectionImpl <em>Local Storage Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.LocalStorageSectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getLocalStorageSection()
	 * @generated
	 */
	int LOCAL_STORAGE_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORAGE_SECTION__NAME = DATA_DIVISION_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORAGE_SECTION__SENTENCES = DATA_DIVISION_SECTION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORAGE_SECTION__PARAGRAPHS = DATA_DIVISION_SECTION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORAGE_SECTION__SEGMENT_NUMBER = DATA_DIVISION_SECTION__SEGMENT_NUMBER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORAGE_SECTION__STATEMENTS = DATA_DIVISION_SECTION__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORAGE_SECTION__RECORDS = DATA_DIVISION_SECTION__RECORDS;

	/**
	 * The number of structural features of the '<em>Local Storage Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORAGE_SECTION_FEATURE_COUNT = DATA_DIVISION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.LinkageStorageSectionImpl <em>Linkage Storage Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.LinkageStorageSectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getLinkageStorageSection()
	 * @generated
	 */
	int LINKAGE_STORAGE_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKAGE_STORAGE_SECTION__NAME = DATA_DIVISION_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKAGE_STORAGE_SECTION__SENTENCES = DATA_DIVISION_SECTION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKAGE_STORAGE_SECTION__PARAGRAPHS = DATA_DIVISION_SECTION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKAGE_STORAGE_SECTION__SEGMENT_NUMBER = DATA_DIVISION_SECTION__SEGMENT_NUMBER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKAGE_STORAGE_SECTION__STATEMENTS = DATA_DIVISION_SECTION__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKAGE_STORAGE_SECTION__RECORDS = DATA_DIVISION_SECTION__RECORDS;

	/**
	 * The number of structural features of the '<em>Linkage Storage Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKAGE_STORAGE_SECTION_FEATURE_COUNT = DATA_DIVISION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.EnvironmentDivisionSectionImpl <em>Environment Division Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.EnvironmentDivisionSectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getEnvironmentDivisionSection()
	 * @generated
	 */
	int ENVIRONMENT_DIVISION_SECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION_SECTION__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION_SECTION__SENTENCES = SECTION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION_SECTION__PARAGRAPHS = SECTION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION_SECTION__SEGMENT_NUMBER = SECTION__SEGMENT_NUMBER;

	/**
	 * The number of structural features of the '<em>Environment Division Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.IOSectionImpl <em>IO Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.IOSectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getIOSection()
	 * @generated
	 */
	int IO_SECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SECTION__NAME = ENVIRONMENT_DIVISION_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SECTION__SENTENCES = ENVIRONMENT_DIVISION_SECTION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SECTION__PARAGRAPHS = ENVIRONMENT_DIVISION_SECTION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SECTION__SEGMENT_NUMBER = ENVIRONMENT_DIVISION_SECTION__SEGMENT_NUMBER;

	/**
	 * The number of structural features of the '<em>IO Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SECTION_FEATURE_COUNT = ENVIRONMENT_DIVISION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.ConfigurationSectionImpl <em>Configuration Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.ConfigurationSectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getConfigurationSection()
	 * @generated
	 */
	int CONFIGURATION_SECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SECTION__NAME = ENVIRONMENT_DIVISION_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SECTION__SENTENCES = ENVIRONMENT_DIVISION_SECTION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SECTION__PARAGRAPHS = ENVIRONMENT_DIVISION_SECTION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SECTION__SEGMENT_NUMBER = ENVIRONMENT_DIVISION_SECTION__SEGMENT_NUMBER;

	/**
	 * The number of structural features of the '<em>Configuration Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SECTION_FEATURE_COUNT = ENVIRONMENT_DIVISION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.FileSectionImpl <em>File Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.FileSectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getFileSection()
	 * @generated
	 */
	int FILE_SECTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__NAME = DATA_DIVISION_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__SENTENCES = DATA_DIVISION_SECTION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__PARAGRAPHS = DATA_DIVISION_SECTION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__SEGMENT_NUMBER = DATA_DIVISION_SECTION__SEGMENT_NUMBER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__STATEMENTS = DATA_DIVISION_SECTION__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__RECORDS = DATA_DIVISION_SECTION__RECORDS;

	/**
	 * The feature id for the '<em><b>File Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__FILE_DESCRIPTORS = DATA_DIVISION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION_FEATURE_COUNT = DATA_DIVISION_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sections.impl.DeclarativeSectionImpl <em>Declarative Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sections.impl.DeclarativeSectionImpl
	 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getDeclarativeSection()
	 * @generated
	 */
	int DECLARATIVE_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SECTION__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SECTION__SENTENCES = SECTION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SECTION__PARAGRAPHS = SECTION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SECTION__SEGMENT_NUMBER = SECTION__SEGMENT_NUMBER;

	/**
	 * The number of structural features of the '<em>Declarative Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.sections.Section#getSentences <em>Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentences</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.Section#getSentences()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Sentences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.sections.Section#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.Section#getParagraphs()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Paragraphs();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.sections.Section#getSegmentNumber <em>Segment Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segment Number</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.Section#getSegmentNumber()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_SegmentNumber();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.WorkingStorageSection <em>Working Storage Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Working Storage Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.WorkingStorageSection
	 * @generated
	 */
	EClass getWorkingStorageSection();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.LocalStorageSection <em>Local Storage Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Storage Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.LocalStorageSection
	 * @generated
	 */
	EClass getLocalStorageSection();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.LinkageStorageSection <em>Linkage Storage Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkage Storage Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.LinkageStorageSection
	 * @generated
	 */
	EClass getLinkageStorageSection();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.IOSection <em>IO Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.IOSection
	 * @generated
	 */
	EClass getIOSection();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.ConfigurationSection <em>Configuration Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.ConfigurationSection
	 * @generated
	 */
	EClass getConfigurationSection();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.EnvironmentDivisionSection <em>Environment Division Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Division Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.EnvironmentDivisionSection
	 * @generated
	 */
	EClass getEnvironmentDivisionSection();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.DataDivisionSection <em>Data Division Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Division Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.DataDivisionSection
	 * @generated
	 */
	EClass getDataDivisionSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.sections.DataDivisionSection#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.DataDivisionSection#getStatements()
	 * @see #getDataDivisionSection()
	 * @generated
	 */
	EReference getDataDivisionSection_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.sections.DataDivisionSection#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.DataDivisionSection#getRecords()
	 * @see #getDataDivisionSection()
	 * @generated
	 */
	EReference getDataDivisionSection_Records();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.FileSection <em>File Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.FileSection
	 * @generated
	 */
	EClass getFileSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.sections.FileSection#getFileDescriptors <em>File Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Descriptors</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.FileSection#getFileDescriptors()
	 * @see #getFileSection()
	 * @generated
	 */
	EReference getFileSection_FileDescriptors();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sections.DeclarativeSection <em>Declarative Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarative Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.sections.DeclarativeSection
	 * @generated
	 */
	EClass getDeclarativeSection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SectionsFactory getSectionsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SENTENCES = eINSTANCE.getSection_Sentences();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PARAGRAPHS = eINSTANCE.getSection_Paragraphs();

		/**
		 * The meta object literal for the '<em><b>Segment Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__SEGMENT_NUMBER = eINSTANCE.getSection_SegmentNumber();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.WorkingStorageSectionImpl <em>Working Storage Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.WorkingStorageSectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getWorkingStorageSection()
		 * @generated
		 */
		EClass WORKING_STORAGE_SECTION = eINSTANCE.getWorkingStorageSection();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.LocalStorageSectionImpl <em>Local Storage Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.LocalStorageSectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getLocalStorageSection()
		 * @generated
		 */
		EClass LOCAL_STORAGE_SECTION = eINSTANCE.getLocalStorageSection();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.LinkageStorageSectionImpl <em>Linkage Storage Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.LinkageStorageSectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getLinkageStorageSection()
		 * @generated
		 */
		EClass LINKAGE_STORAGE_SECTION = eINSTANCE.getLinkageStorageSection();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.IOSectionImpl <em>IO Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.IOSectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getIOSection()
		 * @generated
		 */
		EClass IO_SECTION = eINSTANCE.getIOSection();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.ConfigurationSectionImpl <em>Configuration Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.ConfigurationSectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getConfigurationSection()
		 * @generated
		 */
		EClass CONFIGURATION_SECTION = eINSTANCE.getConfigurationSection();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.EnvironmentDivisionSectionImpl <em>Environment Division Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.EnvironmentDivisionSectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getEnvironmentDivisionSection()
		 * @generated
		 */
		EClass ENVIRONMENT_DIVISION_SECTION = eINSTANCE.getEnvironmentDivisionSection();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.DataDivisionSectionImpl <em>Data Division Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.DataDivisionSectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getDataDivisionSection()
		 * @generated
		 */
		EClass DATA_DIVISION_SECTION = eINSTANCE.getDataDivisionSection();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DIVISION_SECTION__STATEMENTS = eINSTANCE.getDataDivisionSection_Statements();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DIVISION_SECTION__RECORDS = eINSTANCE.getDataDivisionSection_Records();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.FileSectionImpl <em>File Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.FileSectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getFileSection()
		 * @generated
		 */
		EClass FILE_SECTION = eINSTANCE.getFileSection();

		/**
		 * The meta object literal for the '<em><b>File Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SECTION__FILE_DESCRIPTORS = eINSTANCE.getFileSection_FileDescriptors();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sections.impl.DeclarativeSectionImpl <em>Declarative Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sections.impl.DeclarativeSectionImpl
		 * @see org.servicifi.gelato.language.cobol.sections.impl.SectionsPackageImpl#getDeclarativeSection()
		 * @generated
		 */
		EClass DECLARATIVE_SECTION = eINSTANCE.getDeclarativeSection();

	}

} //SectionsPackage
