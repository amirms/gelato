/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

public class KernelDebugProcess extends org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugElement implements org.eclipse.debug.core.model.IProcess, org.servicifi.gelato.language.kernel.resource.kernel.debug.IKernelDebugEventListener {
	
	private org.eclipse.debug.core.ILaunch launch;
	
	private boolean terminated = false;
	
	public KernelDebugProcess(org.eclipse.debug.core.ILaunch launch) {
		super(launch.getDebugTarget());
		this.launch = launch;
	}
	
	public boolean canTerminate() {
		return !terminated;
	}
	
	public boolean isTerminated() {
		return terminated;
	}
	
	public void terminate() throws org.eclipse.debug.core.DebugException {
		terminated = true;
	}
	
	public String getLabel() {
		return null;
	}
	
	public org.eclipse.debug.core.ILaunch getLaunch() {
		return launch;
	}
	
	public org.eclipse.debug.core.model.IStreamsProxy getStreamsProxy() {
		return null;
	}
	
	public void setAttribute(String key, String value) {
	}
	
	public String getAttribute(String key) {
		return null;
	}
	
	public int getExitValue() throws org.eclipse.debug.core.DebugException {
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
