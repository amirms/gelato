/**
 */
package org.servicifi.gelato.language.cobol.dataitems;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.RecordName#getElems <em>Elems</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getRecordName()
 * @model
 * @generated
 */
public interface RecordName extends DataItem {
	/**
	 * Returns the value of the '<em><b>Elems</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.dataitems.DataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elems</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getRecordName_Elems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataItem> getElems();

} // RecordName
