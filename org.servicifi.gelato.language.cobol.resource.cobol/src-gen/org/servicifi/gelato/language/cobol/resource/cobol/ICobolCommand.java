/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol;


/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ICobolCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
