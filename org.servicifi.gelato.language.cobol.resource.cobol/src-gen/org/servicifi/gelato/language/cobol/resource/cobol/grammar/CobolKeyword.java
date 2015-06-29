/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;


/**
 * A class to represent a keyword in the grammar.
 */
public class CobolKeyword extends org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement {
	
	private final String value;
	
	public CobolKeyword(String value, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
