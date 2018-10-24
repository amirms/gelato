/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import org.servicifi.gelato.analysis.framework.commons.Variable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaching Definitions Analysis Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getReachingDefinitionsAnalysisResult()
 * @model
 * @generated
 */
public interface ReachingDefinitionsAnalysisResult extends AnalysisResult {

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getReachingDefinitionsAnalysisResult_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);
} // ReachingDefinitionsAnalysisResult
