/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.conditions.ExpressionList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Evaluate#getCases <em>Cases</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Evaluate#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getEvaluate()
 * @model
 * @generated
 */
public interface Evaluate extends Statement {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.statements.EvaluateCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getEvaluate_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EvaluateCase> getCases();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(ExpressionList)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getEvaluate_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionList getSubject();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Evaluate#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(ExpressionList value);

} // Evaluate
