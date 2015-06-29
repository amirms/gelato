/**
 */
package org.servicifi.gelato.language.kernel.analyses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.AnalysisResult#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getAnalysisResult()
 * @generated
 */
public interface AnalysisResult extends EObject, Comparable {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(long)
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getAnalysisResult_Label()
	 * @generated
	 */
	long getLabel();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.analyses.AnalysisResult#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(long value);

} // AnalysisResult
