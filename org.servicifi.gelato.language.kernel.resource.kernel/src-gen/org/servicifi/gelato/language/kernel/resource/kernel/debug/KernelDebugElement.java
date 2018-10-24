/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

public abstract class KernelDebugElement extends org.eclipse.debug.core.model.DebugElement {
	
	/**
	 * Constructs a new debug element in the given target.
	 */
	public KernelDebugElement(org.eclipse.debug.core.model.IDebugTarget target) {
		super(target);
	}
	
	public String getModelIdentifier() {
		return org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelPlugin.DEBUG_MODEL_ID;
	}
	
	/**
	 * Returns the breakpoint manager.
	 * 
	 * @return the breakpoint manager
	 */
	protected org.eclipse.debug.core.IBreakpointManager getBreakpointManager() {
		return org.eclipse.debug.core.DebugPlugin.getDefault().getBreakpointManager();
	}
	
}
