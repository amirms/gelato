/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

public class KernelChoice extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement {
	
	public KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.explode(getChildren(), "|");
	}
	
}
