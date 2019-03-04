/**
 */
package org.servicifi.gelato.language.kernel.parameters;

import java.util.Map;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.ElementReference;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.parameters.Parameter#getCorrespondingArgument <em>Corresponding Argument</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.parameters.Parameter#isByReference <em>By Reference</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.kernel.parameters.ParametersPackage#getParameter()
 * @generated
 */
public interface Parameter extends DataItem {
	/**
	 * Returns the value of the '<em><b>Corresponding Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Argument</em>' attribute.
	 * @see #setCorrespondingArgument(Map)
	 * @see org.servicifi.gelato.language.kernel.parameters.ParametersPackage#getParameter_CorrespondingArgument()
	 * @generated
	 */
	Map<ProcedureCall, Argument> getCorrespondingArgument();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.parameters.Parameter#getCorrespondingArgument <em>Corresponding Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Argument</em>' attribute.
	 * @see #getCorrespondingArgument()
	 * @generated
	 */
	void setCorrespondingArgument(Map<ProcedureCall, Argument> value);

	/**
	 * Returns the value of the '<em><b>By Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Reference</em>' attribute.
	 * @see #setByReference(boolean)
	 * @see org.servicifi.gelato.language.kernel.parameters.ParametersPackage#getParameter_ByReference()
	 * @generated
	 */
	boolean isByReference();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.parameters.Parameter#isByReference <em>By Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Reference</em>' attribute.
	 * @see #isByReference()
	 * @generated
	 */
	void setByReference(boolean value);

} // Parameter
