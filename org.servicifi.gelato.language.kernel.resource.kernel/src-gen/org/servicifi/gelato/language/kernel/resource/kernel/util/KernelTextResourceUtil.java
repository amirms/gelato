/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.util;

import java.io.File;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

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
	public static org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource getResource(IFile file) {
		return new org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource getResource(File file, Map<?,?> options) {
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource getResource(URI uri) {
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource getResource(URI uri, Map<?,?> options) {
		return org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil.getResource(uri, options);
	}
	
}
