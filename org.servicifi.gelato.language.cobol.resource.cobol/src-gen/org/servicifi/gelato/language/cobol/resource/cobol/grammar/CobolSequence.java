/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;


public class CobolSequence extends org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement {
	
	public CobolSequence(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.servicifi.gelato.language.cobol.resource.cobol.util.CobolStringUtil.explode(getChildren(), " ");
	}
	
}
