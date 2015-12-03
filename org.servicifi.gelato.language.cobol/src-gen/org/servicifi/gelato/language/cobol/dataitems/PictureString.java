/**
 */
package org.servicifi.gelato.language.cobol.dataitems;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picture String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.PictureString#getPicture <em>Picture</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getPictureString()
 * @model
 * @generated
 */
public interface PictureString extends DataItemAttribute {
	/**
	 * Returns the value of the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' attribute.
	 * @see #setPicture(String)
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getPictureString_Picture()
	 * @model required="true"
	 * @generated
	 */
	String getPicture();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.dataitems.PictureString#getPicture <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture</em>' attribute.
	 * @see #getPicture()
	 * @generated
	 */
	void setPicture(String value);

} // PictureString
