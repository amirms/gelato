/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.labels.ProcedureRangeLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.PerformProcedure#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getPerformProcedure()
 * @model
 * @generated
 */
public interface PerformProcedure extends Perform {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(ProcedureRangeLabel)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getPerformProcedure_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProcedureRangeLabel getLabel();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.PerformProcedure#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(ProcedureRangeLabel value);

} // PerformProcedure
