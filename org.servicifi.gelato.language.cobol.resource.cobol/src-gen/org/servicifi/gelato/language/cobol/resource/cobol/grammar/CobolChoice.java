/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;


public class CobolChoice extends org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement {
	
	public CobolChoice(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.servicifi.gelato.language.cobol.resource.cobol.util.CobolStringUtil.explode(getChildren(), "|");
	}
	
}
