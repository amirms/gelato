/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

public class KernelProblem implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelProblem {
	
	private String message;
	private org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType type;
	private org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity severity;
	private java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> quickFixes;
	
	public KernelProblem(String message, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType type, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix>emptySet());
	}
	
	public KernelProblem(String message, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType type, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity severity, org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public KernelProblem(String message, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType type, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity severity, java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType getType() {
		return type;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
