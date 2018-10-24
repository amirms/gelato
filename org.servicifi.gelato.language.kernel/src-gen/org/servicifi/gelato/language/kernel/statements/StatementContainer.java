/**
 */
package org.servicifi.gelato.language.kernel.statements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.StatementContainer#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getStatementContainer()
 * @generated
 */
public interface StatementContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getStatementContainer_Statement()
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.statements.StatementContainer#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // StatementContainer
