/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform Procedure Until Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition#getAfters <em>Afters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getPerformProcedureUntilCondition()
 * @model
 * @generated
 */
public interface PerformProcedureUntilCondition extends PerformUntilCondition, PerformProcedure {
	/**
	 * Returns the value of the '<em><b>Afters</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.statements.AfterUntilCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Afters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Afters</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getPerformProcedureUntilCondition_Afters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AfterUntilCondition> getAfters();

} // PerformProcedureUntilCondition
