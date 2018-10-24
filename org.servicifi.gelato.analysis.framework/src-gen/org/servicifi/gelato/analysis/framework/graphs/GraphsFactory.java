/**
 */
package org.servicifi.gelato.analysis.framework.graphs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.analysis.framework.graphs.GraphsPackage
 * @generated
 */
public interface GraphsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphsFactory eINSTANCE = org.servicifi.gelato.analysis.framework.graphs.impl.GraphsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>Regular Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Flow</em>'.
	 * @generated
	 */
	RegularFlow createRegularFlow();

	/**
	 * Returns a new object of class '<em>Procedure Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Flow</em>'.
	 * @generated
	 */
	ProcedureFlow createProcedureFlow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraphsPackage getGraphsPackage();
	
	ProcedureFlow createProcedureFlow(Node from, Node to);
	
	RegularFlow createRegularFlow(Node from, Node to);

} //GraphsFactory
