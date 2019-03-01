/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

public class CobolUIMetaInformation extends org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolMetaInformation {
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolHoverTextProvider getHoverTextProvider() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolHoverTextProvider();
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolImageProvider getImageProvider() {
		return org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolImageProvider.INSTANCE;
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolColorManager createColorManager() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.servicifi.gelato.language.cobol.resource.cobol.ICobolText
	 * Resource,
	 * org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolColorManager)
	 * instead.
	 */
	public org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolTokenScanner createTokenScanner(org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolTokenScanner createTokenScanner(org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource, org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolColorManager colorManager) {
		return new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolTokenScanner(resource, colorManager);
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCodeCompletionHelper createCodeCompletionHelper() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCodeCompletionHelper();
	}
	
}
