/**
 */
package org.servicifi.gelato.language.cobol.functions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.functions.Argument#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.functions.FunctionsPackage#getArgument()
 * @model abstract="true"
 * @generated
 */
public interface Argument extends EObject {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.PrimaryOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.functions.FunctionsPackage#getArgument_Operands()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimaryOperand> getOperands();

} // Argument
