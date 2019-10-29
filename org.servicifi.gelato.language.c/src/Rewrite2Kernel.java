import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.containers.ContainersFactory;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory;
import org.servicifi.gelato.language.kernel.expressions.Defines;
import org.servicifi.gelato.language.kernel.expressions.Expression;
import org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory;
import org.servicifi.gelato.language.kernel.expressions.SubExpression;
import org.servicifi.gelato.language.kernel.expressions.Uses;
import org.servicifi.gelato.language.kernel.members.Member;
import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.parameters.ParametersFactory;
import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.procedures.ProceduresFactory;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.ArgumentReference;
import org.servicifi.gelato.language.kernel.references.ElementReference;
import org.servicifi.gelato.language.kernel.references.EmptyArgument;
import org.servicifi.gelato.language.kernel.references.ReferenceableElement;
import org.servicifi.gelato.language.kernel.references.ReferencesFactory;
import org.servicifi.gelato.language.kernel.statements.Block;
import org.servicifi.gelato.language.kernel.statements.Condition;
import org.servicifi.gelato.language.kernel.statements.Conditional;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;
import org.servicifi.gelato.language.kernel.statements.Goto;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.StatementContainer;
import org.servicifi.gelato.language.kernel.statements.StatementListContainer;
import org.servicifi.gelato.language.kernel.statements.StatementsFactory;
import org.servicifi.gelato.language.kernel.statements.WhileLoop;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;

public class Rewrite2Kernel extends CBaseVisitor<List<? extends Object>> {

	private MappingStore store = new MappingStore();

	public MappingStore getStore() {
		return store;
	}

	@Override
	public List<CompilationUnit> visitCompilationUnit(CParser.CompilationUnitContext ctx) {

		// populate procedure mappings
		visitTranslationUnitSignature(ctx.translationUnit());

		// do the translation
		CompilationUnit cu = ContainersFactory.eINSTANCE.createCompilationUnit();

		List les = visitChildren(ctx);

		// TODO add main procedure
		// THINK if only one procedure with no parameters, create a main procedure

		for (Object le : les) {
			if (le instanceof Member) {
				cu.getDeclarations().add((Member) le);
			} else {
				throw new Error("The children are non member (i.e. DataItem or Procedure");
			}
		}

		MainProcedure mp = ProceduresFactory.eINSTANCE.createMainProcedure();
		mp.setLabel(0);
		cu.setMainProcedure(mp);

		Procedure lastProcedure = null;

		for (Member member : cu.getDeclarations()) {
			if (member instanceof Procedure) {
				lastProcedure = (Procedure) member;
			}
		}

		if (lastProcedure != null) {
			ProcedureCall pc = StatementsFactory.eINSTANCE.createProcedureCall();
			pc.setLabel(0.1);
			pc.setTarget(lastProcedure);

			// for each parameter in the main entry procedure, create an empty argument
			for (Parameter parameter : lastProcedure.getParameters()) {
				EmptyArgument emptyArg = ReferencesFactory.eINSTANCE.createEmptyArgument();
				pc.getArguments().add(emptyArg);
			}

			mp.getMembers().add(pc);
		}

		fixElementReferenceTargets(cu);

		return Arrays.asList(cu);
	}

	private void fixElementReferenceTargets(CompilationUnit cu) {

		TreeIterator<EObject> iterator = cu.eAllContents();

		while (iterator.hasNext()) {
			EObject element = iterator.next();

			if (!(element instanceof ElementReference)) {
				continue;
			}

			ElementReference reference = (ElementReference) element;
			if (reference.getTarget() == null) {
				throw new Error("Element reference has a null target: " + reference);
			}

			ReferenceableElement target = reference.getTarget();

			if (target instanceof DataItem) {
				// search to see if data item is contained by CompilationUnit

				DataItem dataItem = (DataItem) target;

				// XXX Parameter -|> DataItem, so no need to fix
				if (target instanceof Parameter) {
					continue;
				}

				boolean hasDataItem = cu.getDeclarations().stream().anyMatch(d -> d.equals(dataItem));

				if (!hasDataItem) {
					cu.getDeclarations().add(dataItem);
				}
			}
		}
	}

	/**
	 * directDeclarator : Identifier | '(' declarator ')' | directDeclarator '['
	 * typeQualifierList? assignmentExpression? ']' | directDeclarator '[' 'static'
	 * typeQualifierList? assignmentExpression ']' | directDeclarator '['
	 * typeQualifierList 'static' assignmentExpression ']' | directDeclarator '['
	 * typeQualifierList? '*' ']' | directDeclarator '(' parameterTypeList ')' |
	 * directDeclarator '(' identifierList? ')' | Identifier ':' DigitSequence //
	 * bit field | '(' typeSpecifier? pointer directDeclarator ')' // function
	 * pointer like: (__cdecl *f) ;
	 */
	@Override
	public List<Member> visitDirectDeclarator(CParser.DirectDeclaratorContext ctx) {
		if (ctx.directDeclarator() != null) {
			String identifierName = ctx.directDeclarator().Identifier().toString();

			Procedure procedure = null;
			if (store.hasProcedure(identifierName)) {
				procedure = store.getProcedure(identifierName);
			} else {
				procedure = createProcedureAndPopulateParameters(ctx, identifierName);
			}

			return Arrays.asList(procedure);
		} else if (ctx.Identifier() != null) {
			DataItem dataItem = DataitemsFactory.eINSTANCE.createDataItem();

			if (store.isCReservedWord(ctx.Identifier())) {
				return new ArrayList<>();
			}

			dataItem.setName(store.getName(store.getContext(), ctx.Identifier()));

			return Arrays.asList(dataItem);
		}

		throw new Error("Unsupported " + ctx.getText());
	}

