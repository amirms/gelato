/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

public class KernelGrammarInformationProvider {
	
	public final static EStructuralFeature ANONYMOUS_FEATURE = EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static KernelGrammarInformationProvider INSTANCE = new KernelGrammarInformationProvider();
	
	private Set<String> keywords;
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_0_0_0_0_0_0_0 = INSTANCE.getKERNEL_0_0_0_0_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_0_0_0_0_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__DECLARATIONS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.eINSTANCE.getDataItem(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_0_0_0_0_0_0 = INSTANCE.getKERNEL_0_0_0_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_0_0_0_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_0_0_0_0_0_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_0_0_0_0_0 = INSTANCE.getKERNEL_0_0_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_0_0_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_0_0_0_0_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_0_0_0_0 = INSTANCE.getKERNEL_0_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_0_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_0_0_0_0_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_0_0_0_1 = INSTANCE.getKERNEL_0_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_0_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_0_0_0_2 = INSTANCE.getKERNEL_0_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_0_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_0_0_0_3_0_0_0 = INSTANCE.getKERNEL_0_0_0_3_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_0_0_0_3_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__DECLARATIONS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_0_0_0_3_0_0_1 = INSTANCE.getKERNEL_0_0_0_3_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_0_0_0_3_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_0_0_0_3_0_0 = INSTANCE.getKERNEL_0_0_0_3_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_0_0_0_3_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_0_0_0_3_0_0_0, KERNEL_0_0_0_3_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_0_0_0_3_0 = INSTANCE.getKERNEL_0_0_0_3_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_0_0_0_3_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_0_0_0_3_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_0_0_0_3 = INSTANCE.getKERNEL_0_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_0_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_0_0_0_3_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_0_0_0 = INSTANCE.getKERNEL_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_0_0_0_0, KERNEL_0_0_0_1, KERNEL_0_0_0_2, KERNEL_0_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_0_0 = INSTANCE.getKERNEL_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_0_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_0 = INSTANCE.getKERNEL_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), KERNEL_0_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_1_0_0_0 = INSTANCE.getKERNEL_1_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_1_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("var", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_1_0_0_1 = INSTANCE.getKERNEL_1_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_1_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.eINSTANCE.getDataItem().getEStructuralFeature(org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.DATA_ITEM__NAME), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_1_0_0_2 = INSTANCE.getKERNEL_1_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_1_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_1_0_0_3 = INSTANCE.getKERNEL_1_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_1_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_1_0_0 = INSTANCE.getKERNEL_1_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_1_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_1_0_0_0, KERNEL_1_0_0_1, KERNEL_1_0_0_2, KERNEL_1_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_1_0 = INSTANCE.getKERNEL_1_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_1_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_1_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_1 = INSTANCE.getKERNEL_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.eINSTANCE.getDataItem(), KERNEL_1_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_2_0_0_0 = INSTANCE.getKERNEL_2_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_2_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_2_0_0_1 = INSTANCE.getKERNEL_2_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_2_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_2_0_0_2 = INSTANCE.getKERNEL_2_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_2_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("Procedure", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_2_0_0_3_0_0_0 = INSTANCE.getKERNEL_2_0_0_3_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_2_0_0_3_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__NAME), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_2_0_0_3_0_0 = INSTANCE.getKERNEL_2_0_0_3_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_2_0_0_3_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0_3_0_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_2_0_0_3_0 = INSTANCE.getKERNEL_2_0_0_3_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_2_0_0_3_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0_3_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_2_0_0_3 = INSTANCE.getKERNEL_2_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_2_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_2_0_0_3_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_2_0_0_4 = INSTANCE.getKERNEL_2_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_2_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_2_0_0_5_0_0_0 = INSTANCE.getKERNEL_2_0_0_5_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_2_0_0_5_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__PARAMETERS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_2_0_0_5_0_0_1_0_0_0 = INSTANCE.getKERNEL_2_0_0_5_0_0_1_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_2_0_0_5_0_0_1_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(",", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_2_0_0_5_0_0_1_0_0_1 = INSTANCE.getKERNEL_2_0_0_5_0_0_1_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_2_0_0_5_0_0_1_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__PARAMETERS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_2_0_0_5_0_0_1_0_0 = INSTANCE.getKERNEL_2_0_0_5_0_0_1_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_2_0_0_5_0_0_1_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0_5_0_0_1_0_0_0, KERNEL_2_0_0_5_0_0_1_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_2_0_0_5_0_0_1_0 = INSTANCE.getKERNEL_2_0_0_5_0_0_1_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_2_0_0_5_0_0_1_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0_5_0_0_1_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_2_0_0_5_0_0_1 = INSTANCE.getKERNEL_2_0_0_5_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_2_0_0_5_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_2_0_0_5_0_0_1_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_2_0_0_5_0_0 = INSTANCE.getKERNEL_2_0_0_5_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_2_0_0_5_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0_5_0_0_0, KERNEL_2_0_0_5_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_2_0_0_5_0 = INSTANCE.getKERNEL_2_0_0_5_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_2_0_0_5_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0_5_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_2_0_0_5 = INSTANCE.getKERNEL_2_0_0_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_2_0_0_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_2_0_0_5_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_2_0_0_6 = INSTANCE.getKERNEL_2_0_0_6();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_2_0_0_6() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_2_0_0_7 = INSTANCE.getKERNEL_2_0_0_7();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_2_0_0_7() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("{", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_2_0_0_8_0_0_0 = INSTANCE.getKERNEL_2_0_0_8_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_2_0_0_8_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_2_0_0_8_0_0_1 = INSTANCE.getKERNEL_2_0_0_8_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_2_0_0_8_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__MEMBERS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_2_0_0_8_0_0 = INSTANCE.getKERNEL_2_0_0_8_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_2_0_0_8_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0_8_0_0_0, KERNEL_2_0_0_8_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_2_0_0_8_0 = INSTANCE.getKERNEL_2_0_0_8_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_2_0_0_8_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0_8_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_2_0_0_8 = INSTANCE.getKERNEL_2_0_0_8();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_2_0_0_8() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_2_0_0_8_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_2_0_0_9 = INSTANCE.getKERNEL_2_0_0_9();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_2_0_0_9() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_2_0_0_10 = INSTANCE.getKERNEL_2_0_0_10();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_2_0_0_10() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("}", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_2_0_0_11 = INSTANCE.getKERNEL_2_0_0_11();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_2_0_0_11() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_2_0_0 = INSTANCE.getKERNEL_2_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_2_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0_0, KERNEL_2_0_0_1, KERNEL_2_0_0_2, KERNEL_2_0_0_3, KERNEL_2_0_0_4, KERNEL_2_0_0_5, KERNEL_2_0_0_6, KERNEL_2_0_0_7, KERNEL_2_0_0_8, KERNEL_2_0_0_9, KERNEL_2_0_0_10, KERNEL_2_0_0_11);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_2_0 = INSTANCE.getKERNEL_2_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_2_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_2_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_2 = INSTANCE.getKERNEL_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), KERNEL_2_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_3_0_0_0 = INSTANCE.getKERNEL_3_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_3_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_3_0_0_1 = INSTANCE.getKERNEL_3_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_3_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_3_0_0_2 = INSTANCE.getKERNEL_3_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_3_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("Procedure", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_3_0_0_3 = INSTANCE.getKERNEL_3_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_3_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("main", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_3_0_0_4 = INSTANCE.getKERNEL_3_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_3_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_3_0_0_5_0_0_0 = INSTANCE.getKERNEL_3_0_0_5_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_3_0_0_5_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__PARAMETERS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_3_0_0_5_0_0_1_0_0_0 = INSTANCE.getKERNEL_3_0_0_5_0_0_1_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_3_0_0_5_0_0_1_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(",", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_3_0_0_5_0_0_1_0_0_1 = INSTANCE.getKERNEL_3_0_0_5_0_0_1_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_3_0_0_5_0_0_1_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__PARAMETERS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_3_0_0_5_0_0_1_0_0 = INSTANCE.getKERNEL_3_0_0_5_0_0_1_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_3_0_0_5_0_0_1_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_3_0_0_5_0_0_1_0_0_0, KERNEL_3_0_0_5_0_0_1_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_3_0_0_5_0_0_1_0 = INSTANCE.getKERNEL_3_0_0_5_0_0_1_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_3_0_0_5_0_0_1_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_3_0_0_5_0_0_1_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_3_0_0_5_0_0_1 = INSTANCE.getKERNEL_3_0_0_5_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_3_0_0_5_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_3_0_0_5_0_0_1_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_3_0_0_5_0_0 = INSTANCE.getKERNEL_3_0_0_5_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_3_0_0_5_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_3_0_0_5_0_0_0, KERNEL_3_0_0_5_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_3_0_0_5_0 = INSTANCE.getKERNEL_3_0_0_5_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_3_0_0_5_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_3_0_0_5_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_3_0_0_5 = INSTANCE.getKERNEL_3_0_0_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_3_0_0_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_3_0_0_5_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_3_0_0_6 = INSTANCE.getKERNEL_3_0_0_6();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_3_0_0_6() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_3_0_0_7 = INSTANCE.getKERNEL_3_0_0_7();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_3_0_0_7() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("{", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_3_0_0_8_0_0_0 = INSTANCE.getKERNEL_3_0_0_8_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_3_0_0_8_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_3_0_0_8_0_0_1 = INSTANCE.getKERNEL_3_0_0_8_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_3_0_0_8_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__MEMBERS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_3_0_0_8_0_0 = INSTANCE.getKERNEL_3_0_0_8_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_3_0_0_8_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_3_0_0_8_0_0_0, KERNEL_3_0_0_8_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_3_0_0_8_0 = INSTANCE.getKERNEL_3_0_0_8_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_3_0_0_8_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_3_0_0_8_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_3_0_0_8 = INSTANCE.getKERNEL_3_0_0_8();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_3_0_0_8() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_3_0_0_8_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_3_0_0_9 = INSTANCE.getKERNEL_3_0_0_9();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_3_0_0_9() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_3_0_0_10 = INSTANCE.getKERNEL_3_0_0_10();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_3_0_0_10() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("}", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_3_0_0 = INSTANCE.getKERNEL_3_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_3_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_3_0_0_0, KERNEL_3_0_0_1, KERNEL_3_0_0_2, KERNEL_3_0_0_3, KERNEL_3_0_0_4, KERNEL_3_0_0_5, KERNEL_3_0_0_6, KERNEL_3_0_0_7, KERNEL_3_0_0_8, KERNEL_3_0_0_9, KERNEL_3_0_0_10);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_3_0 = INSTANCE.getKERNEL_3_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_3_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_3_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_3 = INSTANCE.getKERNEL_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), KERNEL_3_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_4_0_0_0 = INSTANCE.getKERNEL_4_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_4_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_4_0_0_1 = INSTANCE.getKERNEL_4_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_4_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_4_0_0_2 = INSTANCE.getKERNEL_4_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_4_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("while", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_4_0_0_3 = INSTANCE.getKERNEL_4_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_4_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_4_0_0_4 = INSTANCE.getKERNEL_4_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_4_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__CONDITION), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_4_0_0_5 = INSTANCE.getKERNEL_4_0_0_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_4_0_0_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_4_0_0_6 = INSTANCE.getKERNEL_4_0_0_6();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_4_0_0_6() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("do", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_4_0_0_7 = INSTANCE.getKERNEL_4_0_0_7();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_4_0_0_7() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__STATEMENT), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_4_0_0_8 = INSTANCE.getKERNEL_4_0_0_8();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_4_0_0_8() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_4_0_0 = INSTANCE.getKERNEL_4_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_4_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_4_0_0_0, KERNEL_4_0_0_1, KERNEL_4_0_0_2, KERNEL_4_0_0_3, KERNEL_4_0_0_4, KERNEL_4_0_0_5, KERNEL_4_0_0_6, KERNEL_4_0_0_7, KERNEL_4_0_0_8);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_4_0 = INSTANCE.getKERNEL_4_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_4_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_4_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_4 = INSTANCE.getKERNEL_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), KERNEL_4_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_5_0_0_0 = INSTANCE.getKERNEL_5_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_5_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_5_0_0_1 = INSTANCE.getKERNEL_5_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_5_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_5_0_0_2 = INSTANCE.getKERNEL_5_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_5_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("if", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_5_0_0_3 = INSTANCE.getKERNEL_5_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_5_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_5_0_0_4 = INSTANCE.getKERNEL_5_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_5_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__CONDITION), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_5_0_0_5 = INSTANCE.getKERNEL_5_0_0_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_5_0_0_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_5_0_0_6 = INSTANCE.getKERNEL_5_0_0_6();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_5_0_0_6() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("then", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_5_0_0_7 = INSTANCE.getKERNEL_5_0_0_7();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_5_0_0_7() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_5_0_0_8 = INSTANCE.getKERNEL_5_0_0_8();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_5_0_0_8() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__STATEMENT), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_5_0_0_9_0_0_0 = INSTANCE.getKERNEL_5_0_0_9_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_5_0_0_9_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_5_0_0_9_0_0_1 = INSTANCE.getKERNEL_5_0_0_9_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_5_0_0_9_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("else", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_5_0_0_9_0_0_2 = INSTANCE.getKERNEL_5_0_0_9_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_5_0_0_9_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_5_0_0_9_0_0_3 = INSTANCE.getKERNEL_5_0_0_9_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_5_0_0_9_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__ELSE_STATEMENT), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_5_0_0_9_0_0 = INSTANCE.getKERNEL_5_0_0_9_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_5_0_0_9_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_5_0_0_9_0_0_0, KERNEL_5_0_0_9_0_0_1, KERNEL_5_0_0_9_0_0_2, KERNEL_5_0_0_9_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_5_0_0_9_0 = INSTANCE.getKERNEL_5_0_0_9_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_5_0_0_9_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_5_0_0_9_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_5_0_0_9 = INSTANCE.getKERNEL_5_0_0_9();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_5_0_0_9() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_5_0_0_9_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_5_0_0_10 = INSTANCE.getKERNEL_5_0_0_10();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_5_0_0_10() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_5_0_0 = INSTANCE.getKERNEL_5_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_5_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_5_0_0_0, KERNEL_5_0_0_1, KERNEL_5_0_0_2, KERNEL_5_0_0_3, KERNEL_5_0_0_4, KERNEL_5_0_0_5, KERNEL_5_0_0_6, KERNEL_5_0_0_7, KERNEL_5_0_0_8, KERNEL_5_0_0_9, KERNEL_5_0_0_10);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_5_0 = INSTANCE.getKERNEL_5_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_5_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_5_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_5 = INSTANCE.getKERNEL_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), KERNEL_5_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_6_0_0_0 = INSTANCE.getKERNEL_6_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_6_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getGoto().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_6_0_0_1 = INSTANCE.getKERNEL_6_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_6_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_6_0_0_2 = INSTANCE.getKERNEL_6_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_6_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("goto", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_6_0_0_3 = INSTANCE.getKERNEL_6_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_6_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getGoto().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_6_0_0_4 = INSTANCE.getKERNEL_6_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_6_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_6_0_0 = INSTANCE.getKERNEL_6_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_6_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_6_0_0_0, KERNEL_6_0_0_1, KERNEL_6_0_0_2, KERNEL_6_0_0_3, KERNEL_6_0_0_4);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_6_0 = INSTANCE.getKERNEL_6_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_6_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_6_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_6 = INSTANCE.getKERNEL_6();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_6() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getGoto(), KERNEL_6_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_7_0_0_0 = INSTANCE.getKERNEL_7_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_7_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_7_0_0_1 = INSTANCE.getKERNEL_7_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_7_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_7_0_0_2 = INSTANCE.getKERNEL_7_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_7_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("{", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_7_0_0_3 = INSTANCE.getKERNEL_7_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_7_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_7_0_0_4 = INSTANCE.getKERNEL_7_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_7_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__STATEMENTS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR, new EClass[] {org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_7_0_0_5 = INSTANCE.getKERNEL_7_0_0_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_7_0_0_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_7_0_0_6 = INSTANCE.getKERNEL_7_0_0_6();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_7_0_0_6() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("}", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_7_0_0 = INSTANCE.getKERNEL_7_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_7_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_7_0_0_0, KERNEL_7_0_0_1, KERNEL_7_0_0_2, KERNEL_7_0_0_3, KERNEL_7_0_0_4, KERNEL_7_0_0_5, KERNEL_7_0_0_6);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_7_0 = INSTANCE.getKERNEL_7_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_7_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_7_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_7 = INSTANCE.getKERNEL_7();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_7() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), KERNEL_7_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_8_0_0_0 = INSTANCE.getKERNEL_8_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_8_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("{*", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_8_0_0_1 = INSTANCE.getKERNEL_8_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_8_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("order", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_8_0_0_2 = INSTANCE.getKERNEL_8_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_8_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("=", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal KERNEL_8_0_0_3 = INSTANCE.getKERNEL_8_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal getKERNEL_8_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__ORDER), new String[] {"l2r", "l2r", "r2l", "r2l", "interleaved", "interleaved", }, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_8_0_0_4 = INSTANCE.getKERNEL_8_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_8_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_8_0_0_5 = INSTANCE.getKERNEL_8_0_0_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_8_0_0_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__STATEMENTS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.PLUS, new EClass[] {org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_8_0_0_6 = INSTANCE.getKERNEL_8_0_0_6();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_8_0_0_6() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_8_0_0_7 = INSTANCE.getKERNEL_8_0_0_7();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_8_0_0_7() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("*}", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_8_0_0 = INSTANCE.getKERNEL_8_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_8_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_8_0_0_0, KERNEL_8_0_0_1, KERNEL_8_0_0_2, KERNEL_8_0_0_3, KERNEL_8_0_0_4, KERNEL_8_0_0_5, KERNEL_8_0_0_6, KERNEL_8_0_0_7);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_8_0 = INSTANCE.getKERNEL_8_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_8_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_8_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_8 = INSTANCE.getKERNEL_8();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_8() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), KERNEL_8_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_9_0_0_0 = INSTANCE.getKERNEL_9_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_9_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(">", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_9_0_0_1 = INSTANCE.getKERNEL_9_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_9_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("|", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_9_0_0_2_0_0_0 = INSTANCE.getKERNEL_9_0_0_2_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_9_0_0_2_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.NON_DETERMINISTIC_BLOCK__STATEMENTS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_9_0_0_2_0_0 = INSTANCE.getKERNEL_9_0_0_2_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_9_0_0_2_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_9_0_0_2_0_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_9_0_0_2_0 = INSTANCE.getKERNEL_9_0_0_2_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_9_0_0_2_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_9_0_0_2_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_9_0_0_2 = INSTANCE.getKERNEL_9_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_9_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_9_0_0_2_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.PLUS);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_9_0_0 = INSTANCE.getKERNEL_9_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_9_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_9_0_0_0, KERNEL_9_0_0_1, KERNEL_9_0_0_2);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_9_0 = INSTANCE.getKERNEL_9_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_9_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_9_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_9 = INSTANCE.getKERNEL_9();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_9() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), KERNEL_9_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_10_0_0_0 = INSTANCE.getKERNEL_10_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_10_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAssignmentStatement().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_10_0_0_1 = INSTANCE.getKERNEL_10_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_10_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_10_0_0_2 = INSTANCE.getKERNEL_10_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_10_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAssignmentStatement().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_10_0_0_3 = INSTANCE.getKERNEL_10_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_10_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":=", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_10_0_0_4 = INSTANCE.getKERNEL_10_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_10_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAssignmentStatement().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__VALUE), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_10_0_0_5 = INSTANCE.getKERNEL_10_0_0_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_10_0_0_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_10_0_0 = INSTANCE.getKERNEL_10_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_10_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_10_0_0_0, KERNEL_10_0_0_1, KERNEL_10_0_0_2, KERNEL_10_0_0_3, KERNEL_10_0_0_4, KERNEL_10_0_0_5);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_10_0 = INSTANCE.getKERNEL_10_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_10_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_10_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_10 = INSTANCE.getKERNEL_10();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_10() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAssignmentStatement(), KERNEL_10_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_11_0_0_0 = INSTANCE.getKERNEL_11_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_11_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExpressionStatement().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_11_0_0_1 = INSTANCE.getKERNEL_11_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_11_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_11_0_0_2 = INSTANCE.getKERNEL_11_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_11_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExpressionStatement().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__EXPRESSION), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_11_0_0_3 = INSTANCE.getKERNEL_11_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_11_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_11_0_0 = INSTANCE.getKERNEL_11_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_11_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_11_0_0_0, KERNEL_11_0_0_1, KERNEL_11_0_0_2, KERNEL_11_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_11_0 = INSTANCE.getKERNEL_11_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_11_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_11_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_11 = INSTANCE.getKERNEL_11();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_11() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExpressionStatement(), KERNEL_11_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_12_0_0_0 = INSTANCE.getKERNEL_12_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_12_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_12_0_0_1 = INSTANCE.getKERNEL_12_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_12_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_12_0_0_2 = INSTANCE.getKERNEL_12_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_12_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("try", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_12_0_0_3 = INSTANCE.getKERNEL_12_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_12_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak KERNEL_12_0_0_4 = INSTANCE.getKERNEL_12_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak getKERNEL_12_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_12_0_0_5 = INSTANCE.getKERNEL_12_0_0_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_12_0_0_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("with", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_12_0_0_6 = INSTANCE.getKERNEL_12_0_0_6();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_12_0_0_6() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.PLUS, new EClass[] {org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_12_0_0 = INSTANCE.getKERNEL_12_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_12_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_12_0_0_0, KERNEL_12_0_0_1, KERNEL_12_0_0_2, KERNEL_12_0_0_3, KERNEL_12_0_0_4, KERNEL_12_0_0_5, KERNEL_12_0_0_6);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_12_0 = INSTANCE.getKERNEL_12_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_12_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_12_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_12 = INSTANCE.getKERNEL_12();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_12() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), KERNEL_12_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_13_0_0_0 = INSTANCE.getKERNEL_13_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_13_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_13_0_0_1 = INSTANCE.getKERNEL_13_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_13_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_13_0_0_2 = INSTANCE.getKERNEL_13_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_13_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("exception", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_13_0_0_3 = INSTANCE.getKERNEL_13_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_13_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__STATEMENT), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_13_0_0 = INSTANCE.getKERNEL_13_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_13_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_13_0_0_0, KERNEL_13_0_0_1, KERNEL_13_0_0_2, KERNEL_13_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_13_0 = INSTANCE.getKERNEL_13_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_13_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_13_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_13 = INSTANCE.getKERNEL_13();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_13() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), KERNEL_13_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_14_0_0_0 = INSTANCE.getKERNEL_14_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_14_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAbort().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_14_0_0_1 = INSTANCE.getKERNEL_14_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_14_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_14_0_0_2 = INSTANCE.getKERNEL_14_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_14_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("abort", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_14_0_0_3 = INSTANCE.getKERNEL_14_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_14_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_14_0_0 = INSTANCE.getKERNEL_14_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_14_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_14_0_0_0, KERNEL_14_0_0_1, KERNEL_14_0_0_2, KERNEL_14_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_14_0 = INSTANCE.getKERNEL_14_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_14_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_14_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_14 = INSTANCE.getKERNEL_14();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_14() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAbort(), KERNEL_14_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_15_0_0_0 = INSTANCE.getKERNEL_15_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_15_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getSkip().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_15_0_0_1 = INSTANCE.getKERNEL_15_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_15_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_15_0_0_2 = INSTANCE.getKERNEL_15_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_15_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("skip", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_15_0_0_3 = INSTANCE.getKERNEL_15_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_15_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_15_0_0 = INSTANCE.getKERNEL_15_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_15_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_15_0_0_0, KERNEL_15_0_0_1, KERNEL_15_0_0_2, KERNEL_15_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_15_0 = INSTANCE.getKERNEL_15_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_15_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_15_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_15 = INSTANCE.getKERNEL_15();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_15() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getSkip(), KERNEL_15_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_16_0_0_0 = INSTANCE.getKERNEL_16_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_16_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_16_0_0_1 = INSTANCE.getKERNEL_16_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_16_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_16_0_0_2 = INSTANCE.getKERNEL_16_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_16_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("call", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_16_0_0_3 = INSTANCE.getKERNEL_16_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_16_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_16_0_0_4 = INSTANCE.getKERNEL_16_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_16_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_16_0_0_5_0_0_0 = INSTANCE.getKERNEL_16_0_0_5_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_16_0_0_5_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__ARGUMENTS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.references.ReferencesPackage.eINSTANCE.getArgument(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_16_0_0_5_0_0_1_0_0_0 = INSTANCE.getKERNEL_16_0_0_5_0_0_1_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_16_0_0_5_0_0_1_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(",", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_16_0_0_5_0_0_1_0_0_1 = INSTANCE.getKERNEL_16_0_0_5_0_0_1_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_16_0_0_5_0_0_1_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__ARGUMENTS), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.references.ReferencesPackage.eINSTANCE.getArgument(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_16_0_0_5_0_0_1_0_0 = INSTANCE.getKERNEL_16_0_0_5_0_0_1_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_16_0_0_5_0_0_1_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_16_0_0_5_0_0_1_0_0_0, KERNEL_16_0_0_5_0_0_1_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_16_0_0_5_0_0_1_0 = INSTANCE.getKERNEL_16_0_0_5_0_0_1_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_16_0_0_5_0_0_1_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_16_0_0_5_0_0_1_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_16_0_0_5_0_0_1 = INSTANCE.getKERNEL_16_0_0_5_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_16_0_0_5_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_16_0_0_5_0_0_1_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_16_0_0_5_0_0 = INSTANCE.getKERNEL_16_0_0_5_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_16_0_0_5_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_16_0_0_5_0_0_0, KERNEL_16_0_0_5_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_16_0_0_5_0 = INSTANCE.getKERNEL_16_0_0_5_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_16_0_0_5_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_16_0_0_5_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_16_0_0_5 = INSTANCE.getKERNEL_16_0_0_5();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_16_0_0_5() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_16_0_0_5_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_16_0_0_6 = INSTANCE.getKERNEL_16_0_0_6();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_16_0_0_6() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_16_0_0_7 = INSTANCE.getKERNEL_16_0_0_7();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_16_0_0_7() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_16_0_0 = INSTANCE.getKERNEL_16_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_16_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_16_0_0_0, KERNEL_16_0_0_1, KERNEL_16_0_0_2, KERNEL_16_0_0_3, KERNEL_16_0_0_4, KERNEL_16_0_0_5, KERNEL_16_0_0_6, KERNEL_16_0_0_7);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_16_0 = INSTANCE.getKERNEL_16_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_16_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_16_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_16 = INSTANCE.getKERNEL_16();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_16() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), KERNEL_16_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_17_0_0_0 = INSTANCE.getKERNEL_17_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_17_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.eINSTANCE.getParameter().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__NAME), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_17_0_0 = INSTANCE.getKERNEL_17_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_17_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_17_0_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_17_0 = INSTANCE.getKERNEL_17_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_17_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_17_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_17 = INSTANCE.getKERNEL_17();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_17() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.eINSTANCE.getParameter(), KERNEL_17_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal KERNEL_18_0_0_0 = INSTANCE.getKERNEL_18_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal getKERNEL_18_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal(org.servicifi.gelato.language.kernel.references.ReferencesPackage.eINSTANCE.getArgument().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__BY_REFERENCE), "ref", "val", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_18_0_0_1 = INSTANCE.getKERNEL_18_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_18_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.references.ReferencesPackage.eINSTANCE.getArgument().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_18_0_0 = INSTANCE.getKERNEL_18_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_18_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_18_0_0_0, KERNEL_18_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_18_0 = INSTANCE.getKERNEL_18_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_18_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_18_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_18 = INSTANCE.getKERNEL_18();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_18() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.references.ReferencesPackage.eINSTANCE.getArgument(), KERNEL_18_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_19_0_0_0 = INSTANCE.getKERNEL_19_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_19_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__LABEL), "CHARACTER_LITERAL", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_19_0_0_1 = INSTANCE.getKERNEL_19_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_19_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(":", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_19_0_0_2 = INSTANCE.getKERNEL_19_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_19_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("[", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_19_0_0_3_0_0_0 = INSTANCE.getKERNEL_19_0_0_3_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_19_0_0_3_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__CHILDREN), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getSubExpression(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_19_0_0_3_0_0_1_0_0_0 = INSTANCE.getKERNEL_19_0_0_3_0_0_1_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_19_0_0_3_0_0_1_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(";", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment KERNEL_19_0_0_3_0_0_1_0_0_1 = INSTANCE.getKERNEL_19_0_0_3_0_0_1_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment getKERNEL_19_0_0_3_0_0_1_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__CHILDREN), org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, new EClass[] {org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getSubExpression(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_19_0_0_3_0_0_1_0_0 = INSTANCE.getKERNEL_19_0_0_3_0_0_1_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_19_0_0_3_0_0_1_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_19_0_0_3_0_0_1_0_0_0, KERNEL_19_0_0_3_0_0_1_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_19_0_0_3_0_0_1_0 = INSTANCE.getKERNEL_19_0_0_3_0_0_1_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_19_0_0_3_0_0_1_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_19_0_0_3_0_0_1_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_19_0_0_3_0_0_1 = INSTANCE.getKERNEL_19_0_0_3_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_19_0_0_3_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_19_0_0_3_0_0_1_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_19_0_0_3_0_0 = INSTANCE.getKERNEL_19_0_0_3_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_19_0_0_3_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_19_0_0_3_0_0_0, KERNEL_19_0_0_3_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_19_0_0_3_0 = INSTANCE.getKERNEL_19_0_0_3_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_19_0_0_3_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_19_0_0_3_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound KERNEL_19_0_0_3 = INSTANCE.getKERNEL_19_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound getKERNEL_19_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCompound(KERNEL_19_0_0_3_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_19_0_0_4 = INSTANCE.getKERNEL_19_0_0_4();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_19_0_0_4() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("]", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_19_0_0 = INSTANCE.getKERNEL_19_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_19_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_19_0_0_0, KERNEL_19_0_0_1, KERNEL_19_0_0_2, KERNEL_19_0_0_3, KERNEL_19_0_0_4);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_19_0 = INSTANCE.getKERNEL_19_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_19_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_19_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_19 = INSTANCE.getKERNEL_19();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_19() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), KERNEL_19_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_20_0_0_0 = INSTANCE.getKERNEL_20_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_20_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("defines", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_20_0_0_1 = INSTANCE.getKERNEL_20_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_20_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_20_0_0_2 = INSTANCE.getKERNEL_20_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_20_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getDefines().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_20_0_0_3 = INSTANCE.getKERNEL_20_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_20_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_20_0_0 = INSTANCE.getKERNEL_20_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_20_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_20_0_0_0, KERNEL_20_0_0_1, KERNEL_20_0_0_2, KERNEL_20_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_20_0 = INSTANCE.getKERNEL_20_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_20_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_20_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_20 = INSTANCE.getKERNEL_20();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_20() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getDefines(), KERNEL_20_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_21_0_0_0 = INSTANCE.getKERNEL_21_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_21_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("uses", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_21_0_0_1 = INSTANCE.getKERNEL_21_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_21_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_21_0_0_2 = INSTANCE.getKERNEL_21_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_21_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getUses().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_21_0_0_3 = INSTANCE.getKERNEL_21_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_21_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_21_0_0 = INSTANCE.getKERNEL_21_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_21_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_21_0_0_0, KERNEL_21_0_0_1, KERNEL_21_0_0_2, KERNEL_21_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_21_0 = INSTANCE.getKERNEL_21_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_21_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_21_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_21 = INSTANCE.getKERNEL_21();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_21() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getUses(), KERNEL_21_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_22_0_0_0 = INSTANCE.getKERNEL_22_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_22_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("affects", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_22_0_0_1 = INSTANCE.getKERNEL_22_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_22_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_22_0_0_2 = INSTANCE.getKERNEL_22_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_22_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getAffects().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_22_0_0_3 = INSTANCE.getKERNEL_22_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_22_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_22_0_0 = INSTANCE.getKERNEL_22_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_22_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_22_0_0_0, KERNEL_22_0_0_1, KERNEL_22_0_0_2, KERNEL_22_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_22_0 = INSTANCE.getKERNEL_22_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_22_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_22_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_22 = INSTANCE.getKERNEL_22();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_22() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getAffects(), KERNEL_22_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_23_0_0_0 = INSTANCE.getKERNEL_23_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_23_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("postdefines", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_23_0_0_1 = INSTANCE.getKERNEL_23_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_23_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_23_0_0_2 = INSTANCE.getKERNEL_23_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_23_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getPostDefines().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_23_0_0_3 = INSTANCE.getKERNEL_23_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_23_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_23_0_0 = INSTANCE.getKERNEL_23_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_23_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_23_0_0_0, KERNEL_23_0_0_1, KERNEL_23_0_0_2, KERNEL_23_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_23_0 = INSTANCE.getKERNEL_23_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_23_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_23_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_23 = INSTANCE.getKERNEL_23();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_23() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getPostDefines(), KERNEL_23_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_24_0_0_0 = INSTANCE.getKERNEL_24_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_24_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("preuses", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_24_0_0_1 = INSTANCE.getKERNEL_24_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_24_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_24_0_0_2 = INSTANCE.getKERNEL_24_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_24_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getPreUses().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_24_0_0_3 = INSTANCE.getKERNEL_24_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_24_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_24_0_0 = INSTANCE.getKERNEL_24_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_24_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_24_0_0_0, KERNEL_24_0_0_1, KERNEL_24_0_0_2, KERNEL_24_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_24_0 = INSTANCE.getKERNEL_24_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_24_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_24_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_24 = INSTANCE.getKERNEL_24();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_24() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getPreUses(), KERNEL_24_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_25_0_0_0 = INSTANCE.getKERNEL_25_0_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_25_0_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("postaffects", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_25_0_0_1 = INSTANCE.getKERNEL_25_0_0_1();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_25_0_0_1() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword("(", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder KERNEL_25_0_0_2 = INSTANCE.getKERNEL_25_0_0_2();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder getKERNEL_25_0_0_2() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getPostAffects().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET), "IDENTIFIER", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword KERNEL_25_0_0_3 = INSTANCE.getKERNEL_25_0_0_3();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword getKERNEL_25_0_0_3() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword(")", org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence KERNEL_25_0_0 = INSTANCE.getKERNEL_25_0_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence getKERNEL_25_0_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSequence(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_25_0_0_0, KERNEL_25_0_0_1, KERNEL_25_0_0_2, KERNEL_25_0_0_3);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice KERNEL_25_0 = INSTANCE.getKERNEL_25_0();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice getKERNEL_25_0() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE, KERNEL_25_0_0);
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule KERNEL_25 = INSTANCE.getKERNEL_25();
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule getKERNEL_25() {
		return new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getPostAffects(), KERNEL_25_0, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE);
	}
	
	
	public static String getSyntaxElementID(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (Field field : org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement) org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule[] RULES = new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule[] {
		KERNEL_0,
		KERNEL_1,
		KERNEL_2,
		KERNEL_3,
		KERNEL_4,
		KERNEL_5,
		KERNEL_6,
		KERNEL_7,
		KERNEL_8,
		KERNEL_9,
		KERNEL_10,
		KERNEL_11,
		KERNEL_12,
		KERNEL_13,
		KERNEL_14,
		KERNEL_15,
		KERNEL_16,
		KERNEL_17,
		KERNEL_18,
		KERNEL_19,
		KERNEL_20,
		KERNEL_21,
		KERNEL_22,
		KERNEL_23,
		KERNEL_24,
		KERNEL_25,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new LinkedHashSet<String>();
			for (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement element, Set<String> keywords) {
		if (element instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword) {
			keywords.add(((org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword) element).getValue());
		} else if (element instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal) {
			keywords.add(((org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal) {
			org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal terminal = (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
