/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.util;

/**
 * Class KernelTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.
 */
public class KernelTextResourceUtil {
	
	/**
	 * Use
	 * org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated	
	public static org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated	
	public static org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated	
	public static org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated	
	public static org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.getResource(uri, options);
	}
	
}
