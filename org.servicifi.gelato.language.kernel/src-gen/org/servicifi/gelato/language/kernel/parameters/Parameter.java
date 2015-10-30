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
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.parameters.Parameter#getCorrespondingArgument <em>Corresponding Argument</em>}</li>
 * </ul>
 * </p>
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

} // Parameter