	private Procedure createProcedureAndPopulateParameters(CParser.DirectDeclaratorContext ctx, String procedureName)
			throws Error {
		Procedure procedure = store.createProcedure(procedureName);
		procedure.setLabel(store.getLabel(ctx));

		store.pushContext(procedureName);

		if (ctx.parameterTypeList() != null) {
			List children = visitChildren(ctx.parameterTypeList());

			for (Object child : children) {
				if (child instanceof Parameter) {
					procedure.getParameters().add((Parameter) child);
				} else {
					throw new Error("Parameter " + child + " has a non-string declaration: " + child.getClass());
				}
			}
		}

		store.popContext();

		return procedure;
	}

	/**
	 * parameterDeclaration : declarationSpecifiers declarator |
	 * declarationSpecifiers2 abstractDeclarator? ;
	 */
	public List visitParameterDeclaration(CParser.ParameterDeclarationContext ctx) {
		if (ctx.declarator() != null) {
			Parameter parameter = ParametersFactory.eINSTANCE.createParameter();

			String parameterName = store.createName(store.getContext(),
					ctx.declarator().directDeclarator().Identifier());

			parameter.setName(parameterName);

			return Arrays.asList(parameter);
		}

		return new ArrayList<>();
	}

	public List visitTranslationUnitSignature(CParser.TranslationUnitContext ctx) {
		List result = new ArrayList<>();

		if (ctx.translationUnit() != null) {
			result.addAll(visitTranslationUnitSignature(ctx.translationUnit()));
		}

		result.addAll(visitExternalDeclarationSignature(ctx.externalDeclaration()));

		return result;
	}

	public List visitExternalDeclarationSignature(CParser.ExternalDeclarationContext ctx) {
		return visitFunctionDefinitionSignature(ctx.functionDefinition());
	}

	/**
	 * functionDefinition : declarationSpecifiers? declarator declarationList?
	 * compoundStatement ;
	 */
	public List visitFunctionDefinitionSignature(CParser.FunctionDefinitionContext ctx) {
		List decl = visitDeclarator(ctx.declarator());

		if (decl.size() > 1) {
			throw new Error("Too many declarators");
		}

		Member memb = (Member) decl.get(0);

		if (memb instanceof Procedure) {
			Procedure procedure = (Procedure) memb;

			// has a return type: could be void
			if (ctx.declarationSpecifiers() != null) {
				if (!(ctx.declarationSpecifiers().getText().equals("void"))) {
					Parameter parameter = ParametersFactory.eINSTANCE.createParameter();
					parameter.setByReference(true);

					String procedureReturnIdentifierName = getProcedureReturnIdentifierName(procedure);
					parameter.setName(store.createName(procedure.getName(), procedureReturnIdentifierName));

					procedure.getParameters().add(parameter);
				}
			}
		}

		return Arrays.asList(memb);

	}

	private String getProcedureReturnIdentifierName(Procedure procedure) {
		return "#return_" + procedure.getName();
	}

	/**
	 * declaration : declarationSpecifiers initDeclaratorList ';' |
	 * declarationSpecifiers ';' | staticAssertDeclaration ;
	 */
	@Override
	public List visitDeclaration(CParser.DeclarationContext ctx) {
		if (ctx.initDeclaratorList() != null) {
			return visitInitDeclaratorList(ctx.initDeclaratorList());
		}

		return new ArrayList<>();
	}

	/**
	 * initDeclaratorList : initDeclarator | initDeclaratorList ',' initDeclarator ;
	 */
	@Override
	public List visitInitDeclaratorList(CParser.InitDeclaratorListContext ctx) {
		List result = new ArrayList<>();
		if (ctx.initDeclaratorList() != null) {
			result.addAll(visitInitDeclaratorList(ctx.initDeclaratorList()));
		}

		CParser.DeclaratorContext declarator = ctx.initDeclarator().declarator();
		if (declarator != null) {
			CParser.DirectDeclaratorContext directDeclarator = declarator.directDeclarator();
			if (directDeclarator != null) {
				TerminalNode identifier = directDeclarator.Identifier();
				if (identifier != null) {
					store.createName(store.getContext(), identifier);
				}
			}
		}

		result.addAll(visitInitDeclarator(ctx.initDeclarator()));

		return result;
	}

	/**
	 * functionDefinition : declarationSpecifiers? declarator declarationList?
	 * compoundStatement ;
	 */
	@Override
	public List visitFunctionDefinition(CParser.FunctionDefinitionContext ctx) {
		List decl = visitDeclarator(ctx.declarator());

		if (decl.size() > 1) {
			throw new Error("Too many declarators");
		}

		Member memb = (Member) decl.get(0);

		if (memb instanceof Procedure) {
			Procedure procedure = (Procedure) decl.get(0);

			store.pushContext(procedure.getName());

			List statements = visitCompoundStatement(ctx.compoundStatement());

			List<Member> results = new ArrayList<>();

			if (statements != null) {
				for (Object st : statements) {
					if (st instanceof Statement) {
						procedure.getMembers().add((Statement) st);

					} else if (st instanceof DataItem) {
						results.add((DataItem) st);
					} else {
						throw new Error("The children are non statement or data item: " + st);
					}
				}
			}

			// set return definition variable expression
			setReturnExpressionDefinitions(procedure);

			// add goto destination labels
			setGotoDestinations(procedure);

			store.popContext();

			results.add(procedure);

			return results;
		}

		return new ArrayList<>();
	}

