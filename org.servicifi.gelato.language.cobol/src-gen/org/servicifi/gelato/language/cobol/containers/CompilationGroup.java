/**
 */
package org.servicifi.gelato.language.cobol.containers;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.commons.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.CompilationGroup#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.containers.ContainersPackage#getCompilationGroup()
 * @model
 * @generated
 */
public interface CompilationGroup extends CobolRoot, NamedElement {
	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.containers.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.containers.ContainersPackage#getCompilationGroup_CompilationUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompilationUnit> getCompilationUnits();

} // CompilationGroup
