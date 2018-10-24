/**
 */
package org.servicifi.gelato.language.cobol.sentences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.sentences.StatementContainer#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.sentences.SentencesPackage#getStatementContainer()
 * @model abstract="true"
 * @generated
 */
public interface StatementContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.sentences.SentencesPackage#getStatementContainer_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // StatementContainer
