/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp;


public class PreprocessMetaInformation implements org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessMetaInformation {
	
	public String getSyntaxName() {
		return "preprocess|cob|cpy";
	}
	
	public String getURI() {
		return "http://www.servicifi.org/gelato/language/cobol/preprocess";
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTextScanner createLexer() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessAntlrScanner(new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessLexer());
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessParser().createInstance(inputStream, encoding);
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTextPrinter createPrinter(java.io.OutputStream outputStream, org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTextResource resource) {
		//return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessPrinter2(outputStream, resource);
		return new CobolSourceFilePrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessReferenceResolverSwitch();
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTokenResolverFactory getTokenResolverFactory() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.servicifi.gelato.language.cobol.preprocess/metamodel/preprocess.cs";
	}
	
	public String[] getTokenNames() {
		return org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessParser.tokenNames;
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessBracketPair> getBracketPairs() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessResourceFactory();
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessNewFileContentProvider getNewFileContentProvider() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessResourceFactoryDelegator());
		}
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.launchConfigurationType";
	}
	
	public org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessNameProvider createNameProvider() {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.analysis.PreprocessDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessAntlrTokenHelper tokenHelper = new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
