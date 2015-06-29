/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class JclFollowSetProvider {
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement TERMINALS[] = new org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement[2];
	
	public final static EStructuralFeature[] FEATURES = new EStructuralFeature[1];
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[] LINKS = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[3];
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[] EMPTY_LINK_ARRAY = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedStructuralFeature(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclGrammarInformationProvider.JCL_1_0_0_0);
		TERMINALS[1] = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedCsString(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclGrammarInformationProvider.JCL_1_0_0_1);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = org.servicifi.gelato.language.jcl.containers.ContainersPackage.eINSTANCE.getJobUnit().getEStructuralFeature(org.servicifi.gelato.language.jcl.containers.ContainersPackage.JOB_UNIT__STATEMENTS);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.eINSTANCE.getExecute(), FEATURES[0]);
		LINKS[1] = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.eINSTANCE.getExecute(), FEATURES[0]);
		LINKS[2] = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.eINSTANCE.getExecute(), FEATURES[0]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[1], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[0], new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[] {new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.eINSTANCE.getExecute(), FEATURES[0]), });
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
