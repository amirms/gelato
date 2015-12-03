/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.functions.Argumentable;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Call#getSubprogram <em>Subprogram</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Statement, Argumentable, ErrorHandled {
	/**
	 * Returns the value of the '<em><b>Subprogram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprogram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprogram</em>' containment reference.
	 * @see #setSubprogram(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getCall_Subprogram()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryOperand getSubprogram();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Call#getSubprogram <em>Subprogram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subprogram</em>' containment reference.
	 * @see #getSubprogram()
	 * @generated
	 */
	void setSubprogram(PrimaryOperand value);

} // Call
