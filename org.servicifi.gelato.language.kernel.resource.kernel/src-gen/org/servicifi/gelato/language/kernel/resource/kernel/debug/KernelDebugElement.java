/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;

public abstract class KernelDebugElement extends DebugElement {
	
	/**
	 * Constructs a new debug element in the given target.
	 */
	public KernelDebugElement(IDebugTarget target) {
		super(target);
	}
	
	public String getModelIdentifier() {
		return org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelPlugin.DEBUG_MODEL_ID;
	}
	
	/**
	 * <p>
	 * Returns the breakpoint manager.
	 * </p>
	 * 
	 * @return the breakpoint manager
	 */
	protected IBreakpointManager getBreakpointManager() {
		return DebugPlugin.getDefault().getBreakpointManager();
	}
	
}