	private void setReturnExpressionDefinitions(Procedure procedure) {
		EList<Parameter> params = procedure.getParameters();

		if (params.size() > 0) {
			Parameter lastParameter = params.get(params.size() - 1);

			for (ExpressionStatement returnExpressionStatement : store.getReturnExpressionStatements()) {
				SubExpression returnVariableDefinition = ExpressionsFactory.eINSTANCE.createDefines();
				returnVariableDefinition.setTarget(lastParameter);

				returnExpressionStatement.getExpression().getChildren().add(returnVariableDefinition);
			}
		}

		store.clearReturnExpressionStatements();
	}

	private void setGotoDestinations(Procedure procedure) {
		TreeIterator<EObject> iterator = procedure.eAllContents();

		while (iterator.hasNext()) {
			EObject obj = iterator.next();

			if (!(obj instanceof Goto)) {
				continue;
			}

			Goto gotoStatement = (Goto) obj;

			if (gotoStatement.getTarget() != null) {
				continue;
			}

			RuleContext ctx = store.getRuleContext(gotoStatement.getLabel());

			if (!(ctx instanceof CParser.JumpStatementContext)) {
				throw new Error("Unsupported non jump statement: " + ctx.getText());
			}

			CParser.JumpStatementContext jumpCtx = (CParser.JumpStatementContext) ctx;

			if (jumpCtx.Identifier() != null) {
				Set<LabellableElement> jumpTargetLabel = store.getJumpLabel(jumpCtx.Identifier().getText());

				if (jumpTargetLabel.size() == 0) {
					throw new Error("Jump statement has no target: " + jumpCtx.getText());
				} else if (jumpTargetLabel.size() > 1) {
					throw new Error("Unsupported multiple targets: " + jumpTargetLabel);
				}

				jumpTargetLabel.forEach(l -> gotoStatement.setTarget(getActualGoToTarget(l)));
			} else if (jumpCtx.Break() != null) {

				// XXX the commented code section is the proper way, however, due to
				// `getNextRuleContext`
				// the correct target rule context cannotbe found from the original program.

//				RuleContext currentCtx = jumpCtx.parent;
//				while (!(currentCtx instanceof CParser.IterationStatementContext)) {
//					currentCtx = currentCtx.getParent();
//				}
//
//				ParserRuleContext ruleContext = (ParserRuleContext) getNextRuleContext(currentCtx);
//
//				LabellableElement target = findLabellableElement(procedure, store.getLabel(ruleContext));
//
//				if (target == null) {
//					throw new Error("Could not find target of break: '" + ruleContext.getText() + "' with label: "
//							+ store.getLabel(ruleContext) + " and type: "+ ruleContext.getClass());
//				}
				EObject container = gotoStatement.eContainer();
				while (!(container == null || container instanceof WhileLoop)) {
					container = container.eContainer();
				}

				if (container != null) {
					LabellableElement target = getNextLabellableElement(container);

					// XXX if target is null, create a no-op at the end of procedure, and set the
					// target to it

					gotoStatement.setTarget(getActualGoToTarget(target));
				} else {
					throw new Error("BREAK does not have any while loop container");
				}

			} else if (jumpCtx.Continue() != null) {
				// XXX this will miss the initialization before the while loop

				EObject container = gotoStatement.eContainer();
				while (!(container == null || container instanceof WhileLoop)) {
					container = container.eContainer();
				}
				if (container != null) {
					LabellableElement target = (LabellableElement) container;

					// XXX if target is null, create a no-op at the end of procedure, and set the
					// target to it
					gotoStatement.setTarget(getActualGoToTarget(target));
				} else {
					throw new Error("BREAK does not have any while loop container");
				}

			} else {
				throw new Error("Jump statement has no goto label: " + jumpCtx.getText());
			}
		}

		store.clearLabels();
	}

	private LabellableElement getActualGoToTarget(LabellableElement target) {
		if (target instanceof Conditional) {
			return ((Conditional) target).getCondition();
		}

		return target;
	}

	private static LabellableElement getNextLabellableElement(EObject object) throws Error {
		EObject container = object.eContainer();
		if (container == null) {
			throw new Error("object " + object + " has no container");
		}

		if (container instanceof Procedure) {
			int index = 0;
			EList<EObject> children = container.eContents();

			while (index < children.size()) {
				if (children.get(index).equals(object)) {
					break;
				}
				index++;
			}

			return (LabellableElement) children.get(++index);
		} else if (container instanceof StatementListContainer) {
			int index = 0;
			EList<EObject> children = container.eContents();

			while (index < children.size()) {
				if (children.get(index).equals(object)) {
					break;
				}
				index++;
			}

			EObject element = children.get(++index);

			if (element == null) {
				return getNextLabellableElement(children.get(--index));
			}

			return (LabellableElement) element;

		} else if (container instanceof StatementContainer) {
			return getNextLabellableElement(container);

		} else {
			throw new Error("Unrecognized container of " + object + ": " + container);
		}
	}

	private static LabellableElement findLabellableElement(EObject container, Double label) {
		TreeIterator<EObject> iterator = container.eAllContents();

		while (iterator.hasNext()) {
			EObject obj = iterator.next();

			if (obj instanceof LabellableElement) {
				LabellableElement element = (LabellableElement) obj;

				if (label.equals(element.getLabel())) {
					return element;
				}
			}
		}

		return null;
	}

