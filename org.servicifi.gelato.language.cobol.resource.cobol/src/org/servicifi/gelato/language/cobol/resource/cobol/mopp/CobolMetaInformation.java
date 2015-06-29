/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

public class CobolMetaInformation implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolMetaInformation {
	
	public String getSyntaxName() {
		//return "cobol | cob | cbl | cpy";
		return "cob | cobol | cbl";
	}
	
	public String getURI() {
		return "http://www.servicifi.org/gelato/language/cobol";
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextScanner createLexer() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolAntlrScanner(new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLexer());
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolParser().createInstance(inputStream, encoding);
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextPrinter createPrinter(java.io.OutputStream outputStream, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource) {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolReferenceResolverSwitch();
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolverFactory getTokenResolverFactory() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.servicifi.gelato.language.cobol/metamodel/cobol.cs";
	}
	
	public String[] getTokenNames() {
		return org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolParser.tokenNames;
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolBracketPair> getBracketPairs() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResourceFactory();
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolNewFileContentProvider getNewFileContentProvider() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResourceFactoryDelegator());
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
		return "org.servicifi.gelato.language.cobol.resource.cobol.ui.launchConfigurationType";
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolNameProvider createNameProvider() {
		return new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolAntlrTokenHelper tokenHelper = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolAntlrTokenHelper();
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
		highlightableTokens.add(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
