/**
 */
package org.servicifi.gelato.language.cobol.ios;

import org.servicifi.gelato.language.cobol.labels.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.ios.ProcedureDirective#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.ios.IosPackage#getProcedureDirective()
 * @model abstract="true"
 * @generated
 */
public interface ProcedureDirective extends IODirectives {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see org.servicifi.gelato.language.cobol.ios.IosPackage#getProcedureDirective_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.ios.ProcedureDirective#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

} // ProcedureDirective
