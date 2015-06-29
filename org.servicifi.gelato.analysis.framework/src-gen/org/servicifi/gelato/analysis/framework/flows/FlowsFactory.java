/**
 */
package org.servicifi.gelato.analysis.framework.flows;

import org.eclipse.emf.ecore.EFactory;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.analysis.framework.flows.FlowsPackage
 * @generated
 */
public interface FlowsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowsFactory eINSTANCE = org.servicifi.gelato.analysis.framework.flows.impl.FlowsFactoryImpl.init();

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
	FlowsPackage getFlowsPackage();

	ProcedureFlow createProcedureFlow(LabellableElement from, LabellableElement to);
	
	RegularFlow createRegularFlow(LabellableElement from, LabellableElement to);


} //FlowsFactory
