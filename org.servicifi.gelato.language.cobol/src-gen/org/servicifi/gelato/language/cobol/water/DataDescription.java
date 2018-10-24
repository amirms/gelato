/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.DataDescription#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getDataDescription()
 * @model
 * @generated
 */
public interface DataDescription extends DataDescriptorWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.DataDescriptionInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.DataDescriptionInfo
	 * @see #setValue(DataDescriptionInfo)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getDataDescription_Value()
	 * @model required="true"
	 * @generated
	 */
	DataDescriptionInfo getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.DataDescription#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.DataDescriptionInfo
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataDescriptionInfo value);

} // DataDescription
