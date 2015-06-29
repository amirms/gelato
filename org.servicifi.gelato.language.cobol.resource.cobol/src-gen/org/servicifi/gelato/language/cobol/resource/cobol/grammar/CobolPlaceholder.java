/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class to represent placeholders in a grammar.
 */
public class CobolPlaceholder extends org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal {
	
	private final String tokenName;
	
	public CobolPlaceholder(EStructuralFeature feature, String tokenName, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
