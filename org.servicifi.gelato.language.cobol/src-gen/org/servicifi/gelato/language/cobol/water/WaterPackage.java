/**
 */
package org.servicifi.gelato.language.cobol.water;

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
 * @see org.servicifi.gelato.language.cobol.water.WaterFactory
 * @model kind="package"
 * @generated
 */
public interface WaterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "water";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/water";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "water";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WaterPackage eINSTANCE = org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.IncompleteElementImpl <em>Incomplete Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.IncompleteElementImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIncompleteElement()
	 * @generated
	 */
	int INCOMPLETE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPLETE_ELEMENT__WATER = 0;

	/**
	 * The number of structural features of the '<em>Incomplete Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPLETE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.WaterImpl <em>Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getWater()
	 * @generated
	 */
	int WATER = 2;

	/**
	 * The number of structural features of the '<em>Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.IdentificationDivisionWaterImpl <em>Identification Division Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.IdentificationDivisionWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIdentificationDivisionWater()
	 * @generated
	 */
	int IDENTIFICATION_DIVISION_WATER = 1;

	/**
	 * The number of structural features of the '<em>Identification Division Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DIVISION_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.ProgramDescriptionImpl <em>Program Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.ProgramDescriptionImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getProgramDescription()
	 * @generated
	 */
	int PROGRAM_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DESCRIPTION__VALUE = IDENTIFICATION_DIVISION_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DESCRIPTION_FEATURE_COUNT = IDENTIFICATION_DIVISION_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.DotImpl <em>Dot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.DotImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getDot()
	 * @generated
	 */
	int DOT = 4;

	/**
	 * The number of structural features of the '<em>Dot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_FEATURE_COUNT = IDENTIFICATION_DIVISION_WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.ObjectComputerParagraphWaterImpl <em>Object Computer Paragraph Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.ObjectComputerParagraphWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getObjectComputerParagraphWater()
	 * @generated
	 */
	int OBJECT_COMPUTER_PARAGRAPH_WATER = 5;

	/**
	 * The number of structural features of the '<em>Object Computer Paragraph Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPUTER_PARAGRAPH_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.ObjectComputerDescriptionImpl <em>Object Computer Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.ObjectComputerDescriptionImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getObjectComputerDescription()
	 * @generated
	 */
	int OBJECT_COMPUTER_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPUTER_DESCRIPTION__VALUE = OBJECT_COMPUTER_PARAGRAPH_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Computer Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPUTER_DESCRIPTION_FEATURE_COUNT = OBJECT_COMPUTER_PARAGRAPH_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.PriorityNumberImpl <em>Priority Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.PriorityNumberImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getPriorityNumber()
	 * @generated
	 */
	int PRIORITY_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_NUMBER__VALUE = OBJECT_COMPUTER_PARAGRAPH_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Priority Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_NUMBER_FEATURE_COUNT = OBJECT_COMPUTER_PARAGRAPH_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.SelectStatementWaterImpl <em>Select Statement Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.SelectStatementWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSelectStatementWater()
	 * @generated
	 */
	int SELECT_STATEMENT_WATER = 8;

	/**
	 * The number of structural features of the '<em>Select Statement Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_STATEMENT_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.SelectStatementClauseImpl <em>Select Statement Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.SelectStatementClauseImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSelectStatementClause()
	 * @generated
	 */
	int SELECT_STATEMENT_CLAUSE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_STATEMENT_CLAUSE__VALUE = SELECT_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Statement Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_STATEMENT_CLAUSE_FEATURE_COUNT = SELECT_STATEMENT_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.SpecialNamesParagraphWaterImpl <em>Special Names Paragraph Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.SpecialNamesParagraphWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSpecialNamesParagraphWater()
	 * @generated
	 */
	int SPECIAL_NAMES_PARAGRAPH_WATER = 10;

	/**
	 * The number of structural features of the '<em>Special Names Paragraph Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_PARAGRAPH_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.SpecialNamesClauseImpl <em>Special Names Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.SpecialNamesClauseImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSpecialNamesClause()
	 * @generated
	 */
	int SPECIAL_NAMES_CLAUSE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_CLAUSE__VALUE = SPECIAL_NAMES_PARAGRAPH_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Special Names Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_NAMES_CLAUSE_FEATURE_COUNT = SPECIAL_NAMES_PARAGRAPH_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.FileDescriptorWaterImpl <em>File Descriptor Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.FileDescriptorWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getFileDescriptorWater()
	 * @generated
	 */
	int FILE_DESCRIPTOR_WATER = 12;

	/**
	 * The number of structural features of the '<em>File Descriptor Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTOR_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.FileDescriptionImpl <em>File Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.FileDescriptionImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getFileDescription()
	 * @generated
	 */
	int FILE_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTION__VALUE = FILE_DESCRIPTOR_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTION_FEATURE_COUNT = FILE_DESCRIPTOR_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.DataDescriptorWaterImpl <em>Data Descriptor Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.DataDescriptorWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getDataDescriptorWater()
	 * @generated
	 */
	int DATA_DESCRIPTOR_WATER = 14;

	/**
	 * The number of structural features of the '<em>Data Descriptor Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTOR_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.DataDescriptionImpl <em>Data Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.DataDescriptionImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getDataDescription()
	 * @generated
	 */
	int DATA_DESCRIPTION = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION__VALUE = DATA_DESCRIPTOR_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION_FEATURE_COUNT = DATA_DESCRIPTOR_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.IOControlParagraphWaterImpl <em>IO Control Paragraph Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.IOControlParagraphWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIOControlParagraphWater()
	 * @generated
	 */
	int IO_CONTROL_PARAGRAPH_WATER = 16;

	/**
	 * The number of structural features of the '<em>IO Control Paragraph Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_PARAGRAPH_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.IOControlDescriptionImpl <em>IO Control Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.IOControlDescriptionImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIOControlDescription()
	 * @generated
	 */
	int IO_CONTROL_DESCRIPTION = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_DESCRIPTION__VALUE = IO_CONTROL_PARAGRAPH_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IO Control Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_DESCRIPTION_FEATURE_COUNT = IO_CONTROL_PARAGRAPH_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.RepositoryParagraphWaterImpl <em>Repository Paragraph Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.RepositoryParagraphWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getRepositoryParagraphWater()
	 * @generated
	 */
	int REPOSITORY_PARAGRAPH_WATER = 18;

	/**
	 * The number of structural features of the '<em>Repository Paragraph Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PARAGRAPH_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.RepositoryDescriptionImpl <em>Repository Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.RepositoryDescriptionImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getRepositoryDescription()
	 * @generated
	 */
	int REPOSITORY_DESCRIPTION = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DESCRIPTION__VALUE = REPOSITORY_PARAGRAPH_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DESCRIPTION_FEATURE_COUNT = REPOSITORY_PARAGRAPH_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.SQLStatementWaterImpl <em>SQL Statement Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.SQLStatementWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSQLStatementWater()
	 * @generated
	 */
	int SQL_STATEMENT_WATER = 20;

	/**
	 * The number of structural features of the '<em>SQL Statement Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.CICSStatementWaterImpl <em>CICS Statement Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.CICSStatementWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCICSStatementWater()
	 * @generated
	 */
	int CICS_STATEMENT_WATER = 21;

	/**
	 * The number of structural features of the '<em>CICS Statement Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICS_STATEMENT_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.SQLStatementTokenImpl <em>SQL Statement Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.SQLStatementTokenImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSQLStatementToken()
	 * @generated
	 */
	int SQL_STATEMENT_TOKEN = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT_TOKEN__VALUE = SQL_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SQL Statement Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT_TOKEN_FEATURE_COUNT = SQL_STATEMENT_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.CICSStatementTokenImpl <em>CICS Statement Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.CICSStatementTokenImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCICSStatementToken()
	 * @generated
	 */
	int CICS_STATEMENT_TOKEN = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICS_STATEMENT_TOKEN__VALUE = CICS_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CICS Statement Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICS_STATEMENT_TOKEN_FEATURE_COUNT = CICS_STATEMENT_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.AcceptStatementWaterImpl <em>Accept Statement Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.AcceptStatementWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getAcceptStatementWater()
	 * @generated
	 */
	int ACCEPT_STATEMENT_WATER = 24;

	/**
	 * The number of structural features of the '<em>Accept Statement Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_STATEMENT_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.AcceptStatementTokenImpl <em>Accept Statement Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.AcceptStatementTokenImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getAcceptStatementToken()
	 * @generated
	 */
	int ACCEPT_STATEMENT_TOKEN = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_STATEMENT_TOKEN__VALUE = ACCEPT_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accept Statement Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_STATEMENT_TOKEN_FEATURE_COUNT = ACCEPT_STATEMENT_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.UseStatementWaterImpl <em>Use Statement Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.UseStatementWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getUseStatementWater()
	 * @generated
	 */
	int USE_STATEMENT_WATER = 26;

	/**
	 * The number of structural features of the '<em>Use Statement Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_STATEMENT_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.UseStatementTokenImpl <em>Use Statement Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.UseStatementTokenImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getUseStatementToken()
	 * @generated
	 */
	int USE_STATEMENT_TOKEN = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_STATEMENT_TOKEN__VALUE = USE_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Use Statement Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_STATEMENT_TOKEN_FEATURE_COUNT = USE_STATEMENT_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.CloseStatementWaterImpl <em>Close Statement Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.CloseStatementWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCloseStatementWater()
	 * @generated
	 */
	int CLOSE_STATEMENT_WATER = 28;

	/**
	 * The number of structural features of the '<em>Close Statement Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_STATEMENT_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.CloseStatementTokenImpl <em>Close Statement Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.CloseStatementTokenImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCloseStatementToken()
	 * @generated
	 */
	int CLOSE_STATEMENT_TOKEN = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_STATEMENT_TOKEN__VALUE = CLOSE_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Close Statement Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_STATEMENT_TOKEN_FEATURE_COUNT = CLOSE_STATEMENT_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.InvokeStatementWaterImpl <em>Invoke Statement Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.InvokeStatementWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getInvokeStatementWater()
	 * @generated
	 */
	int INVOKE_STATEMENT_WATER = 30;

	/**
	 * The number of structural features of the '<em>Invoke Statement Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_STATEMENT_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.InvokeStatementTokenImpl <em>Invoke Statement Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.InvokeStatementTokenImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getInvokeStatementToken()
	 * @generated
	 */
	int INVOKE_STATEMENT_TOKEN = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_STATEMENT_TOKEN__VALUE = INVOKE_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invoke Statement Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_STATEMENT_TOKEN_FEATURE_COUNT = INVOKE_STATEMENT_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.OpenStatementWaterImpl <em>Open Statement Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.OpenStatementWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getOpenStatementWater()
	 * @generated
	 */
	int OPEN_STATEMENT_WATER = 32;

	/**
	 * The number of structural features of the '<em>Open Statement Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STATEMENT_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.OpenStatementTokenImpl <em>Open Statement Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.OpenStatementTokenImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getOpenStatementToken()
	 * @generated
	 */
	int OPEN_STATEMENT_TOKEN = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STATEMENT_TOKEN__VALUE = OPEN_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Statement Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STATEMENT_TOKEN_FEATURE_COUNT = OPEN_STATEMENT_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.SortPhraseWaterImpl <em>Sort Phrase Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.SortPhraseWaterImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSortPhraseWater()
	 * @generated
	 */
	int SORT_PHRASE_WATER = 35;

	/**
	 * The number of structural features of the '<em>Sort Phrase Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_PHRASE_WATER_FEATURE_COUNT = WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.impl.SortPhraseTokenImpl <em>Sort Phrase Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.impl.SortPhraseTokenImpl
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSortPhraseToken()
	 * @generated
	 */
	int SORT_PHRASE_TOKEN = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_PHRASE_TOKEN__VALUE = SORT_PHRASE_WATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sort Phrase Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_PHRASE_TOKEN_FEATURE_COUNT = SORT_PHRASE_WATER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo <em>Program Description Info</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getProgramDescriptionInfo()
	 * @generated
	 */
	int PROGRAM_DESCRIPTION_INFO = 36;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo <em>Object Computer Description Info</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getObjectComputerDescriptionInfo()
	 * @generated
	 */
	int OBJECT_COMPUTER_DESCRIPTION_INFO = 37;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.SelectStatementClauses <em>Select Statement Clauses</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.SelectStatementClauses
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSelectStatementClauses()
	 * @generated
	 */
	int SELECT_STATEMENT_CLAUSES = 38;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.SpecialNamesClauses <em>Special Names Clauses</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesClauses
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSpecialNamesClauses()
	 * @generated
	 */
	int SPECIAL_NAMES_CLAUSES = 39;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.FileDescriptionInfo <em>File Description Info</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.FileDescriptionInfo
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getFileDescriptionInfo()
	 * @generated
	 */
	int FILE_DESCRIPTION_INFO = 40;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.DataDescriptionInfo <em>Data Description Info</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.DataDescriptionInfo
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getDataDescriptionInfo()
	 * @generated
	 */
	int DATA_DESCRIPTION_INFO = 41;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo <em>IO Control Description Info</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIOControlDescriptionInfo()
	 * @generated
	 */
	int IO_CONTROL_DESCRIPTION_INFO = 42;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.RepositoryDescriptionInfo <em>Repository Description Info</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.RepositoryDescriptionInfo
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getRepositoryDescriptionInfo()
	 * @generated
	 */
	int REPOSITORY_DESCRIPTION_INFO = 43;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.CICSStatementTokens <em>CICS Statement Tokens</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.CICSStatementTokens
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCICSStatementTokens()
	 * @generated
	 */
	int CICS_STATEMENT_TOKENS = 44;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.SQLStatementTokens <em>SQL Statement Tokens</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.SQLStatementTokens
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSQLStatementTokens()
	 * @generated
	 */
	int SQL_STATEMENT_TOKENS = 45;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.AcceptStatementTokens <em>Accept Statement Tokens</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.AcceptStatementTokens
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getAcceptStatementTokens()
	 * @generated
	 */
	int ACCEPT_STATEMENT_TOKENS = 46;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.UseStatementTokens <em>Use Statement Tokens</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.UseStatementTokens
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getUseStatementTokens()
	 * @generated
	 */
	int USE_STATEMENT_TOKENS = 47;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.CloseStatementTokens <em>Close Statement Tokens</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.CloseStatementTokens
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCloseStatementTokens()
	 * @generated
	 */
	int CLOSE_STATEMENT_TOKENS = 48;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.InvokeStatementTokens <em>Invoke Statement Tokens</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.InvokeStatementTokens
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getInvokeStatementTokens()
	 * @generated
	 */
	int INVOKE_STATEMENT_TOKENS = 49;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.OpenStatementTokens <em>Open Statement Tokens</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.OpenStatementTokens
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getOpenStatementTokens()
	 * @generated
	 */
	int OPEN_STATEMENT_TOKENS = 50;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.water.SortPhraseTokens <em>Sort Phrase Tokens</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.water.SortPhraseTokens
	 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSortPhraseTokens()
	 * @generated
	 */
	int SORT_PHRASE_TOKENS = 51;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.IncompleteElement <em>Incomplete Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incomplete Element</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.IncompleteElement
	 * @generated
	 */
	EClass getIncompleteElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.water.IncompleteElement#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.IncompleteElement#getWater()
	 * @see #getIncompleteElement()
	 * @generated
	 */
	EReference getIncompleteElement_Water();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater <em>Identification Division Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification Division Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater
	 * @generated
	 */
	EClass getIdentificationDivisionWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.Water <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.Water
	 * @generated
	 */
	EClass getWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.ProgramDescription <em>Program Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Description</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.ProgramDescription
	 * @generated
	 */
	EClass getProgramDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.ProgramDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.ProgramDescription#getValue()
	 * @see #getProgramDescription()
	 * @generated
	 */
	EAttribute getProgramDescription_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.Dot <em>Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.Dot
	 * @generated
	 */
	EClass getDot();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater <em>Object Computer Paragraph Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Computer Paragraph Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater
	 * @generated
	 */
	EClass getObjectComputerParagraphWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.ObjectComputerDescription <em>Object Computer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Computer Description</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerDescription
	 * @generated
	 */
	EClass getObjectComputerDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.ObjectComputerDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerDescription#getValue()
	 * @see #getObjectComputerDescription()
	 * @generated
	 */
	EAttribute getObjectComputerDescription_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.PriorityNumber <em>Priority Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Number</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.PriorityNumber
	 * @generated
	 */
	EClass getPriorityNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.PriorityNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.PriorityNumber#getValue()
	 * @see #getPriorityNumber()
	 * @generated
	 */
	EAttribute getPriorityNumber_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.SelectStatementWater <em>Select Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Statement Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SelectStatementWater
	 * @generated
	 */
	EClass getSelectStatementWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.SelectStatementClause <em>Select Statement Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Statement Clause</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SelectStatementClause
	 * @generated
	 */
	EClass getSelectStatementClause();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.SelectStatementClause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SelectStatementClause#getValue()
	 * @see #getSelectStatementClause()
	 * @generated
	 */
	EAttribute getSelectStatementClause_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater <em>Special Names Paragraph Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Names Paragraph Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater
	 * @generated
	 */
	EClass getSpecialNamesParagraphWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.SpecialNamesClause <em>Special Names Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Names Clause</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesClause
	 * @generated
	 */
	EClass getSpecialNamesClause();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.SpecialNamesClause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesClause#getValue()
	 * @see #getSpecialNamesClause()
	 * @generated
	 */
	EAttribute getSpecialNamesClause_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.FileDescriptorWater <em>File Descriptor Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Descriptor Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.FileDescriptorWater
	 * @generated
	 */
	EClass getFileDescriptorWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.FileDescription <em>File Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Description</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.FileDescription
	 * @generated
	 */
	EClass getFileDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.FileDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.FileDescription#getValue()
	 * @see #getFileDescription()
	 * @generated
	 */
	EAttribute getFileDescription_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.DataDescriptorWater <em>Data Descriptor Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Descriptor Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.DataDescriptorWater
	 * @generated
	 */
	EClass getDataDescriptorWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.DataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Description</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.DataDescription
	 * @generated
	 */
	EClass getDataDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.DataDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.DataDescription#getValue()
	 * @see #getDataDescription()
	 * @generated
	 */
	EAttribute getDataDescription_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.IOControlParagraphWater <em>IO Control Paragraph Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Control Paragraph Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.IOControlParagraphWater
	 * @generated
	 */
	EClass getIOControlParagraphWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.IOControlDescription <em>IO Control Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Control Description</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.IOControlDescription
	 * @generated
	 */
	EClass getIOControlDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.IOControlDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.IOControlDescription#getValue()
	 * @see #getIOControlDescription()
	 * @generated
	 */
	EAttribute getIOControlDescription_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater <em>Repository Paragraph Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Paragraph Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater
	 * @generated
	 */
	EClass getRepositoryParagraphWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.RepositoryDescription <em>Repository Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Description</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.RepositoryDescription
	 * @generated
	 */
	EClass getRepositoryDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.RepositoryDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.RepositoryDescription#getValue()
	 * @see #getRepositoryDescription()
	 * @generated
	 */
	EAttribute getRepositoryDescription_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.SQLStatementWater <em>SQL Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Statement Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SQLStatementWater
	 * @generated
	 */
	EClass getSQLStatementWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.CICSStatementWater <em>CICS Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CICS Statement Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.CICSStatementWater
	 * @generated
	 */
	EClass getCICSStatementWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.SQLStatementToken <em>SQL Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Statement Token</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SQLStatementToken
	 * @generated
	 */
	EClass getSQLStatementToken();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.SQLStatementToken#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SQLStatementToken#getValue()
	 * @see #getSQLStatementToken()
	 * @generated
	 */
	EAttribute getSQLStatementToken_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.CICSStatementToken <em>CICS Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CICS Statement Token</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.CICSStatementToken
	 * @generated
	 */
	EClass getCICSStatementToken();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.CICSStatementToken#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.CICSStatementToken#getValue()
	 * @see #getCICSStatementToken()
	 * @generated
	 */
	EAttribute getCICSStatementToken_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.AcceptStatementWater <em>Accept Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Statement Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.AcceptStatementWater
	 * @generated
	 */
	EClass getAcceptStatementWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.AcceptStatementToken <em>Accept Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Statement Token</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.AcceptStatementToken
	 * @generated
	 */
	EClass getAcceptStatementToken();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.AcceptStatementToken#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.AcceptStatementToken#getValue()
	 * @see #getAcceptStatementToken()
	 * @generated
	 */
	EAttribute getAcceptStatementToken_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.UseStatementWater <em>Use Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Statement Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.UseStatementWater
	 * @generated
	 */
	EClass getUseStatementWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.UseStatementToken <em>Use Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Statement Token</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.UseStatementToken
	 * @generated
	 */
	EClass getUseStatementToken();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.UseStatementToken#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.UseStatementToken#getValue()
	 * @see #getUseStatementToken()
	 * @generated
	 */
	EAttribute getUseStatementToken_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.CloseStatementWater <em>Close Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Statement Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.CloseStatementWater
	 * @generated
	 */
	EClass getCloseStatementWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.CloseStatementToken <em>Close Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Statement Token</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.CloseStatementToken
	 * @generated
	 */
	EClass getCloseStatementToken();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.CloseStatementToken#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.CloseStatementToken#getValue()
	 * @see #getCloseStatementToken()
	 * @generated
	 */
	EAttribute getCloseStatementToken_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.InvokeStatementWater <em>Invoke Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Statement Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.InvokeStatementWater
	 * @generated
	 */
	EClass getInvokeStatementWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.InvokeStatementToken <em>Invoke Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Statement Token</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.InvokeStatementToken
	 * @generated
	 */
	EClass getInvokeStatementToken();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.InvokeStatementToken#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.InvokeStatementToken#getValue()
	 * @see #getInvokeStatementToken()
	 * @generated
	 */
	EAttribute getInvokeStatementToken_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.OpenStatementWater <em>Open Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Statement Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.OpenStatementWater
	 * @generated
	 */
	EClass getOpenStatementWater();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.OpenStatementToken <em>Open Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Statement Token</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.OpenStatementToken
	 * @generated
	 */
	EClass getOpenStatementToken();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.OpenStatementToken#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.OpenStatementToken#getValue()
	 * @see #getOpenStatementToken()
	 * @generated
	 */
	EAttribute getOpenStatementToken_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.SortPhraseToken <em>Sort Phrase Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Phrase Token</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SortPhraseToken
	 * @generated
	 */
	EClass getSortPhraseToken();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.water.SortPhraseToken#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SortPhraseToken#getValue()
	 * @see #getSortPhraseToken()
	 * @generated
	 */
	EAttribute getSortPhraseToken_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.water.SortPhraseWater <em>Sort Phrase Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Phrase Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SortPhraseWater
	 * @generated
	 */
	EClass getSortPhraseWater();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo <em>Program Description Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Program Description Info</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo
	 * @generated
	 */
	EEnum getProgramDescriptionInfo();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo <em>Object Computer Description Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Computer Description Info</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo
	 * @generated
	 */
	EEnum getObjectComputerDescriptionInfo();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.SelectStatementClauses <em>Select Statement Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Select Statement Clauses</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SelectStatementClauses
	 * @generated
	 */
	EEnum getSelectStatementClauses();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.SpecialNamesClauses <em>Special Names Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Names Clauses</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesClauses
	 * @generated
	 */
	EEnum getSpecialNamesClauses();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.FileDescriptionInfo <em>File Description Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Description Info</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.FileDescriptionInfo
	 * @generated
	 */
	EEnum getFileDescriptionInfo();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.DataDescriptionInfo <em>Data Description Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Description Info</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.DataDescriptionInfo
	 * @generated
	 */
	EEnum getDataDescriptionInfo();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo <em>IO Control Description Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Control Description Info</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo
	 * @generated
	 */
	EEnum getIOControlDescriptionInfo();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.RepositoryDescriptionInfo <em>Repository Description Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repository Description Info</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.RepositoryDescriptionInfo
	 * @generated
	 */
	EEnum getRepositoryDescriptionInfo();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.CICSStatementTokens <em>CICS Statement Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CICS Statement Tokens</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.CICSStatementTokens
	 * @generated
	 */
	EEnum getCICSStatementTokens();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.SQLStatementTokens <em>SQL Statement Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SQL Statement Tokens</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SQLStatementTokens
	 * @generated
	 */
	EEnum getSQLStatementTokens();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.AcceptStatementTokens <em>Accept Statement Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accept Statement Tokens</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.AcceptStatementTokens
	 * @generated
	 */
	EEnum getAcceptStatementTokens();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.UseStatementTokens <em>Use Statement Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Use Statement Tokens</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.UseStatementTokens
	 * @generated
	 */
	EEnum getUseStatementTokens();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.CloseStatementTokens <em>Close Statement Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Close Statement Tokens</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.CloseStatementTokens
	 * @generated
	 */
	EEnum getCloseStatementTokens();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.InvokeStatementTokens <em>Invoke Statement Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Invoke Statement Tokens</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.InvokeStatementTokens
	 * @generated
	 */
	EEnum getInvokeStatementTokens();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.OpenStatementTokens <em>Open Statement Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Open Statement Tokens</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.OpenStatementTokens
	 * @generated
	 */
	EEnum getOpenStatementTokens();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.water.SortPhraseTokens <em>Sort Phrase Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Phrase Tokens</em>'.
	 * @see org.servicifi.gelato.language.cobol.water.SortPhraseTokens
	 * @generated
	 */
	EEnum getSortPhraseTokens();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WaterFactory getWaterFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.IncompleteElementImpl <em>Incomplete Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.IncompleteElementImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIncompleteElement()
		 * @generated
		 */
		EClass INCOMPLETE_ELEMENT = eINSTANCE.getIncompleteElement();

		/**
		 * The meta object literal for the '<em><b>Water</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMPLETE_ELEMENT__WATER = eINSTANCE.getIncompleteElement_Water();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.IdentificationDivisionWaterImpl <em>Identification Division Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.IdentificationDivisionWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIdentificationDivisionWater()
		 * @generated
		 */
		EClass IDENTIFICATION_DIVISION_WATER = eINSTANCE.getIdentificationDivisionWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.WaterImpl <em>Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getWater()
		 * @generated
		 */
		EClass WATER = eINSTANCE.getWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.ProgramDescriptionImpl <em>Program Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.ProgramDescriptionImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getProgramDescription()
		 * @generated
		 */
		EClass PROGRAM_DESCRIPTION = eINSTANCE.getProgramDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_DESCRIPTION__VALUE = eINSTANCE.getProgramDescription_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.DotImpl <em>Dot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.DotImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getDot()
		 * @generated
		 */
		EClass DOT = eINSTANCE.getDot();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.ObjectComputerParagraphWaterImpl <em>Object Computer Paragraph Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.ObjectComputerParagraphWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getObjectComputerParagraphWater()
		 * @generated
		 */
		EClass OBJECT_COMPUTER_PARAGRAPH_WATER = eINSTANCE.getObjectComputerParagraphWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.ObjectComputerDescriptionImpl <em>Object Computer Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.ObjectComputerDescriptionImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getObjectComputerDescription()
		 * @generated
		 */
		EClass OBJECT_COMPUTER_DESCRIPTION = eINSTANCE.getObjectComputerDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_COMPUTER_DESCRIPTION__VALUE = eINSTANCE.getObjectComputerDescription_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.PriorityNumberImpl <em>Priority Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.PriorityNumberImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getPriorityNumber()
		 * @generated
		 */
		EClass PRIORITY_NUMBER = eINSTANCE.getPriorityNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_NUMBER__VALUE = eINSTANCE.getPriorityNumber_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.SelectStatementWaterImpl <em>Select Statement Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.SelectStatementWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSelectStatementWater()
		 * @generated
		 */
		EClass SELECT_STATEMENT_WATER = eINSTANCE.getSelectStatementWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.SelectStatementClauseImpl <em>Select Statement Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.SelectStatementClauseImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSelectStatementClause()
		 * @generated
		 */
		EClass SELECT_STATEMENT_CLAUSE = eINSTANCE.getSelectStatementClause();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_STATEMENT_CLAUSE__VALUE = eINSTANCE.getSelectStatementClause_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.SpecialNamesParagraphWaterImpl <em>Special Names Paragraph Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.SpecialNamesParagraphWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSpecialNamesParagraphWater()
		 * @generated
		 */
		EClass SPECIAL_NAMES_PARAGRAPH_WATER = eINSTANCE.getSpecialNamesParagraphWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.SpecialNamesClauseImpl <em>Special Names Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.SpecialNamesClauseImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSpecialNamesClause()
		 * @generated
		 */
		EClass SPECIAL_NAMES_CLAUSE = eINSTANCE.getSpecialNamesClause();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_NAMES_CLAUSE__VALUE = eINSTANCE.getSpecialNamesClause_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.FileDescriptorWaterImpl <em>File Descriptor Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.FileDescriptorWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getFileDescriptorWater()
		 * @generated
		 */
		EClass FILE_DESCRIPTOR_WATER = eINSTANCE.getFileDescriptorWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.FileDescriptionImpl <em>File Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.FileDescriptionImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getFileDescription()
		 * @generated
		 */
		EClass FILE_DESCRIPTION = eINSTANCE.getFileDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_DESCRIPTION__VALUE = eINSTANCE.getFileDescription_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.DataDescriptorWaterImpl <em>Data Descriptor Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.DataDescriptorWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getDataDescriptorWater()
		 * @generated
		 */
		EClass DATA_DESCRIPTOR_WATER = eINSTANCE.getDataDescriptorWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.DataDescriptionImpl <em>Data Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.DataDescriptionImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getDataDescription()
		 * @generated
		 */
		EClass DATA_DESCRIPTION = eINSTANCE.getDataDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DESCRIPTION__VALUE = eINSTANCE.getDataDescription_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.IOControlParagraphWaterImpl <em>IO Control Paragraph Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.IOControlParagraphWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIOControlParagraphWater()
		 * @generated
		 */
		EClass IO_CONTROL_PARAGRAPH_WATER = eINSTANCE.getIOControlParagraphWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.IOControlDescriptionImpl <em>IO Control Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.IOControlDescriptionImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIOControlDescription()
		 * @generated
		 */
		EClass IO_CONTROL_DESCRIPTION = eINSTANCE.getIOControlDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_CONTROL_DESCRIPTION__VALUE = eINSTANCE.getIOControlDescription_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.RepositoryParagraphWaterImpl <em>Repository Paragraph Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.RepositoryParagraphWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getRepositoryParagraphWater()
		 * @generated
		 */
		EClass REPOSITORY_PARAGRAPH_WATER = eINSTANCE.getRepositoryParagraphWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.RepositoryDescriptionImpl <em>Repository Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.RepositoryDescriptionImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getRepositoryDescription()
		 * @generated
		 */
		EClass REPOSITORY_DESCRIPTION = eINSTANCE.getRepositoryDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DESCRIPTION__VALUE = eINSTANCE.getRepositoryDescription_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.SQLStatementWaterImpl <em>SQL Statement Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.SQLStatementWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSQLStatementWater()
		 * @generated
		 */
		EClass SQL_STATEMENT_WATER = eINSTANCE.getSQLStatementWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.CICSStatementWaterImpl <em>CICS Statement Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.CICSStatementWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCICSStatementWater()
		 * @generated
		 */
		EClass CICS_STATEMENT_WATER = eINSTANCE.getCICSStatementWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.SQLStatementTokenImpl <em>SQL Statement Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.SQLStatementTokenImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSQLStatementToken()
		 * @generated
		 */
		EClass SQL_STATEMENT_TOKEN = eINSTANCE.getSQLStatementToken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_STATEMENT_TOKEN__VALUE = eINSTANCE.getSQLStatementToken_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.CICSStatementTokenImpl <em>CICS Statement Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.CICSStatementTokenImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCICSStatementToken()
		 * @generated
		 */
		EClass CICS_STATEMENT_TOKEN = eINSTANCE.getCICSStatementToken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CICS_STATEMENT_TOKEN__VALUE = eINSTANCE.getCICSStatementToken_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.AcceptStatementWaterImpl <em>Accept Statement Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.AcceptStatementWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getAcceptStatementWater()
		 * @generated
		 */
		EClass ACCEPT_STATEMENT_WATER = eINSTANCE.getAcceptStatementWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.AcceptStatementTokenImpl <em>Accept Statement Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.AcceptStatementTokenImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getAcceptStatementToken()
		 * @generated
		 */
		EClass ACCEPT_STATEMENT_TOKEN = eINSTANCE.getAcceptStatementToken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_STATEMENT_TOKEN__VALUE = eINSTANCE.getAcceptStatementToken_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.UseStatementWaterImpl <em>Use Statement Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.UseStatementWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getUseStatementWater()
		 * @generated
		 */
		EClass USE_STATEMENT_WATER = eINSTANCE.getUseStatementWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.UseStatementTokenImpl <em>Use Statement Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.UseStatementTokenImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getUseStatementToken()
		 * @generated
		 */
		EClass USE_STATEMENT_TOKEN = eINSTANCE.getUseStatementToken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_STATEMENT_TOKEN__VALUE = eINSTANCE.getUseStatementToken_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.CloseStatementWaterImpl <em>Close Statement Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.CloseStatementWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCloseStatementWater()
		 * @generated
		 */
		EClass CLOSE_STATEMENT_WATER = eINSTANCE.getCloseStatementWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.CloseStatementTokenImpl <em>Close Statement Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.CloseStatementTokenImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCloseStatementToken()
		 * @generated
		 */
		EClass CLOSE_STATEMENT_TOKEN = eINSTANCE.getCloseStatementToken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSE_STATEMENT_TOKEN__VALUE = eINSTANCE.getCloseStatementToken_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.InvokeStatementWaterImpl <em>Invoke Statement Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.InvokeStatementWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getInvokeStatementWater()
		 * @generated
		 */
		EClass INVOKE_STATEMENT_WATER = eINSTANCE.getInvokeStatementWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.InvokeStatementTokenImpl <em>Invoke Statement Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.InvokeStatementTokenImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getInvokeStatementToken()
		 * @generated
		 */
		EClass INVOKE_STATEMENT_TOKEN = eINSTANCE.getInvokeStatementToken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_STATEMENT_TOKEN__VALUE = eINSTANCE.getInvokeStatementToken_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.OpenStatementWaterImpl <em>Open Statement Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.OpenStatementWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getOpenStatementWater()
		 * @generated
		 */
		EClass OPEN_STATEMENT_WATER = eINSTANCE.getOpenStatementWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.OpenStatementTokenImpl <em>Open Statement Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.OpenStatementTokenImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getOpenStatementToken()
		 * @generated
		 */
		EClass OPEN_STATEMENT_TOKEN = eINSTANCE.getOpenStatementToken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STATEMENT_TOKEN__VALUE = eINSTANCE.getOpenStatementToken_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.SortPhraseTokenImpl <em>Sort Phrase Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.SortPhraseTokenImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSortPhraseToken()
		 * @generated
		 */
		EClass SORT_PHRASE_TOKEN = eINSTANCE.getSortPhraseToken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_PHRASE_TOKEN__VALUE = eINSTANCE.getSortPhraseToken_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.impl.SortPhraseWaterImpl <em>Sort Phrase Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.impl.SortPhraseWaterImpl
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSortPhraseWater()
		 * @generated
		 */
		EClass SORT_PHRASE_WATER = eINSTANCE.getSortPhraseWater();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo <em>Program Description Info</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getProgramDescriptionInfo()
		 * @generated
		 */
		EEnum PROGRAM_DESCRIPTION_INFO = eINSTANCE.getProgramDescriptionInfo();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo <em>Object Computer Description Info</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getObjectComputerDescriptionInfo()
		 * @generated
		 */
		EEnum OBJECT_COMPUTER_DESCRIPTION_INFO = eINSTANCE.getObjectComputerDescriptionInfo();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.SelectStatementClauses <em>Select Statement Clauses</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.SelectStatementClauses
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSelectStatementClauses()
		 * @generated
		 */
		EEnum SELECT_STATEMENT_CLAUSES = eINSTANCE.getSelectStatementClauses();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.SpecialNamesClauses <em>Special Names Clauses</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesClauses
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSpecialNamesClauses()
		 * @generated
		 */
		EEnum SPECIAL_NAMES_CLAUSES = eINSTANCE.getSpecialNamesClauses();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.FileDescriptionInfo <em>File Description Info</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.FileDescriptionInfo
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getFileDescriptionInfo()
		 * @generated
		 */
		EEnum FILE_DESCRIPTION_INFO = eINSTANCE.getFileDescriptionInfo();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.DataDescriptionInfo <em>Data Description Info</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.DataDescriptionInfo
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getDataDescriptionInfo()
		 * @generated
		 */
		EEnum DATA_DESCRIPTION_INFO = eINSTANCE.getDataDescriptionInfo();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo <em>IO Control Description Info</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getIOControlDescriptionInfo()
		 * @generated
		 */
		EEnum IO_CONTROL_DESCRIPTION_INFO = eINSTANCE.getIOControlDescriptionInfo();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.RepositoryDescriptionInfo <em>Repository Description Info</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.RepositoryDescriptionInfo
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getRepositoryDescriptionInfo()
		 * @generated
		 */
		EEnum REPOSITORY_DESCRIPTION_INFO = eINSTANCE.getRepositoryDescriptionInfo();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.CICSStatementTokens <em>CICS Statement Tokens</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.CICSStatementTokens
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCICSStatementTokens()
		 * @generated
		 */
		EEnum CICS_STATEMENT_TOKENS = eINSTANCE.getCICSStatementTokens();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.SQLStatementTokens <em>SQL Statement Tokens</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.SQLStatementTokens
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSQLStatementTokens()
		 * @generated
		 */
		EEnum SQL_STATEMENT_TOKENS = eINSTANCE.getSQLStatementTokens();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.AcceptStatementTokens <em>Accept Statement Tokens</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.AcceptStatementTokens
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getAcceptStatementTokens()
		 * @generated
		 */
		EEnum ACCEPT_STATEMENT_TOKENS = eINSTANCE.getAcceptStatementTokens();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.UseStatementTokens <em>Use Statement Tokens</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.UseStatementTokens
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getUseStatementTokens()
		 * @generated
		 */
		EEnum USE_STATEMENT_TOKENS = eINSTANCE.getUseStatementTokens();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.CloseStatementTokens <em>Close Statement Tokens</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.CloseStatementTokens
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getCloseStatementTokens()
		 * @generated
		 */
		EEnum CLOSE_STATEMENT_TOKENS = eINSTANCE.getCloseStatementTokens();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.InvokeStatementTokens <em>Invoke Statement Tokens</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.InvokeStatementTokens
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getInvokeStatementTokens()
		 * @generated
		 */
		EEnum INVOKE_STATEMENT_TOKENS = eINSTANCE.getInvokeStatementTokens();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.OpenStatementTokens <em>Open Statement Tokens</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.OpenStatementTokens
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getOpenStatementTokens()
		 * @generated
		 */
		EEnum OPEN_STATEMENT_TOKENS = eINSTANCE.getOpenStatementTokens();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.water.SortPhraseTokens <em>Sort Phrase Tokens</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.water.SortPhraseTokens
		 * @see org.servicifi.gelato.language.cobol.water.impl.WaterPackageImpl#getSortPhraseTokens()
		 * @generated
		 */
		EEnum SORT_PHRASE_TOKENS = eINSTANCE.getSortPhraseTokens();

	}

} //WaterPackage
