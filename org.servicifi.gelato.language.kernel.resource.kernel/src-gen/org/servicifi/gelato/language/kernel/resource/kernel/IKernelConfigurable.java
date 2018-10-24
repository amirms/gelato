/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;

/**
 * Implementors of this interface can be configured by a map of options (or
 * parameters).
 */
public interface IKernelConfigurable {
	
	/**
	 * Passes the options given by the map to the configurable object.
	 */
	public void setOptions(java.util.Map<?,?> options);
}
