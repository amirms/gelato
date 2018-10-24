/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class KernelDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugTarget debugTarget;
	
	private org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugCommunicationHelper communicationHelper = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugCommunicationHelper();
	
	public KernelDebugProxy(org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.EXIT);
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage getStack() {
		return sendCommandAndRead(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage message = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage message = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage response = sendCommandAndRead(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage response = sendCommandAndRead(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugVariable[] variables  = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugVariable variable = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes command, String... parameters) {
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage message = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage sendCommandAndRead(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes command, String... parameters) {
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage message = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
