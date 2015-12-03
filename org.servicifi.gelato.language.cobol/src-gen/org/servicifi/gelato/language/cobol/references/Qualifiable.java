/**
 */
package org.servicifi.gelato.language.cobol.references;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.references.Qualifiable#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.references.ReferencesPackage#getQualifiable()
 * @model abstract="true"
 * @generated
 */
public interface Qualifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(ElementReference)
	 * @see org.servicifi.gelato.language.cobol.references.ReferencesPackage#getQualifiable_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	ElementReference getQualifier();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.references.Qualifiable#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(ElementReference value);

} // Qualifiable
