/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;
import org.servicifi.gelato.analysis.framework.commons.Variable;
import org.servicifi.gelato.analysis.framework.graphs.Flow;

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
	 * Returns a new object of class '<em>Exit Entry Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Entry Pair</em>'.
	 * @generated
	 */
	ExitEntryPair createExitEntryPair();

	/**
	 * Returns a new object of class '<em>Intraprocedural Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intraprocedural Analysis</em>'.
	 * @generated
	 */
	IntraproceduralAnalysis createIntraproceduralAnalysis();
	
	IntraproceduralAnalysis createIntraproceduralAnalysis(EList<Flow> cfg, AnalysisConfiguration configuration);

	/**
	 * Returns a new object of class '<em>Interprocedural Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interprocedural Analysis</em>'.
	 * @generated
	 */
	InterproceduralAnalysis createInterproceduralAnalysis();

	/**
	 * Returns a new object of class '<em>Reaching Definitions Analysis Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaching Definitions Analysis Configuration</em>'.
	 * @generated
	 */
	ReachingDefinitionsAnalysisConfiguration createReachingDefinitionsAnalysisConfiguration();

	/**
	 * Returns a new object of class '<em>Reaching Definitions Analysis Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaching Definitions Analysis Result</em>'.
	 * @generated
	 */
	ReachingDefinitionsAnalysisResult createReachingDefinitionsAnalysisResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysesPackage getAnalysesPackage();


	AnalysisResult createReachingDefinitionsResult(Variable v, long i);
	
	ExitEntryPair createExitEntryPair(EList<AnalysisResult> exit,
			EList<AnalysisResult> entry);

} //AnalysesFactory
