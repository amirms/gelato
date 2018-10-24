/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class KernelPlaceholder extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal {
	
	private final String tokenName;
	
	public KernelPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
