/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

public class KernelUIMetaInformation extends org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelMetaInformation {
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelHoverTextProvider getHoverTextProvider() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelHoverTextProvider();
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelImageProvider getImageProvider() {
		return org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelImageProvider.INSTANCE;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelColorManager createColorManager() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.servicifi.gelato.language.kernel.resource.kernel.IKernelT
	 * extResource,
	 * org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelColorManager)
	 * instead.
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelTokenScanner createTokenScanner(org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelTokenScanner createTokenScanner(org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource, org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelColorManager colorManager) {
		return new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelTokenScanner(resource, colorManager);
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCodeCompletionHelper createCodeCompletionHelper() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelCodeCompletionHelper();
	}
	
}
