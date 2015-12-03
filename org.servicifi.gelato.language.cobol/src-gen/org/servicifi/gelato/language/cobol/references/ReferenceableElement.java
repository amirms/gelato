/**
 */
package org.servicifi.gelato.language.cobol.references;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.commons.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenceable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesTo <em>Aliases To</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesFrom <em>Aliases From</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.references.ReferencesPackage#getReferenceableElement()
 * @model abstract="true"
 * @generated
 */
public interface ReferenceableElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Aliases To</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.references.ReferenceableElement}.
	 * It is bidirectional and its opposite is '{@link org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesFrom <em>Aliases From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases To</em>' reference list.
	 * @see org.servicifi.gelato.language.cobol.references.ReferencesPackage#getReferenceableElement_AliasesTo()
	 * @see org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesFrom
	 * @model opposite="aliasesFrom"
	 * @generated
	 */
	EList<ReferenceableElement> getAliasesTo();

	/**
	 * Returns the value of the '<em><b>Aliases From</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.references.ReferenceableElement}.
	 * It is bidirectional and its opposite is '{@link org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesTo <em>Aliases To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases From</em>' reference list.
	 * @see org.servicifi.gelato.language.cobol.references.ReferencesPackage#getReferenceableElement_AliasesFrom()
	 * @see org.servicifi.gelato.language.cobol.references.ReferenceableElement#getAliasesTo
	 * @model opposite="aliasesTo"
	 * @generated
	 */
	EList<ReferenceableElement> getAliasesFrom();

} // ReferenceableElement
