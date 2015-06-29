/**
 */
package org.servicifi.gelato.language.cobol.divisions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsFactory
 * @model kind="package"
 * @generated
 */
public interface DivisionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "divisions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/divisions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "divisions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DivisionsPackage eINSTANCE = org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionImpl
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SECTIONS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__PARAGRAPHS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SENTENCES = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.DataDivisionImpl <em>Data Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.DataDivisionImpl
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getDataDivision()
	 * @generated
	 */
	int DATA_DIVISION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION__NAME = DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION__SECTIONS = DIVISION__SECTIONS;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION__PARAGRAPHS = DIVISION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION__SENTENCES = DIVISION__SENTENCES;

	/**
	 * The number of structural features of the '<em>Data Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIVISION_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.EnvironmentDivisionImpl <em>Environment Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.EnvironmentDivisionImpl
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getEnvironmentDivision()
	 * @generated
	 */
	int ENVIRONMENT_DIVISION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION__NAME = DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION__SECTIONS = DIVISION__SECTIONS;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION__PARAGRAPHS = DIVISION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION__SENTENCES = DIVISION__SENTENCES;

	/**
	 * The number of structural features of the '<em>Environment Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIVISION_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.IdentificationDivisionImpl <em>Identification Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.IdentificationDivisionImpl
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getIdentificationDivision()
	 * @generated
	 */
	int IDENTIFICATION_DIVISION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DIVISION__NAME = DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DIVISION__SECTIONS = DIVISION__SECTIONS;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DIVISION__PARAGRAPHS = DIVISION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DIVISION__SENTENCES = DIVISION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DIVISION__WATER = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DIVISION__PROPERTIES = DIVISION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identification Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DIVISION_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.ProcedureDivisionImpl <em>Procedure Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.ProcedureDivisionImpl
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getProcedureDivision()
	 * @generated
	 */
	int PROCEDURE_DIVISION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIVISION__NAME = DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIVISION__SECTIONS = DIVISION__SECTIONS;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIVISION__PARAGRAPHS = DIVISION__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIVISION__SENTENCES = DIVISION__SENTENCES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIVISION__PARAMETERS = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIVISION__RETURNING = DIVISION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaratives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIVISION__DECLARATIVES = DIVISION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Procedure Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DIVISION_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.divisions.Properties <em>Properties</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.divisions.Properties
	 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 5;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.divisions.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.divisions.Division#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.Division#getSections()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.divisions.Division#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.Division#getParagraphs()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Paragraphs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.divisions.Division#getSentences <em>Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentences</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.Division#getSentences()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Sentences();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.divisions.DataDivision <em>Data Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.DataDivision
	 * @generated
	 */
	EClass getDataDivision();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision <em>Environment Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision
	 * @generated
	 */
	EClass getEnvironmentDivision();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.divisions.IdentificationDivision <em>Identification Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.IdentificationDivision
	 * @generated
	 */
	EClass getIdentificationDivision();

	/**
	 * Returns the meta object for the attribute list '{@link org.servicifi.gelato.language.cobol.divisions.IdentificationDivision#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.IdentificationDivision#getProperties()
	 * @see #getIdentificationDivision()
	 * @generated
	 */
	EAttribute getIdentificationDivision_Properties();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.divisions.ProcedureDivision <em>Procedure Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.ProcedureDivision
	 * @generated
	 */
	EClass getProcedureDivision();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.divisions.ProcedureDivision#getDeclaratives <em>Declaratives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaratives</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.ProcedureDivision#getDeclaratives()
	 * @see #getProcedureDivision()
	 * @generated
	 */
	EReference getProcedureDivision_Declaratives();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.divisions.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Properties</em>'.
	 * @see org.servicifi.gelato.language.cobol.divisions.Properties
	 * @generated
	 */
	EEnum getProperties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DivisionsFactory getDivisionsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionImpl
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__SECTIONS = eINSTANCE.getDivision_Sections();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__PARAGRAPHS = eINSTANCE.getDivision_Paragraphs();

		/**
		 * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__SENTENCES = eINSTANCE.getDivision_Sentences();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.DataDivisionImpl <em>Data Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.DataDivisionImpl
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getDataDivision()
		 * @generated
		 */
		EClass DATA_DIVISION = eINSTANCE.getDataDivision();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.EnvironmentDivisionImpl <em>Environment Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.EnvironmentDivisionImpl
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getEnvironmentDivision()
		 * @generated
		 */
		EClass ENVIRONMENT_DIVISION = eINSTANCE.getEnvironmentDivision();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.IdentificationDivisionImpl <em>Identification Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.IdentificationDivisionImpl
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getIdentificationDivision()
		 * @generated
		 */
		EClass IDENTIFICATION_DIVISION = eINSTANCE.getIdentificationDivision();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_DIVISION__PROPERTIES = eINSTANCE.getIdentificationDivision_Properties();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.divisions.impl.ProcedureDivisionImpl <em>Procedure Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.ProcedureDivisionImpl
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getProcedureDivision()
		 * @generated
		 */
		EClass PROCEDURE_DIVISION = eINSTANCE.getProcedureDivision();

		/**
		 * The meta object literal for the '<em><b>Declaratives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_DIVISION__DECLARATIVES = eINSTANCE.getProcedureDivision_Declaratives();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.divisions.Properties <em>Properties</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.divisions.Properties
		 * @see org.servicifi.gelato.language.cobol.divisions.impl.DivisionsPackageImpl#getProperties()
		 * @generated
		 */
		EEnum PROPERTIES = eINSTANCE.getProperties();

	}

} //DivisionsPackage
