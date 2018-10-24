/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

public class KernelWhiteSpace extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement {
	
	private final int amount;
	
	public KernelWhiteSpace(int amount, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality) {
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