	@Override
	protected List aggregateResult(List aggregate, List nextResult) {
		if (aggregate == null) {
			return nextResult;
		}

		if (nextResult == null) {
			return aggregate;
		}

		List newList = new ArrayList(aggregate);

		newList.addAll(nextResult);

		return newList;
	}

	/**
	 * jumpStatement : 'goto' Identifier ';' | 'continue' ';' | 'break' ';' |
	 * 'return' expression? ';' | 'goto' unaryExpression ';' // GCC extension ;
	 */
	@Override
	public List<Statement> visitJumpStatement(CParser.JumpStatementContext ctx) {
		if (ctx.Goto() != null) {
			TerminalNode identifier = ctx.Identifier();
			if (identifier != null) {
				Statement gotoStatement = StatementsFactory.eINSTANCE.createGoto();
				gotoStatement.setLabel(store.getLabel(ctx));

				return Arrays.asList(gotoStatement);
			}
		} else if (ctx.Continue() != null) {
			Statement gotoStatement = StatementsFactory.eINSTANCE.createGoto();
			gotoStatement.setLabel(store.getLabel(ctx));

			// FIXME does it work?
//			ParserRuleContext currentCtx = ctx;
//			while (currentCtx.parent instanceof CParser.IterationStatementContext) {
//				currentCtx = currentCtx.getParent();
//			}
//
//			double continueLabel = store.getLabel(currentCtx);
//
//			gotoStatement.setLabel(continueLabel);

			return Arrays.asList(gotoStatement);
		} else if (ctx.Return() != null) {
			List results = new ArrayList<>();

			Statement returnStatement = StatementsFactory.eINSTANCE.createReturn();
			returnStatement.setLabel(store.getLabel(ctx));

			if (ctx.expression() != null) {
				ExpressionStatement returnExpressionStatement = StatementsFactory.eINSTANCE.createExpressionStatement();

				double label = store.getLabel(ctx.expression());
				returnExpressionStatement.setLabel(label);

				Expression returnExpression = ExpressionsFactory.eINSTANCE.createExpression();
				returnExpression.setLabel(label + 0.1);

				List<? extends Object> children = visitChildren(ctx.expression());

				for (Object child : children) {
					if (child instanceof SubExpression) {
						returnExpression.getChildren().add((SubExpression) child);
					} else {
						throw new Error("unrecongnized condition expression child: " + child);
					}
				}

				returnExpressionStatement.setExpression(returnExpression);

				store.registerReturnExpressionStatement(returnExpressionStatement);

				results.add(returnExpressionStatement);
			}

			results.add(returnStatement);

			return results;
		} else if (ctx.Break() != null) {
			Statement gotoStatement = StatementsFactory.eINSTANCE.createGoto();
			gotoStatement.setLabel(store.getLabel(ctx));

//			// FIXME does it work?
//			RuleContext currentCtx = ctx.parent;
//			while (!(currentCtx instanceof CParser.IterationStatementContext)) {
//				currentCtx = currentCtx.getParent();
//			}
//			
//			// XXX does the cast here correct?
//			gotoStatement.setLabel(store.getLabel((ParserRuleContext) getNextRuleContext(currentCtx)));

			return Arrays.asList(gotoStatement);
		}

		return new ArrayList<Statement>();
	}

	private static RuleContext getNextRuleContext(RuleContext currentCtx) {
		// need to keep going up the tree to find the right next child
		int index = 0;
		RuleContext currentCtxParent;
		do {
			currentCtxParent = currentCtx.parent;

			index = 0;
			while (index < currentCtxParent.getChildCount()) {
				if (currentCtxParent.getChild(index).equals(currentCtx)) {
					index++;
					break;
				}
				index++;
			}

			currentCtx = currentCtxParent;
		} while (index >= currentCtxParent.getChildCount());

		return getNextRuleContext(currentCtxParent, index);
	}

	private static RuleContext getNextRuleContext(RuleContext currentCtxParent, int index) {
		ParseTree node = currentCtxParent.getChild(index);

		if (node instanceof RuleContext) {
			return (RuleContext) node;
		}

		// next
		index++;
		while (true) {
			while (index < currentCtxParent.getChildCount()) {
				ParseTree currentChild = currentCtxParent.getChild(index);
				if (currentChild instanceof RuleContext) {
					return (RuleContext) currentChild;
				}

				index++;
			}

			currentCtxParent = currentCtxParent.parent;

			if (currentCtxParent == null) {
				throw new Error("Could not find the parent");
			}

			index = 0;
		}
	}

