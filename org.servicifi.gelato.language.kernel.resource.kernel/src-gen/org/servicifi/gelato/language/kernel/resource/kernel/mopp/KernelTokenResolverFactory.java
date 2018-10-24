/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

/**
 * The KernelTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class KernelTokenResolverFactory implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolverFactory {
	
	private java.util.Map<String, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver> featureName2CollectInTokenResolver;
	private static org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver defaultResolver = new org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultTokenResolver();
	
	public KernelTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver>();
		registerTokenResolver("CHARACTER_LITERAL", new org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelCHARACTER_LITERALTokenResolver());
		registerTokenResolver("IDENTIFIER", new org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelIDENTIFIERTokenResolver());
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver internalCreateResolver(java.util.Map<String, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver> resolverMap, String key, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
