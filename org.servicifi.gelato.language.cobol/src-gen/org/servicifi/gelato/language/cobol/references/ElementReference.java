/**
 */
package org.servicifi.gelato.language.cobol.references;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.references.ElementReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.references.ReferencesPackage#getElementReference()
 * @model abstract="true"
 * @generated
 */
public interface ElementReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ReferenceableElement)
	 * @see org.servicifi.gelato.language.cobol.references.ReferencesPackage#getElementReference_Target()
	 * @model required="true"
	 * @generated
	 */
	ReferenceableElement getTarget();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.references.ElementReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ReferenceableElement value);

} // ElementReference
