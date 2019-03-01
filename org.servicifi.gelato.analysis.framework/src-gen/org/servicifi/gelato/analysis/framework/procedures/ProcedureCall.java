/**
 */
package org.servicifi.gelato.analysis.framework.procedures;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.servicifi.gelato.analysis.framework.procedures.ProceduresPackage#getProcedureCall()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ProcedureCall extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resultsMany="true"
	 * @generated
	 */
	void alphaConvert(EList<AnalysisResult> results);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resultsMany="true"
	 * @generated
	 */
	void translateActualToFormalParameters(EList<AnalysisResult> results, Procedure callee);
} // ProcedureCall
