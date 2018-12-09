/**
 */
package org.servicifi.gelato.analysis.framework.procedures;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;

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
 * @see org.servicifi.gelato.analysis.framework.procedures.ProceduresFactory
 * @model kind="package"
 * @generated
 */
public interface ProceduresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "procedures";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/analysis/framework/procedures";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "procedures";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProceduresPackage eINSTANCE = org.servicifi.gelato.analysis.framework.procedures.impl.ProceduresPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.procedures.impl.ReturnSiteImpl <em>Return Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.procedures.impl.ReturnSiteImpl
	 * @see org.servicifi.gelato.analysis.framework.procedures.impl.ProceduresPackageImpl#getReturnSite()
	 * @generated
	 */
	int RETURN_SITE = 0;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE__PREDECESSORS = CommonsPackage.LABELLABLE_ELEMENT__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE__SUCCESSORS = CommonsPackage.LABELLABLE_ELEMENT__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE__LABEL = CommonsPackage.LABELLABLE_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Return Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE_FEATURE_COUNT = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE___FIRST = CommonsPackage.LABELLABLE_ELEMENT___FIRST;

	/**
	 * The operation id for the '<em>Last</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE___LAST = CommonsPackage.LABELLABLE_ELEMENT___LAST;

	/**
	 * The operation id for the '<em>Internal Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE___INTERNAL_FLOW = CommonsPackage.LABELLABLE_ELEMENT___INTERNAL_FLOW;

	/**
	 * The operation id for the '<em>Gen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE___GEN__ANALYSISCONFIGURATION = CommonsPackage.LABELLABLE_ELEMENT___GEN__ANALYSISCONFIGURATION;

	/**
	 * The operation id for the '<em>Kill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE___KILL__ANALYSISCONFIGURATION = CommonsPackage.LABELLABLE_ELEMENT___KILL__ANALYSISCONFIGURATION;

	/**
	 * The number of operations of the '<em>Return Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SITE_OPERATION_COUNT = CommonsPackage.LABELLABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.procedures.ReturnSite <em>Return Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Site</em>'.
	 * @see org.servicifi.gelato.analysis.framework.procedures.ReturnSite
	 * @generated
	 */
	EClass getReturnSite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProceduresFactory getProceduresFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.procedures.impl.ReturnSiteImpl <em>Return Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.procedures.impl.ReturnSiteImpl
		 * @see org.servicifi.gelato.analysis.framework.procedures.impl.ProceduresPackageImpl#getReturnSite()
		 * @generated
		 */
		EClass RETURN_SITE = eINSTANCE.getReturnSite();

	}

} //ProceduresPackage
