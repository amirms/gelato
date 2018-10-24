/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.IOStatement#getIoFileDescriptors <em>Io File Descriptors</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getIOStatement()
 * @model abstract="true"
 * @generated
 */
public interface IOStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Io File Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.statements.IOFileDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io File Descriptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io File Descriptors</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getIOStatement_IoFileDescriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IOFileDescriptor> getIoFileDescriptors();

} // IOStatement
