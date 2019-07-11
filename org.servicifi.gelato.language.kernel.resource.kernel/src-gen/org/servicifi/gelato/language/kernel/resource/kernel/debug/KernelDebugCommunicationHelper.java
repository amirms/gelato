/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class KernelDebugCommunicationHelper {
	
	public void sendEvent(org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage message, PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * <p>
	 * Sends a message using the given stream and waits for an answer.
	 * </p>
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage sendAndReceive(org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage message, PrintStream stream, BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * <p>
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * </p>
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage receive(BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage receivedMessage = org.servicifi.gelato.language.kernel.resource.kernel.debug.KernelDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (IOException e) {
			return null;
		}
	}
	
}
