/**
 */
package org.servicifi.gelato.analysis.framework.graphs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.graphs.Node#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.graphs.Node#getSuccessors <em>Successors</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.analysis.framework.graphs.GraphsPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.analysis.framework.graphs.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see org.servicifi.gelato.analysis.framework.graphs.GraphsPackage#getNode_Predecessors()
	 * @model
	 * @generated
	 */
	EList<Node> getPredecessors();

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.analysis.framework.graphs.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see org.servicifi.gelato.analysis.framework.graphs.GraphsPackage#getNode_Successors()
	 * @model
	 * @generated
	 */
	EList<Node> getSuccessors();

} // Node
