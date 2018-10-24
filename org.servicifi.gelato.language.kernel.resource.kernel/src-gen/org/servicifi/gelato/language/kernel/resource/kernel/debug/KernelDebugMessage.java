/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class KernelDebugMessage {
	
	private static final char DELIMITER = ':';
	private org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes messageType;
	private String[] arguments;
	
	public KernelDebugMessage(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public KernelDebugMessage(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.encode(DELIMITER, parts);
	}
	
	public static KernelDebugMessage deserialize(String response) {
		java.util.List<String> parts = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes type = org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.valueOf(messageType);
		KernelDebugMessage message = new KernelDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.explode(arguments, ", ") + "]";
	}
	
}
