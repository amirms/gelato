/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Computer Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.ObjectComputerDescription#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getObjectComputerDescription()
 * @model
 * @generated
 */
public interface ObjectComputerDescription extends ObjectComputerParagraphWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo
	 * @see #setValue(ObjectComputerDescriptionInfo)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getObjectComputerDescription_Value()
	 * @model required="true"
	 * @generated
	 */
	ObjectComputerDescriptionInfo getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.ObjectComputerDescription#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerDescriptionInfo
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ObjectComputerDescriptionInfo value);

} // ObjectComputerDescription
