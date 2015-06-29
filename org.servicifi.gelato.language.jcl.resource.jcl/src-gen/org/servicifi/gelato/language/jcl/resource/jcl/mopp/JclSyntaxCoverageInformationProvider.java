/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import org.eclipse.emf.ecore.EClass;

public class JclSyntaxCoverageInformationProvider {
	
	public EClass[] getClassesWithSyntax() {
		return new EClass[] {
			org.servicifi.gelato.language.jcl.containers.ContainersPackage.eINSTANCE.getJobUnit(),
			org.servicifi.gelato.language.jcl.statements.StatementsPackage.eINSTANCE.getExecute(),
		};
	}
	
	public EClass[] getStartSymbols() {
		return new EClass[] {
			org.servicifi.gelato.language.jcl.containers.ContainersPackage.eINSTANCE.getJobUnit(),
		};
	}
	
}