	public List<Condition> visitSelectionStatement(CParser.SelectionStatementContext ctx) {
		if (ctx.If() == null) {
			throw new Error("Only if statements are supported");
		}

		Condition statement = StatementsFactory.eINSTANCE.createCondition();
		statement.setLabel(store.getLabel(ctx));

		Expression conditionExpr = ExpressionsFactory.eINSTANCE.createExpression();
		conditionExpr.setLabel(store.getLabel(ctx.expression()));

		List<? extends Object> children = visitChildren(ctx.expression());

		for (Object child : children) {
			if (child instanceof SubExpression) {
				// do something
				conditionExpr.getChildren().add((SubExpression) child);
			} else if (child instanceof ExpressionStatement) {
				// XXX rewrite
				conditionExpr = ((ExpressionStatement) child).getExpression();
			} else {
				throw new Error("unrecongnized condition expression child: " + child);
			}
		}

		statement.setCondition(conditionExpr);

		// true block
		Block trueBlockStatement = StatementsFactory.eINSTANCE.createBlock();
		trueBlockStatement.setLabel(store.getLabel(ctx.statement(0)));

		List<? extends Object> trueStatements = visitChildren(ctx.statement(0));

		for (Object st : trueStatements) {
			if (st instanceof Statement) {
				trueBlockStatement.getStatements().add((Statement) st);
			} else if (st instanceof DataItem) {
				// XXX so nothing
			} else {
				throw new Error("unrecongnized true statement: " + st + " for ctx: " + ctx.statement(0).getText());
			}
		}

		statement.setStatement(trueBlockStatement);

		if (ctx.Else() != null) {
			Block falseBlockStatement = StatementsFactory.eINSTANCE.createBlock();
			falseBlockStatement.setLabel(store.getLabel(ctx.statement(1)));

			List<? extends Object> falseStatements = visitChildren(ctx.statement(1));

			for (Object st : falseStatements) {
				if (st instanceof Statement) {
					falseBlockStatement.getStatements().add((Statement) st);
				} else {
					throw new Error("unrecongnized false statement: " + st);
				}
			}

			statement.setElseStatement(falseBlockStatement);
		}

		return Arrays.asList(statement);
	}

	/**
	 * initDeclarator : declarator | declarator '=' initializer ;
	 */
	public List visitInitDeclarator(CParser.InitDeclaratorContext ctx) {
		List result = new ArrayList<>();

		List declarator = visitChildren(ctx.declarator());

		if (declarator == null || declarator.size() == 0) {
			throw new Error("No declaration in " + ctx.getText());
		}

		if (declarator.size() != 1) {
			throw new Error("More than one declaration in " + ctx.getText());
		}

		Object decl = declarator.get(0);

		if (!(decl instanceof DataItem)) {
			throw new Error("declaration is not a data item: " + decl + " for ctx: " + ctx.getText());
		}

		DataItem di = (DataItem) decl;
		result.add(di);

		if (ctx.initializer() != null) {

			List rhs = visitChildren(ctx.initializer());

			if (rhs.size() == 1) {
				if (rhs.get(0) instanceof ProcedureCall) {
					ProcedureCall o = (ProcedureCall) rhs.get(0);

					ArgumentReference retArg = ReferencesFactory.eINSTANCE.createArgumentReference();
					retArg.setTarget(di);

					o.getArguments().add(retArg);
					result.add(o);

					return result;
				} else if (rhs.get(0) instanceof ExpressionStatement) {
					ExpressionStatement statement = (ExpressionStatement) rhs.get(0);

					SubExpression def = ExpressionsFactory.eINSTANCE.createDefines();
					def.setTarget(di);

					statement.getExpression().getChildren().add(def);

					result.add(statement);

					return result;

				}
			}

			ExpressionStatement st = StatementsFactory.eINSTANCE.createExpressionStatement();
			st.setLabel(store.getLabel(ctx));

			SubExpression def = ExpressionsFactory.eINSTANCE.createDefines();
			def.setTarget(di);

			Expression expression = ExpressionsFactory.eINSTANCE.createExpression();
			expression.setLabel(store.getLabel(ctx.initializer()));

			expression.getChildren().add(def);

			for (Object o : rhs) {
				if (o instanceof SubExpression) {
					expression.getChildren().add((SubExpression) o);
				} else {
					throw new Error("unrecognized statement: " + o);
				}
			}

			st.setExpression(expression);
			result.add(st);

			return result;
		}

		return visitChildren(ctx);
	}

	/**
	 * iterationStatement : While '(' expression ')' statement | Do statement While
	 * '(' expression ')' ';' | For '(' forCondition ')' statement ;
	 */

	public List<WhileLoop> visitIterationStatement(CParser.IterationStatementContext ctx) {
		WhileLoop statement = StatementsFactory.eINSTANCE.createWhileLoop();
		double loopLabel = store.getLabel(ctx);

		statement.setLabel(loopLabel);

		Block blockStatement = StatementsFactory.eINSTANCE.createBlock();
		blockStatement.setLabel(loopLabel + 0.1);

		List<? extends Object> loopStatements = visitChildren(ctx.statement());

		for (Object st : loopStatements) {
			if (st instanceof Statement) {
				blockStatement.getStatements().add((Statement) st);
			} else {
				throw new Error("unrecongnized true statement: " + st);
			}
		}

		if (ctx.For() != null) {
			List<? extends Object> forCondition = visitForCondition(ctx.forCondition());
			// must have three elements: a statement, an expression, a statement
			System.out.println(forCondition.get(0) + "");
			Statement initialization = (Statement) forCondition.get(0);
			Expression conditionExpr = (Expression) forCondition.get(1);
			Statement incrementSt = (Statement) forCondition.get(2);

			statement.setCondition(conditionExpr);
			blockStatement.getStatements().add(incrementSt);

			statement.setStatement(blockStatement);

			List result = new ArrayList();
			result.add(initialization);
			result.add(statement);

			return result;
		} else if (ctx.Do() != null) { // do {} while();
			throw new Error("Unsupported do while statement");
		} else { // while() do {}
			statement.setStatement(blockStatement);

			List<? extends Object> children = visitChildren(ctx.expression());

			Expression conditionExpr = ExpressionsFactory.eINSTANCE.createExpression();
			conditionExpr.setLabel(store.getLabel(ctx.expression()));

			for (Object c : children) {
				if (c instanceof SubExpression) {
					conditionExpr.getChildren().add((SubExpression) c);
				} else if (c instanceof ExpressionStatement) {
					// XXX rewrite this
//					Expression expr = ((ExpressionStatement) c).getExpression();
//					for (SubExpression se : expr.getChildren()) {
//						conditionExpr.getChildren().add(se);
//					}
					conditionExpr = ((ExpressionStatement) c).getExpression();
				} else {
					throw new Error("Condition '" + ctx.expression().getText() + "' has a non usage child " + c);
				}
			}

			statement.setCondition(conditionExpr);

			return Arrays.asList(statement);
		}
	}

