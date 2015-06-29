/**
 */
package org.servicifi.gelato.language.cobol.labels;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.labels.LabelsPackage
 * @generated
 */
public interface LabelsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabelsFactory eINSTANCE = org.servicifi.gelato.language.cobol.labels.impl.LabelsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Procedure Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Range</em>'.
	 * @generated
	 */
	ProcedureRange createProcedureRange();

	/**
	 * Returns a new object of class '<em>Procedure Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Label</em>'.
	 * @generated
	 */
	ProcedureLabel createProcedureLabel();

	/**
	 * Returns a new object of class '<em>Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run</em>'.
	 * @generated
	 */
	Run createRun();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LabelsPackage getLabelsPackage();

} //LabelsFactory
