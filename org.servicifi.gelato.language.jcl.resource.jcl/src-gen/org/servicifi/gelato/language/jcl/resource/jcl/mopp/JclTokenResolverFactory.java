/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The JclTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class JclTokenResolverFactory implements org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolverFactory {
	
	private Map<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver> tokenName2TokenResolver;
	private Map<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver> featureName2CollectInTokenResolver;
	private static org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver defaultResolver = new org.servicifi.gelato.language.jcl.resource.jcl.analysis.JclDefaultTokenResolver();
	
	public JclTokenResolverFactory() {
		tokenName2TokenResolver = new LinkedHashMap<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver>();
		featureName2CollectInTokenResolver = new LinkedHashMap<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver>();
		registerTokenResolver("JCL_WORD", new org.servicifi.gelato.language.jcl.resource.jcl.analysis.JclJCL_WORDTokenResolver());
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver internalCreateResolver(Map<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(Map<String, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver> resolverMap, String key, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
