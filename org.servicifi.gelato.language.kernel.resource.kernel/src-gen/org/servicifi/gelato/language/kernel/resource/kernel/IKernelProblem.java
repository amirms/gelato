/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;

import java.util.Collection;

public interface IKernelProblem {
	public String getMessage();
	public org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity getSeverity();
	public org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType getType();
	public Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> getQuickFixes();
}
