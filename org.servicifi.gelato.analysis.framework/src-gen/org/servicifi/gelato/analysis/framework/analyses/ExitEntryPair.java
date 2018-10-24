/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Entry Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair#getExit <em>Exit</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getExitEntryPair()
 * @model
 * @generated
 */
public interface ExitEntryPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.analysis.framework.analyses.AnalysisResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference list.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getExitEntryPair_Entry()
	 * @model
	 * @generated
	 */
	EList<AnalysisResult> getEntry();

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.analysis.framework.analyses.AnalysisResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' reference list.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getExitEntryPair_Exit()
	 * @model
	 * @generated
	 */
	EList<AnalysisResult> getExit();

} // ExitEntryPair
