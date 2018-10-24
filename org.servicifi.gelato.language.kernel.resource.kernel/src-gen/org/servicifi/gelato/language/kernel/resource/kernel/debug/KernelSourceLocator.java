/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

public class KernelSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelSourceLookupParticipant()});
	}
	
}
