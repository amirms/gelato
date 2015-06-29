/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;

public class JclPrinter implements org.servicifi.gelato.language.jcl.resource.jcl.IJclTextPrinter {
	
	protected org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolverFactory tokenResolverFactory = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenResolverFactory();
	
	protected OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource;
	
	private Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public JclPrinter(OutputStream outputStream, org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(Map<String, Integer> featureCounter, Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(EObject element, PrintWriter out, String globaltab) {
		if (element == null) {
			throw new IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.servicifi.gelato.language.jcl.containers.JobUnit) {
			print_org_servicifi_gelato_language_jcl_containers_JobUnit((org.servicifi.gelato.language.jcl.containers.JobUnit) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.jcl.statements.Execute) {
			print_org_servicifi_gelato_language_jcl_statements_Execute((org.servicifi.gelato.language.jcl.statements.Execute) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclReferenceResolverSwitch) new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, EObject cause) {
		org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclProblem(errorMessage, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.PRINT_PROBLEM, org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(Map<?,?> options) {
		this.options = options;
	}
	
	public Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(EObject element) throws java.io.IOException {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
	}
	
	public void print_org_servicifi_gelato_language_jcl_containers_JobUnit(org.servicifi.gelato.language.jcl.containers.JobUnit element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.jcl.containers.ContainersPackage.JOB_UNIT__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.jcl.containers.ContainersPackage.JOB_UNIT__STATEMENTS));
			doPrint((EObject) o, out, localtab);
			printCountingMap.put("statements", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_jcl_statements_Execute(org.servicifi.gelato.language.jcl.statements.Execute element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.EXECUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.EXECUTE__NAME));
			if (o != null) {
				org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver resolver = tokenResolverFactory.createTokenResolver("JCL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.EXECUTE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("EXEC");
		out.print(" ");
	}
	
	
}
