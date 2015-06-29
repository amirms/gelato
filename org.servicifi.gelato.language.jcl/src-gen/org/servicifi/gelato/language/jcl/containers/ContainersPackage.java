/**
 */
package org.servicifi.gelato.language.jcl.containers;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.jcl.containers.ContainersFactory
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
	String eNS_URI = "http://www.servicifi.org/gelato/language/jcl/containers";

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
	ContainersPackage eINSTANCE = org.servicifi.gelato.language.jcl.containers.impl.ContainersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.jcl.containers.impl.JCLRootImpl <em>JCL Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.jcl.containers.impl.JCLRootImpl
	 * @see org.servicifi.gelato.language.jcl.containers.impl.ContainersPackageImpl#getJCLRoot()
	 * @generated
	 */
	int JCL_ROOT = 0;

	/**
	 * The number of structural features of the '<em>JCL Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCL_ROOT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>JCL Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.jcl.containers.impl.JobUnitImpl <em>Job Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.jcl.containers.impl.JobUnitImpl
	 * @see org.servicifi.gelato.language.jcl.containers.impl.ContainersPackageImpl#getJobUnit()
	 * @generated
	 */
	int JOB_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_UNIT__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Job Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Job Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_UNIT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.jcl.containers.JCLRoot <em>JCL Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JCL Root</em>'.
	 * @see org.servicifi.gelato.language.jcl.containers.JCLRoot
	 * @generated
	 */
	EClass getJCLRoot();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.jcl.containers.JobUnit <em>Job Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Unit</em>'.
	 * @see org.servicifi.gelato.language.jcl.containers.JobUnit
	 * @generated
	 */
	EClass getJobUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.jcl.containers.JobUnit#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statements</em>'.
	 * @see org.servicifi.gelato.language.jcl.containers.JobUnit#getStatements()
	 * @see #getJobUnit()
	 * @generated
	 */
	EReference getJobUnit_Statements();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.jcl.containers.impl.JCLRootImpl <em>JCL Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.jcl.containers.impl.JCLRootImpl
		 * @see org.servicifi.gelato.language.jcl.containers.impl.ContainersPackageImpl#getJCLRoot()
		 * @generated
		 */
		EClass JCL_ROOT = eINSTANCE.getJCLRoot();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.jcl.containers.impl.JobUnitImpl <em>Job Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.jcl.containers.impl.JobUnitImpl
		 * @see org.servicifi.gelato.language.jcl.containers.impl.ContainersPackageImpl#getJobUnit()
		 * @generated
		 */
		EClass JOB_UNIT = eINSTANCE.getJobUnit();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_UNIT__STATEMENTS = eINSTANCE.getJobUnit_Statements();

	}

} //ContainersPackage
