/**
 */
package org.servicifi.gelato.language.cobol.files;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.water.WaterPackage;

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
 * @see org.servicifi.gelato.language.cobol.files.FilesFactory
 * @model kind="package"
 * @generated
 */
public interface FilesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "files";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/files";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "files";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesPackage eINSTANCE = org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.files.impl.FileNameImpl <em>File Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.files.impl.FileNameImpl
	 * @see org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl#getFileName()
	 * @generated
	 */
	int FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__WATER = WaterPackage.INCOMPLETE_ELEMENT__WATER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__NAME = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__ALIASES_TO = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__ALIASES_FROM = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__FILE_DESCRIPTOR = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__RECORDS = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__ATTRIBUTES = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__SENTENCES = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>File Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_FEATURE_COUNT = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.files.impl.SelectStatementImpl <em>Select Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.files.impl.SelectStatementImpl
	 * @see org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl#getSelectStatement()
	 * @generated
	 */
	int SELECT_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_STATEMENT__WATER = WaterPackage.INCOMPLETE_ELEMENT__WATER;

	/**
	 * The feature id for the '<em><b>File Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_STATEMENT__FILE_STATUS = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_STATEMENT__IS_OPTIONAL = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External File Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_STATEMENT__EXTERNAL_FILE_NAMES = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Name Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_STATEMENT__FILE_NAME_REFERENCE = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Select Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_STATEMENT_FEATURE_COUNT = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.files.impl.FileStatusImpl <em>File Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.files.impl.FileStatusImpl
	 * @see org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl#getFileStatus()
	 * @generated
	 */
	int FILE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>File Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATUS__FILE_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Vsam File Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATUS__VSAM_FILE_STATUS = 1;

	/**
	 * The number of structural features of the '<em>File Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATUS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.files.FileDescriptors <em>File Descriptors</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.files.FileDescriptors
	 * @see org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl#getFileDescriptors()
	 * @generated
	 */
	int FILE_DESCRIPTORS = 3;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.files.FileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.FileName
	 * @generated
	 */
	EClass getFileName();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.files.FileName#getFileDescriptor <em>File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Descriptor</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.FileName#getFileDescriptor()
	 * @see #getFileName()
	 * @generated
	 */
	EAttribute getFileName_FileDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.files.FileName#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.FileName#getRecords()
	 * @see #getFileName()
	 * @generated
	 */
	EReference getFileName_Records();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.files.FileName#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.FileName#getAttributes()
	 * @see #getFileName()
	 * @generated
	 */
	EReference getFileName_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.files.FileName#getSentences <em>Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentences</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.FileName#getSentences()
	 * @see #getFileName()
	 * @generated
	 */
	EReference getFileName_Sentences();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.files.SelectStatement <em>Select Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.SelectStatement
	 * @generated
	 */
	EClass getSelectStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.files.SelectStatement#getFileStatus <em>File Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Status</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.SelectStatement#getFileStatus()
	 * @see #getSelectStatement()
	 * @generated
	 */
	EReference getSelectStatement_FileStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.files.SelectStatement#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.SelectStatement#isIsOptional()
	 * @see #getSelectStatement()
	 * @generated
	 */
	EAttribute getSelectStatement_IsOptional();

	/**
	 * Returns the meta object for the attribute list '{@link org.servicifi.gelato.language.cobol.files.SelectStatement#getExternalFileNames <em>External File Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>External File Names</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.SelectStatement#getExternalFileNames()
	 * @see #getSelectStatement()
	 * @generated
	 */
	EAttribute getSelectStatement_ExternalFileNames();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.files.SelectStatement#getFileNameReference <em>File Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Name Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.SelectStatement#getFileNameReference()
	 * @see #getSelectStatement()
	 * @generated
	 */
	EReference getSelectStatement_FileNameReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.files.FileStatus <em>File Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Status</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.FileStatus
	 * @generated
	 */
	EClass getFileStatus();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.files.FileStatus#getFileStatus <em>File Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Status</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.FileStatus#getFileStatus()
	 * @see #getFileStatus()
	 * @generated
	 */
	EReference getFileStatus_FileStatus();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.files.FileStatus#getVsamFileStatus <em>Vsam File Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vsam File Status</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.FileStatus#getVsamFileStatus()
	 * @see #getFileStatus()
	 * @generated
	 */
	EReference getFileStatus_VsamFileStatus();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.files.FileDescriptors <em>File Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Descriptors</em>'.
	 * @see org.servicifi.gelato.language.cobol.files.FileDescriptors
	 * @generated
	 */
	EEnum getFileDescriptors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FilesFactory getFilesFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.files.impl.FileNameImpl <em>File Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.files.impl.FileNameImpl
		 * @see org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl#getFileName()
		 * @generated
		 */
		EClass FILE_NAME = eINSTANCE.getFileName();

		/**
		 * The meta object literal for the '<em><b>File Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_NAME__FILE_DESCRIPTOR = eINSTANCE.getFileName_FileDescriptor();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_NAME__RECORDS = eINSTANCE.getFileName_Records();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_NAME__ATTRIBUTES = eINSTANCE.getFileName_Attributes();

		/**
		 * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_NAME__SENTENCES = eINSTANCE.getFileName_Sentences();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.files.impl.SelectStatementImpl <em>Select Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.files.impl.SelectStatementImpl
		 * @see org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl#getSelectStatement()
		 * @generated
		 */
		EClass SELECT_STATEMENT = eINSTANCE.getSelectStatement();

		/**
		 * The meta object literal for the '<em><b>File Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_STATEMENT__FILE_STATUS = eINSTANCE.getSelectStatement_FileStatus();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_STATEMENT__IS_OPTIONAL = eINSTANCE.getSelectStatement_IsOptional();

		/**
		 * The meta object literal for the '<em><b>External File Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_STATEMENT__EXTERNAL_FILE_NAMES = eINSTANCE.getSelectStatement_ExternalFileNames();

		/**
		 * The meta object literal for the '<em><b>File Name Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_STATEMENT__FILE_NAME_REFERENCE = eINSTANCE.getSelectStatement_FileNameReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.files.impl.FileStatusImpl <em>File Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.files.impl.FileStatusImpl
		 * @see org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl#getFileStatus()
		 * @generated
		 */
		EClass FILE_STATUS = eINSTANCE.getFileStatus();

		/**
		 * The meta object literal for the '<em><b>File Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_STATUS__FILE_STATUS = eINSTANCE.getFileStatus_FileStatus();

		/**
		 * The meta object literal for the '<em><b>Vsam File Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_STATUS__VSAM_FILE_STATUS = eINSTANCE.getFileStatus_VsamFileStatus();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.files.FileDescriptors <em>File Descriptors</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.files.FileDescriptors
		 * @see org.servicifi.gelato.language.cobol.files.impl.FilesPackageImpl#getFileDescriptors()
		 * @generated
		 */
		EEnum FILE_DESCRIPTORS = eINSTANCE.getFileDescriptors();

	}

} //FilesPackage
