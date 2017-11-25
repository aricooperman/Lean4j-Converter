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
	private ClassData currentClass = null;
	
	public QuantConnectConverter() {
		
	}
	
	

	private void writeClasses() {
		for( ClassData classData : parsedClasses ) {
			PrintStream out = System.out;
			
		}
	}
	

	@Override
	public void enterCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
		System.out.println("Starting parse");
	}

	@Override
	public void exitCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
		writeClasses();		
		System.out.println("Finished parse");
	}

	@Override
	public void exitNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx) {
//		 System.out.println( "exitNamespace_or_type_name: " + ctx.getText() );
	}

	@Override
	public void exitType(CSharpParser.TypeContext ctx) {
		 System.out.println( "exitType: " + ctx.getText() );
	}

	@Override
	public void exitBase_type(CSharpParser.Base_typeContext ctx) {
		 System.out.println( "exitBase_type: " + ctx.getText() );
	}

	@Override
	public void exitSimple_type(CSharpParser.Simple_typeContext ctx) {
		 System.out.println( "exitSimple_type: " + ctx.getText() );
	}

	@Override
	public void exitNumeric_type(CSharpParser.Numeric_typeContext ctx) {

	}

	@Override
	public void exitIntegral_type(CSharpParser.Integral_typeContext ctx) {

	}

	@Override
	public void exitFloating_point_type(CSharpParser.Floating_point_typeContext ctx) {

	}

	@Override
	public void exitClass_type(CSharpParser.Class_typeContext ctx) {
		 System.out.println( "exitClass_type: " + ctx.getText() );
	}

	@Override
	public void exitType_argument_list(CSharpParser.Type_argument_listContext ctx) {

	}

	@Override
	public void exitArgument_list(CSharpParser.Argument_listContext ctx) {

	}

	@Override
	public void exitArgument(CSharpParser.ArgumentContext ctx) {

	}

	@Override
	public void exitExpression(CSharpParser.ExpressionContext ctx) {

	}

	@Override
	public void exitNon_assignment_expression(CSharpParser.Non_assignment_expressionContext ctx) {

	}

	@Override
	public void exitAssignment(CSharpParser.AssignmentContext ctx) {

	}

	@Override
	public void exitAssignment_operator(CSharpParser.Assignment_operatorContext ctx) {

	}

	@Override
	public void exitConditional_expression(CSharpParser.Conditional_expressionContext ctx) {

	}

	@Override
	public void exitNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx) {

	}

	@Override
	public void exitConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx) {

	}

	@Override
	public void exitConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx) {

	}

	@Override
	public void exitInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx) {

	}

	@Override
	public void exitExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx) {

	}

	@Override
	public void exitAnd_expression(CSharpParser.And_expressionContext ctx) {

	}

	@Override
	public void exitEquality_expression(CSharpParser.Equality_expressionContext ctx) {

	}

	@Override
	public void exitRelational_expression(CSharpParser.Relational_expressionContext ctx) {

	}

	@Override
	public void exitShift_expression(CSharpParser.Shift_expressionContext ctx) {

	}

	@Override
	public void exitAdditive_expression(CSharpParser.Additive_expressionContext ctx) {

	}

	@Override
	public void exitMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx) {

	}

	@Override
	public void exitUnary_expression(CSharpParser.Unary_expressionContext ctx) {

	}

	@Override
	public void exitPrimary_expression(CSharpParser.Primary_expressionContext ctx) {

	}

	@Override
	public void exitLiteralExpression(CSharpParser.LiteralExpressionContext ctx) {

	}

	@Override
	public void exitSimpleNameExpression(CSharpParser.SimpleNameExpressionContext ctx) {

	}

	@Override
	public void exitParenthesisExpressions(CSharpParser.ParenthesisExpressionsContext ctx) {

	}

	@Override
	public void exitMemberAccessExpression(CSharpParser.MemberAccessExpressionContext ctx) {

	}

	@Override
	public void exitLiteralAccessExpression(CSharpParser.LiteralAccessExpressionContext ctx) {

	}

	@Override
	public void exitThisReferenceExpression(CSharpParser.ThisReferenceExpressionContext ctx) {

	}

	@Override
	public void exitBaseAccessExpression(CSharpParser.BaseAccessExpressionContext ctx) {

	}

	@Override
	public void exitObjectCreationExpression(CSharpParser.ObjectCreationExpressionContext ctx) {

	}

	@Override
	public void exitTypeofExpression(CSharpParser.TypeofExpressionContext ctx) {

	}

	@Override
	public void exitCheckedExpression(CSharpParser.CheckedExpressionContext ctx) {

	}

	@Override
	public void exitUncheckedExpression(CSharpParser.UncheckedExpressionContext ctx) {

	}

	@Override
	public void exitDefaultValueExpression(CSharpParser.DefaultValueExpressionContext ctx) {

	}

	@Override
	public void exitAnonymousMethodExpression(CSharpParser.AnonymousMethodExpressionContext ctx) {

	}

	@Override
	public void exitSizeofExpression(CSharpParser.SizeofExpressionContext ctx) {

	}

	@Override
	public void exitNameofExpression(CSharpParser.NameofExpressionContext ctx) {

	}

	@Override
	public void exitMember_access(CSharpParser.Member_accessContext ctx) {

	}

	@Override
	public void exitBracket_expression(CSharpParser.Bracket_expressionContext ctx) {

	}

	@Override
	public void exitIndexer_argument(CSharpParser.Indexer_argumentContext ctx) {

	}

	@Override
	public void exitPredefined_type(CSharpParser.Predefined_typeContext ctx) {

	}

	@Override
	public void exitExpression_list(CSharpParser.Expression_listContext ctx) {

	}

	@Override
	public void exitObject_or_collection_initializer(CSharpParser.Object_or_collection_initializerContext ctx) {

	}

	@Override
	public void exitObject_initializer(CSharpParser.Object_initializerContext ctx) {

	}

	@Override
	public void exitMember_initializer_list(CSharpParser.Member_initializer_listContext ctx) {

	}

	@Override
	public void exitMember_initializer(CSharpParser.Member_initializerContext ctx) {

	}

	@Override
	public void exitInitializer_value(CSharpParser.Initializer_valueContext ctx) {

	}

	@Override
	public void exitCollection_initializer(CSharpParser.Collection_initializerContext ctx) {

	}

	@Override
	public void exitElement_initializer(CSharpParser.Element_initializerContext ctx) {

	}

	@Override
	public void exitAnonymous_object_initializer(CSharpParser.Anonymous_object_initializerContext ctx) {

	}

	@Override
	public void exitMember_declarator_list(CSharpParser.Member_declarator_listContext ctx) {

	}

	@Override
	public void exitMember_declarator(CSharpParser.Member_declaratorContext ctx) {

	}

	@Override
	public void exitUnbound_type_name(CSharpParser.Unbound_type_nameContext ctx) {

	}

	@Override
	public void exitGeneric_dimension_specifier(CSharpParser.Generic_dimension_specifierContext ctx) {

	}

	@Override
	public void exitIsType(CSharpParser.IsTypeContext ctx) {

	}

	@Override
	public void exitLambda_expression(CSharpParser.Lambda_expressionContext ctx) {

	}

	@Override
	public void exitAnonymous_function_signature(CSharpParser.Anonymous_function_signatureContext ctx) {

	}

	@Override
	public void exitExplicit_anonymous_function_parameter_list(
			CSharpParser.Explicit_anonymous_function_parameter_listContext ctx) {

	}

	@Override
	public void exitExplicit_anonymous_function_parameter(
			CSharpParser.Explicit_anonymous_function_parameterContext ctx) {

	}

	@Override
	public void exitImplicit_anonymous_function_parameter_list(
			CSharpParser.Implicit_anonymous_function_parameter_listContext ctx) {

	}

	@Override
	public void exitAnonymous_function_body(CSharpParser.Anonymous_function_bodyContext ctx) {

	}

	@Override
	public void exitQuery_expression(CSharpParser.Query_expressionContext ctx) {

	}

	@Override
	public void exitFrom_clause(CSharpParser.From_clauseContext ctx) {

	}

	@Override
	public void exitQuery_body(CSharpParser.Query_bodyContext ctx) {

	}

	@Override
	public void exitQuery_body_clause(CSharpParser.Query_body_clauseContext ctx) {

	}

	@Override
	public void exitLet_clause(CSharpParser.Let_clauseContext ctx) {

	}

	@Override
	public void exitWhere_clause(CSharpParser.Where_clauseContext ctx) {

	}

	@Override
	public void exitCombined_join_clause(CSharpParser.Combined_join_clauseContext ctx) {

	}

	@Override
	public void exitOrderby_clause(CSharpParser.Orderby_clauseContext ctx) {

	}

	@Override
	public void exitOrdering(CSharpParser.OrderingContext ctx) {

	}

	@Override
	public void exitSelect_or_group_clause(CSharpParser.Select_or_group_clauseContext ctx) {

	}

	@Override
	public void exitQuery_continuation(CSharpParser.Query_continuationContext ctx) {

	}

	@Override
	public void exitLabeledStatement(CSharpParser.LabeledStatementContext ctx) {

	}

	@Override
	public void exitDeclarationStatement(CSharpParser.DeclarationStatementContext ctx) {

	}

	@Override
	public void exitEmbeddedStatement(CSharpParser.EmbeddedStatementContext ctx) {

	}

	@Override
	public void exitLabeled_Statement(CSharpParser.Labeled_StatementContext ctx) {

	}

	@Override
	public void exitEmbedded_statement(CSharpParser.Embedded_statementContext ctx) {

	}

	@Override
	public void exitEmptyStatement(CSharpParser.EmptyStatementContext ctx) {

	}

	@Override
	public void exitExpressionStatement(CSharpParser.ExpressionStatementContext ctx) {

	}

	@Override
	public void exitIfStatement(CSharpParser.IfStatementContext ctx) {

	}

	@Override
	public void exitSwitchStatement(CSharpParser.SwitchStatementContext ctx) {

	}

	@Override
	public void exitWhileStatement(CSharpParser.WhileStatementContext ctx) {

	}

	@Override
	public void exitDoStatement(CSharpParser.DoStatementContext ctx) {

	}

	@Override
	public void exitForStatement(CSharpParser.ForStatementContext ctx) {

	}

	@Override
	public void exitForeachStatement(CSharpParser.ForeachStatementContext ctx) {

	}

	@Override
	public void exitBreakStatement(CSharpParser.BreakStatementContext ctx) {

	}

	@Override
	public void exitContinueStatement(CSharpParser.ContinueStatementContext ctx) {

	}

	@Override
	public void exitGotoStatement(CSharpParser.GotoStatementContext ctx) {

	}

	@Override
	public void exitReturnStatement(CSharpParser.ReturnStatementContext ctx) {

	}

	@Override
	public void exitThrowStatement(CSharpParser.ThrowStatementContext ctx) {

	}

	@Override
	public void exitTryStatement(CSharpParser.TryStatementContext ctx) {

	}

	@Override
	public void exitCheckedStatement(CSharpParser.CheckedStatementContext ctx) {

	}

	@Override
	public void exitUncheckedStatement(CSharpParser.UncheckedStatementContext ctx) {

	}

	@Override
	public void exitLockStatement(CSharpParser.LockStatementContext ctx) {

	}

	@Override
	public void exitUsingStatement(CSharpParser.UsingStatementContext ctx) {

	}

	@Override
	public void exitYieldStatement(CSharpParser.YieldStatementContext ctx) {

	}

	@Override
	public void exitUnsafeStatement(CSharpParser.UnsafeStatementContext ctx) {

	}

	@Override
	public void exitFixedStatement(CSharpParser.FixedStatementContext ctx) {

	}

	@Override
	public void exitBlock(CSharpParser.BlockContext ctx) {

	}

	@Override
	public void exitLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx) {

	}

	@Override
	public void exitLocal_variable_type(CSharpParser.Local_variable_typeContext ctx) {

	}

	@Override
	public void exitLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx) {

	}

	@Override
	public void exitLocal_variable_initializer(CSharpParser.Local_variable_initializerContext ctx) {

	}

	@Override
	public void exitLocal_constant_declaration(CSharpParser.Local_constant_declarationContext ctx) {

	}

	@Override
	public void exitIf_body(CSharpParser.If_bodyContext ctx) {

	}

	@Override
	public void exitSwitch_section(CSharpParser.Switch_sectionContext ctx) {

	}

	@Override
	public void exitSwitch_label(CSharpParser.Switch_labelContext ctx) {

	}

	@Override
	public void exitStatement_list(CSharpParser.Statement_listContext ctx) {

	}

	@Override
	public void exitFor_initializer(CSharpParser.For_initializerContext ctx) {

	}

	@Override
	public void exitFor_iterator(CSharpParser.For_iteratorContext ctx) {

	}

	@Override
	public void exitCatch_clauses(CSharpParser.Catch_clausesContext ctx) {

	}

	@Override
	public void exitSpecific_catch_clause(CSharpParser.Specific_catch_clauseContext ctx) {

	}

	@Override
	public void exitGeneral_catch_clause(CSharpParser.General_catch_clauseContext ctx) {

	}

	@Override
	public void exitException_filter(CSharpParser.Exception_filterContext ctx) {

	}

	@Override
	public void exitFinally_clause(CSharpParser.Finally_clauseContext ctx) {

	}

	@Override
	public void exitResource_acquisition(CSharpParser.Resource_acquisitionContext ctx) {

	}

	@Override
	public void exitNamespace_declaration(CSharpParser.Namespace_declarationContext ctx) {
		System.out.println("exitNamespace_declaration: " + ctx.getText());
	}

	@Override
	public void exitQualified_identifier(CSharpParser.Qualified_identifierContext ctx) {
		String namespace = ctx.getText();
		if (namespace.startsWith(QUANT_CONNECT))
			System.out.append("package ").append(namespace.toLowerCase()).append(';').println();
		else
			throw new UnsupportedOperationException("Unhandled namespace: " + namespace);

		System.out.println();
	}

	@Override
	public void exitNamespace_body(CSharpParser.Namespace_bodyContext ctx) {

	}

	@Override
	public void exitExtern_alias_directives(CSharpParser.Extern_alias_directivesContext ctx) {

	}

	@Override
	public void exitExtern_alias_directive(CSharpParser.Extern_alias_directiveContext ctx) {

	}

	@Override
	public void exitUsing_directives(CSharpParser.Using_directivesContext ctx) {
		System.out.println("exitUsing_directives: " + ctx.getText());
	}

	@Override
	public void exitUsingAliasDirective(CSharpParser.UsingAliasDirectiveContext ctx) {

	}

	@Override
	public void exitUsingNamespaceDirective(CSharpParser.UsingNamespaceDirectiveContext ctx) {
//		System.out.println("exitUsingNamespaceDirective: " + ctx.namespace_or_type_name().getText());
		 final String packageImport = ctx.namespace_or_type_name().getText();
		 if( !"System".equals(packageImport) ) {
			 if( packageImport.startsWith(QUANT_CONNECT) )
				 currentClass.imports .add(packageImport.toLowerCase());
		 else
			 throw new UnsupportedOperationException("Not supporting using directive: " + packageImport);
		 }
	}

	@Override
	public void exitUsingStaticDirective(CSharpParser.UsingStaticDirectiveContext ctx) {

	}

	@Override
	public void exitNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx) {

	}

	@Override
	public void exitNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx) {

	}

	@Override
	public void exitType_declaration(CSharpParser.Type_declarationContext ctx) {
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
	public void exitQualified_alias_member(CSharpParser.Qualified_alias_memberContext ctx) {

	}

	@Override
	public void exitType_parameter_list(CSharpParser.Type_parameter_listContext ctx) {

	}

	@Override
	public void exitType_parameter(CSharpParser.Type_parameterContext ctx) {

	}

	@Override
	public void exitClass_base(CSharpParser.Class_baseContext ctx) {
		System.out.println("exitClass_base: " + ctx.getText());
	}

	@Override
	public void exitInterface_type_list(CSharpParser.Interface_type_listContext ctx) {

	}

	@Override
	public void exitType_parameter_constraints_clauses(CSharpParser.Type_parameter_constraints_clausesContext ctx) {
	}

	@Override
	public void exitType_parameter_constraints_clause(CSharpParser.Type_parameter_constraints_clauseContext ctx) {

	}

	@Override
	public void exitType_parameter_constraints(CSharpParser.Type_parameter_constraintsContext ctx) {

	}

	@Override
	public void exitPrimary_constraint(CSharpParser.Primary_constraintContext ctx) {

	}

	@Override
	public void exitSecondary_constraints(CSharpParser.Secondary_constraintsContext ctx) {

	}

	@Override
	public void exitConstructor_constraint(CSharpParser.Constructor_constraintContext ctx) {

	}

	@Override
	public void exitClass_body(CSharpParser.Class_bodyContext ctx) {
		System.out.println("enterClass_body: " + ctx.getText());
	}

	@Override
	public void exitClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx) {

	}

	@Override
	public void exitClass_member_declaration(CSharpParser.Class_member_declarationContext ctx) {
		System.out.println("exitClass_member_declaration: " + ctx.getText());
	}

	@Override
	public void exitAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx) {

	}

	@Override
	public void exitAll_member_modifier(CSharpParser.All_member_modifierContext ctx) {

	}

	@Override
	public void exitCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx) {

	}

	@Override
	public void exitTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx) {

	}

	@Override
	public void exitConstant_declarators(CSharpParser.Constant_declaratorsContext ctx) {

	}

	@Override
	public void exitConstant_declarator(CSharpParser.Constant_declaratorContext ctx) {

	}

	@Override
	public void exitVariable_declarators(CSharpParser.Variable_declaratorsContext ctx) {

	}

	@Override
	public void exitVariable_declarator(CSharpParser.Variable_declaratorContext ctx) {

	}

	@Override
	public void exitVariable_initializer(CSharpParser.Variable_initializerContext ctx) {

	}

	@Override
	public void exitReturn_type(CSharpParser.Return_typeContext ctx) {

	}

	@Override
	public void exitMember_name(CSharpParser.Member_nameContext ctx) {

	}

	@Override
	public void exitMethod_body(CSharpParser.Method_bodyContext ctx) {

	}

	@Override
	public void exitFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx) {

	}

	@Override
	public void exitFixed_parameters(CSharpParser.Fixed_parametersContext ctx) {

	}

	@Override
	public void exitFixed_parameter(CSharpParser.Fixed_parameterContext ctx) {

	}

	@Override
	public void exitParameter_modifier(CSharpParser.Parameter_modifierContext ctx) {

	}

	@Override
	public void exitParameter_array(CSharpParser.Parameter_arrayContext ctx) {

	}

	@Override
	public void exitAccessor_declarations(CSharpParser.Accessor_declarationsContext ctx) {

	}

	@Override
	public void exitGet_accessor_declaration(CSharpParser.Get_accessor_declarationContext ctx) {

	}

	@Override
	public void exitSet_accessor_declaration(CSharpParser.Set_accessor_declarationContext ctx) {

	}

	@Override
	public void exitAccessor_modifier(CSharpParser.Accessor_modifierContext ctx) {

	}

	@Override
	public void exitAccessor_body(CSharpParser.Accessor_bodyContext ctx) {

	}

	@Override
	public void exitEvent_accessor_declarations(CSharpParser.Event_accessor_declarationsContext ctx) {

	}

	@Override
	public void exitAdd_accessor_declaration(CSharpParser.Add_accessor_declarationContext ctx) {

	}

	@Override
	public void exitRemove_accessor_declaration(CSharpParser.Remove_accessor_declarationContext ctx) {

	}

	@Override
	public void exitOverloadable_operator(CSharpParser.Overloadable_operatorContext ctx) {

	}

	@Override
	public void exitConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx) {

	}

	@Override
	public void exitConstructor_initializer(CSharpParser.Constructor_initializerContext ctx) {

	}

	@Override
	public void exitBody(CSharpParser.BodyContext ctx) {

	}

	@Override
	public void exitStruct_interfaces(CSharpParser.Struct_interfacesContext ctx) {

	}

	@Override
	public void exitStruct_body(CSharpParser.Struct_bodyContext ctx) {

	}

	@Override
	public void exitStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx) {

	}

	@Override
	public void exitArray_type(CSharpParser.Array_typeContext ctx) {

	}

	@Override
	public void exitRank_specifier(CSharpParser.Rank_specifierContext ctx) {

	}

	@Override
	public void exitArray_initializer(CSharpParser.Array_initializerContext ctx) {

	}

	@Override
	public void exitVariant_type_parameter_list(CSharpParser.Variant_type_parameter_listContext ctx) {

	}

	@Override
	public void exitVariant_type_parameter(CSharpParser.Variant_type_parameterContext ctx) {

	}

	@Override
	public void exitVariance_annotation(CSharpParser.Variance_annotationContext ctx) {

	}

	@Override
	public void exitInterface_base(CSharpParser.Interface_baseContext ctx) {

	}

	@Override
	public void exitInterface_body(CSharpParser.Interface_bodyContext ctx) {

	}

	@Override
	public void exitInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {

	}

	@Override
	public void exitInterface_accessors(CSharpParser.Interface_accessorsContext ctx) {

	}

	@Override
	public void exitEnum_base(CSharpParser.Enum_baseContext ctx) {

	}

	@Override
	public void exitEnum_body(CSharpParser.Enum_bodyContext ctx) {

	}

	@Override
	public void exitEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx) {

	}

	@Override
	public void exitGlobal_attribute_section(CSharpParser.Global_attribute_sectionContext ctx) {

	}

	@Override
	public void exitGlobal_attribute_target(CSharpParser.Global_attribute_targetContext ctx) {

	}

	@Override
	public void exitAttributes(CSharpParser.AttributesContext ctx) {

	}

	@Override
	public void exitAttribute_section(CSharpParser.Attribute_sectionContext ctx) {

	}

	@Override
	public void exitAttribute_target(CSharpParser.Attribute_targetContext ctx) {

	}

	@Override
	public void exitAttribute_list(CSharpParser.Attribute_listContext ctx) {

	}

	@Override
	public void exitAttribute(CSharpParser.AttributeContext ctx) {

	}

	@Override
	public void exitAttribute_argument(CSharpParser.Attribute_argumentContext ctx) {

	}

	@Override
	public void exitPointer_type(CSharpParser.Pointer_typeContext ctx) {

	}

	@Override
	public void exitFixed_pointer_declarators(CSharpParser.Fixed_pointer_declaratorsContext ctx) {

	}

	@Override
	public void exitFixed_pointer_declarator(CSharpParser.Fixed_pointer_declaratorContext ctx) {

	}

	@Override
	public void exitFixed_pointer_initializer(CSharpParser.Fixed_pointer_initializerContext ctx) {

	}

	@Override
	public void exitFixed_size_buffer_declarator(CSharpParser.Fixed_size_buffer_declaratorContext ctx) {

	}

	@Override
	public void exitLocal_variable_initializer_unsafe(CSharpParser.Local_variable_initializer_unsafeContext ctx) {

	}

	@Override
	public void exitRight_arrow(CSharpParser.Right_arrowContext ctx) {

	}

	@Override
	public void exitRight_shift(CSharpParser.Right_shiftContext ctx) {

	}

	@Override
	public void exitRight_shift_assignment(CSharpParser.Right_shift_assignmentContext ctx) {

	}

	@Override
	public void exitLiteral(CSharpParser.LiteralContext ctx) {

	}

	@Override
	public void exitBoolean_literal(CSharpParser.Boolean_literalContext ctx) {

	}

	@Override
	public void exitString_literal(CSharpParser.String_literalContext ctx) {

	}

	@Override
	public void exitInterpolated_regular_string(CSharpParser.Interpolated_regular_stringContext ctx) {

	}

	@Override
	public void exitInterpolated_verbatium_string(CSharpParser.Interpolated_verbatium_stringContext ctx) {

	}

	@Override
	public void exitInterpolated_regular_string_part(CSharpParser.Interpolated_regular_string_partContext ctx) {

	}

	@Override
	public void exitInterpolated_verbatium_string_part(CSharpParser.Interpolated_verbatium_string_partContext ctx) {

	}

	@Override
	public void exitInterpolated_string_expression(CSharpParser.Interpolated_string_expressionContext ctx) {

	}

	@Override
	public void exitKeyword(CSharpParser.KeywordContext ctx) {

	}

	@Override
	public void exitClass_definition(CSharpParser.Class_definitionContext ctx) {
		System.out.println("exitClass_definition: " + ctx.getText());
	}

	@Override
	public void exitStruct_definition(CSharpParser.Struct_definitionContext ctx) {

	}

	@Override
	public void exitInterface_definition(CSharpParser.Interface_definitionContext ctx) {

	}

	@Override
	public void exitEnum_definition(CSharpParser.Enum_definitionContext ctx) {

	}

	@Override
	public void exitDelegate_definition(CSharpParser.Delegate_definitionContext ctx) {

	}

	@Override
	public void exitEvent_declaration(CSharpParser.Event_declarationContext ctx) {

	}

	@Override
	public void exitField_declaration(CSharpParser.Field_declarationContext ctx) {

	}

	@Override
	public void exitProperty_declaration(CSharpParser.Property_declarationContext ctx) {

	}

	@Override
	public void exitConstant_declaration(CSharpParser.Constant_declarationContext ctx) {

	}

	@Override
	public void exitIndexer_declaration(CSharpParser.Indexer_declarationContext ctx) {

	}

	@Override
	public void exitDestructor_definition(CSharpParser.Destructor_definitionContext ctx) {

	}

	@Override
	public void exitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {

	}

	@Override
	public void exitMethod_declaration(CSharpParser.Method_declarationContext ctx) {

	}

	@Override
	public void exitMethod_member_name(CSharpParser.Method_member_nameContext ctx) {

	}

	@Override
	public void exitOperator_declaration(CSharpParser.Operator_declarationContext ctx) {

	}

	@Override
	public void exitArg_declaration(CSharpParser.Arg_declarationContext ctx) {

	}

	@Override
	public void exitMethod_invocation(CSharpParser.Method_invocationContext ctx) {

	}

	@Override
	public void exitObject_creation_expression(CSharpParser.Object_creation_expressionContext ctx) {

	}

	@Override
	public void exitIdentifier(CSharpParser.IdentifierContext ctx) {

	}

	@Override
	public void visitTerminal(TerminalNode node) {

	}

	@Override
	public void visitErrorNode(ErrorNode node) {

	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// System.out.println( "enterEveryRule: " +
		// CSharpParser.ruleNames[ctx.getRuleIndex()] + " -> " +
		// ctx.getText() );
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		 System.out.println(
		 "exitEveryRule: " + CSharpParser.ruleNames[ctx.getRuleIndex()] + " | " + ctx.getClass().getSimpleName() + " | " + ctx.getText());
	}
	
	private static final class ClassData {

		public Set<String> imports = new TreeSet<>() ;

	}
}