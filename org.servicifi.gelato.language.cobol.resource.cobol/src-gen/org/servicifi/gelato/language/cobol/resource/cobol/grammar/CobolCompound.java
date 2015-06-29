/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;


public class CobolCompound extends org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement {
	
	public CobolCompound(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolChoice choice, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality) {
		super(cardinality, new org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