	// for condition
	/**
	 * forCondition : forDeclaration ';' forExpression? ';' forExpression? |
	 * expression? ';' forExpression? ';' forExpression? ;
	 */
	// post-condition: a triple <intialization Statement, condition Expr, increment
	// Statement>
	public List<? extends Object> visitForCondition(CParser.ForConditionContext ctx) {
		List result = new ArrayList();

		ExpressionStatement initSt = null;
		DataItem dataItemDeclaraion = null;

		if (ctx.expression() != null) {
			initSt = StatementsFactory.eINSTANCE.createExpressionStatement();

			double label = store.getLabel(ctx.expression());
			initSt.setLabel(label);

			Expression initExpr = ExpressionsFactory.eINSTANCE.createExpression();
			initExpr.setLabel(label + 0.1);

			List children = visitChildren(ctx.expression());
			for (Object child : children) {
				if (child instanceof SubExpression) {
					initExpr.getChildren().add((SubExpression) child);
				} else if (child instanceof DataItem) {
					// FIXME do nothing
				} else {
					throw new Error("Unsupported child sub expression " + ctx.expression().getText());
				}
			}
			initSt.setExpression(initExpr);
		} else if (ctx.forDeclaration() != null) {
			initSt = StatementsFactory.eINSTANCE.createExpressionStatement();

			double label = store.getLabel(ctx.forDeclaration());
			initSt.setLabel(label);

			Expression initExpr = ExpressionsFactory.eINSTANCE.createExpression();
			initExpr.setLabel(label + 0.1);

			List children = visitChildren(ctx.forDeclaration());
			for (Object child : children) {
				if (child instanceof SubExpression) {
					initExpr.getChildren().add((SubExpression) child);
//				} else if (child instanceof DataItem) {
//					// FIXME do nothing
				} else {
					throw new Error("Unsupported child sub expression " + ctx.forDeclaration().getText());
				}
			}
			initSt.setExpression(initExpr);

		} else {
			throw new Error("unrecognized for initialization");
		}

		result.add(initSt);

		Expression conditionExpr = ExpressionsFactory.eINSTANCE.createExpression();
		conditionExpr.setLabel(store.getLabel(ctx.forExpression(0)));

		List conditionChildren = visitChildren(ctx.forExpression(0));
		for (Object child : conditionChildren) {
			if (child instanceof SubExpression) {
				conditionExpr.getChildren().add((SubExpression) child);
			}
		}

		result.add(conditionExpr);

		ExpressionStatement incrementSt = StatementsFactory.eINSTANCE.createExpressionStatement();

		double label = store.getLabel(ctx.forExpression(1));
		incrementSt.setLabel(label);

		Expression incrementExpr = ExpressionsFactory.eINSTANCE.createExpression();
		incrementExpr.setLabel(label + 0.1);

		List incrementChildren = visitChildren(ctx.forExpression(1));
		for (Object child : incrementChildren) {
			if (child instanceof SubExpression) {
				incrementExpr.getChildren().add((SubExpression) child);
			}
		}
		incrementSt.setExpression(incrementExpr);

		result.add(incrementSt);

		return result;
	}

	/**
	 * expression : assignmentExpression | expression ',' assignmentExpression ;
	 */
	public List<ExpressionStatement> visitExpressionStatement(CParser.ExpressionStatementContext ctx) {
		List children = visitChildren(ctx);

		if (children.size() == 1 && children.get(0) instanceof Statement) {
			return children;
		}
		
		List<ExpressionStatement> result = new ArrayList<>();

		ExpressionStatement statement = StatementsFactory.eINSTANCE.createExpressionStatement();
		double label = store.getLabel(ctx);
		statement.setLabel(label);

		Expression expr = ExpressionsFactory.eINSTANCE.createExpression();
		expr.setLabel(label + 0.1);

		for (Object child : children) {
			if (child instanceof SubExpression) {
				expr.getChildren().add((SubExpression) child);
			} else if (child instanceof DataItem) {
				// do nothing
			} else if (child instanceof ExpressionStatement) {
				result.add((ExpressionStatement) child);
			} else {
				throw new Error("Unrecognized child " + child + " for " + ctx.getText());

			}
		}

		statement.setExpression(expr);
		
		result.add(0, statement);

		return result;
	}

