/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

public class PreprocessUIMetaInformation extends org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessMetaInformation {
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessHoverTextProvider getHoverTextProvider() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessHoverTextProvider();
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessImageProvider getImageProvider() {
		return org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessImageProvider.INSTANCE;
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessColorManager createColorManager() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.servicifi.gelato.language.cobol.preprocess.resource.prepr
	 * ocess.IPreprocessTextResource,
	 * org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.Preprocess
	 * ColorManager) instead.
	 */
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessTokenScanner createTokenScanner(org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessTokenScanner createTokenScanner(org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTextResource resource, org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessColorManager colorManager) {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessTokenScanner(resource, colorManager);
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessCodeCompletionHelper createCodeCompletionHelper() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessCodeCompletionHelper();
	}
	
}
