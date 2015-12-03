/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol;

import java.util.Collection;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface ICobolExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement getSyntaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement follower, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.util.CobolPair<org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature[]>> getFollowers();
	
}
