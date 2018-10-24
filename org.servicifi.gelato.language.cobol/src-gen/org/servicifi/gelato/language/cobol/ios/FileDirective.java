/**
 */
package org.servicifi.gelato.language.cobol.ios;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.ios.FileDirective#getFileNames <em>File Names</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.ios.IosPackage#getFileDirective()
 * @model abstract="true"
 * @generated
 */
public interface FileDirective extends IODirectives {
	/**
	 * Returns the value of the '<em><b>File Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.references.FileNameReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Names</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.ios.IosPackage#getFileDirective_FileNames()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FileNameReference> getFileNames();

} // FileDirective
