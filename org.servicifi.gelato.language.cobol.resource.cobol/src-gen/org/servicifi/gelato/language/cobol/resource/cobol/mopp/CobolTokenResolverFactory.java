/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The CobolTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class CobolTokenResolverFactory implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolverFactory {
	
	private Map<String, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver> tokenName2TokenResolver;
	private Map<String, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver> featureName2CollectInTokenResolver;
	private static org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver defaultResolver = new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultTokenResolver();
	
	public CobolTokenResolverFactory() {
		tokenName2TokenResolver = new LinkedHashMap<String, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver>();
		featureName2CollectInTokenResolver = new LinkedHashMap<String, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver>();
		registerTokenResolver("BOOLEAN_LITERAL", new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolBOOLEAN_LITERALTokenResolver());
		registerTokenResolver("ALPHANUMERIC_LITERAL", new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolALPHANUMERIC_LITERALTokenResolver());
		registerTokenResolver("ALPHANUMERIC_HEX_LITERAL", new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolALPHANUMERIC_HEX_LITERALTokenResolver());
		registerTokenResolver("DECIMAL_INTEGER_LITERAL", new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDECIMAL_INTEGER_LITERALTokenResolver());
		registerTokenResolver("DECIMAL_FIXED_LITERAL", new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDECIMAL_FIXED_LITERALTokenResolver());
		registerTokenResolver("DECIMAL_FLOAT_LITERAL", new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDECIMAL_FLOAT_LITERALTokenResolver());
		registerTokenResolver("COBOL_WORD", new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolCOBOL_WORDTokenResolver());
		registerTokenResolver("QUOTED_69886967_6978684569886967", new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolQUOTED_69886967_6978684569886967TokenResolver());
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver internalCreateResolver(Map<String, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(Map<String, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver> resolverMap, String key, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
