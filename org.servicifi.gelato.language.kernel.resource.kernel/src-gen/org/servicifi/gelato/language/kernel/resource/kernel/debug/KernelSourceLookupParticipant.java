/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;

public class KernelSourceLookupParticipant extends AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws CoreException {
		if (object instanceof org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelStackFrame) {
			org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelStackFrame frame = (org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
