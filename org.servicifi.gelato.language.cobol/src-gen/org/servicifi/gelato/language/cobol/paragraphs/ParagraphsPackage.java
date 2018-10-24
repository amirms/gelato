/**
 */
package org.servicifi.gelato.language.cobol.paragraphs;

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
 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsFactory
 * @model kind="package"
 * @generated
 */
public interface ParagraphsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "paragraphs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/paragraphs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "paragraphs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParagraphsPackage eINSTANCE = org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__SENTENCES = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.ConfigurationSectionParagraphImpl <em>Configuration Section Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ConfigurationSectionParagraphImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getConfigurationSectionParagraph()
	 * @generated
	 */
	int CONFIGURATION_SECTION_PARAGRAPH = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SECTION_PARAGRAPH__NAME = PARAGRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SECTION_PARAGRAPH__SENTENCES = PARAGRAPH__SENTENCES;

	/**
	 * The number of structural features of the '<em>Configuration Section Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.SourceComputerParagraphImpl <em>Source Computer Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.SourceComputerParagraphImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getSourceComputerParagraph()
	 * @generated
	 */
	int SOURCE_COMPUTER_PARAGRAPH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COMPUTER_PARAGRAPH__NAME = CONFIGURATION_SECTION_PARAGRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COMPUTER_PARAGRAPH__SENTENCES = CONFIGURATION_SECTION_PARAGRAPH__SENTENCES;

	/**
	 * The feature id for the '<em><b>With Debugging Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE = CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Computer Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COMPUTER_PARAGRAPH_FEATURE_COUNT = CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.ObjectComputerParagraphImpl <em>Object Computer Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ObjectComputerParagraphImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getObjectComputerParagraph()
	 * @generated
	 */
	int OBJECT_COMPUTER_PARAGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPUTER_PARAGRAPH__NAME = CONFIGURATION_SECTION_PARAGRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPUTER_PARAGRAPH__SENTENCES = CONFIGURATION_SECTION_PARAGRAPH__SENTENCES;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPUTER_PARAGRAPH__WATER = CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Computer Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPUTER_PARAGRAPH_FEATURE_COUNT = CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.IOSectionParagraphImpl <em>IO Section Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.IOSectionParagraphImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getIOSectionParagraph()
	 * @generated
	 */
	int IO_SECTION_PARAGRAPH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SECTION_PARAGRAPH__NAME = PARAGRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SECTION_PARAGRAPH__SENTENCES = PARAGRAPH__SENTENCES;

	/**
	 * The number of structural features of the '<em>IO Section Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_SECTION_PARAGRAPH_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.FileControlParagraphImpl <em>File Control Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.FileControlParagraphImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getFileControlParagraph()
	 * @generated
	 */
	int FILE_CONTROL_PARAGRAPH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTROL_PARAGRAPH__NAME = IO_SECTION_PARAGRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTROL_PARAGRAPH__SENTENCES = IO_SECTION_PARAGRAPH__SENTENCES;

	/**
	 * The feature id for the '<em><b>Select Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS = IO_SECTION_PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Control Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTROL_PARAGRAPH_FEATURE_COUNT = IO_SECTION_PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.IOControlParagraphImpl <em>IO Control Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.IOControlParagraphImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getIOControlParagraph()
	 * @generated
	 */
	int IO_CONTROL_PARAGRAPH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_PARAGRAPH__NAME = IO_SECTION_PARAGRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_PARAGRAPH__SENTENCES = IO_SECTION_PARAGRAPH__SENTENCES;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_PARAGRAPH__WATER = IO_SECTION_PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IO Control Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_PARAGRAPH_FEATURE_COUNT = IO_SECTION_PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.SpecialNamesParagraphImpl <em>Special Names Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.SpecialNamesParagraphImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getSpecialNamesParagraph()
	 * @generated
	 */
	int SPECIAL_NAMES_PARAGRAPH = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_PARAGRAPH__NAME = CONFIGURATION_SECTION_PARAGRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_PARAGRAPH__SENTENCES = CONFIGURATION_SECTION_PARAGRAPH__SENTENCES;

	/**
	 * The feature id for the '<em><b>Special Name Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS = CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_PARAGRAPH__WATER = CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Special Names Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_PARAGRAPH_FEATURE_COUNT = CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.RepositoryParagraphImpl <em>Repository Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.RepositoryParagraphImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getRepositoryParagraph()
	 * @generated
	 */
	int REPOSITORY_PARAGRAPH = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PARAGRAPH__NAME = CONFIGURATION_SECTION_PARAGRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PARAGRAPH__SENTENCES = CONFIGURATION_SECTION_PARAGRAPH__SENTENCES;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PARAGRAPH__WATER = CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PARAGRAPH_FEATURE_COUNT = CONFIGURATION_SECTION_PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.DebuggingModeImpl <em>Debugging Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.DebuggingModeImpl
	 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getDebuggingMode()
	 * @generated
	 */
	int DEBUGGING_MODE = 9;

	/**
	 * The number of structural features of the '<em>Debugging Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGGING_MODE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.paragraphs.Paragraph#getSentences <em>Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentences</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.Paragraph#getSentences()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Sentences();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph <em>Source Computer Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Computer Paragraph</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph
	 * @generated
	 */
	EClass getSourceComputerParagraph();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph#getWithDebuggingMode <em>With Debugging Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>With Debugging Mode</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph#getWithDebuggingMode()
	 * @see #getSourceComputerParagraph()
	 * @generated
	 */
	EReference getSourceComputerParagraph_WithDebuggingMode();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph <em>Object Computer Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Computer Paragraph</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph
	 * @generated
	 */
	EClass getObjectComputerParagraph();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph <em>File Control Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Control Paragraph</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph
	 * @generated
	 */
	EClass getFileControlParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph#getSelectStatements <em>Select Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select Statements</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph#getSelectStatements()
	 * @see #getFileControlParagraph()
	 * @generated
	 */
	EReference getFileControlParagraph_SelectStatements();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph <em>IO Control Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Control Paragraph</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph
	 * @generated
	 */
	EClass getIOControlParagraph();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.ConfigurationSectionParagraph <em>Configuration Section Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Section Paragraph</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.ConfigurationSectionParagraph
	 * @generated
	 */
	EClass getConfigurationSectionParagraph();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.IOSectionParagraph <em>IO Section Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Section Paragraph</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.IOSectionParagraph
	 * @generated
	 */
	EClass getIOSectionParagraph();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph <em>Special Names Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Names Paragraph</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph
	 * @generated
	 */
	EClass getSpecialNamesParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph#getSpecialNameStatements <em>Special Name Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Special Name Statements</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph#getSpecialNameStatements()
	 * @see #getSpecialNamesParagraph()
	 * @generated
	 */
	EReference getSpecialNamesParagraph_SpecialNameStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph#getWater()
	 * @see #getSpecialNamesParagraph()
	 * @generated
	 */
	EReference getSpecialNamesParagraph_Water();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph <em>Repository Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Paragraph</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph
	 * @generated
	 */
	EClass getRepositoryParagraph();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode <em>Debugging Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debugging Mode</em>'.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode
	 * @generated
	 */
	EClass getDebuggingMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParagraphsFactory getParagraphsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__SENTENCES = eINSTANCE.getParagraph_Sentences();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.SourceComputerParagraphImpl <em>Source Computer Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.SourceComputerParagraphImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getSourceComputerParagraph()
		 * @generated
		 */
		EClass SOURCE_COMPUTER_PARAGRAPH = eINSTANCE.getSourceComputerParagraph();

		/**
		 * The meta object literal for the '<em><b>With Debugging Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE = eINSTANCE.getSourceComputerParagraph_WithDebuggingMode();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.ObjectComputerParagraphImpl <em>Object Computer Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ObjectComputerParagraphImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getObjectComputerParagraph()
		 * @generated
		 */
		EClass OBJECT_COMPUTER_PARAGRAPH = eINSTANCE.getObjectComputerParagraph();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.FileControlParagraphImpl <em>File Control Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.FileControlParagraphImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getFileControlParagraph()
		 * @generated
		 */
		EClass FILE_CONTROL_PARAGRAPH = eINSTANCE.getFileControlParagraph();

		/**
		 * The meta object literal for the '<em><b>Select Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS = eINSTANCE.getFileControlParagraph_SelectStatements();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.IOControlParagraphImpl <em>IO Control Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.IOControlParagraphImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getIOControlParagraph()
		 * @generated
		 */
		EClass IO_CONTROL_PARAGRAPH = eINSTANCE.getIOControlParagraph();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.ConfigurationSectionParagraphImpl <em>Configuration Section Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ConfigurationSectionParagraphImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getConfigurationSectionParagraph()
		 * @generated
		 */
		EClass CONFIGURATION_SECTION_PARAGRAPH = eINSTANCE.getConfigurationSectionParagraph();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.IOSectionParagraphImpl <em>IO Section Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.IOSectionParagraphImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getIOSectionParagraph()
		 * @generated
		 */
		EClass IO_SECTION_PARAGRAPH = eINSTANCE.getIOSectionParagraph();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.SpecialNamesParagraphImpl <em>Special Names Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.SpecialNamesParagraphImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getSpecialNamesParagraph()
		 * @generated
		 */
		EClass SPECIAL_NAMES_PARAGRAPH = eINSTANCE.getSpecialNamesParagraph();

		/**
		 * The meta object literal for the '<em><b>Special Name Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS = eINSTANCE.getSpecialNamesParagraph_SpecialNameStatements();

		/**
		 * The meta object literal for the '<em><b>Water</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_NAMES_PARAGRAPH__WATER = eINSTANCE.getSpecialNamesParagraph_Water();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.RepositoryParagraphImpl <em>Repository Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.RepositoryParagraphImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getRepositoryParagraph()
		 * @generated
		 */
		EClass REPOSITORY_PARAGRAPH = eINSTANCE.getRepositoryParagraph();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.paragraphs.impl.DebuggingModeImpl <em>Debugging Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.DebuggingModeImpl
		 * @see org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsPackageImpl#getDebuggingMode()
		 * @generated
		 */
		EClass DEBUGGING_MODE = eINSTANCE.getDebuggingMode();

	}

} //ParagraphsPackage
