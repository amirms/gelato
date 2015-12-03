/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.SearchStatement#getCases <em>Cases</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.SearchStatement#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSearchStatement()
 * @model abstract="true"
 * @generated
 */
public interface SearchStatement extends Statement, ErrorHandled {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSearchStatement_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NormalEvaluateCase> getCases();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSearchStatement_Table()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryOperand getTable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.SearchStatement#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(PrimaryOperand value);

} // SearchStatement
