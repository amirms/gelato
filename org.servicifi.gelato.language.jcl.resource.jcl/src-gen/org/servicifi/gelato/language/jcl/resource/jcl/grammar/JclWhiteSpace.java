/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;


public class JclWhiteSpace extends org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclFormattingElement {
	
	private final int amount;
	
	public JclWhiteSpace(int amount, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality) {
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
