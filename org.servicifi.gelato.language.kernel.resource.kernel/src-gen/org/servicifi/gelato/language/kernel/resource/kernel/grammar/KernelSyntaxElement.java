/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class KernelSyntaxElement {
	
	private KernelSyntaxElement[] children;
	private KernelSyntaxElement parent;
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality;
	
	public KernelSyntaxElement(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality, KernelSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (KernelSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(KernelSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public KernelSyntaxElement getParent() {
		return parent;
	}
	
	public KernelSyntaxElement[] getChildren() {
		if (children == null) {
			return new KernelSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality getCardinality() {
		return cardinality;
	}
	
}
