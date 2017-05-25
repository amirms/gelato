/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import org.eclipse.emf.ecore.EFactory;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage
 * @generated
 */
public interface AnalysesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysesFactory eINSTANCE = org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reaching Definitions Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaching Definitions Analysis</em>'.
	 * @generated
	 */
	ReachingDefinitionsAnalysis createReachingDefinitionsAnalysis();

	/**
	 * Returns a new object of class '<em>Reaching Definitions Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaching Definitions Result</em>'.
	 * @generated
	 */
	ReachingDefinitionsResult createReachingDefinitionsResult();

	/**
	 * Returns a new object of class '<em>Exit Entry Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Entry Pair</em>'.
	 * @generated
	 */
	ExitEntryPair createExitEntryPair();

	/**
	 * Returns a new object of class '<em>Iterator Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Element</em>'.
	 * @generated
	 */
	IteratorElement createIteratorElement();
	
	
	/**
	 * Returns a new object of class '<em>Iterator Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Element</em>'.
	 */
	IteratorElement createIteratorElement(int iteration, LabellableElement e);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysesPackage getAnalysesPackage();

	/**
	 * Returns a new object of class '<em>Reaching Definitions Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaching Definitions Result</em>'.
	 */
	ReachingDefinitionsResult createReachingDefinitionsResult(DataItem v, long i);

} //AnalysesFactory
