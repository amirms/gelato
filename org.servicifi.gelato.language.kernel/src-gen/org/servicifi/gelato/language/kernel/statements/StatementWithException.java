/**
 */
package org.servicifi.gelato.language.kernel.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement With Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.StatementWithException#getExceptionStatements <em>Exception Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getStatementWithException()
 * @generated
 */
public interface StatementWithException extends StatementContainer, Statement {
	/**
	 * Returns the value of the '<em><b>Exception Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Statements</em>' containment reference list.
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getStatementWithException_ExceptionStatements()
	 * @generated
	 */
	EList<ExceptionHandlerStatement> getExceptionStatements();

} // StatementWithException
