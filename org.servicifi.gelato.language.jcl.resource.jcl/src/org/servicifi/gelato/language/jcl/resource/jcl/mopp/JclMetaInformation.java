/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class JclMetaInformation implements org.servicifi.gelato.language.jcl.resource.jcl.IJclMetaInformation {
	
	public String getSyntaxName() {
		return "jcl";
	}
	
	public String getURI() {
		return "http://www.servicifi.org/gelato/language/jcl";
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTextScanner createLexer() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclAntlrScanner(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclLexer());
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTextParser createParser(InputStream inputStream, String encoding) {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclParser().createInstance(inputStream, encoding);
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTextPrinter createPrinter(OutputStream outputStream, org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource) {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclPrinter2(outputStream, resource);
	}
	
	public EClass[] getClassesWithSyntax() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public EClass[] getStartSymbols() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclReferenceResolverSwitch();
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolverFactory getTokenResolverFactory() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.servicifi.gelato.language.jcl/metamodel/jcl.cs";
	}
	
	public String[] getTokenNames() {
		return org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclParser.tokenNames;
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclBracketPair> getBracketPairs() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclBracketInformationProvider().getBracketPairs();
	}
	
	public EClass[] getFoldableClasses() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclFoldingInformationProvider().getFoldableClasses();
	}
	
	public Factory createResourceFactory() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResourceFactory();
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclNewFileContentProvider getNewFileContentProvider() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResourceFactoryDelegator());
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
		return "org.servicifi.gelato.language.jcl.resource.jcl.ui.launchConfigurationType";
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclNameProvider createNameProvider() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.analysis.JclDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclAntlrTokenHelper tokenHelper = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclAntlrTokenHelper();
		List<String> highlightableTokens = new ArrayList<String>();
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
		highlightableTokens.add(org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
