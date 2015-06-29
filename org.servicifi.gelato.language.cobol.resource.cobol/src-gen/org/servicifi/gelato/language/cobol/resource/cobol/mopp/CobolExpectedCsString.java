/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.Collections;
import java.util.Set;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class CobolExpectedCsString extends org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolAbstractExpectedElement {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolKeyword keyword;
	
	public CobolExpectedCsString(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public Set<String> getTokenNames() {
		return Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof CobolExpectedCsString) {
			return getValue().equals(((CobolExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
