/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.analysis.framework.commons.LabellableElement;

import org.servicifi.gelato.analysis.framework.graphs.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getCfg <em>Cfg</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getResult <em>Result</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getExitTable <em>Exit Table</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getEntryTable <em>Entry Table</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysis()
 * @model abstract="true"
 * @generated
 */
public interface Analysis extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"FORWARDS"</code>.
	 * The literals are from the enumeration {@link org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection
	 * @see #setDirection(AnalysisDirection)
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysis_Direction()
	 * @model default="FORWARDS"
	 * @generated
	 */
	AnalysisDirection getDirection();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(AnalysisDirection value);

	/**
	 * Returns the value of the '<em><b>Cfg</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.analysis.framework.graphs.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfg</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfg</em>' reference list.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysis_Cfg()
	 * @model required="true"
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
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysis_Result()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<Long, ExitEntryPair> getResult();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getResult <em>Result</em>}' attribute.
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
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysis_ExitTable()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<LabellableElement, EList<AnalysisResult>> getExitTable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getExitTable <em>Exit Table</em>}' attribute.
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
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysis_EntryTable()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<LabellableElement, EList<AnalysisResult>> getEntryTable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getEntryTable <em>Entry Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Table</em>' attribute.
	 * @see #getEntryTable()
	 * @generated
	 */
	void setEntryTable(Map<LabellableElement, EList<AnalysisResult>> value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(AnalysisConfiguration)
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysis_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AnalysisConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(AnalysisConfiguration value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Map<Long, ExitEntryPair> performAnalysis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" eRequired="true" dirRequired="true" flowTypeRequired="true"
	 * @generated
	 */
	EList<LabellableElement> getAllNodesWithDirection(LabellableElement e, AnalysisDirection dir, Class<? extends Flow> flowType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exitsRequired="true" exitsMany="true"
	 * @generated
	 */
	EList<AnalysisResult> meet(EList<EList<AnalysisResult>> exits);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" eRequired="true" dirRequired="true" flowTypeRequired="true"
	 * @generated
	 */
	EList<Flow> getAllEdgesWithDirection(LabellableElement e, AnalysisDirection dir, Class<? extends Flow> flowType);

} // Analysis
