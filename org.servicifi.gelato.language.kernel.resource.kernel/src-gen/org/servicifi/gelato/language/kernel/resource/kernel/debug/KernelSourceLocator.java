/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;
import org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant;

public class KernelSourceLocator extends AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new ISourceLookupParticipant[]{new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelSourceLookupParticipant()});
	}
	
}
