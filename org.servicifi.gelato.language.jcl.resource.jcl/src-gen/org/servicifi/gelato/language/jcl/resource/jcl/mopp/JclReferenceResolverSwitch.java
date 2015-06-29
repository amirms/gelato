/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class JclReferenceResolverSwitch implements org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private Map<Object, Object> options;
	
	
	public void setOptions(Map<?, ?> options) {
		if (options != null) {
			this.options = new LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
	}
	
	public void resolveFuzzy(String identifier, EObject container, EReference reference, int position, org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolveResult<EObject> result) {
		if (container == null) {
			return;
		}
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver<? extends EObject, ? extends EObject> getResolver(EStructuralFeature reference) {
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public <ContainerType extends EObject, ReferenceType extends EObject> org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver<ContainerType, ReferenceType> getResolverChain(EStructuralFeature reference, org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof Map)) {
			// send this to the error log
			new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().logWarning("Found value with invalid type for option " + org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		Map<?,?> resolverMap = (Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver) {
			org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver replacingResolver = (org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.servicifi.gelato.language.jcl.resource.jcl.IJclDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof Collection) {
			Collection replacingResolvers = (Collection) resolverValue;
			org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceCache) {
					org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver nextResolver = (org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver) next;
					if (nextResolver instanceof org.servicifi.gelato.language.jcl.resource.jcl.IJclDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.servicifi.gelato.language.jcl.resource.jcl.IJclDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.servicifi.gelato.language.jcl.resource.jcl.IJclDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.servicifi.gelato.language.jcl.resource.jcl.IJclDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
