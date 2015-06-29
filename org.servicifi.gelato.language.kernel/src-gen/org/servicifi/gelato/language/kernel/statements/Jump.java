/**
 */
package org.servicifi.gelato.language.kernel.statements;

import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.references.ElementReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.Jump#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getJump()
 * @generated
 */
public interface Jump extends Statement {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(LabellableElement)
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getJump_Target()
	 * @generated
	 */
	LabellableElement getTarget();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.statements.Jump#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LabellableElement value);

} // Jump
