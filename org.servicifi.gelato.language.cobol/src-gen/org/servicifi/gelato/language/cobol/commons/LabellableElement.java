/**
 */
package org.servicifi.gelato.language.cobol.commons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labellable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.commons.LabellableElement#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.commons.CommonsPackage#getLabellableElement()
 * @model abstract="true"
 * @generated
 */
public interface LabellableElement extends Commentable {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.servicifi.gelato.language.cobol.commons.CommonsPackage#getLabellableElement_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.commons.LabellableElement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // LabellableElement
