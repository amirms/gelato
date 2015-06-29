/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class CobolProblem implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolProblem {
	
	private String message;
	private org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemType type;
	private org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemSeverity severity;
	private Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix> quickFixes;
	
	public CobolProblem(String message, org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemType type, org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemSeverity severity) {
		this(message, type, severity, Collections.<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix>emptySet());
	}
	
	public CobolProblem(String message, org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemType type, org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemSeverity severity, org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix quickFix) {
		this(message, type, severity, Collections.singleton(quickFix));
	}
	
	public CobolProblem(String message, org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemType type, org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemSeverity severity, Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemType getType() {
		return type;
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
