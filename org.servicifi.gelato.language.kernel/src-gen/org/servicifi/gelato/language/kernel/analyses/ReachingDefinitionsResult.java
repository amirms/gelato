/**
 */
package org.servicifi.gelato.language.kernel.analyses;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaching Definitions Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsResult#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getReachingDefinitionsResult()
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
	 * @see #setVariable(org.servicifi.gelato.language.kernel.dataitems.DataItem)
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getReachingDefinitionsResult_Variable()
	 * @generated
	 */
	org.servicifi.gelato.language.kernel.dataitems.DataItem getVariable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsResult#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(org.servicifi.gelato.language.kernel.dataitems.DataItem value);

} // ReachingDefinitionsResult
