/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol;

import java.util.Collection;

public interface ICobolProblem {
	public String getMessage();
	public org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemSeverity getSeverity();
	public org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemType getType();
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix> getQuickFixes();
}
