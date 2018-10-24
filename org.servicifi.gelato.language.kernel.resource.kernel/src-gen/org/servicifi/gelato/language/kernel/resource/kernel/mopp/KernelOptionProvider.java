/**
 * <copyright>
 * </copyright>
 *
 * 
 */
/**
 * This class can be used to configure options that must be used when resources
 * are loaded. This is similar to using the extension point
 * 'org.servicifi.gelato.language.kernel.resource.kernel.default_load_options'
 * with the difference that the options defined in this class are used even if no
 * Eclipse platform is running.
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

public class KernelOptionProvider implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptionProvider {
	
	public java.util.Map<?,?> getOptions() {
		// create a map with static option providers here
		return java.util.Collections.emptyMap();
	}
	
}
