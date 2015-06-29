/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl;


/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IJclCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
