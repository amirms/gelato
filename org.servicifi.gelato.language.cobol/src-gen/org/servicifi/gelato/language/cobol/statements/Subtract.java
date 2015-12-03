/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Subtract#getFroms <em>Froms</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSubtract()
 * @model
 * @generated
 */
public interface Subtract extends ArithmeticStatement {
	/**
	 * Returns the value of the '<em><b>Froms</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.ArithmeticOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Froms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Froms</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSubtract_Froms()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArithmeticOperand> getFroms();

} // Subtract
