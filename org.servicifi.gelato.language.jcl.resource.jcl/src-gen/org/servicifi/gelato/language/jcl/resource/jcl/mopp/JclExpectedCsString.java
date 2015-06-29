/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.util.Collections;
import java.util.Set;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class JclExpectedCsString extends org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclAbstractExpectedElement {
	
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclKeyword keyword;
	
	public JclExpectedCsString(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public Set<String> getTokenNames() {
		return Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof JclExpectedCsString) {
			return getValue().equals(((JclExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
