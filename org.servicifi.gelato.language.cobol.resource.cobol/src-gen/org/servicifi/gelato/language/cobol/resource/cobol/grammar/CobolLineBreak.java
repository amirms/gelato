/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;


public class CobolLineBreak extends org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement {
	
	private final int tabs;
	
	public CobolLineBreak(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality, int tabs) {
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
