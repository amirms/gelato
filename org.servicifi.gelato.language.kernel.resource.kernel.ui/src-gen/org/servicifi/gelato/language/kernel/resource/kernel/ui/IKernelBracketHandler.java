/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;


/**
 * The BracketHandler is responsible for handling the input of brackets. It
 * automatically adds closing brackets, if the opening counterpart is entered in
 * editors. It does also ignore the input of closing brackets, if these were
 * automatically inserted right before.
 */
public interface IKernelBracketHandler {
	
	/**
	 * If a closing bracket was added right before, this method returns true.
	 */
	public boolean addedClosingBracket();
	
	/**
	 * Returns the last closing bracket that was added automatically.
	 */
	public String getClosingBracket();
	
}
