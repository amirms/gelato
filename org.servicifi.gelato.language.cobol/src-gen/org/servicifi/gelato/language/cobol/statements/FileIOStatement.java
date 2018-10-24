/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.ios.InputDirective;
import org.servicifi.gelato.language.cobol.ios.OutputDirective;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File IO Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getInput <em>Input</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getOutput <em>Output</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getKeyDescriptors <em>Key Descriptors</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getFileIOStatement()
 * @model abstract="true"
 * @generated
 */
public interface FileIOStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' containment reference.
	 * @see #setFileName(FileNameReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getFileIOStatement_FileName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileNameReference getFileName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getFileName <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' containment reference.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(FileNameReference value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(InputDirective)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getFileIOStatement_Input()
	 * @model containment="true"
	 * @generated
	 */
	InputDirective getInput();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputDirective value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(OutputDirective)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getFileIOStatement_Output()
	 * @model containment="true"
	 * @generated
	 */
	OutputDirective getOutput();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(OutputDirective value);

	/**
	 * Returns the value of the '<em><b>Key Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.statements.KeyDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Descriptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Descriptors</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getFileIOStatement_KeyDescriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<KeyDescriptor> getKeyDescriptors();

} // FileIOStatement
