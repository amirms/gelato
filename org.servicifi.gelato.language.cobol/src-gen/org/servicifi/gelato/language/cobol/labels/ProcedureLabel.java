/**
 */
package org.servicifi.gelato.language.cobol.labels;

import org.servicifi.gelato.language.cobol.sections.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.labels.ProcedureLabel#getSection <em>Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.labels.LabelsPackage#getProcedureLabel()
 * @model
 * @generated
 */
public interface ProcedureLabel extends ProcedureRangeChild {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' reference.
	 * @see #setSection(Section)
	 * @see org.servicifi.gelato.language.cobol.labels.LabelsPackage#getProcedureLabel_Section()
	 * @model
	 * @generated
	 */
	Section getSection();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.labels.ProcedureLabel#getSection <em>Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Section value);

} // ProcedureLabel
