/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class JclSyntaxElement {
	
	private JclSyntaxElement[] children;
	private JclSyntaxElement parent;
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality;
	
	public JclSyntaxElement(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality, JclSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (JclSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(JclSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public JclSyntaxElement getParent() {
		return parent;
	}
	
	public JclSyntaxElement[] getChildren() {
		if (children == null) {
			return new JclSyntaxElement[0];
		}
		return children;
	}
	
	public EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality getCardinality() {
		return cardinality;
	}
	
}