	// assignmentExpression defines left, usages of right
	/**
	 * assignmentExpression : conditionalExpression | unaryExpression
	 * assignmentOperator assignmentExpression | DigitSequence // for ;
	 */
	public List visitAssignmentExpression(CParser.AssignmentExpressionContext ctx) {
		List result = new ArrayList<>();
		List statements = new ArrayList<>();

		if (ctx.unaryExpression() != null) {
			// definition
			List lhs = visitUnaryExpression(ctx.unaryExpression());

			List<SubExpression> leftSubExpressions = new ArrayList<>();

			for (Object child : lhs) {
				if (child instanceof DataItem) {
					DataItem di = (DataItem) child;

					SubExpression definition = ExpressionsFactory.eINSTANCE.createDefines();
					definition.setTarget(di);
					leftSubExpressions.add(definition);
				} else if (child instanceof SubExpression) {
					leftSubExpressions.add((SubExpression) child);
				} else if (child instanceof Statement) {
					statements.add((Statement) child);
				} else {
					throw new Error("Unrecognized expression " + child);
				}
			}

			result.addAll(leftSubExpressions);

			// usages
			List<SubExpression> rightSubExpression = visitAssignmentExpression(ctx.assignmentExpression());
			


			if (rightSubExpression.size() == 1 && rightSubExpression.get(0) instanceof ExpressionStatement) {
				ExpressionStatement st = (ExpressionStatement) rightSubExpression.get(0);

				st.getExpression().getChildren().addAll(leftSubExpressions);

				return Arrays.asList(st);
			}

			result.addAll(rightSubExpression);

			result.addAll(statements);

			return result;
		} else if (ctx.conditionalExpression() != null) {
			Expression expr = ExpressionsFactory.eINSTANCE.createExpression();
			expr.setLabel(store.getLabel(ctx.conditionalExpression()));

			List<SubExpression> usages = visitConditionalExpression(ctx.conditionalExpression());
			

			result.addAll(usages);

			return result;
		}

		return new ArrayList<>();
	}

	/**
	 * unaryExpression : postfixExpression | '++' unaryExpression | '--'
	 * unaryExpression | unaryOperator castExpression | 'sizeof' unaryExpression |
	 * 'sizeof' '(' typeName ')' | '_Alignof' '(' typeName ')' | '&&' Identifier //
	 * GCC extension address of label ;
	 */
	public List visitUnaryExpression(CParser.UnaryExpressionContext ctx) {

		if (ctx.unaryOperator() != null) {
			if (ctx.unaryOperator().getText().equals("&")) {
				List result = new ArrayList();

				List castExpressions = visitChildren(ctx.castExpression());

				for (Object obj : castExpressions) {
					if (obj instanceof DataItem) {
						DataItem di = (DataItem) obj;

						Uses castUses = ExpressionsFactory.eINSTANCE.createUses();
						castUses.setTarget(di);
						result.add(castUses);

						Defines castDefines = ExpressionsFactory.eINSTANCE.createDefines();
						castDefines.setTarget(di);
						result.add(castDefines);
					}
				}

				return result;
			}
		}

		return visitChildren(ctx);
	}

	/**
	 * conditionalExpression : logicalOrExpression ('?' expression ':'
	 * conditionalExpression)? ;
	 */
	public List<SubExpression> visitConditionalExpression(CParser.ConditionalExpressionContext ctx) {
		List result = new ArrayList<>();

		List children = visitChildren(ctx);

		if (children == null) {
			return result;
		}

		for (Object child : children) {
			if (child instanceof DataItem) {
				SubExpression usage = ExpressionsFactory.eINSTANCE.createUses();

				usage.setTarget((DataItem) child);

				result.add(usage);
			} else if (child instanceof SubExpression) {
				result.add(child);
			} else if (child instanceof Statement) {
				result.add(child);
			}
		}

		return result;
	}

	/**
	 * primaryExpression : Identifier | Constant | StringLiteral+ | '(' expression
	 * ')' | genericSelection | '__extension__'? '(' compoundStatement ')' // Blocks
	 * (GCC extension) | '__builtin_va_arg' '(' unaryExpression ',' typeName ')' |
	 * '__builtin_offsetof' '(' typeName ',' unaryExpression ')'
	 */
	// primaryExpression
	public List visitPrimaryExpression(CParser.PrimaryExpressionContext ctx) {
		if (ctx.Identifier() != null) {
			if (store.isCReservedWord(ctx.Identifier())) {
				return new ArrayList<>();
			}

			DataItem dataItem = DataitemsFactory.eINSTANCE.createDataItem();
			dataItem.setName(store.getName(store.getContext(), ctx.Identifier()));

			return Arrays.asList(dataItem);
		}

		return visitChildren(ctx);
	}

	/**
	 * postfixExpression : primaryExpression | postfixExpression '[' expression ']'
	 * | postfixExpression '(' argumentExpressionList? ')' | postfixExpression '.'
	 * Identifier | postfixExpression '->' Identifier | postfixExpression '++' |
	 * postfixExpression '--' | '(' typeName ')' '{' initializerList '}' | '('
	 * typeName ')' '{' initializerList ',' '}' | '__extension__' '(' typeName ')'
	 * '{' initializerList '}' | '__extension__' '(' typeName ')' '{'
	 * initializerList ',' '}' ;
	 */

	public List<? extends Object> visitPostfixExpression(CParser.PostfixExpressionContext ctx) {
		if (ctx.Dot() != null) {
			// for structure.member, only map structure
			return visitChildren(ctx.postfixExpression());
		} else if (ctx.Identifier() != null) {
			List result = new ArrayList();

			List children = visitChildren(ctx.postfixExpression());
			result.addAll(children);

			if (store.isCReservedWord(ctx.Identifier())) {
				return result;
			}

			DataItem dataItem = DataitemsFactory.eINSTANCE.createDataItem();
			dataItem.setName(store.getName(store.getContext(), ctx.Identifier()));

			result.add(dataItem);

			return result;
		} else if (ctx.postfixExpression() != null && ctx.LeftParen() != null && ctx.RightParen() != null) { // procedure
																												// call

			return visitFunctionCall(ctx);
		} else if (ctx.postfixExpression() != null && ctx.PlusPlus() != null) {
			List result = new ArrayList<>();
			List children = visitChildren(ctx.postfixExpression());

			for (Object child : children) {
				if (child instanceof DataItem) {
					Uses uses = ExpressionsFactory.eINSTANCE.createUses();
					uses.setTarget((DataItem) child);
					result.add(uses);

					// post incrementation
					ExpressionStatement exprStatement = StatementsFactory.eINSTANCE.createExpressionStatement();
					
					double label = store.getLabel(ctx);
					exprStatement.setLabel(label);

					Expression expr = ExpressionsFactory.eINSTANCE.createExpression();
					expr.setLabel(label + 0.1);

					Defines defines = ExpressionsFactory.eINSTANCE.createDefines();
					defines.setTarget((DataItem) child);
					expr.getChildren().add(defines);

					exprStatement.setExpression(expr);

					result.add(exprStatement);
				} else {
					throw new Error("child is not a data item: " + ctx.getText());
				}
			}

			return result;
		}

		return visitChildren(ctx);
	}

