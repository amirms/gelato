/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;

public class KernelDebugProcess extends org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugElement implements IProcess, org.servicifi.gelato.language.kernel.resource.kernel.debug.IKernelDebugEventListener {
	
	private ILaunch launch;
	
	private boolean terminated = false;
	
	public KernelDebugProcess(ILaunch launch) {
		super(launch.getDebugTarget());
		this.launch = launch;
	}
	
	public boolean canTerminate() {
		return !terminated;
	}
	
	public boolean isTerminated() {
		return terminated;
	}
	
	public void terminate() throws DebugException {
		terminated = true;
	}
	
	public String getLabel() {
		return null;
	}
	
	public ILaunch getLaunch() {
		return launch;
	}
	
	public IStreamsProxy getStreamsProxy() {
		return null;
	}
	
	public void setAttribute(String key, String value) {
	}
	
	public String getAttribute(String key) {
		return null;
	}
	
	public int getExitValue() throws DebugException {
		return 0;
	}
	
	public void handleMessage(org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage message) {
		if (message.hasType(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.TERMINATED)) {
			terminated = true;
		} else {
			// ignore other events
		}
	}
	
}
