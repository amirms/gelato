/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Add#getTos <em>Tos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends ArithmeticStatement {
	/**
	 * Returns the value of the '<em><b>Tos</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.ArithmeticOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tos</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getAdd_Tos()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArithmeticOperand> getTos();

} // Add
