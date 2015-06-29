/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Control Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.IOControlDescription#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getIOControlDescription()
 * @model
 * @generated
 */
public interface IOControlDescription extends IOControlParagraphWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo
	 * @see #setValue(IOControlDescriptionInfo)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getIOControlDescription_Value()
	 * @model required="true"
	 * @generated
	 */
	IOControlDescriptionInfo getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.IOControlDescription#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.IOControlDescriptionInfo
	 * @see #getValue()
	 * @generated
	 */
	void setValue(IOControlDescriptionInfo value);

} // IOControlDescription
