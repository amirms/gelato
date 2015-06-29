/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.labels.StopLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Stop#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStop()
 * @model
 * @generated
 */
public interface Stop extends Statement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(StopLabel)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStop_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StopLabel getLabel();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Stop#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(StopLabel value);

} // Stop
