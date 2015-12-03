/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getCorresponding <em>Corresponding</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getOperands <em>Operands</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getGivings <em>Givings</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getArithmeticStatement()
 * @model abstract="true"
 * @generated
 */
public interface ArithmeticStatement extends Statement, ErrorHandled {
	/**
	 * Returns the value of the '<em><b>Corresponding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.statements.Corresponding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Corresponding
	 * @see #setCorresponding(Corresponding)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getArithmeticStatement_Corresponding()
	 * @model
	 * @generated
	 */
	Corresponding getCorresponding();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getCorresponding <em>Corresponding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Corresponding
	 * @see #getCorresponding()
	 * @generated
	 */
	void setCorresponding(Corresponding value);

	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.ArithmeticOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getArithmeticStatement_Operands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ArithmeticOperand> getOperands();

	/**
	 * Returns the value of the '<em><b>Givings</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.ArithmeticOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Givings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Givings</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getArithmeticStatement_Givings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArithmeticOperand> getGivings();

} // ArithmeticStatement
