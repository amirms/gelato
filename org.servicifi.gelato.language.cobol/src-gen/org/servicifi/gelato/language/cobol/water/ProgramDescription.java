/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.ProgramDescription#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getProgramDescription()
 * @model
 * @generated
 */
public interface ProgramDescription extends IdentificationDivisionWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo
	 * @see #setValue(ProgramDescriptionInfo)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getProgramDescription_Value()
	 * @model required="true"
	 * @generated
	 */
	ProgramDescriptionInfo getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.ProgramDescription#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.ProgramDescriptionInfo
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ProgramDescriptionInfo value);

} // ProgramDescription