	private List<Statement> visitFunctionCall(CParser.PostfixExpressionContext ctx) throws Error {
		Procedure target = store.getProcedure(ctx.postfixExpression().getText());

		Statement statement;

		if (target != null) {
			statement = createProcedureCallForFunctionCall(target, ctx);
		} else {
			statement = createExpressionStatementForFunctionCall(ctx);
		}

		return Arrays.asList(statement);
	}

	private Statement createExpressionStatementForFunctionCall(CParser.PostfixExpressionContext ctx) {
		ExpressionStatement exprStatement = StatementsFactory.eINSTANCE.createExpressionStatement();

		double label = store.getLabel(ctx);
		exprStatement.setLabel(label);

		Expression expr = ExpressionsFactory.eINSTANCE.createExpression();
		expr.setLabel(label + 0.1);

		List children = visitArgumentExpressionList(ctx.argumentExpressionList());
		
		for (int i = 0; i < children.size(); i++) {
			Object child = children.get(i);

			SubExpression subExpression = null;

			if (child instanceof ArgumentReference) {
				ReferenceableElement target = ((ArgumentReference) child).getTarget();

				if (target == null) {
					throw new Error("argument does not have a target: " + ctx.argumentExpressionList().getText());
				}

				subExpression = ExpressionsFactory.eINSTANCE.createUses();
				subExpression.setTarget(target);

			} else if (child instanceof EmptyArgument) {

			} else if (child instanceof DataItem) {
				subExpression = ExpressionsFactory.eINSTANCE.createUses();
				subExpression.setTarget(((DataItem) child));

			} else if (child instanceof Defines) {
				subExpression = (Defines) child;
			} else {
				throw new Error("child not right " + child);
			}

			if (subExpression != null) {
				expr.getChildren().add(subExpression);
			}
		}

		exprStatement.setExpression(expr);
		return exprStatement;
	}

	private Statement createProcedureCallForFunctionCall(Procedure target, CParser.PostfixExpressionContext ctx)
			throws Error {
		// create procedure call
		ProcedureCall call = StatementsFactory.eINSTANCE.createProcedureCall();

		call.setTarget(target);
		call.setLabel(store.getLabel(ctx));

		// arguments
		List children = visitArgumentExpressionList(ctx.argumentExpressionList());
		System.out.println("no of children: " + children.size());

		for (Object child : children) {
			if (child instanceof Argument) {
				call.getArguments().add((Argument) child);
			} else if (child instanceof DataItem) {
				// TODO
				// result.add(child);
			} else { // XXX it could also return Defines which needs to be added next to procedure
						// call itself
				throw new Error("child not right " + child);
			}
		}

		return call;
	}

	// argumentExpressionList
	// : assignmentExpression
	// | argumentExpressionList ',' assignmentExpression
	// ;
	public List visitArgumentExpressionList(CParser.ArgumentExpressionListContext ctx) {
		List result = new ArrayList<>();

		if (ctx.Comma() != null) {
			List children = visitArgumentExpressionList(ctx.argumentExpressionList());

			result.addAll(children);
		}

		List argumentExpression = visitChildren(ctx.assignmentExpression());

		if (argumentExpression == null || argumentExpression.size() == 0) {
			result.add(ReferencesFactory.eINSTANCE.createEmptyArgument());
		} else {
			// XXX this implementation cannot handle calls such as `func(func(),a+b, ...)`
			for (Object argument : argumentExpression) {
				if (argument instanceof DataItem) {
					ArgumentReference argumentReference = ReferencesFactory.eINSTANCE.createArgumentReference();

					argumentReference.setTarget((DataItem) argument);
					result.add(argument);
				} else if (argument instanceof Uses) {
					DataItem di = (DataItem) ((Uses) argument).getTarget();

					result.add(di);

					ArgumentReference argumentReference = ReferencesFactory.eINSTANCE.createArgumentReference();

					argumentReference.setTarget(di);
					result.add(argumentReference);

				} else if (argument instanceof Defines) {

					result.add(argument);
				} else {
					throw new Error("argument not a data item");
				}
			}
		}

		return result;

	}

	/**
	 * labeledStatement : Identifier ':' statement | 'case' constantExpression ':'
	 * statement | 'default' ':' statement ;
	 */
	public List visitLabeledStatement(CParser.LabeledStatementContext ctx) {
		if (ctx.Identifier() != null) {
			List children = visitChildren(ctx.statement());

			for (Object child : children) {
				if (child instanceof Statement) {
					store.registerLabeledStatement(ctx.Identifier().toString(), (Statement) child);
				} else {
					throw new Error("child not a statement: " + ctx.statement().getText());
				}
			}
			return children;
		}

		return visitChildren(ctx);
	}
}
