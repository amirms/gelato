/**
 */
package org.servicifi.gelato.analysis.framework.procedures;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.analysis.framework.procedures.ProceduresPackage
 * @generated
 */
public interface ProceduresFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProceduresFactory eINSTANCE = org.servicifi.gelato.analysis.framework.procedures.impl.ProceduresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Return Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Site</em>'.
	 * @generated
	 */
	ReturnSite createReturnSite();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProceduresPackage getProceduresPackage();

} //ProceduresFactory
