/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;


public class KernelLineBreak extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement {
	
	private final int tabs;
	
	public KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
