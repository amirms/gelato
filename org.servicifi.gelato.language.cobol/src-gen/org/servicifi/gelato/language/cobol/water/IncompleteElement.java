/**
 */
package org.servicifi.gelato.language.cobol.water;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incomplete Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.IncompleteElement#getWater <em>Water</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getIncompleteElement()
 * @model abstract="true"
 * @generated
 */
public interface IncompleteElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Water</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.water.Water}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getIncompleteElement_Water()
	 * @model containment="true"
	 * @generated
	 */
	EList<Water> getWater();

} // IncompleteElement
