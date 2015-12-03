/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.strings.Replacement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initialize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Initialize#getSubprograms <em>Subprograms</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Initialize#getReplacements <em>Replacements</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getInitialize()
 * @model
 * @generated
 */
public interface Initialize extends Statement {
	/**
	 * Returns the value of the '<em><b>Subprograms</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.identifiers.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprograms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprograms</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getInitialize_Subprograms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getSubprograms();

	/**
	 * Returns the value of the '<em><b>Replacements</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.strings.Replacement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacements</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getInitialize_Replacements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Replacement> getReplacements();

} // Initialize
