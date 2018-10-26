/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration#getAnalysisType <em>Analysis Type</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysisConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface AnalysisConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
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
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysisConfiguration_Direction()
	 * @model required="true"
	 * @generated
	 */
	AnalysisDirection getDirection();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(AnalysisDirection value);

	/**
	 * Returns the value of the '<em><b>Analysis Type</b></em>' attribute.
	 * The default value is <code>"MUST"</code>.
	 * The literals are from the enumeration {@link org.servicifi.gelato.analysis.framework.analyses.AnalysisType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Type</em>' attribute.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisType
	 * @see #setAnalysisType(AnalysisType)
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage#getAnalysisConfiguration_AnalysisType()
	 * @model default="MUST" required="true"
	 * @generated
	 */
	AnalysisType getAnalysisType();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration#getAnalysisType <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Type</em>' attribute.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisType
	 * @see #getAnalysisType()
	 * @generated
	 */
	void setAnalysisType(AnalysisType value);

} // AnalysisConfiguration
