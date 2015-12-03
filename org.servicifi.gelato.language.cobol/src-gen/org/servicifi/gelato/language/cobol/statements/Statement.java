/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Statement#getNext <em>Next</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Statement#isEndVerb <em>End Verb</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Statement)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStatement_Next()
	 * @model
	 * @generated
	 */
	Statement getNext();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Statement#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Statement value);

	/**
	 * Returns the value of the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Verb</em>' attribute.
	 * @see #setEndVerb(boolean)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStatement_EndVerb()
	 * @model required="true"
	 * @generated
	 */
	boolean isEndVerb();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Statement#isEndVerb <em>End Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Verb</em>' attribute.
	 * @see #isEndVerb()
	 * @generated
	 */
	void setEndVerb(boolean value);

} // Statement
