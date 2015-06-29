/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class CobolSyntaxElement {
	
	private CobolSyntaxElement[] children;
	private CobolSyntaxElement parent;
	private org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality;
	
	public CobolSyntaxElement(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality, CobolSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (CobolSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(CobolSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public CobolSyntaxElement getParent() {
		return parent;
	}
	
	public CobolSyntaxElement[] getChildren() {
		if (children == null) {
			return new CobolSyntaxElement[0];
		}
		return children;
	}
	
	public EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality getCardinality() {
		return cardinality;
	}
	
}
