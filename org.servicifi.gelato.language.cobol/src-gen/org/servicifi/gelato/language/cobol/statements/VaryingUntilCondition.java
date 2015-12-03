/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Varying Until Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getInit <em>Init</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getVaryingUntilCondition()
 * @model abstract="true"
 * @generated
 */
public interface VaryingUntilCondition extends Conditional {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getVaryingUntilCondition_Variable()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierReference getVariable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(IdentifierReference value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getVaryingUntilCondition_Init()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryOperand getInit();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(PrimaryOperand value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' containment reference.
	 * @see #setIncrement(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getVaryingUntilCondition_Increment()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryOperand getIncrement();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getIncrement <em>Increment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' containment reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(PrimaryOperand value);

} // VaryingUntilCondition
