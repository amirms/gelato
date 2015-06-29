/**
 */
package org.servicifi.gelato.language.cobol.registers;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.registers.Register#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.registers.RegistersPackage#getRegister()
 * @model abstract="true"
 * @generated
 */
public interface Register extends PrimaryOperand {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.registers.RegistersPackage#getRegister_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryOperand getOperand();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.registers.Register#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(PrimaryOperand value);

} // Register
