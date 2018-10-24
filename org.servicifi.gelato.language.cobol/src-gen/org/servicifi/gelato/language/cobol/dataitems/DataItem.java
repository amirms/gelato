/**
 */
package org.servicifi.gelato.language.cobol.dataitems;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.references.ReferenceableElement;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getLevelNumber <em>Level Number</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getSubentries <em>Subentries</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getSuperentry <em>Superentry</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getDataItem()
 * @model
 * @generated
 */
public interface DataItem extends ReferenceableElement, IncompleteElement {
	/**
	 * Returns the value of the '<em><b>Level Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Number</em>' attribute.
	 * @see #setLevelNumber(String)
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getDataItem_LevelNumber()
	 * @model required="true"
	 * @generated
	 */
	String getLevelNumber();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getLevelNumber <em>Level Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Number</em>' attribute.
	 * @see #getLevelNumber()
	 * @generated
	 */
	void setLevelNumber(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getDataItem_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataItemAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Subentries</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.dataitems.DataItem}.
	 * It is bidirectional and its opposite is '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getSuperentry <em>Superentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subentries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subentries</em>' reference list.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getDataItem_Subentries()
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItem#getSuperentry
	 * @model opposite="superentry"
	 * @generated
	 */
	EList<DataItem> getSubentries();

	/**
	 * Returns the value of the '<em><b>Superentry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getSubentries <em>Subentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superentry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superentry</em>' reference.
	 * @see #setSuperentry(DataItem)
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getDataItem_Superentry()
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItem#getSubentries
	 * @model opposite="subentries"
	 * @generated
	 */
	DataItem getSuperentry();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getSuperentry <em>Superentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superentry</em>' reference.
	 * @see #getSuperentry()
	 * @generated
	 */
	void setSuperentry(DataItem value);

} // DataItem
