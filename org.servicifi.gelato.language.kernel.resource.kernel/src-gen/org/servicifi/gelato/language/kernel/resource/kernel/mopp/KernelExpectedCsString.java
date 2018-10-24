/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class KernelExpectedCsString extends org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelAbstractExpectedElement {
	
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword keyword;
	
	public KernelExpectedCsString(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof KernelExpectedCsString) {
			return getValue().equals(((KernelExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
