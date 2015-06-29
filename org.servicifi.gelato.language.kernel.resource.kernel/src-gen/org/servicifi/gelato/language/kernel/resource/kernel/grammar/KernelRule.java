/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * A class to represent a rules in the grammar.
 */
public class KernelRule extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement {
	
	private final EClass metaclass;
	
	public KernelRule(EClass metaclass, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice choice, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality) {
		super(cardinality, new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public EClass getMetaclass() {
		return metaclass;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getDefinition() {
		return (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice) getChildren()[0];
	}
	
}

