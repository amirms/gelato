/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.environments.Environment;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Display#getOperands <em>Operands</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Display#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getDisplay()
 * @model
 * @generated
 */
public interface Display extends Statement {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.PrimaryOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getDisplay_Operands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PrimaryOperand> getOperands();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Environment)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getDisplay_Output()
	 * @model containment="true"
	 * @generated
	 */
	Environment getOutput();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Display#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Environment value);

} // Display
