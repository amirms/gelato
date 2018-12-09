/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

public class KernelPrinter implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextPrinter {
	
	protected org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolverFactory tokenResolverFactory = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public KernelPrinter(java.io.OutputStream outputStream, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
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
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.servicifi.gelato.language.kernel.containers.CompilationUnit) {
			print_org_servicifi_gelato_language_kernel_containers_CompilationUnit((org.servicifi.gelato.language.kernel.containers.CompilationUnit) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.procedures.Procedure) {
			print_org_servicifi_gelato_language_kernel_procedures_Procedure((org.servicifi.gelato.language.kernel.procedures.Procedure) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.procedures.MainProcedure) {
			print_org_servicifi_gelato_language_kernel_procedures_MainProcedure((org.servicifi.gelato.language.kernel.procedures.MainProcedure) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.WhileLoop) {
			print_org_servicifi_gelato_language_kernel_statements_WhileLoop((org.servicifi.gelato.language.kernel.statements.WhileLoop) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Condition) {
			print_org_servicifi_gelato_language_kernel_statements_Condition((org.servicifi.gelato.language.kernel.statements.Condition) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Goto) {
			print_org_servicifi_gelato_language_kernel_statements_Goto((org.servicifi.gelato.language.kernel.statements.Goto) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Block) {
			print_org_servicifi_gelato_language_kernel_statements_Block((org.servicifi.gelato.language.kernel.statements.Block) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.ParallelBlock) {
			print_org_servicifi_gelato_language_kernel_statements_ParallelBlock((org.servicifi.gelato.language.kernel.statements.ParallelBlock) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock) {
			print_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock((org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.AssignmentStatement) {
			print_org_servicifi_gelato_language_kernel_statements_AssignmentStatement((org.servicifi.gelato.language.kernel.statements.AssignmentStatement) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.ExpressionStatement) {
			print_org_servicifi_gelato_language_kernel_statements_ExpressionStatement((org.servicifi.gelato.language.kernel.statements.ExpressionStatement) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.StatementWithException) {
			print_org_servicifi_gelato_language_kernel_statements_StatementWithException((org.servicifi.gelato.language.kernel.statements.StatementWithException) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement) {
			print_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement((org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Abort) {
			print_org_servicifi_gelato_language_kernel_statements_Abort((org.servicifi.gelato.language.kernel.statements.Abort) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Skip) {
			print_org_servicifi_gelato_language_kernel_statements_Skip((org.servicifi.gelato.language.kernel.statements.Skip) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Return) {
			print_org_servicifi_gelato_language_kernel_statements_Return((org.servicifi.gelato.language.kernel.statements.Return) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.ProcedureCall) {
			print_org_servicifi_gelato_language_kernel_statements_ProcedureCall((org.servicifi.gelato.language.kernel.statements.ProcedureCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.parameters.Parameter) {
			print_org_servicifi_gelato_language_kernel_parameters_Parameter((org.servicifi.gelato.language.kernel.parameters.Parameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.references.Argument) {
			print_org_servicifi_gelato_language_kernel_references_Argument((org.servicifi.gelato.language.kernel.references.Argument) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.Expression) {
			print_org_servicifi_gelato_language_kernel_expressions_Expression((org.servicifi.gelato.language.kernel.expressions.Expression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.Defines) {
			print_org_servicifi_gelato_language_kernel_expressions_Defines((org.servicifi.gelato.language.kernel.expressions.Defines) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.Uses) {
			print_org_servicifi_gelato_language_kernel_expressions_Uses((org.servicifi.gelato.language.kernel.expressions.Uses) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.Affects) {
			print_org_servicifi_gelato_language_kernel_expressions_Affects((org.servicifi.gelato.language.kernel.expressions.Affects) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.PostDefines) {
			print_org_servicifi_gelato_language_kernel_expressions_PostDefines((org.servicifi.gelato.language.kernel.expressions.PostDefines) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.PreUses) {
			print_org_servicifi_gelato_language_kernel_expressions_PreUses((org.servicifi.gelato.language.kernel.expressions.PreUses) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.PostAffects) {
			print_org_servicifi_gelato_language_kernel_expressions_PostAffects((org.servicifi.gelato.language.kernel.expressions.PostAffects) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.dataitems.DataItem) {
			print_org_servicifi_gelato_language_kernel_dataitems_DataItem((org.servicifi.gelato.language.kernel.dataitems.DataItem) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelReferenceResolverSwitch) new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelProblem(errorMessage, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType.PRINT_PROBLEM, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
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
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_servicifi_gelato_language_kernel_containers_CompilationUnit(org.servicifi.gelato.language.kernel.containers.CompilationUnit element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE));
		printCountingMap.put("mainProcedure", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__DECLARATIONS));
		printCountingMap.put("declarations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__START));
		printCountingMap.put("start", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__END));
		printCountingMap.put("end", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_kernel_containers_CompilationUnit_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_kernel_containers_CompilationUnit_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("mainProcedure");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("mainProcedure", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_kernel_containers_CompilationUnit_0(org.servicifi.gelato.language.kernel.containers.CompilationUnit element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("declarations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__DECLARATIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("declarations", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_kernel_containers_CompilationUnit_1(org.servicifi.gelato.language.kernel.containers.CompilationUnit element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("declarations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__DECLARATIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("declarations", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_dataitems_DataItem(org.servicifi.gelato.language.kernel.dataitems.DataItem element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.DATA_ITEM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("var");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.DATA_ITEM__NAME));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.DATA_ITEM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_procedures_Procedure(org.servicifi.gelato.language.kernel.procedures.Procedure element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__MEMBERS));
		printCountingMap.put("members", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__CALLERS));
		printCountingMap.put("callers", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__START));
		printCountingMap.put("start", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__END));
		printCountingMap.put("end", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Procedure");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_kernel_procedures_Procedure_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_kernel_procedures_Procedure_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_kernel_procedures_Procedure_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	public void print_org_servicifi_gelato_language_kernel_procedures_Procedure_0(org.servicifi.gelato.language.kernel.procedures.Procedure element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__NAME));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_kernel_procedures_Procedure_1(org.servicifi.gelato.language.kernel.procedures.Procedure element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_kernel_procedures_Procedure_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_kernel_procedures_Procedure_1_0(org.servicifi.gelato.language.kernel.procedures.Procedure element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_kernel_procedures_Procedure_2(org.servicifi.gelato.language.kernel.procedures.Procedure element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("members");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__MEMBERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("members", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_procedures_MainProcedure(org.servicifi.gelato.language.kernel.procedures.MainProcedure element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__MEMBERS));
		printCountingMap.put("members", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__START));
		printCountingMap.put("start", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__END));
		printCountingMap.put("end", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Procedure");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("main");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_kernel_procedures_MainProcedure_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_kernel_procedures_MainProcedure_0(org.servicifi.gelato.language.kernel.procedures.MainProcedure element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("members");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__MEMBERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("members", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_WhileLoop(org.servicifi.gelato.language.kernel.statements.WhileLoop element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__STATEMENT));
		printCountingMap.put("statement", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("while");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("do");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__STATEMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("statement", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_Condition(org.servicifi.gelato.language.kernel.statements.Condition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__STATEMENT));
		printCountingMap.put("statement", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__ELSE_STATEMENT));
		printCountingMap.put("elseStatement", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("then");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__STATEMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("statement", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_kernel_statements_Condition_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_kernel_statements_Condition_0(org.servicifi.gelato.language.kernel.statements.Condition element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("else");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elseStatement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__ELSE_STATEMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elseStatement", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_Goto(org.servicifi.gelato.language.kernel.statements.Goto element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("goto");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getJumpTargetReferenceResolver().deResolve((org.servicifi.gelato.analysis.framework.commons.LabellableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_Block(org.servicifi.gelato.language.kernel.statements.Block element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_ParallelBlock(org.servicifi.gelato.language.kernel.statements.ParallelBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__ORDER));
		printCountingMap.put("order", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{*");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("order");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("order");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__ORDER));
			if (o != null) {
			}
			printCountingMap.put("order", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("*}");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock(org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.NON_DETERMINISTIC_BLOCK__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.NON_DETERMINISTIC_BLOCK__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.NON_DETERMINISTIC_BLOCK__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.NON_DETERMINISTIC_BLOCK__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock_0(org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.NON_DETERMINISTIC_BLOCK__STATEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("statements", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_AssignmentStatement(org.servicifi.gelato.language.kernel.statements.AssignmentStatement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.kernel.references.ReferenceableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_ExpressionStatement(org.servicifi.gelato.language.kernel.statements.ExpressionStatement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__EXPRESSION));
		printCountingMap.put("expression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("expression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_StatementWithException(org.servicifi.gelato.language.kernel.statements.StatementWithException element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT));
		printCountingMap.put("statement", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS));
		printCountingMap.put("exceptionStatements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("try");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("statement", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("with");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exceptionStatements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exceptionStatements", 0);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement(org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__STATEMENT));
		printCountingMap.put("statement", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("exception");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__STATEMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("statement", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_Abort(org.servicifi.gelato.language.kernel.statements.Abort element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("abort");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_Skip(org.servicifi.gelato.language.kernel.statements.Skip element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("skip");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_Return(org.servicifi.gelato.language.kernel.statements.Return element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__RETURN_VALUE));
		printCountingMap.put("returnValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("return");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__RETURN_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnValue", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_statements_ProcedureCall(org.servicifi.gelato.language.kernel.statements.ProcedureCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__RETURN_SITE));
		printCountingMap.put("returnSite", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("call");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.kernel.references.ReferenceableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_kernel_statements_ProcedureCall_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_kernel_statements_ProcedureCall_0(org.servicifi.gelato.language.kernel.statements.ProcedureCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_kernel_statements_ProcedureCall_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_kernel_statements_ProcedureCall_0_0(org.servicifi.gelato.language.kernel.statements.ProcedureCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_parameters_Parameter(org.servicifi.gelato.language.kernel.parameters.Parameter element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__CORRESPONDING_ARGUMENT));
		printCountingMap.put("correspondingArgument", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__NAME));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_references_Argument(org.servicifi.gelato.language.kernel.references.Argument element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__BY_REFERENCE));
		printCountingMap.put("byReference", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__CORRESPONDING_PARAMETER));
		printCountingMap.put("correspondingParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("byReference");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__BY_REFERENCE));
			if (o != null) {
			}
			printCountingMap.put("byReference", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.kernel.references.ReferenceableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_expressions_Expression(org.servicifi.gelato.language.kernel.expressions.Expression element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__PREDECESSORS));
		printCountingMap.put("predecessors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__SUCCESSORS));
		printCountingMap.put("successors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__LABEL));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_kernel_expressions_Expression_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_kernel_expressions_Expression_0(org.servicifi.gelato.language.kernel.expressions.Expression element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__CHILDREN));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_kernel_expressions_Expression_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_kernel_expressions_Expression_0_0(org.servicifi.gelato.language.kernel.expressions.Expression element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__CHILDREN));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_expressions_Defines(org.servicifi.gelato.language.kernel.expressions.Defines element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__REACHES));
		printCountingMap.put("reaches", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("defines");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.kernel.references.ReferenceableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_expressions_Uses(org.servicifi.gelato.language.kernel.expressions.Uses element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("uses");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.kernel.references.ReferenceableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_expressions_Affects(org.servicifi.gelato.language.kernel.expressions.Affects element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__REACHES));
		printCountingMap.put("reaches", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("affects");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.kernel.references.ReferenceableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_expressions_PostDefines(org.servicifi.gelato.language.kernel.expressions.PostDefines element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__REACHES));
		printCountingMap.put("reaches", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("postdefines");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.kernel.references.ReferenceableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_expressions_PreUses(org.servicifi.gelato.language.kernel.expressions.PreUses element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("preuses");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.kernel.references.ReferenceableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_kernel_expressions_PostAffects(org.servicifi.gelato.language.kernel.expressions.PostAffects element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__REACHES));
		printCountingMap.put("reaches", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("postaffects");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.kernel.references.ReferenceableElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
}
