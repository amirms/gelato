/**
 */
package org.servicifi.gelato.language.cobol.labels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Range Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.labels.LabelsPackage#getProcedureRangeChild()
 * @model abstract="true"
 * @generated
 */
public interface ProcedureRangeChild extends ProcedureRangeLabel {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Procedure)
	 * @see org.servicifi.gelato.language.cobol.labels.LabelsPackage#getProcedureRangeChild_Target()
	 * @model required="true"
	 * @generated
	 */
	Procedure getTarget();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Procedure value);

} // ProcedureRangeChild
