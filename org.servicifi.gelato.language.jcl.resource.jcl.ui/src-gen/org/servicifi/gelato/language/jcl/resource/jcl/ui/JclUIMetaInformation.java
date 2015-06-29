/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

import org.eclipse.core.resources.IResource;

public class JclUIMetaInformation extends org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMetaInformation {
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclHoverTextProvider getHoverTextProvider() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclHoverTextProvider();
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.ui.JclImageProvider getImageProvider() {
		return org.servicifi.gelato.language.jcl.resource.jcl.ui.JclImageProvider.INSTANCE;
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.ui.JclColorManager createColorManager() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResour
	 * ce, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclColorManager) instead.
	 */
	public org.servicifi.gelato.language.jcl.resource.jcl.ui.JclTokenScanner createTokenScanner(org.servicifi.gelato.language.jcl.resource.jcl.ui.JclColorManager colorManager) {
		return (org.servicifi.gelato.language.jcl.resource.jcl.ui.JclTokenScanner) createTokenScanner(null, colorManager);
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.ui.IJclTokenScanner createTokenScanner(org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource, org.servicifi.gelato.language.jcl.resource.jcl.ui.JclColorManager colorManager) {
		return new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclTokenScanner(resource, colorManager);
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.ui.JclCodeCompletionHelper createCodeCompletionHelper() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclCodeCompletionHelper();
	}
	
	@SuppressWarnings("rawtypes")
	public Object createResourceAdapter(Object adaptableObject, Class adapterType, IResource resource) {
		return new org.servicifi.gelato.language.jcl.resource.jcl.ui.debug.JclLineBreakpointAdapter();
	}
	
}
