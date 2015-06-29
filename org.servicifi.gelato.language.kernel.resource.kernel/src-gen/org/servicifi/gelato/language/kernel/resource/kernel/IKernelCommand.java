/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;


/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IKernelCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
