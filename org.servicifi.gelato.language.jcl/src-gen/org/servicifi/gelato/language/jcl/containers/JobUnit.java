/**
 */
package org.servicifi.gelato.language.jcl.containers;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.jcl.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.jcl.containers.JobUnit#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.jcl.containers.ContainersPackage#getJobUnit()
 * @model
 * @generated
 */
public interface JobUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference.
	 * @see #setStatements(Statement)
	 * @see org.servicifi.gelato.language.jcl.containers.ContainersPackage#getJobUnit_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStatements();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.jcl.containers.JobUnit#getStatements <em>Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statements</em>' containment reference.
	 * @see #getStatements()
	 * @generated
	 */
	void setStatements(Statement value);

} // JobUnit
