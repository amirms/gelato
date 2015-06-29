/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.util;

import java.io.File;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * Class JclTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.servicifi.gelato.language.jcl.resource.jcl.util.JclResourceUtil.
 */
public class JclTextResourceUtil {
	
	/**
	 * Use
	 * org.servicifi.gelato.language.jcl.resource.jcl.util.JclResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResource getResource(IFile file) {
		return new org.servicifi.gelato.language.jcl.resource.jcl.util.JclEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.jcl.resource.jcl.util.JclResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResource getResource(File file, Map<?,?> options) {
		return org.servicifi.gelato.language.jcl.resource.jcl.util.JclResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.jcl.resource.jcl.util.JclResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResource getResource(URI uri) {
		return org.servicifi.gelato.language.jcl.resource.jcl.util.JclResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.jcl.resource.jcl.util.JclResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResource getResource(URI uri, Map<?,?> options) {
		return org.servicifi.gelato.language.jcl.resource.jcl.util.JclResourceUtil.getResource(uri, options);
	}
	
}
