/**
 */
package org.servicifi.gelato.language.cobol.dataitems;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.Usage#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.Usage#isIsNative <em>Is Native</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getUsage()
 * @model
 * @generated
 */
public interface Usage extends DataItemAttribute {
	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.dataitems.Usages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Usages
	 * @see #setUsage(Usages)
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getUsage_Usage()
	 * @model required="true"
	 * @generated
	 */
	Usages getUsage();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.dataitems.Usage#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Usages
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(Usages value);

	/**
	 * Returns the value of the '<em><b>Is Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Native</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Native</em>' attribute.
	 * @see #setIsNative(boolean)
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getUsage_IsNative()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsNative();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.dataitems.Usage#isIsNative <em>Is Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Native</em>' attribute.
	 * @see #isIsNative()
	 * @generated
	 */
	void setIsNative(boolean value);

} // Usage
