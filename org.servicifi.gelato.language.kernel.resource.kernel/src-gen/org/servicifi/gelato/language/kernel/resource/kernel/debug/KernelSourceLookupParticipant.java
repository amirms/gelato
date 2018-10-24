/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

public class KernelSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelStackFrame) {
			org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelStackFrame frame = (org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
