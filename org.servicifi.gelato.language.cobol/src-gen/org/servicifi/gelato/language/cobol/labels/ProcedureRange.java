/**
 */
package org.servicifi.gelato.language.cobol.labels;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operators.Through;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.labels.ProcedureRange#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.labels.ProcedureRange#getThroughOperator <em>Through Operator</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.labels.LabelsPackage#getProcedureRange()
 * @model
 * @generated
 */
public interface ProcedureRange extends ProcedureRangeLabel {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.labels.LabelsPackage#getProcedureRange_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcedureRangeChild> getChildren();

	/**
	 * Returns the value of the '<em><b>Through Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Through Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Through Operator</em>' containment reference.
	 * @see #setThroughOperator(Through)
	 * @see org.servicifi.gelato.language.cobol.labels.LabelsPackage#getProcedureRange_ThroughOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Through getThroughOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.labels.ProcedureRange#getThroughOperator <em>Through Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Through Operator</em>' containment reference.
	 * @see #getThroughOperator()
	 * @generated
	 */
	void setThroughOperator(Through value);

} // ProcedureRange
