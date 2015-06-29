/**
 */
package org.servicifi.gelato.language.cobol.literals;

import org.servicifi.gelato.language.cobol.labels.StopLabel;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.water.CICSStatementWater;
import org.servicifi.gelato.language.cobol.water.InvokeStatementWater;
import org.servicifi.gelato.language.cobol.water.SelectStatementWater;
import org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getLiteral()
 * @model abstract="true"
 * @generated
 */
public interface Literal extends SelectStatementWater, SpecialNamesParagraphWater, CICSStatementWater, PrimaryOperand, InvokeStatementWater, StopLabel {
} // Literal
