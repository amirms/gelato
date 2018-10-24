/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class KernelKeyword extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement {
	
	private final String value;
	
	public KernelKeyword(String value, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality) {
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
