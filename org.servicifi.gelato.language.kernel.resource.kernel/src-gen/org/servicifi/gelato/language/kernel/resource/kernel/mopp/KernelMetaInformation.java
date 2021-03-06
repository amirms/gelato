/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

public class KernelMetaInformation implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelMetaInformation {
	
	public String getSyntaxName() {
		return "kernel";
	}
	
	public String getURI() {
		return "http://www.servicifi.org/gelato/language/kernel";
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextScanner createLexer() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelAntlrScanner(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLexer());
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelParser().createInstance(inputStream, encoding);
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextPrinter createPrinter(java.io.OutputStream outputStream, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelReferenceResolverSwitch();
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolverFactory getTokenResolverFactory() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.servicifi.gelato.language.kernel/metamodel/kernel.cs";
	}
	
	public String[] getTokenNames() {
		return org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelParser.tokenNames;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelBracketPair> getBracketPairs() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResourceFactory();
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelNewFileContentProvider getNewFileContentProvider() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResourceFactory());
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
		return "org.servicifi.gelato.language.kernel.resource.kernel.ui.launchConfigurationType";
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelNameProvider createNameProvider() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelAntlrTokenHelper tokenHelper = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelAntlrTokenHelper();
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
		highlightableTokens.add(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
