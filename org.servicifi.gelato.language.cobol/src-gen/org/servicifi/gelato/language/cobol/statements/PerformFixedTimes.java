/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform Fixed Times</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.PerformFixedTimes#getIterations <em>Iterations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getPerformFixedTimes()
 * @model abstract="true"
 * @generated
 */
public interface PerformFixedTimes extends Perform {
	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' containment reference.
	 * @see #setIterations(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getPerformFixedTimes_Iterations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryOperand getIterations();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.PerformFixedTimes#getIterations <em>Iterations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' containment reference.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(PrimaryOperand value);

} // PerformFixedTimes
