/**
 */
package org.servicifi.gelato.language.jcl.containers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.jcl.containers.ContainersPackage
 * @generated
 */
public interface ContainersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainersFactory eINSTANCE = org.servicifi.gelato.language.jcl.containers.impl.ContainersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JCL Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JCL Root</em>'.
	 * @generated
	 */
	JCLRoot createJCLRoot();

	/**
	 * Returns a new object of class '<em>Job Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Unit</em>'.
	 * @generated
	 */
	JobUnit createJobUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContainersPackage getContainersPackage();

} //ContainersFactory