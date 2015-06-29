/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class JclProblem implements org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem {
	
	private String message;
	private org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType type;
	private org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity severity;
	private Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix> quickFixes;
	
	public JclProblem(String message, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType type, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity severity) {
		this(message, type, severity, Collections.<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix>emptySet());
	}
	
	public JclProblem(String message, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType type, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity severity, org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix quickFix) {
		this(message, type, severity, Collections.singleton(quickFix));
	}
	
	public JclProblem(String message, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType type, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity severity, Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new LinkedHashSet<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType getType() {
		return type;
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
