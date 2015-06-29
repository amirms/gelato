/**
 */
package org.servicifi.gelato.language.kernel.analyses;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.kernel.commons.LabellableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.IteratorElement#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.IteratorElement#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getIteratorElement()
 * @generated
 */
public interface IteratorElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' attribute.
	 * @see #setIteration(int)
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getIteratorElement_Iteration()
	 * @generated
	 */
	int getIteration();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.analyses.IteratorElement#getIteration <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' attribute.
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(int value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(LabellableElement)
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesPackage#getIteratorElement_Element()
	 * @generated
	 */
	LabellableElement getElement();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.analyses.IteratorElement#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(LabellableElement value);

} // IteratorElement
