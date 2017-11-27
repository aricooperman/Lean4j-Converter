package com.tbmresearch.qc4j.converter;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class QuantConnectConverter extends CSharpParserBaseListener {

	private static final String QUANT_CONNECT = "QuantConnect";
	
	private final List<ClassData> parsedClasses = new ArrayList<>();
	private final Set<String> imports = new TreeSet<>();

	private final ClassData currentClass = null;
	private String namespace = null;
	

	private void writeClasses() {
		for( final ClassData classData : parsedClasses ) {
			final PrintStream out = System.out;
			
		}
	}
	

	@Override
	public void enterCompilation_unit(final CSharpParser.Compilation_unitContext ctx) {
		System.out.println("Starting parse");
	}

	@Override
	public void exitCompilation_unit(final CSharpParser.Compilation_unitContext ctx) {
		writeClasses();
		System.out.println("Finished parse");
	}

//	@Override
//	public void exitNamespace_or_type_name(final CSharpParser.Namespace_or_type_nameContext ctx) {
//		 System.out.println( "exitNamespace_or_type_name: " + ctx.getText() );
//	}

	@Override
	public void exitType(final CSharpParser.TypeContext ctx) {
		 System.out.println( "exitType: " + ctx.getText() );
	}

	@Override
	public void exitBase_type(final CSharpParser.Base_typeContext ctx) {
		 System.out.println( "exitBase_type: " + ctx.getText() );
	}

	@Override
	public void exitSimple_type(final CSharpParser.Simple_typeContext ctx) {
		 System.out.println( "exitSimple_type: " + ctx.getText() );
	}

	@Override
	public void exitNumeric_type(final CSharpParser.Numeric_typeContext ctx) {

	}

	@Override
	public void exitIntegral_type(final CSharpParser.Integral_typeContext ctx) {

	}

	@Override
	public void exitFloating_point_type(final CSharpParser.Floating_point_typeContext ctx) {

	}

	@Override
	public void exitClass_type(final CSharpParser.Class_typeContext ctx) {
		 System.out.println( "exitClass_type: " + ctx.getText() );
	}

	@Override
	public void exitType_argument_list(final CSharpParser.Type_argument_listContext ctx) {

	}

	@Override
	public void exitArgument_list(final CSharpParser.Argument_listContext ctx) {

	}

	@Override
	public void exitArgument(final CSharpParser.ArgumentContext ctx) {

	}

	@Override
	public void exitExpression(final CSharpParser.ExpressionContext ctx) {

	}

	@Override
	public void exitNon_assignment_expression(final CSharpParser.Non_assignment_expressionContext ctx) {

	}

	@Override
	public void exitAssignment(final CSharpParser.AssignmentContext ctx) {

	}

	@Override
	public void exitAssignment_operator(final CSharpParser.Assignment_operatorContext ctx) {

	}

	@Override
	public void exitConditional_expression(final CSharpParser.Conditional_expressionContext ctx) {

	}

	@Override
	public void exitNull_coalescing_expression(final CSharpParser.Null_coalescing_expressionContext ctx) {

	}

	@Override
	public void exitConditional_or_expression(final CSharpParser.Conditional_or_expressionContext ctx) {

	}

	@Override
	public void exitConditional_and_expression(final CSharpParser.Conditional_and_expressionContext ctx) {

	}

	@Override
	public void exitInclusive_or_expression(final CSharpParser.Inclusive_or_expressionContext ctx) {

	}

	@Override
	public void exitExclusive_or_expression(final CSharpParser.Exclusive_or_expressionContext ctx) {

	}

	@Override
	public void exitAnd_expression(final CSharpParser.And_expressionContext ctx) {

	}

	@Override
	public void exitEquality_expression(final CSharpParser.Equality_expressionContext ctx) {

	}

	@Override
	public void exitRelational_expression(final CSharpParser.Relational_expressionContext ctx) {

	}

	@Override
	public void exitShift_expression(final CSharpParser.Shift_expressionContext ctx) {

	}

	@Override
	public void exitAdditive_expression(final CSharpParser.Additive_expressionContext ctx) {

	}

	@Override
	public void exitMultiplicative_expression(final CSharpParser.Multiplicative_expressionContext ctx) {

	}

	@Override
	public void exitUnary_expression(final CSharpParser.Unary_expressionContext ctx) {

	}

	@Override
	public void exitPrimary_expression(final CSharpParser.Primary_expressionContext ctx) {

	}

	@Override
	public void exitLiteralExpression(final CSharpParser.LiteralExpressionContext ctx) {

	}

	@Override
	public void exitSimpleNameExpression(final CSharpParser.SimpleNameExpressionContext ctx) {

	}

	@Override
	public void exitParenthesisExpressions(final CSharpParser.ParenthesisExpressionsContext ctx) {

	}

	@Override
	public void exitMemberAccessExpression(final CSharpParser.MemberAccessExpressionContext ctx) {

	}

	@Override
	public void exitLiteralAccessExpression(final CSharpParser.LiteralAccessExpressionContext ctx) {

	}

	@Override
	public void exitThisReferenceExpression(final CSharpParser.ThisReferenceExpressionContext ctx) {

	}

	@Override
	public void exitBaseAccessExpression(final CSharpParser.BaseAccessExpressionContext ctx) {

	}

	@Override
	public void exitObjectCreationExpression(final CSharpParser.ObjectCreationExpressionContext ctx) {

	}

	@Override
	public void exitTypeofExpression(final CSharpParser.TypeofExpressionContext ctx) {

	}

	@Override
	public void exitCheckedExpression(final CSharpParser.CheckedExpressionContext ctx) {

	}

	@Override
	public void exitUncheckedExpression(final CSharpParser.UncheckedExpressionContext ctx) {

	}

	@Override
	public void exitDefaultValueExpression(final CSharpParser.DefaultValueExpressionContext ctx) {

	}

	@Override
	public void exitAnonymousMethodExpression(final CSharpParser.AnonymousMethodExpressionContext ctx) {

	}

	@Override
	public void exitSizeofExpression(final CSharpParser.SizeofExpressionContext ctx) {

	}

	@Override
	public void exitNameofExpression(final CSharpParser.NameofExpressionContext ctx) {

	}

	@Override
	public void exitMember_access(final CSharpParser.Member_accessContext ctx) {

	}

	@Override
	public void exitBracket_expression(final CSharpParser.Bracket_expressionContext ctx) {

	}

	@Override
	public void exitIndexer_argument(final CSharpParser.Indexer_argumentContext ctx) {

	}

	@Override
	public void exitPredefined_type(final CSharpParser.Predefined_typeContext ctx) {

	}

	@Override
	public void exitExpression_list(final CSharpParser.Expression_listContext ctx) {

	}

	@Override
	public void exitObject_or_collection_initializer(final CSharpParser.Object_or_collection_initializerContext ctx) {

	}

	@Override
	public void exitObject_initializer(final CSharpParser.Object_initializerContext ctx) {

	}

	@Override
	public void exitMember_initializer_list(final CSharpParser.Member_initializer_listContext ctx) {

	}

	@Override
	public void exitMember_initializer(final CSharpParser.Member_initializerContext ctx) {

	}

	@Override
	public void exitInitializer_value(final CSharpParser.Initializer_valueContext ctx) {

	}

	@Override
	public void exitCollection_initializer(final CSharpParser.Collection_initializerContext ctx) {

	}

	@Override
	public void exitElement_initializer(final CSharpParser.Element_initializerContext ctx) {

	}

	@Override
	public void exitAnonymous_object_initializer(final CSharpParser.Anonymous_object_initializerContext ctx) {

	}

	@Override
	public void exitMember_declarator_list(final CSharpParser.Member_declarator_listContext ctx) {

	}

	@Override
	public void exitMember_declarator(final CSharpParser.Member_declaratorContext ctx) {

	}

	@Override
	public void exitUnbound_type_name(final CSharpParser.Unbound_type_nameContext ctx) {

	}

	@Override
	public void exitGeneric_dimension_specifier(final CSharpParser.Generic_dimension_specifierContext ctx) {

	}

	@Override
	public void exitIsType(final CSharpParser.IsTypeContext ctx) {

	}

	@Override
	public void exitLambda_expression(final CSharpParser.Lambda_expressionContext ctx) {

	}

	@Override
	public void exitAnonymous_function_signature(final CSharpParser.Anonymous_function_signatureContext ctx) {

	}

	@Override
	public void exitExplicit_anonymous_function_parameter_list(
			final CSharpParser.Explicit_anonymous_function_parameter_listContext ctx) {

	}

	@Override
	public void exitExplicit_anonymous_function_parameter(
			final CSharpParser.Explicit_anonymous_function_parameterContext ctx) {

	}

	@Override
	public void exitImplicit_anonymous_function_parameter_list(
			final CSharpParser.Implicit_anonymous_function_parameter_listContext ctx) {

	}

	@Override
	public void exitAnonymous_function_body(final CSharpParser.Anonymous_function_bodyContext ctx) {

	}

	@Override
	public void exitQuery_expression(final CSharpParser.Query_expressionContext ctx) {

	}

	@Override
	public void exitFrom_clause(final CSharpParser.From_clauseContext ctx) {

	}

	@Override
	public void exitQuery_body(final CSharpParser.Query_bodyContext ctx) {

	}

	@Override
	public void exitQuery_body_clause(final CSharpParser.Query_body_clauseContext ctx) {

	}

	@Override
	public void exitLet_clause(final CSharpParser.Let_clauseContext ctx) {

	}

	@Override
	public void exitWhere_clause(final CSharpParser.Where_clauseContext ctx) {

	}

	@Override
	public void exitCombined_join_clause(final CSharpParser.Combined_join_clauseContext ctx) {

	}

	@Override
	public void exitOrderby_clause(final CSharpParser.Orderby_clauseContext ctx) {

	}

	@Override
	public void exitOrdering(final CSharpParser.OrderingContext ctx) {

	}

	@Override
	public void exitSelect_or_group_clause(final CSharpParser.Select_or_group_clauseContext ctx) {

	}

	@Override
	public void exitQuery_continuation(final CSharpParser.Query_continuationContext ctx) {

	}

	@Override
	public void exitLabeledStatement(final CSharpParser.LabeledStatementContext ctx) {

	}

	@Override
	public void exitDeclarationStatement(final CSharpParser.DeclarationStatementContext ctx) {

	}

	@Override
	public void exitEmbeddedStatement(final CSharpParser.EmbeddedStatementContext ctx) {

	}

	@Override
	public void exitLabeled_Statement(final CSharpParser.Labeled_StatementContext ctx) {

	}

	@Override
	public void exitEmbedded_statement(final CSharpParser.Embedded_statementContext ctx) {

	}

	@Override
	public void exitEmptyStatement(final CSharpParser.EmptyStatementContext ctx) {

	}

	@Override
	public void exitExpressionStatement(final CSharpParser.ExpressionStatementContext ctx) {

	}

	@Override
	public void exitIfStatement(final CSharpParser.IfStatementContext ctx) {

	}

	@Override
	public void exitSwitchStatement(final CSharpParser.SwitchStatementContext ctx) {

	}

	@Override
	public void exitWhileStatement(final CSharpParser.WhileStatementContext ctx) {

	}

	@Override
	public void exitDoStatement(final CSharpParser.DoStatementContext ctx) {

	}

	@Override
	public void exitForStatement(final CSharpParser.ForStatementContext ctx) {

	}

	@Override
	public void exitForeachStatement(final CSharpParser.ForeachStatementContext ctx) {

	}

	@Override
	public void exitBreakStatement(final CSharpParser.BreakStatementContext ctx) {

	}

	@Override
	public void exitContinueStatement(final CSharpParser.ContinueStatementContext ctx) {

	}

	@Override
	public void exitGotoStatement(final CSharpParser.GotoStatementContext ctx) {

	}

	@Override
	public void exitReturnStatement(final CSharpParser.ReturnStatementContext ctx) {

	}

	@Override
	public void exitThrowStatement(final CSharpParser.ThrowStatementContext ctx) {

	}

	@Override
	public void exitTryStatement(final CSharpParser.TryStatementContext ctx) {

	}

	@Override
	public void exitCheckedStatement(final CSharpParser.CheckedStatementContext ctx) {

	}

	@Override
	public void exitUncheckedStatement(final CSharpParser.UncheckedStatementContext ctx) {

	}

	@Override
	public void exitLockStatement(final CSharpParser.LockStatementContext ctx) {

	}

	@Override
	public void exitUsingStatement(final CSharpParser.UsingStatementContext ctx) {

	}

	@Override
	public void exitYieldStatement(final CSharpParser.YieldStatementContext ctx) {

	}

	@Override
	public void exitUnsafeStatement(final CSharpParser.UnsafeStatementContext ctx) {

	}

	@Override
	public void exitFixedStatement(final CSharpParser.FixedStatementContext ctx) {

	}

	@Override
	public void exitBlock(final CSharpParser.BlockContext ctx) {

	}

	@Override
	public void exitLocal_variable_declaration(final CSharpParser.Local_variable_declarationContext ctx) {

	}

	@Override
	public void exitLocal_variable_type(final CSharpParser.Local_variable_typeContext ctx) {

	}

	@Override
	public void exitLocal_variable_declarator(final CSharpParser.Local_variable_declaratorContext ctx) {

	}

	@Override
	public void exitLocal_variable_initializer(final CSharpParser.Local_variable_initializerContext ctx) {

	}

	@Override
	public void exitLocal_constant_declaration(final CSharpParser.Local_constant_declarationContext ctx) {

	}

	@Override
	public void exitIf_body(final CSharpParser.If_bodyContext ctx) {

	}

	@Override
	public void exitSwitch_section(final CSharpParser.Switch_sectionContext ctx) {

	}

	@Override
	public void exitSwitch_label(final CSharpParser.Switch_labelContext ctx) {

	}

	@Override
	public void exitStatement_list(final CSharpParser.Statement_listContext ctx) {

	}

	@Override
	public void exitFor_initializer(final CSharpParser.For_initializerContext ctx) {

	}

	@Override
	public void exitFor_iterator(final CSharpParser.For_iteratorContext ctx) {

	}

	@Override
	public void exitCatch_clauses(final CSharpParser.Catch_clausesContext ctx) {

	}

	@Override
	public void exitSpecific_catch_clause(final CSharpParser.Specific_catch_clauseContext ctx) {

	}

	@Override
	public void exitGeneral_catch_clause(final CSharpParser.General_catch_clauseContext ctx) {

	}

	@Override
	public void exitException_filter(final CSharpParser.Exception_filterContext ctx) {

	}

	@Override
	public void exitFinally_clause(final CSharpParser.Finally_clauseContext ctx) {

	}

	@Override
	public void exitResource_acquisition(final CSharpParser.Resource_acquisitionContext ctx) {

	}

//	@Override
//	public void exitNamespace_declaration(final CSharpParser.Namespace_declarationContext ctx) {
//		System.out.println("exitNamespace_declaration: " + ctx.getText());
//	}

	@Override
	public void exitQualified_identifier(final CSharpParser.Qualified_identifierContext ctx) {
		final String pkg = ctx.getText();
		if( namespace != null ) {
		    throw new UnsupportedOperationException( "Multiple namespaces found: " + namespace + " & " + pkg );
		}
		else if( pkg.startsWith( QUANT_CONNECT ) )
			namespace = pkg;
		else
			throw new UnsupportedOperationException( "Unhandled namespace: " + pkg );

		System.out.println();
	}

	@Override
	public void exitNamespace_body(final CSharpParser.Namespace_bodyContext ctx) {
	    System.out.println("exitNamespace_body: " + ctx.getText());
	}

	@Override
	public void exitExtern_alias_directives(final CSharpParser.Extern_alias_directivesContext ctx) {

	}

	@Override
	public void exitExtern_alias_directive(final CSharpParser.Extern_alias_directiveContext ctx) {

	}

//	@Override
//	public void exitUsing_directives(final CSharpParser.Using_directivesContext ctx) {
//		System.out.println("exitUsing_directives: " + ctx.getText());
//	}

	@Override
	public void exitUsingAliasDirective(final CSharpParser.UsingAliasDirectiveContext ctx) {
	    System.out.println("exitUsingAliasDirective: " + ctx.getText());
	}

	@Override
	public void exitUsingNamespaceDirective(final CSharpParser.UsingNamespaceDirectiveContext ctx) {
//		System.out.println("exitUsingNamespaceDirective: " + ctx.getText());
		 final String packageImport = ctx.namespace_or_type_name().getText();
		 if( !"System".equals(packageImport) ) {
			 if( packageImport.startsWith(QUANT_CONNECT) )
				 imports.add( packageImport.toLowerCase() );
		 else
			 throw new UnsupportedOperationException("Not supporting using directive: " + packageImport);
		 }
	}

	@Override
	public void exitUsingStaticDirective(final CSharpParser.UsingStaticDirectiveContext ctx) {

	}

	@Override
	public void exitNamespace_member_declarations(final CSharpParser.Namespace_member_declarationsContext ctx) {

	}

	@Override
	public void exitNamespace_member_declaration(final CSharpParser.Namespace_member_declarationContext ctx) {

	}

	@Override
	public void exitType_declaration(final CSharpParser.Type_declarationContext ctx) {
		System.out.println("exitType_declaration: " + ctx.getText());

		// Class_definitionContext classDef = ctx.class_definition();
		// if(classDef != null)
		// System.out.println( "Class_definitionContext: " + classDef.getText()
		// );
		//
		// Struct_definitionContext structDef = ctx.struct_definition();
		// if( structDef != null )
		// System.out.println( "Struct_definitionContext: " +
		// structDef.getText() );
		//
		// Interface_definitionContext intDef = ctx.interface_definition();
		// if( intDef != null )
		// System.out.println( "Interface_definitionContext: " + intDef );
		// Enum_definitionContext enumDef = ctx.enum_definition();
		// System.out.println( "Enum_definitionContext: " + enumDef );
		// Delegate_definitionContext delDef = ctx.delegate_definition();
		// System.out.println( "Delegate_definitionContext: " + delDef );
		// AttributesContext attrCtx = ctx.attributes();
		// System.out.println( "AttributesContext: " + attrCtx );
		// All_member_modifiersContext allMemberCtx =
		// ctx.all_member_modifiers();
		// System.out.println( "All_member_modifiersContext: " + allMemberCtx );
	}

	@Override
	public void exitQualified_alias_member(final CSharpParser.Qualified_alias_memberContext ctx) {

	}

	@Override
	public void exitType_parameter_list(final CSharpParser.Type_parameter_listContext ctx) {

	}

	@Override
	public void exitType_parameter(final CSharpParser.Type_parameterContext ctx) {

	}

	@Override
	public void exitClass_base(final CSharpParser.Class_baseContext ctx) {
		System.out.println("exitClass_base: " + ctx.getText());
	}

	@Override
	public void exitInterface_type_list(final CSharpParser.Interface_type_listContext ctx) {

	}

	@Override
	public void exitType_parameter_constraints_clauses(final CSharpParser.Type_parameter_constraints_clausesContext ctx) {
	}

	@Override
	public void exitType_parameter_constraints_clause(final CSharpParser.Type_parameter_constraints_clauseContext ctx) {

	}

	@Override
	public void exitType_parameter_constraints(final CSharpParser.Type_parameter_constraintsContext ctx) {

	}

	@Override
	public void exitPrimary_constraint(final CSharpParser.Primary_constraintContext ctx) {

	}

	@Override
	public void exitSecondary_constraints(final CSharpParser.Secondary_constraintsContext ctx) {

	}

	@Override
	public void exitConstructor_constraint(final CSharpParser.Constructor_constraintContext ctx) {

	}

	@Override
	public void exitClass_body(final CSharpParser.Class_bodyContext ctx) {
		System.out.println("enterClass_body: " + ctx.getText());
	}

	@Override
	public void exitClass_member_declarations(final CSharpParser.Class_member_declarationsContext ctx) {

	}

	@Override
	public void exitClass_member_declaration(final CSharpParser.Class_member_declarationContext ctx) {
		System.out.println("exitClass_member_declaration: " + ctx.getText());
	}

	@Override
	public void exitAll_member_modifiers(final CSharpParser.All_member_modifiersContext ctx) {

	}

	@Override
	public void exitAll_member_modifier(final CSharpParser.All_member_modifierContext ctx) {

	}

	@Override
	public void exitCommon_member_declaration(final CSharpParser.Common_member_declarationContext ctx) {

	}

	@Override
	public void exitTyped_member_declaration(final CSharpParser.Typed_member_declarationContext ctx) {

	}

	@Override
	public void exitConstant_declarators(final CSharpParser.Constant_declaratorsContext ctx) {

	}

	@Override
	public void exitConstant_declarator(final CSharpParser.Constant_declaratorContext ctx) {

	}

	@Override
	public void exitVariable_declarators(final CSharpParser.Variable_declaratorsContext ctx) {

	}

	@Override
	public void exitVariable_declarator(final CSharpParser.Variable_declaratorContext ctx) {

	}

	@Override
	public void exitVariable_initializer(final CSharpParser.Variable_initializerContext ctx) {

	}

	@Override
	public void exitReturn_type(final CSharpParser.Return_typeContext ctx) {

	}

	@Override
	public void exitMember_name(final CSharpParser.Member_nameContext ctx) {

	}

	@Override
	public void exitMethod_body(final CSharpParser.Method_bodyContext ctx) {

	}

	@Override
	public void exitFormal_parameter_list(final CSharpParser.Formal_parameter_listContext ctx) {

	}

	@Override
	public void exitFixed_parameters(final CSharpParser.Fixed_parametersContext ctx) {

	}

	@Override
	public void exitFixed_parameter(final CSharpParser.Fixed_parameterContext ctx) {

	}

	@Override
	public void exitParameter_modifier(final CSharpParser.Parameter_modifierContext ctx) {

	}

	@Override
	public void exitParameter_array(final CSharpParser.Parameter_arrayContext ctx) {

	}

	@Override
	public void exitAccessor_declarations(final CSharpParser.Accessor_declarationsContext ctx) {

	}

	@Override
	public void exitGet_accessor_declaration(final CSharpParser.Get_accessor_declarationContext ctx) {

	}

	@Override
	public void exitSet_accessor_declaration(final CSharpParser.Set_accessor_declarationContext ctx) {

	}

	@Override
	public void exitAccessor_modifier(final CSharpParser.Accessor_modifierContext ctx) {

	}

	@Override
	public void exitAccessor_body(final CSharpParser.Accessor_bodyContext ctx) {

	}

	@Override
	public void exitEvent_accessor_declarations(final CSharpParser.Event_accessor_declarationsContext ctx) {

	}

	@Override
	public void exitAdd_accessor_declaration(final CSharpParser.Add_accessor_declarationContext ctx) {

	}

	@Override
	public void exitRemove_accessor_declaration(final CSharpParser.Remove_accessor_declarationContext ctx) {

	}

	@Override
	public void exitOverloadable_operator(final CSharpParser.Overloadable_operatorContext ctx) {

	}

	@Override
	public void exitConversion_operator_declarator(final CSharpParser.Conversion_operator_declaratorContext ctx) {

	}

	@Override
	public void exitConstructor_initializer(final CSharpParser.Constructor_initializerContext ctx) {

	}

	@Override
	public void exitBody(final CSharpParser.BodyContext ctx) {

	}

	@Override
	public void exitStruct_interfaces(final CSharpParser.Struct_interfacesContext ctx) {

	}

	@Override
	public void exitStruct_body(final CSharpParser.Struct_bodyContext ctx) {

	}

	@Override
	public void exitStruct_member_declaration(final CSharpParser.Struct_member_declarationContext ctx) {

	}

	@Override
	public void exitArray_type(final CSharpParser.Array_typeContext ctx) {

	}

	@Override
	public void exitRank_specifier(final CSharpParser.Rank_specifierContext ctx) {

	}

	@Override
	public void exitArray_initializer(final CSharpParser.Array_initializerContext ctx) {

	}

	@Override
	public void exitVariant_type_parameter_list(final CSharpParser.Variant_type_parameter_listContext ctx) {

	}

	@Override
	public void exitVariant_type_parameter(final CSharpParser.Variant_type_parameterContext ctx) {

	}

	@Override
	public void exitVariance_annotation(final CSharpParser.Variance_annotationContext ctx) {

	}

	@Override
	public void exitInterface_base(final CSharpParser.Interface_baseContext ctx) {

	}

	@Override
	public void exitInterface_body(final CSharpParser.Interface_bodyContext ctx) {

	}

	@Override
	public void exitInterface_member_declaration(final CSharpParser.Interface_member_declarationContext ctx) {

	}

	@Override
	public void exitInterface_accessors(final CSharpParser.Interface_accessorsContext ctx) {

	}

	@Override
	public void exitEnum_base(final CSharpParser.Enum_baseContext ctx) {

	}

	@Override
	public void exitEnum_body(final CSharpParser.Enum_bodyContext ctx) {

	}

	@Override
	public void exitEnum_member_declaration(final CSharpParser.Enum_member_declarationContext ctx) {

	}

	@Override
	public void exitGlobal_attribute_section(final CSharpParser.Global_attribute_sectionContext ctx) {

	}

	@Override
	public void exitGlobal_attribute_target(final CSharpParser.Global_attribute_targetContext ctx) {

	}

	@Override
	public void exitAttributes(final CSharpParser.AttributesContext ctx) {

	}

	@Override
	public void exitAttribute_section(final CSharpParser.Attribute_sectionContext ctx) {

	}

	@Override
	public void exitAttribute_target(final CSharpParser.Attribute_targetContext ctx) {

	}

	@Override
	public void exitAttribute_list(final CSharpParser.Attribute_listContext ctx) {

	}

	@Override
	public void exitAttribute(final CSharpParser.AttributeContext ctx) {

	}

	@Override
	public void exitAttribute_argument(final CSharpParser.Attribute_argumentContext ctx) {

	}

	@Override
	public void exitPointer_type(final CSharpParser.Pointer_typeContext ctx) {

	}

	@Override
	public void exitFixed_pointer_declarators(final CSharpParser.Fixed_pointer_declaratorsContext ctx) {

	}

	@Override
	public void exitFixed_pointer_declarator(final CSharpParser.Fixed_pointer_declaratorContext ctx) {

	}

	@Override
	public void exitFixed_pointer_initializer(final CSharpParser.Fixed_pointer_initializerContext ctx) {

	}

	@Override
	public void exitFixed_size_buffer_declarator(final CSharpParser.Fixed_size_buffer_declaratorContext ctx) {

	}

	@Override
	public void exitLocal_variable_initializer_unsafe(final CSharpParser.Local_variable_initializer_unsafeContext ctx) {

	}

	@Override
	public void exitRight_arrow(final CSharpParser.Right_arrowContext ctx) {

	}

	@Override
	public void exitRight_shift(final CSharpParser.Right_shiftContext ctx) {

	}

	@Override
	public void exitRight_shift_assignment(final CSharpParser.Right_shift_assignmentContext ctx) {

	}

	@Override
	public void exitLiteral(final CSharpParser.LiteralContext ctx) {

	}

	@Override
	public void exitBoolean_literal(final CSharpParser.Boolean_literalContext ctx) {

	}

	@Override
	public void exitString_literal(final CSharpParser.String_literalContext ctx) {

	}

	@Override
	public void exitInterpolated_regular_string(final CSharpParser.Interpolated_regular_stringContext ctx) {

	}

	@Override
	public void exitInterpolated_verbatium_string(final CSharpParser.Interpolated_verbatium_stringContext ctx) {

	}

	@Override
	public void exitInterpolated_regular_string_part(final CSharpParser.Interpolated_regular_string_partContext ctx) {

	}

	@Override
	public void exitInterpolated_verbatium_string_part(final CSharpParser.Interpolated_verbatium_string_partContext ctx) {

	}

	@Override
	public void exitInterpolated_string_expression(final CSharpParser.Interpolated_string_expressionContext ctx) {

	}

	@Override
	public void exitKeyword(final CSharpParser.KeywordContext ctx) {

	}

	@Override
	public void exitClass_definition(final CSharpParser.Class_definitionContext ctx) {
		System.out.println("exitClass_definition: " + ctx.getText());
	}

	@Override
	public void exitStruct_definition(final CSharpParser.Struct_definitionContext ctx) {

	}

	@Override
	public void exitInterface_definition(final CSharpParser.Interface_definitionContext ctx) {

	}

	@Override
	public void exitEnum_definition(final CSharpParser.Enum_definitionContext ctx) {

	}

	@Override
	public void exitDelegate_definition(final CSharpParser.Delegate_definitionContext ctx) {

	}

	@Override
	public void exitEvent_declaration(final CSharpParser.Event_declarationContext ctx) {

	}

	@Override
	public void exitField_declaration(final CSharpParser.Field_declarationContext ctx) {

	}

	@Override
	public void exitProperty_declaration(final CSharpParser.Property_declarationContext ctx) {

	}

	@Override
	public void exitConstant_declaration(final CSharpParser.Constant_declarationContext ctx) {

	}

	@Override
	public void exitIndexer_declaration(final CSharpParser.Indexer_declarationContext ctx) {

	}

	@Override
	public void exitDestructor_definition(final CSharpParser.Destructor_definitionContext ctx) {

	}

	@Override
	public void exitConstructor_declaration(final CSharpParser.Constructor_declarationContext ctx) {

	}

	@Override
	public void exitMethod_declaration(final CSharpParser.Method_declarationContext ctx) {

	}

	@Override
	public void exitMethod_member_name(final CSharpParser.Method_member_nameContext ctx) {

	}

	@Override
	public void exitOperator_declaration(final CSharpParser.Operator_declarationContext ctx) {

	}

	@Override
	public void exitArg_declaration(final CSharpParser.Arg_declarationContext ctx) {

	}

	@Override
	public void exitMethod_invocation(final CSharpParser.Method_invocationContext ctx) {

	}

	@Override
	public void exitObject_creation_expression(final CSharpParser.Object_creation_expressionContext ctx) {

	}

	@Override
	public void exitIdentifier(final CSharpParser.IdentifierContext ctx) {

	}

	@Override
	public void visitTerminal(final TerminalNode node) {

	}

	@Override
	public void visitErrorNode(final ErrorNode node) {

	}

	@Override
	public void enterEveryRule(final ParserRuleContext ctx) {
		// System.out.println( "enterEveryRule: " +
		// CSharpParser.ruleNames[ctx.getRuleIndex()] + " -> " +
		// ctx.getText() );
	}

	@Override
	public void exitEveryRule(final ParserRuleContext ctx) {
		 System.out.println(
		 "exitEveryRule: " + CSharpParser.ruleNames[ctx.getRuleIndex()] + " | " + ctx.getClass().getSimpleName() + " | " + ctx.getText());
	}
	
	private static final class ClassData {
	    

	}
}