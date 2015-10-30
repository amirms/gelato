/**
 */
package org.servicifi.gelato.language.kernel.analyses;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.flows.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getCfg <em>Cfg</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getResult <em>Result</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getExitTable <em>Exit Table</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getEntryTable <em>Entry Table</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getAnalysisType <em>Analysis Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getAnalysis()
 * @generated
 */
public interface Analysis extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"FORWARDS"</code>.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.kernel.analyses.AnalysisDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisDirection
	 * @see #setDirection(AnalysisDirection)
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getAnalysis_Direction()
	 * @generated
	 */
	AnalysisDirection getDirection();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(AnalysisDirection value);

	/**
	 * Returns the value of the '<em><b>Cfg</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.kernel.flows.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfg</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfg</em>' containment reference list.
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getAnalysis_Cfg()
	 * @generated
	 */
	EList<Flow> getCfg();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(Map)
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getAnalysis_Result()
	 * @generated
	 */
	Map<Long, ExitEntryPair> getResult();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Map<Long, ExitEntryPair> value);

	/**
	 * Returns the value of the '<em><b>Exit Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Table</em>' attribute.
	 * @see #setExitTable(Map)
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getAnalysis_ExitTable()
	 * @generated
	 */
	Map<LabellableElement, EList<AnalysisResult>> getExitTable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getExitTable <em>Exit Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Table</em>' attribute.
	 * @see #getExitTable()
	 * @generated
	 */
	void setExitTable(Map<LabellableElement, EList<AnalysisResult>> value);

	/**
	 * Returns the value of the '<em><b>Entry Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Table</em>' attribute.
	 * @see #setEntryTable(Map)
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getAnalysis_EntryTable()
	 * @generated
	 */
	Map<LabellableElement, EList<AnalysisResult>> getEntryTable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getEntryTable <em>Entry Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Table</em>' attribute.
	 * @see #getEntryTable()
	 * @generated
	 */
	void setEntryTable(Map<LabellableElement, EList<AnalysisResult>> value);

	/**
	 * Returns the value of the '<em><b>Analysis Type</b></em>' attribute.
	 * The default value is <code>"MUST"</code>.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.kernel.analyses.AnalysisType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Type</em>' attribute.
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisType
	 * @see #setAnalysisType(AnalysisType)
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getAnalysis_AnalysisType()
	 * @generated
	 */
	AnalysisType getAnalysisType();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getAnalysisType <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Type</em>' attribute.
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisType
	 * @see #getAnalysisType()
	 * @generated
	 */
	void setAnalysisType(AnalysisType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<AnalysisResult> kill(LabellableElement e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<AnalysisResult> gen(LabellableElement e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<AnalysisResult> entry(LabellableElement e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<AnalysisResult> exit(LabellableElement e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Map<Long, ExitEntryPair> performAnalysis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<LabellableElement> getAllNodesWithDirection(LabellableElement e, AnalysisDirection dir);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<AnalysisResult> meet(EList<EList<AnalysisResult>> exits);

} // Analysis
