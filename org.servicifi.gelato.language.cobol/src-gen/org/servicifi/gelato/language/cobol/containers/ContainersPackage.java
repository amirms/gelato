/**
 */
package org.servicifi.gelato.language.cobol.containers;

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
 * @see org.servicifi.gelato.language.cobol.containers.ContainersFactory
 * @model kind="package"
 * @generated
 */
public interface ContainersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "containers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/containers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "containers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainersPackage eINSTANCE = org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.containers.impl.CobolRootImpl <em>Cobol Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.containers.impl.CobolRootImpl
	 * @see org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl#getCobolRoot()
	 * @generated
	 */
	int COBOL_ROOT = 2;

	/**
	 * The number of structural features of the '<em>Cobol Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBOL_ROOT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.containers.impl.CompilationGroupImpl <em>Compilation Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.containers.impl.CompilationGroupImpl
	 * @see org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl#getCompilationGroup()
	 * @generated
	 */
	int COMPILATION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_GROUP__NAME = COBOL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_GROUP__COMPILATION_UNITS = COBOL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compilation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_GROUP_FEATURE_COUNT = COBOL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.containers.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.containers.impl.CompilationUnitImpl
	 * @see org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Identification Division</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__IDENTIFICATION_DIVISION = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Environment Division</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__ENVIRONMENT_DIVISION = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Division</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__DATA_DIVISION = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Procedure Division</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PROCEDURE_DIVISION = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nested Compilation Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NESTED_COMPILATION_UNITS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.containers.impl.EmptyModelImpl <em>Empty Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.containers.impl.EmptyModelImpl
	 * @see org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl#getEmptyModel()
	 * @generated
	 */
	int EMPTY_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Empty Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_MODEL_FEATURE_COUNT = COBOL_ROOT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.containers.CompilationGroup <em>Compilation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Group</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.CompilationGroup
	 * @generated
	 */
	EClass getCompilationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.containers.CompilationGroup#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compilation Units</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.CompilationGroup#getCompilationUnits()
	 * @see #getCompilationGroup()
	 * @generated
	 */
	EReference getCompilationGroup_CompilationUnits();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getIdentificationDivision <em>Identification Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identification Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.CompilationUnit#getIdentificationDivision()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_IdentificationDivision();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getEnvironmentDivision <em>Environment Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.CompilationUnit#getEnvironmentDivision()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_EnvironmentDivision();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getDataDivision <em>Data Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.CompilationUnit#getDataDivision()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_DataDivision();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getProcedureDivision <em>Procedure Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.CompilationUnit#getProcedureDivision()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_ProcedureDivision();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getNestedCompilationUnits <em>Nested Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Compilation Units</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.CompilationUnit#getNestedCompilationUnits()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_NestedCompilationUnits();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.containers.CobolRoot <em>Cobol Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cobol Root</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.CobolRoot
	 * @generated
	 */
	EClass getCobolRoot();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.containers.EmptyModel <em>Empty Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Model</em>'.
	 * @see org.servicifi.gelato.language.cobol.containers.EmptyModel
	 * @generated
	 */
	EClass getEmptyModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContainersFactory getContainersFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.containers.impl.CompilationGroupImpl <em>Compilation Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.containers.impl.CompilationGroupImpl
		 * @see org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl#getCompilationGroup()
		 * @generated
		 */
		EClass COMPILATION_GROUP = eINSTANCE.getCompilationGroup();

		/**
		 * The meta object literal for the '<em><b>Compilation Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_GROUP__COMPILATION_UNITS = eINSTANCE.getCompilationGroup_CompilationUnits();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.containers.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.containers.impl.CompilationUnitImpl
		 * @see org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Identification Division</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__IDENTIFICATION_DIVISION = eINSTANCE.getCompilationUnit_IdentificationDivision();

		/**
		 * The meta object literal for the '<em><b>Environment Division</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__ENVIRONMENT_DIVISION = eINSTANCE.getCompilationUnit_EnvironmentDivision();

		/**
		 * The meta object literal for the '<em><b>Data Division</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__DATA_DIVISION = eINSTANCE.getCompilationUnit_DataDivision();

		/**
		 * The meta object literal for the '<em><b>Procedure Division</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__PROCEDURE_DIVISION = eINSTANCE.getCompilationUnit_ProcedureDivision();

		/**
		 * The meta object literal for the '<em><b>Nested Compilation Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__NESTED_COMPILATION_UNITS = eINSTANCE.getCompilationUnit_NestedCompilationUnits();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.containers.impl.CobolRootImpl <em>Cobol Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.containers.impl.CobolRootImpl
		 * @see org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl#getCobolRoot()
		 * @generated
		 */
		EClass COBOL_ROOT = eINSTANCE.getCobolRoot();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.containers.impl.EmptyModelImpl <em>Empty Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.containers.impl.EmptyModelImpl
		 * @see org.servicifi.gelato.language.cobol.containers.impl.ContainersPackageImpl#getEmptyModel()
		 * @generated
		 */
		EClass EMPTY_MODEL = eINSTANCE.getEmptyModel();

	}

} //ContainersPackage
