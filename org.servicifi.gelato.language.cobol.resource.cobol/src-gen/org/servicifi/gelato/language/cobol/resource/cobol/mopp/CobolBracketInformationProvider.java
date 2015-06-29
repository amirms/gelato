/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class CobolBracketInformationProvider {
	
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolBracketPair> getBracketPairs() {
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolBracketPair> result = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ICobolBracketPair>();
		result.add(new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolBracketPair("(", ")", true, false));
		return result;
	}
	
}
