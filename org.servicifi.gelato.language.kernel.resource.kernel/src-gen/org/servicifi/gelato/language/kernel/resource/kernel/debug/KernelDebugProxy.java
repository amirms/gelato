/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class KernelDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private PrintStream output;
	
	private BufferedReader reader;
	
	private org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugTarget debugTarget;
	
	private org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugCommunicationHelper communicationHelper = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugCommunicationHelper();
	
	public KernelDebugProxy(org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugTarget debugTarget, int requestPort) throws UnknownHostException, IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws UnknownHostException, IOException {
		// creating client proxy socket (trying to connect)...
		Socket client = new Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			BufferedInputStream input = new BufferedInputStream(client.getInputStream());
			reader = new BufferedReader(new InputStreamReader(input));
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			output = new PrintStream(client.getOutputStream());
		} catch (IOException e) {
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
	
	public IVariable[] getStackVariables(String stackFrame) {
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage response = sendCommandAndRead(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public IVariable[] getVariables(String... requestedIDs) {
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage response = sendCommandAndRead(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugVariable[] variables  = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			Map<String, String> properties = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			Map<String, Long> childVariables = new TreeMap<String, Long>(new Comparator<String>() {
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
			IValue value = new org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
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
