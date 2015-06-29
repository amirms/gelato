/**
 */
package org.servicifi.gelato.language.cobol.ios;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.servicifi.gelato.language.cobol.ios.IosFactory
 * @model kind="package"
 * @generated
 */
public interface IosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ios";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/ios";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ios";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IosPackage eINSTANCE = org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.ios.impl.IODirectivesImpl <em>IO Directives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IODirectivesImpl
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getIODirectives()
	 * @generated
	 */
	int IO_DIRECTIVES = 6;

	/**
	 * The number of structural features of the '<em>IO Directives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DIRECTIVES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.ios.impl.InputDirectiveImpl <em>Input Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.ios.impl.InputDirectiveImpl
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getInputDirective()
	 * @generated
	 */
	int INPUT_DIRECTIVE = 1;

	/**
	 * The number of structural features of the '<em>Input Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DIRECTIVE_FEATURE_COUNT = IO_DIRECTIVES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.ios.impl.InputProcedureImpl <em>Input Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.ios.impl.InputProcedureImpl
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getInputProcedure()
	 * @generated
	 */
	int INPUT_PROCEDURE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PROCEDURE__LABEL = INPUT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PROCEDURE_FEATURE_COUNT = INPUT_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.ios.impl.InputFileImpl <em>Input File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.ios.impl.InputFileImpl
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getInputFile()
	 * @generated
	 */
	int INPUT_FILE = 2;

	/**
	 * The feature id for the '<em><b>File Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__FILE_NAMES = INPUT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE_FEATURE_COUNT = INPUT_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.ios.impl.OutputDirectiveImpl <em>Output Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.ios.impl.OutputDirectiveImpl
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getOutputDirective()
	 * @generated
	 */
	int OUTPUT_DIRECTIVE = 3;

	/**
	 * The number of structural features of the '<em>Output Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DIRECTIVE_FEATURE_COUNT = IO_DIRECTIVES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.ios.impl.ProcedureDirectiveImpl <em>Procedure Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.ios.impl.ProcedureDirectiveImpl
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getProcedureDirective()
	 * @generated
	 */
	int PROCEDURE_DIRECTIVE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIRECTIVE__LABEL = IO_DIRECTIVES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Procedure Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIRECTIVE_FEATURE_COUNT = IO_DIRECTIVES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.ios.impl.OutputProcedureImpl <em>Output Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.ios.impl.OutputProcedureImpl
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getOutputProcedure()
	 * @generated
	 */
	int OUTPUT_PROCEDURE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PROCEDURE__LABEL = PROCEDURE_DIRECTIVE__LABEL;

	/**
	 * The number of structural features of the '<em>Output Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PROCEDURE_FEATURE_COUNT = PROCEDURE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.ios.impl.OutputFileImpl <em>Output File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.ios.impl.OutputFileImpl
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getOutputFile()
	 * @generated
	 */
	int OUTPUT_FILE = 5;

	/**
	 * The feature id for the '<em><b>File Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__FILE_NAMES = OUTPUT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE_FEATURE_COUNT = OUTPUT_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.ios.impl.FileDirectiveImpl <em>File Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.ios.impl.FileDirectiveImpl
	 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getFileDirective()
	 * @generated
	 */
	int FILE_DIRECTIVE = 7;

	/**
	 * The feature id for the '<em><b>File Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DIRECTIVE__FILE_NAMES = IO_DIRECTIVES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DIRECTIVE_FEATURE_COUNT = IO_DIRECTIVES_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.ios.InputProcedure <em>Input Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Procedure</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.InputProcedure
	 * @generated
	 */
	EClass getInputProcedure();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.ios.InputDirective <em>Input Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Directive</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.InputDirective
	 * @generated
	 */
	EClass getInputDirective();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.ios.InputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input File</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.InputFile
	 * @generated
	 */
	EClass getInputFile();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.ios.OutputDirective <em>Output Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Directive</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.OutputDirective
	 * @generated
	 */
	EClass getOutputDirective();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.ios.OutputProcedure <em>Output Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Procedure</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.OutputProcedure
	 * @generated
	 */
	EClass getOutputProcedure();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.ios.OutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output File</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.OutputFile
	 * @generated
	 */
	EClass getOutputFile();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.ios.IODirectives <em>IO Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Directives</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.IODirectives
	 * @generated
	 */
	EClass getIODirectives();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.ios.FileDirective <em>File Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Directive</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.FileDirective
	 * @generated
	 */
	EClass getFileDirective();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.ios.FileDirective#getFileNames <em>File Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Names</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.FileDirective#getFileNames()
	 * @see #getFileDirective()
	 * @generated
	 */
	EReference getFileDirective_FileNames();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.ios.ProcedureDirective <em>Procedure Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Directive</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.ProcedureDirective
	 * @generated
	 */
	EClass getProcedureDirective();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.ios.ProcedureDirective#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.servicifi.gelato.language.cobol.ios.ProcedureDirective#getLabel()
	 * @see #getProcedureDirective()
	 * @generated
	 */
	EReference getProcedureDirective_Label();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IosFactory getIosFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.ios.impl.InputProcedureImpl <em>Input Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.ios.impl.InputProcedureImpl
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getInputProcedure()
		 * @generated
		 */
		EClass INPUT_PROCEDURE = eINSTANCE.getInputProcedure();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.ios.impl.InputDirectiveImpl <em>Input Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.ios.impl.InputDirectiveImpl
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getInputDirective()
		 * @generated
		 */
		EClass INPUT_DIRECTIVE = eINSTANCE.getInputDirective();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.ios.impl.InputFileImpl <em>Input File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.ios.impl.InputFileImpl
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getInputFile()
		 * @generated
		 */
		EClass INPUT_FILE = eINSTANCE.getInputFile();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.ios.impl.OutputDirectiveImpl <em>Output Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.ios.impl.OutputDirectiveImpl
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getOutputDirective()
		 * @generated
		 */
		EClass OUTPUT_DIRECTIVE = eINSTANCE.getOutputDirective();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.ios.impl.OutputProcedureImpl <em>Output Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.ios.impl.OutputProcedureImpl
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getOutputProcedure()
		 * @generated
		 */
		EClass OUTPUT_PROCEDURE = eINSTANCE.getOutputProcedure();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.ios.impl.OutputFileImpl <em>Output File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.ios.impl.OutputFileImpl
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getOutputFile()
		 * @generated
		 */
		EClass OUTPUT_FILE = eINSTANCE.getOutputFile();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.ios.impl.IODirectivesImpl <em>IO Directives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IODirectivesImpl
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getIODirectives()
		 * @generated
		 */
		EClass IO_DIRECTIVES = eINSTANCE.getIODirectives();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.ios.impl.FileDirectiveImpl <em>File Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.ios.impl.FileDirectiveImpl
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getFileDirective()
		 * @generated
		 */
		EClass FILE_DIRECTIVE = eINSTANCE.getFileDirective();

		/**
		 * The meta object literal for the '<em><b>File Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DIRECTIVE__FILE_NAMES = eINSTANCE.getFileDirective_FileNames();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.ios.impl.ProcedureDirectiveImpl <em>Procedure Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.ios.impl.ProcedureDirectiveImpl
		 * @see org.servicifi.gelato.language.cobol.ios.impl.IosPackageImpl#getProcedureDirective()
		 * @generated
		 */
		EClass PROCEDURE_DIRECTIVE = eINSTANCE.getProcedureDirective();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_DIRECTIVE__LABEL = eINSTANCE.getProcedureDirective_Label();

	}

} //IosPackage
