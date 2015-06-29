/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.references.IndexNameReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Index Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.SetIndexName#getAdjust <em>Adjust</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.SetIndexName#getReceivers <em>Receivers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSetIndexName()
 * @model
 * @generated
 */
public interface SetIndexName extends SetStatement {
	/**
	 * Returns the value of the '<em><b>Adjust</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.statements.Adjustings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjust</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjust</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Adjustings
	 * @see #setAdjust(Adjustings)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSetIndexName_Adjust()
	 * @model required="true"
	 * @generated
	 */
	Adjustings getAdjust();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.SetIndexName#getAdjust <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjust</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Adjustings
	 * @see #getAdjust()
	 * @generated
	 */
	void setAdjust(Adjustings value);

	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.references.IndexNameReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receivers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSetIndexName_Receivers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IndexNameReference> getReceivers();

} // SetIndexName
