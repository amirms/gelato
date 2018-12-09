/**
 */
package org.servicifi.gelato.language.kernel.statements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.ParallelBlock#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getParallelBlock()
 * @generated
 */
public interface ParallelBlock extends Statement, StatementListContainer {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.kernel.statements.ExecutionOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see org.servicifi.gelato.language.kernel.statements.ExecutionOrder
	 * @see #setOrder(ExecutionOrder)
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getParallelBlock_Order()
	 * @generated
	 */
	ExecutionOrder getOrder();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.statements.ParallelBlock#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see org.servicifi.gelato.language.kernel.statements.ExecutionOrder
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(ExecutionOrder value);

} // ParallelBlock
