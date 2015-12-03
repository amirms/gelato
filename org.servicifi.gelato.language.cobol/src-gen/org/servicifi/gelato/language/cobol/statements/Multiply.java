/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Multiply#getBys <em>Bys</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getMultiply()
 * @model
 * @generated
 */
public interface Multiply extends ArithmeticStatement {
	/**
	 * Returns the value of the '<em><b>Bys</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.ArithmeticOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bys</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getMultiply_Bys()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArithmeticOperand> getBys();

} // Multiply
