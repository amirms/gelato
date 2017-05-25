/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import org.servicifi.gelato.language.kernel.dataitems.DataItem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaching Definitions Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsResult#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getReachingDefinitionsResult()
 * @model
 * @generated
 */
public interface ReachingDefinitionsResult extends AnalysisResult {

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(DataItem)
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getReachingDefinitionsResult_Variable()
	 * @model required="true"
	 * @generated
	 */
	DataItem getVariable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsResult#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(DataItem value);
} // ReachingDefinitionsResult
