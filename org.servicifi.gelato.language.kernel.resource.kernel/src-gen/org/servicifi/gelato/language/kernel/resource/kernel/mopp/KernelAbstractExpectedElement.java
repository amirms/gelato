/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class KernelAbstractExpectedElement implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.servicifi.gelato.language.kernel.resource.kernel.util.KernelPair<org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[]>> followers = new java.util.LinkedHashSet<org.servicifi.gelato.language.kernel.resource.kernel.util.KernelPair<org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[]>>();
	
	public KernelAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement follower, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[] path) {
		followers.add(new org.servicifi.gelato.language.kernel.resource.kernel.util.KernelPair<org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.util.KernelPair<org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
