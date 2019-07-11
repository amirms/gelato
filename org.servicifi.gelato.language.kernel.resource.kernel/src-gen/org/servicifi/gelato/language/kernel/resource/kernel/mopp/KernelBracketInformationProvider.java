/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class KernelBracketInformationProvider {
	
	public Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelBracketPair> getBracketPairs() {
		Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelBracketPair> result = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelBracketPair>();
		result.add(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelBracketPair("{", "}", true, true));
		result.add(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelBracketPair("(", ")", true, false));
		result.add(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelBracketPair("[", "]", true, false));
		return result;
	}
	
}
