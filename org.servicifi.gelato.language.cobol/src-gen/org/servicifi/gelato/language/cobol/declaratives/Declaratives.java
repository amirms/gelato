/**
 */
package org.servicifi.gelato.language.cobol.declaratives;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.sections.DeclarativeSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaratives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.declaratives.Declaratives#getDeclarativeSections <em>Declarative Sections</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.declaratives.DeclarativesPackage#getDeclaratives()
 * @model
 * @generated
 */
public interface Declaratives extends EObject {
	/**
	 * Returns the value of the '<em><b>Declarative Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.sections.DeclarativeSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarative Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarative Sections</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.declaratives.DeclarativesPackage#getDeclaratives_DeclarativeSections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DeclarativeSection> getDeclarativeSections();

} // Declaratives
