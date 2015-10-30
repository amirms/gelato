/**
 */
package org.servicifi.gelato.language.kernel.containers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.servicifi.gelato.language.kernel.commons.CommonsPackage;

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
 * @see org.servicifi.gelato.language.kernel.containers.ContainersFactory
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
	String eNS_URI = "http://www.servicifi.org/gelato/language/kernel/containers";

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
	ContainersPackage eINSTANCE = org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.containers.impl.KernelRootImpl <em>Kernel Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.containers.impl.KernelRootImpl
	 * @see org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl#getKernelRoot()
	 * @generated
	 */
	int KERNEL_ROOT = 0;

	/**
	 * The number of structural features of the '<em>Kernel Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL_ROOT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.containers.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.containers.impl.CompilationUnitImpl
	 * @see org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__LABEL = KERNEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__MAIN_PROCEDURE = KERNEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__DECLARATIONS = KERNEL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__START = KERNEL_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__END = KERNEL_ROOT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = KERNEL_ROOT_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.containers.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.containers.impl.StartImpl
	 * @see org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl#getStart()
	 * @generated
	 */
	int START = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__LABEL = CommonsPackage.LABELLABLE_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.containers.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.containers.impl.EndImpl
	 * @see org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl#getEnd()
	 * @generated
	 */
	int END = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LABEL = CommonsPackage.LABELLABLE_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.containers.KernelRoot <em>Kernel Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kernel Root</em>'.
	 * @see org.servicifi.gelato.language.kernel.containers.KernelRoot
	 * @generated
	 */
	EClass getKernelRoot();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see org.servicifi.gelato.language.kernel.containers.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getMainProcedure <em>Main Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Procedure</em>'.
	 * @see org.servicifi.gelato.language.kernel.containers.CompilationUnit#getMainProcedure()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_MainProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.servicifi.gelato.language.kernel.containers.CompilationUnit#getDeclarations()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Declarations();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.servicifi.gelato.language.kernel.containers.CompilationUnit#getStart()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.servicifi.gelato.language.kernel.containers.CompilationUnit#getEnd()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_End();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.containers.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see org.servicifi.gelato.language.kernel.containers.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.containers.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see org.servicifi.gelato.language.kernel.containers.End
	 * @generated
	 */
	EClass getEnd();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.containers.impl.KernelRootImpl <em>Kernel Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.containers.impl.KernelRootImpl
		 * @see org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl#getKernelRoot()
		 * @generated
		 */
		EClass KERNEL_ROOT = eINSTANCE.getKernelRoot();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.containers.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.containers.impl.CompilationUnitImpl
		 * @see org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Main Procedure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__MAIN_PROCEDURE = eINSTANCE.getCompilationUnit_MainProcedure();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__DECLARATIONS = eINSTANCE.getCompilationUnit_Declarations();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__START = eINSTANCE.getCompilationUnit_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__END = eINSTANCE.getCompilationUnit_End();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.containers.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.containers.impl.StartImpl
		 * @see org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.containers.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.containers.impl.EndImpl
		 * @see org.servicifi.gelato.language.kernel.containers.impl.ContainersPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

	}

} //ContainersPackage
