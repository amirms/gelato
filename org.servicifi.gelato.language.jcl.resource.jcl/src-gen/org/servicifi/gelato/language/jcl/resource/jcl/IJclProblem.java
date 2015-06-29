/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl;

import java.util.Collection;

public interface IJclProblem {
	public String getMessage();
	public org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity getSeverity();
	public org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType getType();
	public Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix> getQuickFixes();
}
