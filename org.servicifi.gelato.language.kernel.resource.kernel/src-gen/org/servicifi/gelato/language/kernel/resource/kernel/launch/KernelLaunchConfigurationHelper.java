/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.launch;

import java.io.IOException;
import java.net.ServerSocket;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * A class that provides common methods that are required by launch configuration
 * delegates.
 */
public class KernelLaunchConfigurationHelper {
	
	public static class SystemOutInterpreter extends org.servicifi.gelato.language.kernel.resource.kernel.util.AbstractKernelInterpreter<Void,Void> {
		
		@Override
		public Void interprete(EObject object, Void context) {
			System.out.println("Found " + object + ", but don't know what to do with it.");
			return null;
		}
	}
	
	/**
	 * Launch an example interpreter that prints object to System.out.
	 */
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		EObject root = getModelRoot(configuration);
		// replace this delegate with your actual interpreter
		SystemOutInterpreter delegate = new SystemOutInterpreter();
		delegate.addObjectTreeToInterpreteTopDown(root);
		launchInterpreter(configuration, mode, launch, monitor, delegate, null);
	}
	
	public <ResultType, ContextType> void launchInterpreter(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor, org.servicifi.gelato.language.kernel.resource.kernel.util.AbstractKernelInterpreter<ResultType, ContextType> delegate, final ContextType context) throws CoreException {
		final boolean enableDebugger = mode.equals(ILaunchManager.DEBUG_MODE);
		// step 1: find two free ports we can use to communicate between the Eclipse and
		// the interpreter
		int requestPort = findFreePort();
		int eventPort = findFreePort();
		if (requestPort < 0 || eventPort < 0) {
			abort("Unable to find free port", null);
		}
		
		final org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebuggableInterpreter<ResultType, ContextType> interpreter = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebuggableInterpreter<ResultType, ContextType>(delegate, eventPort);
		
		// step 2: prepare and start interpreter in separate thread
		Thread interpreterThread = new Thread(new Runnable() {
			
			public void run() {
				// if we are in debug mode, the interpreter must wait for the debugger to attach
				interpreter.interprete(context, enableDebugger);
			}
		});
		interpreterThread.start();
		
		// step 3: start debugger listener (sends commands from Eclipse debug framework to
		// running process
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebuggerListener<ResultType, ContextType> debugListener = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebuggerListener<ResultType, ContextType>(requestPort);
		debugListener.setDebuggable(interpreter);
		new Thread(debugListener).start();
		
		// step 4: start debugger
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugProcess process = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugProcess(launch);
		launch.addDebugTarget(new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugTarget(process, launch, requestPort, eventPort));
	}
	
	public URI getURI(ILaunchConfiguration configuration) throws CoreException {
		return URI.createURI(configuration.getAttribute(org.servicifi.gelato.language.kernel.resource.kernel.launch.KernelLaunchConfigurationDelegate.ATTR_RESOURCE_URI, (String) null));
	}
	
	public EObject getModelRoot(ILaunchConfiguration configuration) throws CoreException {
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.getResourceContent(getURI(configuration));
	}
	
	/**
	 * Returns a free port number on localhost, or -1 if unable to find a free port.
	 */
	protected int findFreePort() {
		ServerSocket socket = null;
		try {
			socket = new ServerSocket(0);
			return socket.getLocalPort();
		} catch (IOException e) {
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
		return -1;
	}
	/**
	 * <p>
	 * Throws an exception with a new status containing the given message and optional
	 * exception.
	 * </p>
	 * 
	 * @param message error message
	 * @param e underlying exception
	 * 
	 * @throws CoreException
	 */
	protected void abort(String message, Throwable e) throws CoreException {
		throw new CoreException(new Status(IStatus.ERROR, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelPlugin.DEBUG_MODEL_ID, 0, message, e));
	}
}
