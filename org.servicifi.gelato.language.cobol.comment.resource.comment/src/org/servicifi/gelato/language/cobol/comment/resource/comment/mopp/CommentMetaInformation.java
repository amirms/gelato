/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.mopp;

public class CommentMetaInformation implements org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentMetaInformation {
	
	public String getSyntaxName() {
		return "comment";
	}
	
	public String getURI() {
		return "http://www.servicifi.org/gelato/language/comment";
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextScanner createLexer() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentAntlrScanner(new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentLexer());
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentParser().createInstance(inputStream, encoding);
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextPrinter createPrinter(java.io.OutputStream outputStream, org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTextResource resource) {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentReferenceResolverSwitch();
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenResolverFactory getTokenResolverFactory() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.servicifi.gelato.language.cobol.comment/metamodel/comment.cs";
	}
	
	public String[] getTokenNames() {
		return org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentParser.tokenNames;
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentBracketPair> getBracketPairs() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentResourceFactory();
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentNewFileContentProvider getNewFileContentProvider() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentResourceFactoryDelegator());
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
		return "org.servicifi.gelato.language.cobol.comment.resource.comment.ui.launchConfigurationType";
	}
	
	public org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentNameProvider createNameProvider() {
		return new org.servicifi.gelato.language.cobol.comment.resource.comment.analysis.CommentDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentAntlrTokenHelper tokenHelper = new org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentAntlrTokenHelper();
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
		highlightableTokens.add(org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
