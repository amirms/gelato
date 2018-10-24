/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class KernelRule extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public KernelRule(org.eclipse.emf.ecore.EClass metaclass, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice choice, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality) {
		super(cardinality, new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getDefinition() {
		return (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice) getChildren()[0];
	}
	
}

