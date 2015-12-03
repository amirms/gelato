/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Divide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Divide#getIntos <em>Intos</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Divide#getRemainders <em>Remainders</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getDivide()
 * @model
 * @generated
 */
public interface Divide extends ArithmeticStatement {
	/**
	 * Returns the value of the '<em><b>Intos</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.ArithmeticOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intos</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getDivide_Intos()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArithmeticOperand> getIntos();

	/**
	 * Returns the value of the '<em><b>Remainders</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.identifiers.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remainders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remainders</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getDivide_Remainders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getRemainders();

} // Divide
