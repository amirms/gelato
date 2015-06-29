/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.servicifi.gelato.language.kernel.variables.Variable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaching Definitions Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysis#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getReachingDefinitionsAnalysis()
 * @model
 * @generated
 */
public interface ReachingDefinitionsAnalysis extends Analysis {

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
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getReachingDefinitionsAnalysis_Assignments()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<Variable, EList<Long>> getAssignments();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysis#getAssignments <em>Assignments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignments</em>' attribute.
	 * @see #getAssignments()
	 * @generated
	 */
	void setAssignments(Map<Variable, EList<Long>> value);
} // ReachingDefinitionsAnalysis
