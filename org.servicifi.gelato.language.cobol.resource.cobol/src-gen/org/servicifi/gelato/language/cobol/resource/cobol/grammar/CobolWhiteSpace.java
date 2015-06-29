/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;


public class CobolWhiteSpace extends org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement {
	
	private final int amount;
	
	public CobolWhiteSpace(int amount, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
