/**
 */
package org.servicifi.gelato.language.cobol.sections;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.dataitems.DataItem;

import org.servicifi.gelato.language.cobol.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Division Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.DataDivisionSection#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.DataDivisionSection#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage#getDataDivisionSection()
 * @model abstract="true"
 * @generated
 */
public interface DataDivisionSection extends Section {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage#getDataDivisionSection_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.dataitems.DataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage#getDataDivisionSection_Records()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataItem> getRecords();

} // DataDivisionSection
