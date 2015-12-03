/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.operators.Negate;
import org.servicifi.gelato.language.cobol.operators.RelationalOperator;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Start#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Start#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Start#getDataName <em>Data Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Start#getNot <em>Not</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends ErrorHandled, Statement {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' containment reference.
	 * @see #setFileName(FileNameReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStart_FileName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileNameReference getFileName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Start#getFileName <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' containment reference.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(FileNameReference value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(RelationalOperator)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStart_Operator()
	 * @model containment="true"
	 * @generated
	 */
	RelationalOperator getOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Start#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RelationalOperator value);

	/**
	 * Returns the value of the '<em><b>Data Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Name</em>' containment reference.
	 * @see #setDataName(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStart_DataName()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getDataName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Start#getDataName <em>Data Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Name</em>' containment reference.
	 * @see #getDataName()
	 * @generated
	 */
	void setDataName(Identifier value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(Negate)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getStart_Not()
	 * @model containment="true"
	 * @generated
	 */
	Negate getNot();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Start#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(Negate value);

} // Start
