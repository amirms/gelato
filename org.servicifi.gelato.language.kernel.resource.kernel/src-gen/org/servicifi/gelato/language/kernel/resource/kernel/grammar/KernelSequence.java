/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

public class KernelSequence extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement {
	
	public KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.explode(getChildren(), " ");
	}
	
}
