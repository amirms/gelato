/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class to represent placeholders in a grammar.
 */
public class JclPlaceholder extends org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclTerminal {
	
	private final String tokenName;
	
	public JclPlaceholder(EStructuralFeature feature, String tokenName, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
