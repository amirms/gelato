/**
 */
package org.servicifi.gelato.language.kernel.statements;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.kernel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.Conditional#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getConditional()
 * @generated
 */
public interface Conditional extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getConditional_Condition()
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.statements.Conditional#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // Conditional
