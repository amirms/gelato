/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.servicifi.gelato.analysis.framework.commons.Variable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaching Definitions Analysis Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getReachingDefinitionsAnalysisConfiguration()
 * @model
 * @generated
 */
public interface ReachingDefinitionsAnalysisConfiguration extends AnalysisConfiguration {

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' attribute.
	 * @see #setAssignments(Map)
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getReachingDefinitionsAnalysisConfiguration_Assignments()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<Variable, EList<Double>> getAssignments();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration#getAssignments <em>Assignments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignments</em>' attribute.
	 * @see #getAssignments()
	 * @generated
	 */
	void setAssignments(Map<Variable, EList<Double>> value);
} // ReachingDefinitionsAnalysisConfiguration
