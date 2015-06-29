/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.util;

import java.io.File;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * Class CobolTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil.
 */
public class CobolTextResourceUtil {
	
	/**
	 * Use
	 * org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil.getRes
	 * ource() instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResource getResource(IFile file) {
		return new org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil.getRes
	 * ource() instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResource getResource(File file, Map<?,?> options) {
		return org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil.getRes
	 * ource() instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResource getResource(URI uri) {
		return org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil.getRes
	 * ource() instead.
	 */
	@Deprecated
	public static org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResource getResource(URI uri, Map<?,?> options) {
		return org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil.getResource(uri, options);
	}
	
}
