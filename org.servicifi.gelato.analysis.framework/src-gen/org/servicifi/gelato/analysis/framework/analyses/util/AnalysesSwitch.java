/**
 */
package org.servicifi.gelato.analysis.framework.analyses.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.Analysis;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.InterproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.IntraproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage
 * @generated
 */
public class AnalysesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnalysesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysesSwitch() {
		if (modelPackage == null) {
			modelPackage = AnalysesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AnalysesPackage.ANALYSIS: {
				Analysis analysis = (Analysis)theEObject;
				T result = caseAnalysis(analysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysesPackage.ANALYSIS_RESULT: {
				AnalysisResult analysisResult = (AnalysisResult)theEObject;
				T result = caseAnalysisResult(analysisResult);
				if (result == null) result = caseComparable(analysisResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysesPackage.EXIT_ENTRY_PAIR: {
				ExitEntryPair exitEntryPair = (ExitEntryPair)theEObject;
				T result = caseExitEntryPair(exitEntryPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysesPackage.COMPARABLE: {
				Comparable comparable = (Comparable)theEObject;
				T result = caseComparable(comparable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysesPackage.ANALYSIS_CONFIGURATION: {
				AnalysisConfiguration analysisConfiguration = (AnalysisConfiguration)theEObject;
				T result = caseAnalysisConfiguration(analysisConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysesPackage.INTRAPROCEDURAL_ANALYSIS: {
				IntraproceduralAnalysis intraproceduralAnalysis = (IntraproceduralAnalysis)theEObject;
				T result = caseIntraproceduralAnalysis(intraproceduralAnalysis);
				if (result == null) result = caseAnalysis(intraproceduralAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysesPackage.INTERPROCEDURAL_ANALYSIS: {
				InterproceduralAnalysis interproceduralAnalysis = (InterproceduralAnalysis)theEObject;
				T result = caseInterproceduralAnalysis(interproceduralAnalysis);
				if (result == null) result = caseAnalysis(interproceduralAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION: {
				ReachingDefinitionsAnalysisConfiguration reachingDefinitionsAnalysisConfiguration = (ReachingDefinitionsAnalysisConfiguration)theEObject;
				T result = caseReachingDefinitionsAnalysisConfiguration(reachingDefinitionsAnalysisConfiguration);
				if (result == null) result = caseAnalysisConfiguration(reachingDefinitionsAnalysisConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_RESULT: {
				ReachingDefinitionsAnalysisResult reachingDefinitionsAnalysisResult = (ReachingDefinitionsAnalysisResult)theEObject;
				T result = caseReachingDefinitionsAnalysisResult(reachingDefinitionsAnalysisResult);
				if (result == null) result = caseAnalysisResult(reachingDefinitionsAnalysisResult);
				if (result == null) result = caseComparable(reachingDefinitionsAnalysisResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysis(Analysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisResult(AnalysisResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Entry Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Entry Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitEntryPair(ExitEntryPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparable(Comparable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisConfiguration(AnalysisConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intraprocedural Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intraprocedural Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntraproceduralAnalysis(IntraproceduralAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interprocedural Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interprocedural Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterproceduralAnalysis(InterproceduralAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaching Definitions Analysis Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaching Definitions Analysis Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReachingDefinitionsAnalysisConfiguration(ReachingDefinitionsAnalysisConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaching Definitions Analysis Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaching Definitions Analysis Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReachingDefinitionsAnalysisResult(ReachingDefinitionsAnalysisResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AnalysesSwitch
