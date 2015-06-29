/**
 */
package org.servicifi.gelato.language.cobol.identifiers;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.references.ElementReference;
import org.servicifi.gelato.language.cobol.references.Qualifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.IdentifierReference#getSubscripts <em>Subscripts</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.IdentifierReference#getQualifiers <em>Qualifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getIdentifierReference()
 * @model
 * @generated
 */
public interface IdentifierReference extends Identifier, ElementReference, Qualifiable {
	/**
	 * Returns the value of the '<em><b>Subscripts</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.identifiers.Subscript}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscripts</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getIdentifierReference_Subscripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscript> getSubscripts();

	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.identifiers.Qualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifiers</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getIdentifierReference_Qualifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Qualifier> getQualifiers();

} // IdentifierReference
