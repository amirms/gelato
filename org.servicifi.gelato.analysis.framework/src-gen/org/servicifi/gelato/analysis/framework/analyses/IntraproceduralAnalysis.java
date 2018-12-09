/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import org.eclipse.emf.common.util.EList;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intraprocedural Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getIntraproceduralAnalysis()
 * @model
 * @generated
 */
public interface IntraproceduralAnalysis extends Analysis {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" eRequired="true"
	 * @generated
	 */
	EList<AnalysisResult> entry(LabellableElement e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" eRequired="true"
	 * @generated
	 */
	EList<AnalysisResult> exit(LabellableElement e);
} // IntraproceduralAnalysis
