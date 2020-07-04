// Generated from C:/Users/Bcc/Desktop/compiler_v2-master/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#def_all}.
	 * @param ctx the parse tree
	 */
	void enterDef_all(SQLParser.Def_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#def_all}.
	 * @param ctx the parse tree
	 */
	void exitDef_all(SQLParser.Def_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#def_function}.
	 * @param ctx the parse tree
	 */
	void enterDef_function(SQLParser.Def_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#def_function}.
	 * @param ctx the parse tree
	 */
	void exitDef_function(SQLParser.Def_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SQLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SQLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_get_func}.
	 * @param ctx the parse tree
	 */
	void enterVar_get_func(SQLParser.Var_get_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_get_func}.
	 * @param ctx the parse tree
	 */
	void exitVar_get_func(SQLParser.Var_get_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_init}.
	 * @param ctx the parse tree
	 */
	void enterVar_init(SQLParser.Var_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_init}.
	 * @param ctx the parse tree
	 */
	void exitVar_init(SQLParser.Var_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_operator}.
	 * @param ctx the parse tree
	 */
	void enterVar_operator(SQLParser.Var_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_operator}.
	 * @param ctx the parse tree
	 */
	void exitVar_operator(SQLParser.Var_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#def_print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDef_print_stmt(SQLParser.Def_print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#def_print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDef_print_stmt(SQLParser.Def_print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#print_body}.
	 * @param ctx the parse tree
	 */
	void enterPrint_body(SQLParser.Print_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#print_body}.
	 * @param ctx the parse tree
	 */
	void exitPrint_body(SQLParser.Print_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SQLParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SQLParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#else_if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_stmt(SQLParser.Else_if_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#else_if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_stmt(SQLParser.Else_if_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(SQLParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(SQLParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#inline_condition_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInline_condition_stmt(SQLParser.Inline_condition_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#inline_condition_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInline_condition_stmt(SQLParser.Inline_condition_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(SQLParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(SQLParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_stmt(SQLParser.Do_while_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_stmt(SQLParser.Do_while_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_do_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_do_stmt(SQLParser.While_do_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_do_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_do_stmt(SQLParser.While_do_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(SQLParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(SQLParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_rule}.
	 * @param ctx the parse tree
	 */
	void enterFor_rule(SQLParser.For_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_rule}.
	 * @param ctx the parse tree
	 */
	void exitFor_rule(SQLParser.For_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreach_rule}.
	 * @param ctx the parse tree
	 */
	void enterForeach_rule(SQLParser.Foreach_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreach_rule}.
	 * @param ctx the parse tree
	 */
	void exitForeach_rule(SQLParser.Foreach_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SQLParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SQLParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(SQLParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(SQLParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#func_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_argument_list(SQLParser.Func_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#func_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_argument_list(SQLParser.Func_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_stmt(SQLParser.Create_type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_stmt(SQLParser.Create_type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_aggr_func}.
	 * @param ctx the parse tree
	 */
	void enterCreate_aggr_func(SQLParser.Create_aggr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_aggr_func}.
	 * @param ctx the parse tree
	 */
	void exitCreate_aggr_func(SQLParser.Create_aggr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#jar_path}.
	 * @param ctx the parse tree
	 */
	void enterJar_path(SQLParser.Jar_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#jar_path}.
	 * @param ctx the parse tree
	 */
	void exitJar_path(SQLParser.Jar_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(SQLParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(SQLParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(SQLParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(SQLParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(SQLParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(SQLParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_aggr}.
	 * @param ctx the parse tree
	 */
	void enterArray_aggr(SQLParser.Array_aggrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_aggr}.
	 * @param ctx the parse tree
	 */
	void exitArray_aggr(SQLParser.Array_aggrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_while}.
	 * @param ctx the parse tree
	 */
	void enterExpr_while(SQLParser.Expr_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_while}.
	 * @param ctx the parse tree
	 */
	void exitExpr_while(SQLParser.Expr_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_if}.
	 * @param ctx the parse tree
	 */
	void enterExpr_if(SQLParser.Expr_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_if}.
	 * @param ctx the parse tree
	 */
	void exitExpr_if(SQLParser.Expr_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_for_and_operator}.
	 * @param ctx the parse tree
	 */
	void enterExpr_for_and_operator(SQLParser.Expr_for_and_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_for_and_operator}.
	 * @param ctx the parse tree
	 */
	void exitExpr_for_and_operator(SQLParser.Expr_for_and_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_var_init}.
	 * @param ctx the parse tree
	 */
	void enterExpr_var_init(SQLParser.Expr_var_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_var_init}.
	 * @param ctx the parse tree
	 */
	void exitExpr_var_init(SQLParser.Expr_var_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_print}.
	 * @param ctx the parse tree
	 */
	void enterExpr_print(SQLParser.Expr_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_print}.
	 * @param ctx the parse tree
	 */
	void exitExpr_print(SQLParser.Expr_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void enterGroupBy(SQLParser.GroupByContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void exitGroupBy(SQLParser.GroupByContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#having}.
	 * @param ctx the parse tree
	 */
	void enterHaving(SQLParser.HavingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#having}.
	 * @param ctx the parse tree
	 */
	void exitHaving(SQLParser.HavingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name_identifier_json}.
	 * @param ctx the parse tree
	 */
	void enterAny_name_identifier_json(SQLParser.Any_name_identifier_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name_identifier_json}.
	 * @param ctx the parse tree
	 */
	void exitAny_name_identifier_json(SQLParser.Any_name_identifier_jsonContext ctx);
}