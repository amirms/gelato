/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class to represent placeholders in a grammar.
 */
public class KernelPlaceholder extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal {
	
	private final String tokenName;
	
	public KernelPlaceholder(EStructuralFeature feature, String tokenName, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
