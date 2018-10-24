/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

public class KernelCompound extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement {
	
	public KernelCompound(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice choice, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality) {
		super(cardinality, new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
