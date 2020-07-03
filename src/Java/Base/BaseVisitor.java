package Java.Base;

import Java.AST.*;
import Java.AST.Expr.*;
import Java.AST.Expr.Expr_for_and_operator;
import Java.AST.Expr.Expr_if;
import Java.AST.Expr.Expr_while;
import Java.AST.Function.*;
import Java.AST.Function.If_stmt.*;
import Java.AST.Function.Loop.*;
import Java.AST.Function.Print.Def_print_stmt;
import Java.AST.Function.Print.Print_body;
import Java.AST.Function.Switch.Switch_stmt;
import Java.AST.QueryStmt.*;
import Java.AST.QueryStmt.AlterStatement.*;
import Java.AST.QueryStmt.ColumnConstraints.ColumnForeignKey;
import Java.AST.QueryStmt.ColumnConstraints.ColumnNotNull;
import Java.AST.QueryStmt.ColumnConstraints.ColumnNull;
import Java.AST.QueryStmt.ColumnConstraints.ColumnPrimaryKey;
import Java.AST.QueryStmt.DeleteStatement.QualifiedTableName;
import Java.AST.QueryStmt.SelectOrSubQuery.ResultColumn;
import Java.AST.QueryStmt.SelectOrSubQuery.SelectOrValues;
import Java.AST.QueryStmt.SelectOrSubQuery.TableOrSubQuery;
import Java.AST.QueryStmt.SelectStmt.*;
import Java.Main;
import Java.SymbolTable.CreateType;
import Java.SymbolTable.Scope;
import Java.SymbolTable.Symbol;
import Java.SymbolTable.Type;
import generated.SQLBaseVisitor;
import generated.SQLParser;

import java.util.*;

public class BaseVisitor extends SQLBaseVisitor {

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Parse visitParse(SQLParser.ParseContext ctx) {
//        System.out.println("visitParse");
        Parse p = new Parse();

        if (!ctx.sql_stmt_list().isEmpty()) {
            List<Statement> sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(0));
            p.setSqlStmts(sqlStmts);
        }
        if (ctx.def_all() != null) {
            List<DefAllObject> defAllObjects = new ArrayList<>();
            for (int i = 0; i < ctx.def_all().size(); i++) {

                defAllObjects.add(visitDef_all(ctx.def_all(i)));
            }
            p.setDefAllObject(defAllObjects);
        }

        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return p;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitError(SQLParser.ErrorContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Statement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

//        System.out.println("visitSql_stmt_list");

        List<Statement> sqlStmt = new ArrayList<Statement>();
        for (int i = 0; i < ctx.sql_stmt().size(); i++) {
            sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
        }

        return sqlStmt;
//        return visitChildren(ctx);

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Statement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {
        Statement s = new Statement();
        if (ctx.factored_select_stmt() != null) {
            s.setFactoredSelectStmt(visitFactored_select_stmt(ctx.factored_select_stmt()));
        }

        if (ctx.create_table_stmt() != null) {
            s.setCreateStmt(visitCreate_table_stmt(ctx.create_table_stmt()));
        }
//        if (ctx.alter_table_stmt() != null) {
//            s.setAlterTableStmt(visitAlter_table_stmt(ctx.alter_table_stmt()));
//        }
//        if (ctx.insert_stmt() != null) {
//            s.setInsertStmt(visitInsert_stmt(ctx.insert_stmt()));
//        }
//        if (ctx.drop_table_stmt() != null) {
//            s.setDropStmt(visitDrop_table_stmt(ctx.drop_table_stmt()));
//        }
//        if (ctx.delete_stmt() != null) {
//            s.setDeleteStmt(visitDelete_stmt(ctx.delete_stmt()));
//        }
//        if (ctx.update_stmt() != null) {
//            s.setUpdateStmt(visitUpdate_stmt(ctx.update_stmt()));
//        }
        if (ctx.create_type_stmt() != null) {
            s.setCreateType(visitCreate_type_stmt(ctx.create_type_stmt()));
        }
        return s;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public SelectStmt visitSelect_stmt(SQLParser.Select_stmtContext ctx) {


//        System.out.println("visitSelect_stmt");
        SelectStmt selectStmt = new SelectStmt();
        if (ctx.select_or_values() != null) {
            selectStmt.setSelectOrValues(visitSelect_or_values(ctx.select_or_values()));
        }
        if (ctx.ordering_term() != null) {
            List<OrderingTerm> orderingTerms = new ArrayList<>();
            for (int i = 0; i < ctx.ordering_term().size(); i++) {
                orderingTerms.add(visitOrdering_term(ctx.ordering_term(i)));
            }
            selectStmt.setOrderingTerm(orderingTerms);
        }
        if (ctx.expr() != null) {
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                exprs.add(visitExpr(ctx.expr(i)));
            }
            selectStmt.setExpr(exprs);
        }
        return selectStmt;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public FactoredSelectStmt visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx) {
        FactoredSelectStmt factoredSelectStmt = new FactoredSelectStmt();


        if (ctx.select_core() != null) {
            factoredSelectStmt.setSelectCore(visitSelect_core(ctx.select_core()));
        }

        if (ctx.ordering_term() != null) {
            List<OrderingTerm> orderingTerms = new ArrayList<>();
            for (int i = 0; i < ctx.ordering_term().size(); i++) {
                orderingTerms.add(visitOrdering_term(ctx.ordering_term(i)));
            }

            factoredSelectStmt.setOrderingTerm(orderingTerms);


        }
        if (ctx.expr() != null) {
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                exprs.add(visitExpr(ctx.expr(i)));
            }
            factoredSelectStmt.setExpr(exprs);
        }

        if (ctx.K_ORDER() != null) {
            factoredSelectStmt.setOrder(ctx.K_ORDER().getSymbol().getText());
        }
        if (ctx.K_BY() != null) {
            factoredSelectStmt.setBy(ctx.K_BY().getSymbol().getText());
        }
        if (ctx.K_OFFSET() != null) {
            factoredSelectStmt.setOffset(ctx.K_OFFSET().getSymbol().getText());
        }
        if (ctx.K_LIMIT() != null) {
            factoredSelectStmt.setLimit(ctx.K_LIMIT().getSymbol().getText());
        }


        return factoredSelectStmt;


    }


    @Override
    public CreateType visitCreate_type_stmt(SQLParser.Create_type_stmtContext ctx) {
        CreateType createType = new CreateType();
        Type tableType = new Type();
        Main.rightType = tableType;


        Main.symbolTable.getDeclaredTypes().add(tableType);
        if (ctx.any_name() != null) {
            createType.setAnyName(visitAny_name(ctx.any_name()));
            Main.rightType.setName(ctx.any_name().IDENTIFIER().getText());
        }

        if (ctx.column_def() != null) {
            List<ColumnDef> columnDefs1 = new ArrayList<>();
            for (int i = 0; i < ctx.column_def().size(); i++) {
                columnDefs1.add(visitColumn_def(ctx.column_def(i)));
            }
            createType.setColumnDefList(columnDefs1);

        }
//        if (ctx.type() != null) {
//            createType.setType(visitType(ctx.type()));
//        }
        return createType;
    }


//    @Override
//    public Type visitType(SQLParser.TypeContext ctx) {
//        Type type = new Type();
//        Map<String, Type> columns = new HashMap<>();
//
//        if (ctx.any_name() != null) {
//            for (int i = 0; i < ctx.any_name().size(); i++) {
//                type.setName(ctx.any_name().get(i).IDENTIFIER().getSymbol().getText());
//                if (ctx.type() != null) {
//                    columns.put(ctx.any_name().get(i).IDENTIFIER().getSymbol().getText(), visitType(ctx.type(i)));
//                }
//            }
//        }
//
//        if (ctx.K_NUMBER() != null) {
//            type.setName(Type.NUMBER_CONST);
//        }
//        if (ctx.K_STRING() != null) {
//            type.setName(Type.STRING_CONST);
//        }
//        if (ctx.K_BOOLEAN() != null) {
//            type.setName(Type.BOOLEAN_CONST);
//        }
//        type.setColumns(columns);
//        return type;
//    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public SelectOrValues visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
        SelectOrValues selectOrValues = new SelectOrValues();
        if (ctx.result_column() != null) {
            List<ResultColumn> resultColumns = new ArrayList<>();
            for (int i = 0; i < ctx.result_column().size(); i++) {
                resultColumns.add(visitResult_column(ctx.result_column(i)));
            }
            selectOrValues.setResultColumns(resultColumns);
        }


        if (ctx.table_or_subquery() != null) {
            List<TableOrSubQuery> tableOrSubQueries = new ArrayList<>();
            for (int i = 0; i < ctx.table_or_subquery().size(); i++) {

                tableOrSubQueries.add(visitTable_or_subquery(ctx.table_or_subquery(i)));

            }
            selectOrValues.setTableOrSubQueries(tableOrSubQueries);
        }
        if (ctx.join_clause() != null) {
            selectOrValues.setJoinClause(visitJoin_clause(ctx.join_clause()));

        }
        if (ctx.expr() != null) {
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                exprs.add(visitExpr(ctx.expr(i)));
            }
            selectOrValues.setExpr(exprs);
        }
        if (ctx.K_FROM() != null) {
            selectOrValues.setFrom(ctx.K_FROM().getSymbol().getText());
        }
        if(ctx.having() != null ){
            selectOrValues.setHaving(visitHaving(ctx.having()));
        }
        return selectOrValues;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public OrderingTerm visitOrdering_term(SQLParser.Ordering_termContext ctx) {
//        System.out.println("visitOrdering_term");
        OrderingTerm orderingTerm = new OrderingTerm();
        if (ctx.expr() != null) {

            orderingTerm.setExpr(visitExpr(ctx.expr()));
        }
        if (ctx.K_ASC() != null) {
            orderingTerm.setASC(ctx.K_ASC().getSymbol().getText());
        }
        if (ctx.K_DESC() != null) {
            orderingTerm.setDESC(ctx.K_DESC().getSymbol().getText());
        }
        return orderingTerm;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Expr visitExpr(SQLParser.ExprContext ctx) {
        Expr expr = new Expr();
        if (ctx.literal_value() != null) {
            expr.setLiteralValue(visitLiteral_value(ctx.literal_value()));
        }
        if (ctx.unary_operator() != null) {
            expr.setUnaryOperator(visitUnary_operator(ctx.unary_operator()));
        }
        if (ctx.database_name() != null) {
            expr.setDatabaseName(ctx.database_name().any_name().getText());
        }
        if (ctx.table_name() != null) {
            expr.setTableName(ctx.table_name().any_name().getText());
        }
        if (ctx.column_name() != null) {
            expr.setColumnName(ctx.column_name().any_name().getText());

            Symbol symbol = new Symbol();
            symbol.setName(ctx.column_name().any_name().getText());
            symbol.setScope(Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1));
            Type symbolType  =new Type();
            symbolType.setName("columnName");

            symbol.setType(symbolType);
            Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1)
                    .setSymbol(symbol);
        }
        if (ctx.expr() != null) {
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                exprs.add(visitExpr(ctx.expr(i)));
            }
            expr.setExprs(exprs);
        }
        if (ctx.function_name() != null) {
            expr.setFunctionName(ctx.function_name().any_name().getText());

        }
        if (ctx.K_IN() != null) {
            expr.setK_IN(ctx.K_IN().getSymbol().getText());
        }
        List<String> operation = new ArrayList<>();
        if (ctx.PIPE2() != null) {
            operation.add(ctx.PIPE2().getSymbol().getText());
        }
        if (ctx.STAR() != null) {
            operation.add(ctx.STAR().getSymbol().getText());
        }
        if (ctx.DIV() != null) {
            operation.add(ctx.DIV().getSymbol().getText());
        }
        if (ctx.MOD() != null) {
            operation.add(ctx.MOD().getSymbol().getText());
        }
        if (ctx.PLUS() != null) {
            operation.add(ctx.PLUS().getSymbol().getText());
        }
        if (ctx.MINUS() != null) {
            operation.add(ctx.MINUS().getSymbol().getText());
        }
        if (ctx.LT2() != null) {
            operation.add(ctx.LT2().getSymbol().getText());
        }
        if (ctx.GT2() != null) {
            operation.add(ctx.GT2().getSymbol().getText());
        }
        if (ctx.AMP() != null) {
            operation.add(ctx.AMP().getSymbol().getText());
        }
        if (ctx.PIPE() != null) {
            operation.add(ctx.PIPE().getSymbol().getText());
        }
        if (ctx.LT() != null) {
            operation.add(ctx.LT().getSymbol().getText());
        }
        if (ctx.LT_EQ() != null) {
            operation.add(ctx.LT_EQ().getSymbol().getText());
        }
        if (ctx.GT() != null) {
            operation.add(ctx.GT().getSymbol().getText());
        }
        if (ctx.GT_EQ() != null) {
//            System.out.println("GT_EQ" +ctx.GT_EQ().getSymbol().getText());
            operation.add(ctx.GT_EQ().getSymbol().getText());
        }
        if (ctx.ASSIGN() != null) {
            operation.add(ctx.ASSIGN().getSymbol().getText());
        }
        if (ctx.NOT_EQ1() != null) {
            operation.add(ctx.NOT_EQ1().getSymbol().getText());
        }
        if (ctx.K_IS() != null) {
            operation.add(ctx.K_IS().getSymbol().getText());
        }
        if (ctx.EQ() != null) {
            operation.add(ctx.EQ().getSymbol().getText());
        }
        if (ctx.NOT_EQ2() != null) {
            operation.add(ctx.NOT_EQ2().getSymbol().getText());
        }
        if (ctx.K_IN() != null) {
            operation.add(ctx.K_IN().getSymbol().getText());
        }
        if (ctx.K_LIKE() != null) {
            operation.add(ctx.K_LIKE().getSymbol().getText());
        }
        if (ctx.K_IS() != null && ctx.K_NOT() != null) {
            operation.add(ctx.K_IS().getSymbol().getText());
            operation.add(ctx.K_NOT().getSymbol().getText());
        }
        if (ctx.K_GLOB() != null) {
            operation.add(ctx.K_GLOB().getSymbol().getText());
        }
        if (ctx.K_MATCH() != null) {
            operation.add(ctx.K_MATCH().getSymbol().getText());
        }
        if (ctx.K_REGEXP() != null) {
            operation.add(ctx.K_REGEXP().getSymbol().getText());
        }
        if (ctx.K_AND() != null) {
            operation.add(ctx.K_AND().getSymbol().getText());
        }
        if (ctx.K_OR() != null) {
            operation.add(ctx.K_OR().getSymbol().getText());
        }
        if (ctx.OPEN_PAR() != null) {
            operation.add(ctx.OPEN_PAR().getSymbol().getText());
        }
        if (ctx.CLOSE_PAR() != null) {
            operation.add(ctx.CLOSE_PAR().getSymbol().getText());
        }
        if (ctx.COMMA() != null) {
//            operation.add(ctx.COMMA().get(0).getSymbol().getText());
            //list
        }
        if (ctx.DOT() != null) {
            //list
//            operation.add(ctx.DOT().get(0).getSymbol().getText());
        }
        if (ctx.K_EXISTS() != null) {
            operation.add(ctx.K_EXISTS().getSymbol().getText());
        }
        expr.setOperation(operation);

        if (ctx.select_stmt() != null) {
            expr.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
        }
        if (ctx.sql_stmt_list() != null && !ctx.sql_stmt_list().isEmpty()) {
            expr.setSql_stmt_list(visitSql_stmt_list(ctx.sql_stmt_list()));
        }
        if (ctx.inline_condition_stmt() != null && !ctx.inline_condition_stmt().isEmpty()) {
            expr.setInline_condition_stmt(visitInline_condition_stmt(ctx.inline_condition_stmt()));
        }

        expr.setLine(ctx.getStart().getLine());
        expr.setCol(ctx.getStart().getCharPositionInLine()); //

        return expr;
    }


    @Override
    public Expr_while visitExpr_while(SQLParser.Expr_whileContext ctx) {
//        Scope parentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);
        Expr_while expr_while = new Expr_while();

        if (ctx.literal_value() != null) {
            LiteralValue literalValue = visitLiteral_value(ctx.literal_value());
//            Symbol symbol = new Symbol();
//            if (literalValue.getStringValue() != null) symbol.setName(literalValue.getStringValue());
//            if (literalValue.getNumericalValue() != null) symbol.setName(literalValue.getNumericalValue());
//
//            symbol.setIsParam(false);
//            symbol.setScope(parentScope);

            expr_while.setLiteralValue(literalValue);
        }

        if (ctx.any_name() != null) {
            List<AnyName> anyNames = new ArrayList<>();
            for (int i = 0; i < ctx.any_name().size(); i++) {
//                Symbol symbol = new Symbol();
//                symbol.setName(visitAny_name(ctx.any_name(i)).getIDENTIFIER());
//                symbol.setIsParam(false);
//                symbol.setScope(parentScope);

                anyNames.add(visitAny_name(ctx.any_name(i)));
            }
            expr_while.setAnyNamesList(anyNames);
        }

        if (ctx.expr_while() != null) {
            List<Expr_while> expr_whiles = new ArrayList<>();
            for (int i = 0; i < ctx.expr_while().size(); i++) {
                expr_whiles.add(visitExpr_while(ctx.expr_while(i)));
            }
            expr_while.setExpr_while(expr_whiles);
        }

        if (ctx.expr() != null) {
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                exprs.add(visitExpr(ctx.expr(i)));
            }
            expr_while.setExpr(exprs);
        }

        //call_json
//        if (ctx.call_json() != null) {
//            List<Call_json> call_jsons = new ArrayList<>();
//            for (int i = 0; i < ctx.call_json().size(); i++) {
//                call_jsons.add(visitCall_json(ctx.call_json().get(i)));
//            }
//            expr_while.setCall_jsons(call_jsons);
//        }

        if (ctx.signed_number() != null) {
            expr_while.setSignedNumber(visitSigned_number(ctx.signed_number()));
        }

        if (ctx.type_name() != null) {
            expr_while.setTypeName(visitType_name(ctx.type_name()));
        }

        List<String> operation = new ArrayList<>();
        if (ctx.PIPE2() != null) {
            operation.add(ctx.PIPE2().getSymbol().getText());
        }
        if (ctx.STAR() != null) {
            operation.add(ctx.STAR().getSymbol().getText());
        }
        if (ctx.DIV() != null) {
            operation.add(ctx.DIV().getSymbol().getText());
        }
        if (ctx.MOD() != null) {
            operation.add(ctx.MOD().getSymbol().getText());
        }
        if (ctx.PLUS() != null) {
            operation.add(ctx.PLUS().getSymbol().getText());
        }
        if (ctx.MINUS() != null) {
            operation.add(ctx.MINUS().getSymbol().getText());
        }
        if (ctx.LT() != null) {
            operation.add(ctx.LT().getSymbol().getText());
        }
        if (ctx.LT_EQ() != null) {
            operation.add(ctx.LT_EQ().getSymbol().getText());
        }
        if (ctx.GT() != null) {
            operation.add(ctx.GT().getSymbol().getText());
        }
        if (ctx.GT_EQ() != null) {
//            System.out.println("GT_EQ" +ctx.GT_EQ().getSymbol().getText());
            operation.add(ctx.GT_EQ().getSymbol().getText());
        }
        if (ctx.EQ() != null) {
            operation.add(ctx.EQ().getSymbol().getText());
        }
        if (ctx.K_AND() != null) {
            operation.add(ctx.K_AND().getSymbol().getText());
        }
        if (ctx.K_OR() != null) {
            operation.add(ctx.K_OR().getSymbol().getText());
        }
        if (ctx.OPEN_PAR() != null) {
            operation.add(ctx.OPEN_PAR().getSymbol().getText());
        }
        if (ctx.CLOSE_PAR() != null) {
            operation.add(ctx.CLOSE_PAR().getSymbol().getText());
        }
        expr_while.setOperation(operation);

        return expr_while;
    }

    @Override
    public Expr_if visitExpr_if(SQLParser.Expr_ifContext ctx) {
        Expr_if expr_if = new Expr_if();

        if (ctx.literal_value() != null) {
            LiteralValue literalValue = visitLiteral_value(ctx.literal_value());

            expr_if.setLiteralValue(literalValue);
        }

        if (ctx.any_name() != null) {
            List<AnyName> anyNames = new ArrayList<>();
            for (int i = 0; i < ctx.any_name().size(); i++) {

                anyNames.add(visitAny_name(ctx.any_name(i)));
            }
            expr_if.setAnyNames(anyNames);
        }

        if (ctx.expr_if() != null) {
            List<Expr_if> expr_ifs = new ArrayList<>();
            for (int i = 0; i < ctx.expr_if().size(); i++) {
                expr_ifs.add(visitExpr_if(ctx.expr_if().get(i)));
            }
            expr_if.setExpr_ifs(expr_ifs);
        }


        if (ctx.expr() != null) {
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                exprs.add(visitExpr(ctx.expr().get(i)));
            }
            expr_if.setExpr(exprs);
        }

        //call_json
//        if (ctx.call_json() != null) {
//            List<Call_json> call_jsons = new ArrayList<>();
//            for (int i = 0; i < ctx.call_json().size(); i++) {
//                call_jsons.add(visitCall_json(ctx.call_json().get(i)));
//            }
//            expr_if.setCall_jsons(call_jsons);
//        }

        if (ctx.signed_number() != null) {
            expr_if.setSignedNumber(visitSigned_number(ctx.signed_number()));
        }

        if (ctx.type_name() != null) {
            expr_if.setTypeName(visitType_name(ctx.type_name()));
        }

        List<String> operation = new ArrayList<>();
        if (ctx.PIPE2() != null) {
            operation.add(ctx.PIPE2().getSymbol().getText());
        }
        if (ctx.STAR() != null) {
            operation.add(ctx.STAR().getSymbol().getText());
        }
        if (ctx.DIV() != null) {
            operation.add(ctx.DIV().getSymbol().getText());
        }
        if (ctx.MOD() != null) {
            operation.add(ctx.MOD().getSymbol().getText());
        }
        if (ctx.PLUS() != null) {
            operation.add(ctx.PLUS().getSymbol().getText());
        }
        if (ctx.MINUS() != null) {
            operation.add(ctx.MINUS().getSymbol().getText());
        }
        if (ctx.LT() != null) {
            operation.add(ctx.LT().getSymbol().getText());
        }
        if (ctx.LT_EQ() != null) {
            operation.add(ctx.LT_EQ().getSymbol().getText());
        }
        if (ctx.GT() != null) {
            operation.add(ctx.GT().getSymbol().getText());
        }
        if (ctx.GT_EQ() != null) {
//            System.out.println("GT_EQ" +ctx.GT_EQ().getSymbol().getText());
            operation.add(ctx.GT_EQ().getSymbol().getText());
        }
        if (ctx.NOT_EQ1() != null) {
            operation.add(ctx.NOT_EQ1().getSymbol().getText());
        }
        if (ctx.K_AND() != null) {
            operation.add(ctx.K_AND().getSymbol().getText());
        }
        if (ctx.K_OR() != null) {
            operation.add(ctx.K_OR().getSymbol().getText());
        }
        if (ctx.OPEN_PAR() != null) {
            operation.add(ctx.OPEN_PAR().getSymbol().getText());
        }
        if (ctx.CLOSE_PAR() != null) {
            operation.add(ctx.CLOSE_PAR().getSymbol().getText());
        }
        expr_if.setOperation(operation);


        return expr_if;
    }

    @Override
    public Expr_for_and_operator visitExpr_for_and_operator(SQLParser.Expr_for_and_operatorContext ctx) {
        Expr_for_and_operator expr_for_and_operator = new Expr_for_and_operator();

        if (ctx.expr_for_and_operator() != null) {
            List<Expr_for_and_operator> expr_for_and_operators = new ArrayList<>();
            for (int i = 0; i < ctx.expr_for_and_operator().size(); i++) {
                expr_for_and_operators.add(visitExpr_for_and_operator(ctx.expr_for_and_operator(i)));
            }
            expr_for_and_operator.setExpr_for_and_operators(expr_for_and_operators);
        }

        if (ctx.literal_value() != null) {
            expr_for_and_operator.setLiteralValue(visitLiteral_value(ctx.literal_value()));
        }
        if (ctx.any_name() != null) {
            expr_for_and_operator.setAnyName(visitAny_name(ctx.any_name()));
        }


        List<String> operation = new ArrayList<>();
        if (ctx.ASSIGN() != null) {
            operation.add(ctx.ASSIGN().getSymbol().getText());
        }
        if (ctx.OPEN_PAR() != null) {
            operation.add(ctx.OPEN_PAR().getSymbol().getText());
        }
        if (ctx.CLOSE_PAR() != null) {
            operation.add(ctx.CLOSE_PAR().getSymbol().getText());
        }
        expr_for_and_operator.setOperation(operation);

        return expr_for_and_operator;
    }

    @Override
    public Expr_Print visitExpr_print(SQLParser.Expr_printContext ctx) {
        Expr_Print expr_print = new Expr_Print();
        if (ctx.literal_value() != null) {
            expr_print.setLiteralValue(visitLiteral_value(ctx.literal_value()));
        }
        if (ctx.unary_operator() != null) {
            expr_print.setUnaryOperator(visitUnary_operator(ctx.unary_operator()));
        }

        if (ctx.expr_print() != null) {
            List<Expr_Print> expr_prints = new ArrayList<>();
            for (int i = 0; i < ctx.expr_print().size(); i++) {
                expr_prints.add(visitExpr_print(ctx.expr_print(i)));
            }
            expr_print.setExpr_prints(expr_prints);
        }
        if (ctx.database_name() != null) {
            expr_print.setDatabaseName(ctx.database_name().any_name().getText());
        }
        if (ctx.table_name() != null) {
            expr_print.setTableName(ctx.table_name().any_name().getText());
        }
        if (ctx.column_name() != null) {

            expr_print.setColumnName(ctx.column_name().any_name().getText());
        }
        if (ctx.function_name() != null) {
            expr_print.setFunctionName(ctx.function_name().any_name().getText());
        }
        List<String> operation = new ArrayList<>();
        if (ctx.PIPE2() != null) {
            operation.add(ctx.PIPE2().getSymbol().getText());
        }
        if (ctx.STAR() != null) {
            operation.add(ctx.STAR().getSymbol().getText());
        }
        if (ctx.DIV() != null) {
            operation.add(ctx.DIV().getSymbol().getText());
        }
        if (ctx.MOD() != null) {
            operation.add(ctx.MOD().getSymbol().getText());
        }
        if (ctx.PLUS() != null) {
            operation.add(ctx.PLUS().getSymbol().getText());
        }
        if (ctx.MINUS() != null) {
            operation.add(ctx.MINUS().getSymbol().getText());
        }
        if (ctx.LT2() != null) {
            operation.add(ctx.LT2().getSymbol().getText());
        }
        if (ctx.GT2() != null) {
            operation.add(ctx.GT2().getSymbol().getText());
        }
        if (ctx.AMP() != null) {
            operation.add(ctx.AMP().getSymbol().getText());
        }
        if (ctx.PIPE() != null) {
            operation.add(ctx.PIPE().getSymbol().getText());
        }
        if (ctx.LT() != null) {
            operation.add(ctx.LT().getSymbol().getText());
        }
        if (ctx.LT_EQ() != null) {
            operation.add(ctx.LT_EQ().getSymbol().getText());
        }
        if (ctx.GT() != null) {
            operation.add(ctx.GT().getSymbol().getText());
        }
        if (ctx.GT_EQ() != null) {
//            System.out.println("GT_EQ" +ctx.GT_EQ().getSymbol().getText());
            operation.add(ctx.GT_EQ().getSymbol().getText());
        }
        if (ctx.ASSIGN() != null) {
            operation.add(ctx.ASSIGN().getSymbol().getText());
        }
        if (ctx.NOT_EQ1() != null) {
            operation.add(ctx.NOT_EQ1().getSymbol().getText());
        }
        if (ctx.K_IS() != null) {
            operation.add(ctx.K_IS().getSymbol().getText());
        }
        if (ctx.EQ() != null) {
            operation.add(ctx.EQ().getSymbol().getText());
        }
        if (ctx.NOT_EQ2() != null) {
            operation.add(ctx.NOT_EQ2().getSymbol().getText());
        }
        if (ctx.K_IN() != null) {
            operation.add(ctx.K_IN().getSymbol().getText());
        }
        if (ctx.K_LIKE() != null) {
            operation.add(ctx.K_LIKE().getSymbol().getText());
        }
        if (ctx.K_IS() != null && ctx.K_NOT() != null) {
            operation.add(ctx.K_IS().getSymbol().getText());
            operation.add(ctx.K_NOT().getSymbol().getText());
        }
        if (ctx.K_GLOB() != null) {
            operation.add(ctx.K_GLOB().getSymbol().getText());
        }
        if (ctx.K_MATCH() != null) {
            operation.add(ctx.K_MATCH().getSymbol().getText());
        }
        if (ctx.K_REGEXP() != null) {
            operation.add(ctx.K_REGEXP().getSymbol().getText());
        }
        if (ctx.K_AND() != null) {
            operation.add(ctx.K_AND().getSymbol().getText());
        }
        if (ctx.K_OR() != null) {
            operation.add(ctx.K_OR().getSymbol().getText());
        }
        if (ctx.OPEN_PAR() != null) {
            operation.add(ctx.OPEN_PAR().getSymbol().getText());
        }
        if (ctx.CLOSE_PAR() != null) {
            operation.add(ctx.CLOSE_PAR().getSymbol().getText());
        }
        if (ctx.COMMA() != null) {
//            operation.add(ctx.COMMA().get(0).getSymbol().getText());
            //list
        }
        if (ctx.DOT() != null) {
            //list
//            operation.add(ctx.DOT().get(0).getSymbol().getText());
        }
        if (ctx.K_EXISTS() != null) {
            operation.add(ctx.K_EXISTS().getSymbol().getText());
        }
        expr_print.setOperation(operation);

        if (ctx.select_stmt() != null) {
            expr_print.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
        }

        return expr_print;

    }

    @Override
    public UnaryOperator visitUnary_operator(SQLParser.Unary_operatorContext ctx) {
        UnaryOperator unaryOperator = new UnaryOperator();


        if (ctx.K_NOT() != null) {
            unaryOperator.setNot(ctx.K_NOT().getSymbol().getText());
        }

        if (ctx.MINUS() != null) {
            unaryOperator.setMinus(ctx.MINUS().getSymbol().getText());
        }

        if (ctx.PLUS() != null) {
            unaryOperator.setPlus(ctx.PLUS().getSymbol().getText());
        }

        if (ctx.TILDE() != null) {
            unaryOperator.setTilde(ctx.TILDE().getSymbol().getText());
        }

        return unaryOperator;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ResultColumn visitResult_column(SQLParser.Result_columnContext ctx) {
//        System.out.println("visitResult_column");


        ResultColumn resultColumn = new ResultColumn();


        if (ctx.expr() != null) {

            resultColumn.setExpr(visitExpr(ctx.expr()));

        }
        if (ctx.table_name() != null) {
            resultColumn.setTableName(ctx.table_name().any_name().getText());




        }
        if (ctx.column_alias() != null) {
            resultColumn.setColumnAlias(ctx.getText());
        }
        if (ctx.STAR() != null) {

            resultColumn.setStar(ctx.STAR().getSymbol().getText());
        }

        return resultColumn;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public TableOrSubQuery visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {


        Type symbolType = new Type();
        TableOrSubQuery tableOrSubQuery = new TableOrSubQuery();

        if (ctx.database_name() != null) {
            tableOrSubQuery.setDataBaseName(ctx.database_name().any_name().getText());
        }
        if (ctx.table_name() != null) {
            symbolType.setName(ctx.table_name().getText());
            tableOrSubQuery.setTableName(ctx.table_name().any_name().getText());


        }
        if (ctx.table_alias() != null) {
            Symbol tableAliasSymbol = new Symbol();
            tableAliasSymbol.setName(ctx.table_alias().any_name().getText());
            tableAliasSymbol.setScope(Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1));
            tableOrSubQuery.setTableAlias(ctx.table_alias().any_name().getText());
            tableAliasSymbol.setType(symbolType);

            Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1)
                    .addSymbol(tableAliasSymbol.getScope().getId(), tableAliasSymbol);

            Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1)
                    .setSymbol(tableAliasSymbol);
        }

        if (ctx.table_or_subquery() != null) {
            List<TableOrSubQuery> tableOrSubQueries = new ArrayList<>();
            for (int i = 0; i < ctx.table_or_subquery().size(); i++) {
                tableOrSubQueries.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
            }

            tableOrSubQuery.setTableOrSubQueries(tableOrSubQueries);
        }
        if (ctx.index_name() != null) {
            tableOrSubQuery.setIndexName(ctx.index_name().any_name().getText());
        }
        if (ctx.select_stmt() != null) {
            tableOrSubQuery.setSelectOrValues(visitSelect_or_values(ctx.select_stmt().select_or_values()));
        }

        tableOrSubQuery.setLine(ctx.getStart().getLine());
        tableOrSubQuery.setCol(ctx.getStart().getCharPositionInLine()); //

        return tableOrSubQuery;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitColumn_alias(SQLParser.Column_aliasContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitColumn_name(SQLParser.Column_nameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitTable_name(SQLParser.Table_nameContext ctx) {
        System.out.println(ctx.any_name().IDENTIFIER().getText());
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitDatabase_name(SQLParser.Database_nameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitCollation_name(SQLParser.Collation_nameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public LiteralValue visitLiteral_value(SQLParser.Literal_valueContext ctx) {
        LiteralValue literalValue = new LiteralValue();


        if (ctx.K_CURRENT_TIMESTAMP() != null) {

            literalValue.setCurrentTimeStamp(ctx.K_CURRENT_TIMESTAMP().getSymbol().getText());
        }
        if (ctx.K_CURRENT_TIME() != null) {

            literalValue.setCurrentTime(ctx.K_CURRENT_TIME().getSymbol().getText());
        }
        if (ctx.K_NULL() != null) {

            literalValue.setNullValue(ctx.K_NULL().getSymbol().getText());
        }
        if (ctx.BLOB_LITERAL() != null) {

            literalValue.setBlobValue(ctx.BLOB_LITERAL().getSymbol().getText());
        }
        if (ctx.NUMERIC_LITERAL() != null) {

            literalValue.setNumericalValue(ctx.NUMERIC_LITERAL().getSymbol().getText());
        }
        if (ctx.K_CURRENT_DATE() != null) {

            literalValue.setCurrentDate(ctx.K_CURRENT_DATE().getSymbol().getText());
        }
        if (ctx.STRING_LITERAL() != null) {
            literalValue.setStringValue(ctx.STRING_LITERAL().getSymbol().getText());
        }
        return literalValue;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public AnyName visitAny_name(SQLParser.Any_nameContext ctx) {
//        System.out.println("anyName");
        AnyName anyName = new AnyName();

        if (ctx.IDENTIFIER() != null) {
//            System.out.println(ctx.IDENTIFIER().getSymbol().getText());

            anyName.setIDENTIFIER(ctx.IDENTIFIER().getSymbol().getText());

            ///////////////
            Type anyNameType = new Type();
            anyNameType.setName(ctx.IDENTIFIER().getSymbol().getText());
            //////////////
        }
        if (ctx.any_name() != null) {

            anyName.setAnyName(visitAny_name(ctx));
        }
//        if (ctx.keyword() != null) {
//            anyName.setKeyword(ctx.keyword().getText());
//        }
        if (ctx.STRING_LITERAL() != null) {

            anyName.setStrinagLiteral(ctx.STRING_LITERAL().getSymbol().getText());
        }
        return anyName;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitKeyword(SQLParser.KeywordContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public DefAllObject visitDef_all(SQLParser.Def_allContext ctx) {
        DefAllObject defAllObject = new DefAllObject();
//        System.out.println("def all");

        if (ctx.def_function() != null) {
            defAllObject.setFunctionDeclarations(visitDef_function(ctx.def_function()));
        }
//        if (ctx.def_function_default_value() != null) {
//            defAllObject.setDef_function_default_value(visitDef_function_default_value(ctx.def_function_default_value()));
//
//        }
//        if (ctx.higher_order_stmt() != null) {
//            defAllObject.setHigherOrderStmt(visitHigher_order_stmt(ctx.higher_order_stmt()));
//        }
//        if (ctx.json_stmt() != null) {
//            defAllObject.setJson_stmt(visitJson_stmt(ctx.json_stmt()));
//        }
        if (ctx.func_argument_list() != null) {
            defAllObject.setFuncArgumentList(visitFunc_argument_list(ctx.func_argument_list()));
        }
        if (ctx.var_get_func() != null) {
            defAllObject.setVar_get_func(visitVar_get_func(ctx.var_get_func()));
        }


        return defAllObject;
    }


//    @Override
//    public DefFunctionDefaultValue visitDef_function_default_value(SQLParser.Def_function_default_valueContext ctx) {
//        DefFunctionDefaultValue defFunctionDefaultValue = new DefFunctionDefaultValue();
//        if (ctx.K_VAR() != null) {
//            List<String> vars = new ArrayList<>();
//            for (int i = 0; i < ctx.K_VAR().size(); i++) {
//                vars.add(ctx.K_VAR(i).getSymbol().getText());
//            }
//            defFunctionDefaultValue.setK_var(vars);
//        }
//        if (ctx.K_FUNCTION() != null) {
//            defFunctionDefaultValue.setK_function(ctx.K_FUNCTION().getSymbol().getText());
//        }
//        if (ctx.any_name() != null) {
//            defFunctionDefaultValue.setAnyName(visitAny_name(ctx.any_name()));
//        }
//        if (ctx.body() != null) {
//            defFunctionDefaultValue.setBody(visitBody(ctx.body()));
//        }
//        if (ctx.expr() != null) {
//            List<Expr> exprs = new ArrayList<>();
//            for (int i = 0; i < ctx.expr().size(); i++) {
//                exprs.add(visitExpr(ctx.expr(i)));
//            }
//            defFunctionDefaultValue.setExprList(exprs);
//        }
//        return defFunctionDefaultValue;
//    }

//    @Override
//    public HigherOrderStmt visitHigher_order_stmt(SQLParser.Higher_order_stmtContext ctx) {
//        HigherOrderStmt higherOrderStmt = new HigherOrderStmt();
//        if (ctx.K_FUNCTION() != null) {
//            higherOrderStmt.setK_function(ctx.K_FUNCTION().getSymbol().getText());
//        }
//        if (ctx.K_RETURN() != null) {
//            higherOrderStmt.setK_return(ctx.K_RETURN().getSymbol().getText());
//        }
//        if (ctx.K_VAR() != null) {
//
//            higherOrderStmt.setK_var(ctx.K_VAR().getSymbol().getText());
//        }
//        if (ctx.ASSIGN() != null) {
//            higherOrderStmt.setAssign(ctx.ASSIGN().getSymbol().getText());
//        }
//        if (ctx.IDENTIFIER() != null) {
//            List<String> identifier = new ArrayList<>();
//            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
//                identifier.add(ctx.IDENTIFIER().get(i).getSymbol().getText());
//            }
//            higherOrderStmt.setIdentifier(identifier);
//        }
//        if (ctx.expr() != null) {
//            higherOrderStmt.setExpr(visitExpr(ctx.expr()));
//        }
//        return higherOrderStmt;
//    }

    @Override
    public FunctionDeclaration visitDef_function(SQLParser.Def_functionContext ctx) {
        Scope funScope = new Scope();
        String funName = ctx.any_name(0).IDENTIFIER().getText();
        funScope.setId("fun_" + funName);
        Main.symbolTable.addScope(funScope);

        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        if (ctx.K_FUNCTION() != null) {
            functionDeclaration.setK_function(ctx.K_FUNCTION().getSymbol().getText());
        }
        if (ctx.any_name() != null) {
            List<AnyName> anyNames = new ArrayList<>();
            for (int i = 0; i < ctx.any_name().size(); i++) {
                anyNames.add(visitAny_name(ctx.any_name(i)));

                // symbol table
                if (i != 0) { // 0 for func name
                    Symbol symbol = new Symbol();
                    String paramName = ctx.any_name(i).IDENTIFIER().getText();
                    symbol.setName(paramName);
                    symbol.setIsParam(true);
                    Scope currentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);
                    currentScope.addSymbol(paramName, symbol);
                    currentScope.setSymbol(symbol);
                }
                // end
            }
            functionDeclaration.setAnyNames(anyNames);
        }
        if (ctx.body() != null) {
            functionDeclaration.setBody(visitBody(ctx.body()));

            for (Scope scope : Main.symbolTable.getScopes()) {
                System.out.println("scope: "+scope.getId());
            }
        }

        return functionDeclaration;
    }

    @Override
    public JoinClause visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        JoinClause joinClause = new JoinClause();
//        System.out.println("Join_clause");
        if (ctx.table_or_subquery() != null) {
            List<TableOrSubQuery> tableOrSubQueries = new ArrayList<>();
            for (int i = 0; i < ctx.table_or_subquery().size(); i++) {
                tableOrSubQueries.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
            }
            joinClause.setTableOrSubQuery(tableOrSubQueries);
        }
        if (ctx.join_constraint() != null) {
            List<JoinConstraint> joinConstraints = new ArrayList<>();
            for (int i = 0; i < ctx.join_constraint().size(); i++) {

                joinConstraints.add(visitJoin_constraint(ctx.join_constraint(i)));
            }
            joinClause.setJoinConstraint(joinConstraints);
        }
        if (ctx.join_operator() != null) {
            List<JoinOperator> joinOperator = new ArrayList<>();
            for (int i = 0; i < ctx.join_operator().size(); i++) {

                joinOperator.add(visitJoin_operator(ctx.join_operator(i)));
            }
            joinClause.setJoinOperator(joinOperator);
        }

        return joinClause;

    }

    ;


    @Override
    public JoinOperator visitJoin_operator(SQLParser.Join_operatorContext ctx) {
        JoinOperator joinOperator = new JoinOperator();
        if (ctx.K_JOIN() != null) {
            joinOperator.setJoin(ctx.K_JOIN().getSymbol().getText());
        }
        if (ctx.K_LEFT() != null) {
            joinOperator.setLeft(ctx.K_LEFT().getSymbol().getText());
        }
        if (ctx.K_OUTER() != null) {
            joinOperator.setOuter(ctx.K_OUTER().getSymbol().getText());
        }
        if (ctx.K_INNER() != null) {
            joinOperator.setInner(ctx.K_INNER().getSymbol().getText());
        }
        return joinOperator;
    }

    ;

    @Override
    public JoinConstraint visitJoin_constraint(SQLParser.Join_constraintContext ctx) {
//        System.out.println("joinConstraint");
        JoinConstraint joinConstraint = new JoinConstraint();
        if (ctx.expr() != null) {
            joinConstraint.setExpr(visitExpr(ctx.expr()));
        }
        if (ctx.K_ON() != null) {
            joinConstraint.setName(ctx.K_ON().getSymbol().getText());

        }
        return joinConstraint;

    }

    ;

    @Override
    public CreateStmt visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {
        Type tableType = new Type();
        Main.rightType = tableType;
        Main.rightType.setName(ctx.table_name().any_name().IDENTIFIER().getText());

        Main.symbolTable.getDeclaredTypes().add(tableType);

        CreateStmt createStmt = new CreateStmt();

        if (ctx.database_name() != null) {
            createStmt.setDataBaseName(ctx.database_name().any_name().getText());
        }
        if (ctx.table_constraint() != null) {
            List<TableConstraint> tableConstraints = new ArrayList<>();
            for (int i = 0; i < ctx.table_constraint().size(); i++) {

                tableConstraints.add(visitTable_constraint(ctx.table_constraint(i)));
            }
            createStmt.setTableConstraints(tableConstraints);
        }
//        if (ctx.K_AS() != null) {
//            createStmt.setAS(ctx.K_AS().getSymbol().getText());
//        }
//        if (ctx.select_stmt() != null) {
//            createStmt.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
//        }
        if (ctx.table_name() != null) {
            createStmt.setTableName(ctx.table_name().any_name().getText());
        }

        if (ctx.column_def() != null) {
            List<ColumnDef> columnDefs1 = new ArrayList<>();
            for (int i = 0; i < ctx.column_def().size(); i++) {
                columnDefs1.add(visitColumn_def(ctx.column_def(i)));
            }
            createStmt.setColumnDefList(columnDefs1);

        }

        return createStmt;
    }

//    @Override
//    public AlterTableStmt visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx) {
//        AlterTableStmt alterTableStmt = new AlterTableStmt();
//        if (ctx.source_table_name() != null) {
//            alterTableStmt.setAlterTableName(ctx.source_table_name().any_name().getText());
//        }
//
//        if (ctx.K_RENAME() != null) {
//            alterTableStmt.setRenameTo(ctx.K_RENAME().getSymbol().getText() + "" + ctx.K_TO().getSymbol().getText());
//        }
//        if (ctx.new_table_name() != null) {
//            alterTableStmt.setNewTableName(ctx.new_table_name().any_name().getText());
//        }
//        if (ctx.column_def() != null) {
//            alterTableStmt.setColumnDef(visitColumn_def(ctx.column_def()));
//        }
//        if (ctx.alter_table_add() != null) {
//            alterTableStmt.setAlterTableAdd(visitAlter_table_add(ctx.alter_table_add()));
//        }
//        if (ctx.alter_table_add_constraint() != null) {
//            alterTableStmt.setAlterTableAddConstraint(visitAlter_table_add_constraint(ctx.alter_table_add_constraint()));
//        }
//        if (ctx.database_name() != null) {
//            alterTableStmt.setDataBaseName(ctx.database_name().any_name().getText());
//        }
//
//        return alterTableStmt;
//    }

    @Override
    public Object visitSource_table_name(SQLParser.Source_table_nameContext ctx) {
        return super.visitSource_table_name(ctx);
    }

//    @Override
//    public AlterTableAdd visitAlter_table_add(SQLParser.Alter_table_addContext ctx) {
//        AlterTableAdd alterTableAdd = new AlterTableAdd();
//        if (ctx.table_constraint() != null) {
//
//            alterTableAdd.setTableConstraint(visitTable_constraint(ctx.table_constraint()));
//        }
//        if (ctx.K_ADD() != null) {
//            alterTableAdd.setAdd(ctx.K_ADD().getSymbol().getText());
//        }
//        return alterTableAdd;
//    }
//
//    @Override
//    public AlterTableAddConstraint visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx) {
//        AlterTableAddConstraint alterTableAddConstraint = new AlterTableAddConstraint();
//        if (ctx.table_constraint() != null) {
//            alterTableAddConstraint.setTableConstraint(visitTable_constraint(ctx.table_constraint()));
//
//        }
//        if (ctx.any_name() != null) {
//
//            alterTableAddConstraint.setName(ctx.any_name().getText());
//        }
//        if (ctx.K_ADD() != null) {
//            alterTableAddConstraint.setAdd(ctx.K_ADD().getSymbol().getText());
//        }
//        if (ctx.K_CONSTRAINT() != null) {
//            alterTableAddConstraint.setConstraint(ctx.K_CONSTRAINT().getSymbol().getText());
//        }
//        return alterTableAddConstraint;
//    }

    @Override
    public TableConstraint visitTable_constraint(SQLParser.Table_constraintContext ctx) {
        TableConstraint tableConstraint = new TableConstraint();
        if (ctx.name() != null) {
            tableConstraint.setName(ctx.name().any_name().getText());
        }
        if (ctx.table_constraint_primary_key() != null) {
            tableConstraint.setTableConstraintPrimaryKey(visitTable_constraint_primary_key(ctx.table_constraint_primary_key()));
        }
        if (ctx.table_constraint_foreign_key() != null) {
            tableConstraint.setForeignKeys(visitTable_constraint_foreign_key(ctx.table_constraint_foreign_key()));
        }
        if (ctx.table_constraint_key() != null) {
            tableConstraint.setTableConstraintKey(visitTable_constraint_key(ctx.table_constraint_key()));
        }
        if (ctx.table_constraint_unique() != null) {
            tableConstraint.setTableConstraintUnique(visitTable_constraint_unique(ctx.table_constraint_unique()));
        }
        if (ctx.K_CHECK() != null) {
            tableConstraint.setCheckExpr(ctx.K_CHECK().getSymbol().getText());
        }
        if (ctx.expr() != null) {
            tableConstraint.setExpr(visitExpr(ctx.expr()));
        }

        return tableConstraint;
    }

    @Override
    public ForeignKey visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx) {
        ForeignKey foreignKey = new ForeignKey();
        if (ctx.K_KEY() != null && ctx.K_FOREIGN() != null) {
            foreignKey.setName(ctx.K_FOREIGN().getSymbol().getText() + "" + ctx.K_KEY().getSymbol().getText());
        }
        if (ctx.foreign_key_clause() != null) {
            foreignKey.setForeignKeyClause(visitForeign_key_clause(ctx.foreign_key_clause()));
        }
        if (ctx.fk_origin_column_name() != null) {
            List<String> fk_originColumnName = new ArrayList<>();
            for (int i = 0; i < ctx.fk_origin_column_name().size(); i++) {
                fk_originColumnName.add(ctx.fk_origin_column_name(i).column_name().any_name().getText());
            }
            foreignKey.setFkOriginColumnName(fk_originColumnName);
        }
        return foreignKey;
    }

    @Override
    public ForeignKeyClause visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx) {
        ForeignKeyClause foreignKeyClause = new ForeignKeyClause();
        if (ctx.database_name() != null) {
            foreignKeyClause.setDatabaseName(ctx.database_name().any_name().getText());
        }
        if (ctx.fk_target_column_name() != null) {
            List<String> FkTargetColumnName = new ArrayList<>();
            for (int i = 0; i < ctx.fk_target_column_name().size(); i++) {
                FkTargetColumnName.add(ctx.fk_target_column_name(i).name().getText());
            }
            foreignKeyClause.setFkTargetColumnName(FkTargetColumnName);
        }
        return foreignKeyClause;
    }

    @Override
    public TableConstraintKey visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx) {
        TableConstraintKey tableConstraintKey = new TableConstraintKey();
        if (ctx.name() != null) {
            tableConstraintKey.setName(ctx.name().any_name().getText());
        }
        if (ctx.indexed_column() != null) {
            List<IndexedColumn> indexedColumns = new ArrayList<>();
            for (int i = 0; i < ctx.indexed_column().size(); i++) {
                indexedColumns.add(visitIndexed_column(ctx.indexed_column(i)));
            }
            tableConstraintKey.setIndexedColumn(indexedColumns);
        }
        return tableConstraintKey;
    }

    @Override
    public IndexedColumn visitIndexed_column(SQLParser.Indexed_columnContext ctx) {
        IndexedColumn indexedColumn = new IndexedColumn();
        if (ctx.collation_name() != null) {
            indexedColumn.setCollationName(ctx.collation_name().any_name().getText());
        }
        if (ctx.column_name() != null) {
            indexedColumn.setColumnName(ctx.column_name().any_name().getText());
        }
        if (ctx.K_ASC() != null) {
            indexedColumn.setASC(ctx.K_ASC().getSymbol().getText());
        }
        if (ctx.K_COLLATE() != null) {
            indexedColumn.setCOLLATE(ctx.K_COLLATE().getSymbol().getText());
        }
        if (ctx.K_DESC() != null) {
            indexedColumn.setDESC(ctx.K_DESC().getSymbol().getText());
        }
        return indexedColumn;
    }

    @Override
    public PrimaryKey visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx) {

        PrimaryKey primaryKey = new PrimaryKey();
        if (ctx.K_KEY() != null && ctx.K_PRIMARY() != null) {
            primaryKey.setName(ctx.K_PRIMARY().getSymbol().getText() + " " + ctx.K_KEY().getSymbol().getText());
        }
        if (ctx.indexed_column() != null) {
            List<IndexedColumn> indexedColumns = new ArrayList<>();
            for (int i = 0; i < ctx.indexed_column().size(); i++) {
                indexedColumns.add(visitIndexed_column(ctx.indexed_column(i)));
            }
            primaryKey.setIndexedColumn(indexedColumns);
        }

        return primaryKey;
    }

    @Override
    public TableConstraintUnique visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx) {
        TableConstraintUnique tableConstraintUnique = new TableConstraintUnique();

        if (ctx.K_UNIQUE() != null) {
            tableConstraintUnique.setUNIQUE(ctx.K_UNIQUE().getSymbol().getText());
        }
        if (ctx.K_KEY() != null) {
            tableConstraintUnique.setKEY(ctx.K_KEY().getSymbol().getText());
        }
        if (ctx.name() != null) {
            tableConstraintUnique.setName(ctx.name().any_name().getText());
        }
        if (ctx.indexed_column() != null) {
            List<IndexedColumn> indexedColumns = new ArrayList<>();
            for (int i = 0; i < ctx.indexed_column().size(); i++) {
                indexedColumns.add(visitIndexed_column(ctx.indexed_column(i)));
            }
            tableConstraintUnique.setIndexedColumn(indexedColumns);
        }
        return tableConstraintUnique;
    }

    @Override
    public ColumnDef visitColumn_def(SQLParser.Column_defContext ctx) {
        ColumnDef columnDef = new ColumnDef();

        Type columnType = new Type();


//        System.out.println("visitColumn_def " + Main.rightType.getName());

        if (ctx.column_name() != null) {
            columnDef.setColumnName(ctx.column_name().getText());

        }

        if (ctx.column_constraint() != null) {
            List<ColumnConstraint> columnConstraints1 = new ArrayList<>();
            for (int i = 0; i < ctx.column_constraint().size(); i++) {
                columnConstraints1.add(visitColumn_constraint(ctx.column_constraint(i)));
            }
            columnDef.setColumnConstraint(columnConstraints1);
        }
        if (ctx.type_name() != null) {
            List<TypeName> typeNames = new ArrayList<>();
            for (int i = 0; i < ctx.type_name().size(); i++) {

                typeNames.add(visitType_name(ctx.type_name(i)));
            }
            columnDef.setTypeName(typeNames);
            columnType.setName(ctx.type_name().get(0).name().any_name().getText());
        }
        if(Main.rightType.getColumns().containsKey(ctx.column_name().getText())){
            System.err.println("duplicate column "+ ctx.column_name().getText() +" in " + Main.rightType.getName() + " line " +ctx.getStart().getLine());
        }
        Main.rightType.getColumns().put(ctx.column_name().getText(), columnType);
        return columnDef;
    }


    @Override
    public TypeName visitType_name(SQLParser.Type_nameContext ctx) {



        TypeName typeName = new TypeName();
        if (ctx.name() != null) {
            typeName.setName(ctx.name().any_name().getText());
        }

        if (ctx.any_name() != null) {
            List<AnyName> anyNames = new ArrayList<>();
            for (int i = 0; i < ctx.any_name().size(); i++) {
                anyNames.add(visitAny_name(ctx.any_name(i)));
            }
            typeName.setAnyNames(anyNames);
        }
        if (ctx.signed_number() != null) {
            List<SignedNumber> signedNumbers = new ArrayList<>();
            for (int i = 0; i < ctx.signed_number().size(); i++) {
                signedNumbers.add(visitSigned_number(ctx.signed_number(i)));

            }
            typeName.setSignedNumbers(signedNumbers);
        }


        return typeName;
    }


    @Override
    public SignedNumber visitSigned_number(SQLParser.Signed_numberContext ctx) {
        SignedNumber signedNumber = new SignedNumber();
        if (ctx.PLUS() != null) {
            signedNumber.setPlus(ctx.PLUS().getSymbol().getText());
        }
        if (ctx.MINUS() != null) {
            signedNumber.setMinus(ctx.MINUS().getSymbol().getText());
        }
        if (ctx.STAR() != null) {
            signedNumber.setStar(ctx.STAR().getSymbol().getText());
        }
        if (ctx.NUMERIC_LITERAL() != null) {
            signedNumber.setNumericLiteral(ctx.NUMERIC_LITERAL().getSymbol().getText());
        }

        return signedNumber;
    }

    @Override
    public ColumnConstraint visitColumn_constraint(SQLParser.Column_constraintContext ctx) {
        ColumnConstraint columnConstraint = new ColumnConstraint();
        if (ctx.column_constraint_foreign_key() != null) {
            columnConstraint.setColumnForeignKey(visitColumn_constraint_foreign_key(ctx.column_constraint_foreign_key()));
        }
        if (ctx.column_constraint_primary_key() != null) {
            columnConstraint.setColumnPrimaryKey(visitColumn_constraint_primary_key(ctx.column_constraint_primary_key()));
        }
        if (ctx.column_constraint_not_null() != null) {
            columnConstraint.setColumnNotNull(visitColumn_constraint_not_null(ctx.column_constraint_not_null()));
        }
        if (ctx.column_constraint_null() != null) {
            columnConstraint.setColumnNull(visitColumn_constraint_null(ctx.column_constraint_null()));
        }
        return columnConstraint;
    }

    @Override
    public ColumnForeignKey visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx) {
        ColumnForeignKey columnForeignKey = new ColumnForeignKey();
        if (ctx.foreign_key_clause() != null) {
            columnForeignKey.setForeignKeyClause(visitForeign_key_clause(ctx.foreign_key_clause()));
        }
        return columnForeignKey;
    }

    @Override
    public ColumnPrimaryKey visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx) {
        ColumnPrimaryKey columnPrimaryKey = new ColumnPrimaryKey();
        if (ctx.K_PRIMARY() != null) {
            columnPrimaryKey.setPRIMARY(ctx.K_PRIMARY().getSymbol().getText());
        }
        if (ctx.K_KEY() != null) {
            columnPrimaryKey.setKEY(ctx.K_KEY().getSymbol().getText());
        }
        if (ctx.K_ASC() != null) {
            columnPrimaryKey.setASC(ctx.K_ASC().getSymbol().getText());
        }
        if (ctx.K_DESC() != null) {
            columnPrimaryKey.setDESC(ctx.K_DESC().getSymbol().getText());
        }
        if (ctx.K_AUTOINCREMENT() != null) {
            columnPrimaryKey.setAUTOINCREMENT(ctx.K_AUTOINCREMENT().getSymbol().getText());
        }


        return columnPrimaryKey;
    }

    @Override
    public ColumnNotNull visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx) {
        ColumnNotNull columnNotNull = new ColumnNotNull();
        if (ctx.K_NOT() != null) {
            columnNotNull.setNot(ctx.K_NOT().getSymbol().getText());
        }
        if (ctx.K_NULL() != null) {
            columnNotNull.setNull(ctx.K_NULL().getSymbol().getText());
        }
        return columnNotNull;
    }

    @Override
    public ColumnNull visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx) {
        ColumnNull columnNull = new ColumnNull();
        if (ctx.K_NULL() != null) {
            columnNull.setNull(ctx.K_NULL().getSymbol().getText());
        }
        return columnNull;
    }

//    @Override
//    public InsertStmt visitInsert_stmt(SQLParser.Insert_stmtContext ctx) {
//        InsertStmt insertStmt = new InsertStmt();
//        if (ctx.database_name() != null) {
//            insertStmt.setDatabaseName(ctx.database_name().any_name().getText());
//        }
//        if (ctx.table_name() != null) {
//            insertStmt.setTableName(ctx.table_name().any_name().getText());
//        }
//        if (ctx.column_name() != null) {
//            List<String> columName = new ArrayList<>();
//            for (int i = 0; i < ctx.column_name().size(); i++) {
//                columName.add(ctx.column_name(i).any_name().getText());
//            }
//            insertStmt.setColumnName(columName);
//        }
//        if (ctx.expr() != null) {
//            List<Expr> exprs = new ArrayList<>();
//            for (int i = 0; i < ctx.expr().size(); i++) {
//                exprs.add(visitExpr(ctx.expr(i)));
//            }
//            insertStmt.setExprs(exprs);
//        }
//        if (ctx.select_stmt() != null) {
//            insertStmt.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
//        }
//        if (ctx.K_VALUES() != null) {
//            insertStmt.setValues(ctx.K_VALUES().getSymbol().getText());
//        }
//        return insertStmt;
//    }

//
//    @Override
//    public DropStmt visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx) {
//        DropStmt dropStmt = new DropStmt();
//        if (ctx.database_name() != null) {
//            dropStmt.setDataBaseName(ctx.database_name().any_name().getText());
//        }
//        if (ctx.table_name() != null) {
//
//            dropStmt.setTableName(ctx.table_name().any_name().getText());
//        }
//        return dropStmt;
//    }
//
//    @Override
//    public DeleteStmt visitDelete_stmt(SQLParser.Delete_stmtContext ctx) {
//        DeleteStmt deleteStmt = new DeleteStmt();
//        if (ctx.expr() != null) {
//
//            deleteStmt.setExpr(visitExpr(ctx.expr()));
//        }
//        if (ctx.qualified_table_name() != null) {
//            deleteStmt.setQualifiedTableName(visitQualified_table_name(ctx.qualified_table_name()));
//        }
//        if (ctx.K_WHERE() != null) {
//            deleteStmt.setWhere(ctx.K_WHERE().getSymbol().getText());
//        }
//        return deleteStmt;
//    }

    @Override
    public QualifiedTableName visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx) {
        QualifiedTableName qualifiedTableName = new QualifiedTableName();
        if (ctx.database_name() != null) {
            qualifiedTableName.setDataBaseName(ctx.database_name().any_name().getText());
        }
        qualifiedTableName.setTableName(ctx.table_name().any_name().getText());
        if (ctx.index_name() != null) {
            qualifiedTableName.setIndexName(ctx.index_name().any_name().getText());
        }
        return qualifiedTableName;
    }

//    @Override
//    public UpdateStmt visitUpdate_stmt(SQLParser.Update_stmtContext ctx) {
//        UpdateStmt updateStmt = new UpdateStmt();
//        updateStmt.setQualifiedTableName(visitQualified_table_name(ctx.qualified_table_name()));
//        List<String> columnName = new ArrayList<>();
//        for (int i = 0; i < ctx.column_name().size(); i++) {
//            columnName.add(ctx.column_name(i).any_name().getText());
//
//            updateStmt.setColumnName(columnName);
//        }
//
//        if (ctx.expr() != null) {
//            List<Expr> exprs = new ArrayList<>();
//            for (int i = 0; i < ctx.expr().size(); i++) {
//                exprs.add(visitExpr(ctx.expr(i)));
//            }
//            updateStmt.setExpr(exprs);
//        }
//
//        return updateStmt;
//    }
//

    @Override
    public SelectCore visitSelect_core(SQLParser.Select_coreContext ctx) {

        Scope selectScope = new Scope();
        selectScope.setId("select_core" + Main.symbolTable.getScopes().size() + 1);

        if (!Main.symbolTable.getScopes().isEmpty()) {
            selectScope.setParent(Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1));
        }
        Main.symbolTable.getScopes().add(selectScope);

//        System.out.println("visitSelect_core");
        SelectCore selectCore = new SelectCore();

        selectCore.setScope(selectScope);
        if (ctx.join_clause() != null) {

            selectCore.setJoinClause(visitJoin_clause(ctx.join_clause()));

        }

        if (ctx.result_column() != null) {
            List<ResultColumn> resultColumns = new ArrayList<>();
            for (int i = 0; i < ctx.result_column().size(); i++) {
                resultColumns.add(visitResult_column(ctx.result_column(i)));
            }
            selectCore.setResultColumnList(resultColumns);
        }

        if (ctx.table_or_subquery() != null) {
            List<TableOrSubQuery> tableOrSubQueries = new ArrayList<>();
            for (int i = 0; i < ctx.table_or_subquery().size(); i++) {

                tableOrSubQueries.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
            }
            selectCore.setTableOrSubQueries(tableOrSubQueries);
        }

        if (ctx.K_FROM() != null) {
            selectCore.setFrom(ctx.K_FROM().getSymbol().getText());
        }
        if (ctx.K_ALL() != null) {
            selectCore.setAll(ctx.K_ALL().getSymbol().getText());
        }

        if (ctx.K_DISTINCT() != null) {
            selectCore.setDISTINCT(ctx.K_DISTINCT().getSymbol().getText());
        }
        if(ctx.groupBy() != null){

        }
        if (ctx.having() != null) {

            selectCore.setHAVING(visitHaving(ctx.having()));
        }

        if (ctx.K_SELECT() != null) {
            selectCore.setSELECT(ctx.K_SELECT().getSymbol().getText());
        }
        if (ctx.K_VALUES() != null) {
            selectCore.setVALUES(ctx.K_VALUES().getSymbol().getText());
        }
        if (ctx.K_WHERE() != null) {
            selectCore.setWhere(ctx.K_WHERE().getSymbol().getText());
        }
        if (ctx.expr() != null) {
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                exprs.add(visitExpr(ctx.expr(i)));
            }
            selectCore.setExprs(exprs);
        }


        selectCore.setLine(ctx.getStart().getLine()); //get line number
        selectCore.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return selectCore;
    }
////////////////////////////////////////////////////////////////////////////////////


    @Override
    public GroupBy visitGroupBy(SQLParser.GroupByContext ctx) {
        GroupBy groupBy = new GroupBy();

        if (ctx.K_BY() != null) {
            groupBy.setBy(ctx.K_BY().getSymbol().getText());
        }
        if (ctx.K_GROUP() != null) {
            groupBy.setGROUP(ctx.K_GROUP().getSymbol().getText());
        }
        if (ctx.expr() != null) {
            groupBy.setExpr(visitExpr(ctx.expr()));
        }
        return groupBy;
    }

    @Override
    public Having visitHaving(SQLParser.HavingContext ctx) {
        Having having = new Having();
        if (ctx.K_HAVING() != null) {
            having.setK_Having(ctx.K_HAVING().getSymbol().getText());
        }
        if(ctx.expr() != null ){
            having.setExpr(visitExpr(ctx.expr()));
        }
        return having;
    }

    // body
    @Override
    public Body visitBody(SQLParser.BodyContext ctx) {
        Scope parentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);

        Body body = new Body();
        if (ctx.var_init() != null) {
            List<VarInit> varInits = new ArrayList<>();
            for (int i = 0; i < ctx.var_init().size(); i++) {
                varInits.add(visitVar_init(ctx.var_init(i)));
            }
            body.setVarInits(varInits);
        }
        // if into body
        if (ctx.if_stmt() != null) {
            List<If_stmt> if_stmts = new ArrayList<>();
            for (int i = 0; i < ctx.if_stmt().size(); i++) {
                Scope ifScope = new Scope();
                ifScope.setId("Parent_" + parentScope.getId() + "_If_" + i);
                ifScope.setParent(parentScope);
                Main.symbolTable.addScope(ifScope);

                if_stmts.add(visitIf_stmt(ctx.if_stmt(i)));

            }
            body.setif_stmt(if_stmts);
        }

        // while_stmt into body
        if (ctx.while_stmt() != null) {
            List<While_stmt> while_stmts = new ArrayList<>();
            for (int i = 0; i < ctx.while_stmt().size(); i++) {
                Scope whileScope = new Scope();
                whileScope.setId("Parent_" + parentScope.getId() + "_While_" + i);
                whileScope.setParent(parentScope);
                Main.symbolTable.addScope(whileScope);

                while_stmts.add(visitWhile_stmt(ctx.while_stmt(i)));
            }
            body.setwhile_stmt(while_stmts);
        }
        // for_stmt into body
        if (ctx.for_stmt() != null) {
            List<For_stmt> for_stmts = new ArrayList<>();
            for (int i = 0; i < ctx.for_stmt().size(); i++) {
                Scope forScope = new Scope();
                forScope.setId("Parent_" + parentScope.getId() + "_For_" + i);
                forScope.setParent(parentScope);
                Main.symbolTable.addScope(forScope);

                for_stmts.add(visitFor_stmt(ctx.for_stmt(i)));
            }
            body.setfor_stmt(for_stmts);
        }
        // do_while_stmt into body
        if (ctx.do_while_stmt() != null) {
            List<Do_while_stmt> do_while_stmts = new ArrayList<>();
            for (int i = 0; i < ctx.do_while_stmt().size(); i++) {
                Scope forScope = new Scope();
                forScope.setId("Parent_" + parentScope.getId() + "_DoWhile_" + i);
                forScope.setParent(parentScope);
                Main.symbolTable.addScope(forScope);

                do_while_stmts.add(visitDo_while_stmt(ctx.do_while_stmt(i)));
            }
            body.setdo_while_stmt(do_while_stmts);
        }

        // Switch_stmt
        if (ctx.switch_stmt() != null) {
            List<Switch_stmt> switch_stmts = new ArrayList<>();
            for (int i = 0; i < ctx.switch_stmt().size(); i++) {
                Scope forScope = new Scope();
                forScope.setId("Parent_" + parentScope.getId() + "_Switch_" + i);
                forScope.setParent(parentScope);
                Main.symbolTable.addScope(forScope);

                switch_stmts.add(visitSwitch_stmt(ctx.switch_stmt(i)));
            }
            body.setSwitch_stmt(switch_stmts);
        }

        // def_print_stmt
        if (ctx.def_print_stmt() != null) {
            List<Def_print_stmt> def_print_stmts = new ArrayList<>();
            for (int i = 0; i < ctx.def_print_stmt().size(); i++) {
                def_print_stmts.add(visitDef_print_stmt(ctx.def_print_stmt(i)));
            }
            body.setDef_print_stmt(def_print_stmts);
        }
//        // Array_stmt
//        if (ctx.array_stmt() != null) {
//            List<Array_stmt> array_stmts = new ArrayList<>();
//            for (int i = 0; i < ctx.array_stmt().size(); i++) {
//                array_stmts.add(visitArray_stmt(ctx.array_stmt(i)));
//            }
//            body.setArray_stmt(array_stmts);
//        }

        // Inline_condition_stmt
        if (ctx.inline_condition_stmt() != null) {
            List<Inline_condition_stmt> inline_condition_stmts = new ArrayList<>();
            for (int i = 0; i < ctx.inline_condition_stmt().size(); i++) {
                inline_condition_stmts.add(visitInline_condition_stmt(ctx.inline_condition_stmt(i)));
            }
            body.setInline_condition_stmt(inline_condition_stmts);
        }

        // sql_statment
        if (ctx.sql_stmt_list() != null) {

            for (int i = 0; i < ctx.sql_stmt_list().size(); i++) {
                body.setStatements(visitSql_stmt_list(ctx.sql_stmt_list(i)));
            }
        }


        //var_get_func
        if (ctx.var_get_func() != null) {
            List<Var_get_func> var_get_funcs = new ArrayList<>();
            for (int i = 0; i < ctx.var_get_func().size(); i++) {
                var_get_funcs.add(visitVar_get_func(ctx.var_get_func().get(i)));
            }
            body.setVar_get_func(var_get_funcs);
        }

        //Func_argument_list
        if (ctx.func_argument_list() != null) {
            List<Func_argument_list> func_argument_lists = new ArrayList<>();
            for (int i = 0; i < ctx.func_argument_list().size(); i++) {
                func_argument_lists.add(visitFunc_argument_list(ctx.func_argument_list().get(i)));
            }
            body.setfunc_argument_list(func_argument_lists);
        }

//        //call_json
//        if (ctx.call_json() != null) {
//            List<Call_json> call_jsons = new ArrayList<>();
//            for (int i = 0; i < ctx.call_json().size(); i++) {
//                call_jsons.add(visitCall_json(ctx.call_json().get(i)));
//            }
//            body.setcall_json(call_jsons);
//        }
//
//        //edit json
//        if (ctx.edit_json() != null) {
//            List<Edit_json> edit_jsons = new ArrayList<>();
//            for (int i = 0; i < ctx.edit_json().size(); i++) {
//                edit_jsons.add(visitEdit_json(ctx.edit_json().get(i)));
//            }
//            body.setedit_json(edit_jsons);
//        }

        //var_operator
        if (ctx.var_operator() != null) {
            List<Var_operator> var_operators = new ArrayList<>();
            for (int i = 0; i < ctx.var_operator().size(); i++) {
                var_operators.add(visitVar_operator(ctx.var_operator().get(i)));
            }
            body.setvar_operator(var_operators);
        }

//        // var json_stmt
//        if (ctx.json_stmt() != null) {
//            List<Json_stmt> json_stmts = new ArrayList<>();
//            for (int i = 0; i < ctx.json_stmt().size(); i++) {
//                json_stmts.add(visitJson_stmt(ctx.json_stmt().get(i)));
//            }
//            body.setJson_stmt(json_stmts);
//
//        }
        if (ctx.return_stmt() != null) {
            body.setReturnStmt(visitReturn_stmt(ctx.return_stmt()));
        }

        return body;
    }

    @Override
    public ReturnStmt visitReturn_stmt(SQLParser.Return_stmtContext ctx) {
        ReturnStmt returnStmt = new ReturnStmt();
        if (ctx.expr() != null) {
            returnStmt.setExpr(visitExpr(ctx.expr()));
        }
        if (ctx.var_operator() != null) {
            returnStmt.setVar_operator(visitVar_operator(ctx.var_operator()));
        }
        if (ctx.K_RETURN() != null) {
            returnStmt.setK_return(ctx.K_RETURN().getSymbol().getText());
        }
        if (ctx.inline_condition_stmt() != null) {
            returnStmt.setInline_condition_stmt(visitInline_condition_stmt(ctx.inline_condition_stmt()));
        }
        return returnStmt;
    }

    // varinti


    @Override
    public VarInit visitVar_init(SQLParser.Var_initContext ctx) {
        VarInit varInit = new VarInit();

        // symbol table
        Symbol varSymbol = new Symbol();
        String varName = visitAny_name(ctx.any_name()).getIDENTIFIER();
        Scope parentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);
        Type type = new Type();
        // end

        if (ctx.K_VAR() != null) {
            varInit.setK_var(ctx.K_VAR().getSymbol().getText());
        }
        if (ctx.any_name() != null) {
            varInit.setAnyName(visitAny_name(ctx.any_name()));
        }

        if (ctx.ASSIGN() != null) {
            varInit.setAssign(ctx.ASSIGN().getSymbol().getText());
        }
        if (ctx.expr() != null) {
            // symbol table
            Expr expr = visitExpr(ctx.expr());
            String typeName = "";
            if (expr.getLiteralValue().getNumericalValue() != null) {
                typeName = Type.NUMBER_CONST;
            }
            if (expr.getLiteralValue().getStringValue() != null) {
                typeName = Type.STRING_CONST;
            }
            type.setName(typeName);
            varSymbol.setIsParam(false);
            varSymbol.setName(varName);
            varSymbol.setScope(parentScope);
            varSymbol.setType(type);
            parentScope.addSymbol(varName, varSymbol);
            parentScope.setSymbol(varSymbol);
            // end
            varInit.setExpr(expr);
        }

        return varInit;
    }

    // def_print_stmt

    @Override
    public Def_print_stmt visitDef_print_stmt(SQLParser.Def_print_stmtContext ctx) {
        Def_print_stmt def_print_stmt = new Def_print_stmt();
        //print statement
//        System.out.println("def_print_stmt");
        if (ctx.print_body() != null) {
            def_print_stmt.setPrint_body(visitPrint_body(ctx.print_body()));

        }
        if (ctx.K_PRINT() != null) {
            def_print_stmt.setPrint(ctx.K_PRINT().getSymbol().getText());
        }

        return def_print_stmt;
    }

    // print body
    @Override
    public Print_body visitPrint_body(SQLParser.Print_bodyContext ctx) {
        Print_body print_body = new Print_body();
//        if (ctx.call_json() != null) {
//            for (int i = 0; i < ctx.call_json().size(); i++) {
//                print_body.setCall_json(visitCall_json(ctx.call_json().get(i)));
//            }
//        }

        if (ctx.expr_print() != null) {
            List<Expr_Print> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr_print().size(); i++) {
                exprs.add(visitExpr_print(ctx.expr_print(i)));
            }
            print_body.setExpr_prints(exprs);
        }
        return print_body;
    }

//    // call json
//    @Override
//    public Call_json visitCall_json(SQLParser.Call_jsonContext ctx) {
//        Call_json call_json = new Call_json();
//        if (ctx.any_name() != null) {
//            List<AnyName> anyNames = new ArrayList<>();
//            for (int i = 0; i < ctx.any_name().size(); i++) {
//                anyNames.add(visitAny_name(ctx.any_name(i)));
//            }
//            call_json.setAnyName(anyNames);
//        }
//        return call_json;
//    }
//
//    // edit json
//    @Override
//    public Edit_json visitEdit_json(SQLParser.Edit_jsonContext ctx) {
//        Edit_json edit_json = new Edit_json();
//        if (ctx.any_name() != null) {
//            List<AnyName> anyNames = new ArrayList<>();
//            for (int i = 0; i < ctx.any_name().size(); i++) {
//                anyNames.add(visitAny_name(ctx.any_name(i)));
//            }
//            edit_json.setAnyNameList(anyNames);
//
//        }
//        if (ctx.signed_number() != null) {
//            edit_json.setSignedNumber(visitSigned_number(ctx.signed_number()));
//        }
//        if (ctx.expr() != null) {
//            edit_json.setExpr(visitExpr(ctx.expr()));
//        }
//        if (ctx.ASSIGN() != null) {
//            edit_json.setAssin(ctx.ASSIGN().getSymbol().getText());
//        }
//        if (ctx.DOT() != null) {
//            List<String> dot = new ArrayList<>();
//            for (int i = 0; i < ctx.DOT().size(); i++) {
//                dot.add(ctx.DOT().get(i).getSymbol().getText());
//            }
//            edit_json.setDot(dot);
//        }
//        return edit_json;
//    }


    // visit_if
    @Override
    public If_stmt visitIf_stmt(SQLParser.If_stmtContext ctx) {
        Scope parentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);

        If_stmt if_stmt = new If_stmt();

        if_stmt.setParentScope(parentScope);
        List<Else_if> else_ifList = new ArrayList<>();
        Body body = new Body();
        //print statement
        if (ctx.K_IF() != null) {
            if_stmt.setK_if(ctx.K_IF().getSymbol().getText());
        }
        if (ctx.body() != null) {
            if_stmt.setBody_if(visitBody(ctx.body()));
        }
        if (ctx.else_if_stmt() != null) {
            for (int i = 0; i < ctx.else_if_stmt().size(); i++) {
                Scope elseIfScope = new Scope();
                elseIfScope.setId("Parent_" + parentScope.getId() + "_ElseIf_" + i);
                elseIfScope.setParent(parentScope);
                Main.symbolTable.addScope(elseIfScope);

                else_ifList.add(visitElse_if_stmt(ctx.else_if_stmt(i)));
            }
            if_stmt.setElse_ifList(else_ifList);
        }
        if (ctx.else_stmt() != null) {
            Scope elseScope = new Scope();
            elseScope.setId("Parent_" + parentScope.getId() + "_Else");
            elseScope.setParent(parentScope);
            Main.symbolTable.addScope(elseScope);

            if_stmt.setElsee(visitElse_stmt(ctx.else_stmt()));
        }
        if (ctx.expr_if() != null) {
            List<Expr_if> expr_ifs = new ArrayList<>();
            for (int i = 0; i < ctx.expr_if().expr_if().size(); i++) {
                expr_ifs.add(visitExpr_if(ctx.expr_if().expr_if(i)));
            }
            if_stmt.setExpr_ifs(expr_ifs);
        }

        return if_stmt;
    }

    @Override
    public Else_if visitElse_if_stmt(SQLParser.Else_if_stmtContext ctx) {
        // declare all object in if
        Else_if else_if = new Else_if();
        if (ctx.K_IF() != null) {
            else_if.setK_if(ctx.K_IF().getSymbol().getText());
        }
        if (ctx.K_ELSE() != null) {
            else_if.setK_else(ctx.K_ELSE().getSymbol().getText());
        }
        if (ctx.body() != null) {
            else_if.setBody(visitBody(ctx.body()));
        }
        if (ctx.expr_if() != null) {
            else_if.setExpr_if(visitExpr_if(ctx.expr_if()));
        }

        return else_if;
    }

    @Override
    public Else visitElse_stmt(SQLParser.Else_stmtContext ctx) {

        // declare all object in if
        Else elsee = new Else();
        if (ctx.body() != null) {
            elsee.setBody(visitBody(ctx.body()));
        }
        if (ctx.K_ELSE() != null) {
            elsee.setK_else(ctx.K_ELSE().getSymbol().getText());
        }

        return elsee;
    }


    @Override
    public While_stmt visitWhile_stmt(SQLParser.While_stmtContext ctx) {
        Scope parentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);


        // declare all object in if
        While_stmt while_stmt = new While_stmt();
        while_stmt.setParentScope(parentScope);
        if (ctx.body() != null) {
            while_stmt.setBody_while(visitBody(ctx.body()));
        }
        if (ctx.expr_while().expr_while() != null) {
            List<Expr_while> list = new ArrayList<>();
            for (int i = 0; i < ctx.expr_while().expr_while().size(); i++) {
                list.add(visitExpr_while(ctx.expr_while()).getExpr_while().get(i));
            }
            while_stmt.setExpr_whileList(list);
        }
        if (ctx.K_WHILE() != null) {
            while_stmt.setK_while(ctx.K_WHILE().getSymbol().getText());
        }
        return while_stmt;
    }


    @Override
    public For_stmt visitFor_stmt(SQLParser.For_stmtContext ctx) {
        // declare all object in while
        For_stmt for_stmt = new For_stmt();

        if (ctx.body() != null) {
            for_stmt.setBody_for(visitBody(ctx.body()));
        }
        if (ctx.for_rule() != null) {
            for_stmt.setFor_rule(visitFor_rule(ctx.for_rule()));
        }
        if (ctx.foreach_rule() != null) {
            for_stmt.setForeach_rule(visitForeach_rule(ctx.foreach_rule()));
        }
        if (ctx.K_FOR() != null) {
            for_stmt.setK_for(ctx.K_FOR().getSymbol().getText());
        }

        return for_stmt;
    }

    @Override
    public For_rule visitFor_rule(SQLParser.For_ruleContext ctx) {
        // declare for rule
        For_rule for_rule = new For_rule();
        if (ctx.expr_for_and_operator() != null) {
            List<Expr_for_and_operator> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr_for_and_operator().size(); i++) {
                exprs.add(visitExpr_for_and_operator(ctx.expr_for_and_operator(i)));
            }
            for_rule.setExpr_for_and_operators(exprs);
        }

        if (ctx.K_VAR() != null) { // if Var is exist then we must store new var in symbolTable
            for_rule.setK_var(ctx.K_VAR().getSymbol().getText());

            Scope parentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);
            List<Expr_for_and_operator> list = for_rule.getExpr_for_and_operators().get(0).getExpr_for_and_operators();

            Symbol varForSymbol = new Symbol();
            Type varType = new Type();

            for (int i = 0; i < list.size(); i++) {

                if (i == 0) { // 0 is index of (name) of symbol
                    if (list.get(i).getAnyName() != null)
                        varForSymbol.setName(list.get(i).getAnyName().getIDENTIFIER());
                    else if (list.get(i).getLiteralValue() != null) {
                        if (list.get(i).getLiteralValue().getStringValue() != null)
                            varForSymbol.setName(list.get(i).getLiteralValue().getStringValue());
                        else if (list.get(i).getLiteralValue().getNumericalValue() != null)
                            varForSymbol.setName(list.get(i).getLiteralValue().getNullValue());

                    }
                }

                if (i == 1) { // 1 is index of (type) of symbol

                    if (list.get(i).getLiteralValue() != null) {

                        if (list.get(i).getLiteralValue().getStringValue() != null)
                            varType.setName(Type.STRING_CONST);
                        else if (list.get(i).getLiteralValue().getNumericalValue() != null)
                            varType.setName(Type.NUMBER_CONST);
                    }
                }

                varForSymbol.setType(varType);
                varForSymbol.setScope(parentScope);
                varForSymbol.setIsParam(true);
                parentScope.addSymbol(varForSymbol.getName(), varForSymbol);
                parentScope.setSymbol(varForSymbol);
            }

            System.out.println("varName: "+varForSymbol.getName()+" parentScope:"+varForSymbol.getScope().getId()
                    + " type:"+ varForSymbol.getType().getName());
        }

        return for_rule;
    }

    @Override
    public Foreach_rule visitForeach_rule(SQLParser.Foreach_ruleContext ctx) {
        Scope parentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);
        Foreach_rule foreach_rule = new Foreach_rule();

        Symbol varForSymbol = new Symbol();

        if (ctx.any_name() != null) {
            List<AnyName> anyNames = new ArrayList<>();
            for (int i = 0; i < ctx.any_name().size(); i++) {
                AnyName anyName = visitAny_name(ctx.any_name(i));
                anyNames.add(anyName);

                if (i == 0){ // first anyName is a var must be stored in symbolTable
                    varForSymbol.setName(anyName.getIDENTIFIER());
                    varForSymbol.setIsParam(true);
                    varForSymbol.setScope(parentScope);
                    parentScope.addSymbol(varForSymbol.getName(),varForSymbol);
                    parentScope.setSymbol(varForSymbol);

                    System.out.println("varName: "+varForSymbol.getName()
                            +" parentScope:"+varForSymbol.getScope().getId());
                }
            }
            foreach_rule.setAnyNames(anyNames);
        }
        if (ctx.K_VAR() != null) {
            foreach_rule.setK_var(ctx.K_VAR().getSymbol().getText());
        }
        return foreach_rule;
    }


    @Override
    public Do_while_stmt visitDo_while_stmt(SQLParser.Do_while_stmtContext ctx) {
        // declare all object in if
        Do_while_stmt do_while_stmt = new Do_while_stmt();

        if (ctx.body() != null) {
            do_while_stmt.setBody_do_while(visitBody(ctx.body()));
        }
        if (ctx.while_do_stmt() != null) {
            do_while_stmt.setWhile_do(visitWhile_do_stmt(ctx.while_do_stmt()));
        }
        if (ctx.K_DO() != null) {
            do_while_stmt.setK_do(ctx.K_DO().getSymbol().getText());
        }
        return do_while_stmt;
    }

    @Override
    public While_do_stmt visitWhile_do_stmt(SQLParser.While_do_stmtContext ctx) {
        // declare for rule
        While_do_stmt while_do_stmt = new While_do_stmt();
        if (ctx.expr_while() != null) {
            while_do_stmt.setExpr_while(visitExpr_while(ctx.expr_while()));
        }
        if (ctx.K_WHILE() != null) {
            while_do_stmt.setK_while(ctx.K_WHILE().getSymbol().getText());
        }
        return while_do_stmt;
    }

//    @Override
//    public Array_stmt visitArray_stmt(SQLParser.Array_stmtContext ctx) {
//        Array_stmt array_stmt = new Array_stmt();
//        List<AnyName> anyNames = new ArrayList<>();
//        List<SignedNumber> signedNumbers = new ArrayList<>();
//        if (ctx.any_name() != null) {
//            for (int i = 0; i < ctx.any_name().size(); i++) {
//                anyNames.add(visitAny_name(ctx.any_name(i)));
//            }
//            array_stmt.setAny_name(anyNames);
//        }
//        if (ctx.signed_number() != null) {
//            for (int i = 0; i < ctx.signed_number().size(); i++) {
//                signedNumbers.add(visitSigned_number(ctx.signed_number(i)));
//            }
//            array_stmt.setSigned_number(signedNumbers);
//        }
//        if (ctx.sql_stmt_list() != null) {
//            array_stmt.setSql_stmt_list(visitSql_stmt_list(ctx.sql_stmt_list()));
//        }
//        return array_stmt;
//    }

    @Override
    public Inline_condition_stmt visitInline_condition_stmt(SQLParser.Inline_condition_stmtContext ctx) {
        // declare all object in if
        Inline_condition_stmt inline = new Inline_condition_stmt();
        //set inline
        if (ctx.expr() != null) {
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                exprs.add(visitExpr(ctx.expr(i)));
            }
            inline.setExpr(exprs);
        }
        if (ctx.QuesM() != null) {
            inline.setQesM(ctx.QuesM().getSymbol().getText());
        }
        if (ctx.ORM() != null) {
            inline.setOrM(ctx.ORM().getSymbol().getText());
        }
        return inline;
    }

    @Override
    public Switch_stmt visitSwitch_stmt(SQLParser.Switch_stmtContext ctx) {
        Scope parentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);

        Switch_stmt switch_stmt = new Switch_stmt();
        List<AnyName> anyNames = new ArrayList<>();
        List<SignedNumber> signedNumbers = new ArrayList<>();

        if (ctx.any_name() != null) {
            for (int i = 0; i < ctx.any_name().size(); i++) {

                anyNames.add(visitAny_name(ctx.any_name(i)));
            }
            switch_stmt.setAnyNames(anyNames);
        }
        if (ctx.signed_number() != null) {
            for (int i = 0; i < ctx.signed_number().size(); i++) {
                signedNumbers.add(visitSigned_number(ctx.signed_number(i)));
            }
            switch_stmt.setSignedNumbers(signedNumbers);
        }
        if (ctx.body() != null) {
            List<Body> bodies = new ArrayList<>();
            for (int i = 0; i < ctx.body().size(); i++) {
                Scope forScope = new Scope();
                forScope.setId(parentScope.getId() + "_Case_" + i);
                forScope.setParent(parentScope);
                Main.symbolTable.addScope(forScope);

                bodies.add(visitBody(ctx.body(i)));
            }
            switch_stmt.setBody_swich(bodies);
        }
        return switch_stmt;
    }

    @Override
    public Var_get_func visitVar_get_func(SQLParser.Var_get_funcContext ctx) {
        Var_get_func var_get_func = new Var_get_func();
        List<AnyName> anyNames = new ArrayList<>();
        if (ctx.any_name() != null) {
            for (int i = 0; i < ctx.any_name().size(); i++) {

                anyNames.add(visitAny_name(ctx.any_name(i)));
            }
            var_get_func.setAny_name(anyNames);
        }
        if (ctx.IDENTIFIER() != null) {
            var_get_func.setIdentifier(ctx.IDENTIFIER().getSymbol().getText());
        }
        if (ctx.K_FUNCTION() != null) {
            var_get_func.setFunctionn(ctx.K_FUNCTION().getSymbol().getText());
        }
        if (ctx.ASSIGN() != null) {
            var_get_func.setAssign(ctx.ASSIGN().getSymbol().getText());
        }
        if (ctx.K_VAR() != null) {
            var_get_func.setK_var(ctx.K_VAR().getSymbol().getText());
        }
        return var_get_func;
    }

    @Override
    public Func_argument_list visitFunc_argument_list(SQLParser.Func_argument_listContext ctx) {
        Func_argument_list func_argument_list = new Func_argument_list();
        List<AnyName> anyNames = new ArrayList<>();
        if (ctx.any_name() != null) {
            for (int i = 0; i < ctx.any_name().size(); i++) {
                anyNames.add(visitAny_name(ctx.any_name(i)));
            }
            func_argument_list.setAnyNames(anyNames);
        }
        if (ctx.K_FUNCTION() != null) {
            func_argument_list.setK_function(ctx.K_FUNCTION().getSymbol().getText());
        }
        return func_argument_list;
    }

    @Override
    public Var_operator visitVar_operator(SQLParser.Var_operatorContext ctx) {

        Var_operator var_operator = new Var_operator();
        if (ctx.expr_for_and_operator() != null) {
            var_operator.setExpr_for_and_operator(visitExpr_for_and_operator(ctx.expr_for_and_operator()));
        }
        return var_operator;
    }

//    @Override
//    public Json_stmt visitJson_stmt(SQLParser.Json_stmtContext ctx) {
//        Json_stmt json_stmt = new Json_stmt();
//        if (ctx.json_array() != null) {
//            List<Json_array> json_arrays = new ArrayList<>();
//            for (int i = 0; i < ctx.json_array().size(); i++) {
//                json_arrays.add(visitJson_array(ctx.json_array(i)));
//            }
//            json_stmt.setJson_arrays(json_arrays);
//        }
//        if (ctx.json_attribute() != null) {
//            List<Json_attribute> json_attributes = new ArrayList<>();
//            for (int i = 0; i < ctx.json_attribute().size(); i++) {
//                json_attributes.add(visitJson_attribute(ctx.json_attribute(i)));
//            }
//            json_stmt.setJson_attributes(json_attributes);
//        }
//        if (ctx.json_obj() != null) {
//            List<Json_obj> json_objs = new ArrayList<>();
//            for (int i = 0; i < ctx.json_obj().size(); i++) {
//                json_objs.add(visitJson_obj(ctx.json_obj(i)));
//            }
//            json_stmt.setJson_objs(json_objs);
//        }
//        if (ctx.ASSIGN() != null) {
//            json_stmt.setAssign(ctx.ASSIGN().getSymbol().getText());
//        }
//        if (ctx.K_VAR() != null) {
//            json_stmt.setK_var(ctx.K_VAR().getSymbol().getText());
//        }
//        if (ctx.any_name() != null) {
//            json_stmt.setAnyName(visitAny_name(ctx.any_name()));
//        }
//        return json_stmt;
//    }
//
//    @Override
//    public Json_attribute visitJson_attribute(SQLParser.Json_attributeContext ctx) {
//        Json_attribute json_attribute = new Json_attribute();
//        if (ctx.expr() != null) {
//            json_attribute.setExpr(visitExpr(ctx.expr()));
//        }
//        if (ctx.IDENTIFIER() != null) {
//            json_attribute.setIdentifier(ctx.IDENTIFIER().getSymbol().getText());
//        }
//        if (ctx.ORM() != null) {
//            json_attribute.setORM(ctx.ORM().getSymbol().getText());
//        }
//        return json_attribute;
//    }
//
//    @Override
//    public Json_obj visitJson_obj(SQLParser.Json_objContext ctx) {
//
//        Json_obj jsonObject = new Json_obj();
//        List<Json_attribute> json_attributes = new ArrayList<>();
//        List<Json_obj> json_objs = new ArrayList<>();
//        List<Json_array> json_arrays = new ArrayList<>();
//        if (ctx.json_array() != null) {
//            for (int i = 0; i < ctx.json_array().size(); i++) {
//                json_arrays.add(visitJson_array(ctx.json_array(i)));
//            }
//            jsonObject.setJson_arrays(json_arrays);
//        }
//        if (ctx.json_attribute() != null) {
//            for (int i = 0; i < ctx.json_attribute().size(); i++) {
//                json_attributes.add(visitJson_attribute(ctx.json_attribute(i)));
//            }
//            jsonObject.setJson_attributes(json_attributes);
//        }
//        if (ctx.json_obj() != null) {
//            for (int i = 0; i < ctx.json_obj().size(); i++) {
//                json_objs.add(visitJson_obj(ctx.json_obj(i)));
//            }
//            jsonObject.setJson_objs(json_objs);
//        }
//        if (ctx.IDENTIFIER() != null) {
//            jsonObject.setIdentifier(ctx.IDENTIFIER().getSymbol().getText());
//        }
//        if (ctx.ORM() != null) {
//            jsonObject.setORM(ctx.ORM().getSymbol().getText());
//        }
//
//        return jsonObject;
//
//    }
//
//
//    @Override
//    public Json_array visitJson_array(SQLParser.Json_arrayContext ctx) {
//
//        Json_array json_array = new Json_array();
//
//        List<Json_obj> json_objs = new ArrayList<>();
//        List<AnyName> anyNames = new ArrayList<>();
//        List<SignedNumber> signedNumbers = new ArrayList<>();
//
//        if (ctx.IDENTIFIER() != null) {
//            json_array.setIdentifier(ctx.IDENTIFIER().getSymbol().getText());
//        }
//        if (ctx.any_name() != null) {
//            for (int i = 0; i < ctx.any_name().size(); i++) {
//                anyNames.add(visitAny_name(ctx.any_name(i)));
//            }
//            json_array.setAnyNames(anyNames);
//        }
//
//        if (ctx.signed_number() != null) {
//            for (int i = 0; i < ctx.signed_number().size(); i++) {
//                signedNumbers.add(visitSigned_number(ctx.signed_number(i)));
//            }
//            json_array.setSignedNumbers(signedNumbers);
//        }
//
//
//        if (ctx.json_obj() != null) {
//            for (int i = 0; i < ctx.json_obj().size(); i++) {
//                json_objs.add(visitJson_obj(ctx.json_obj(i)));
//            }
//            json_array.setJson_objs(json_objs);
//        }
//        if (ctx.ORM() != null) {
//            json_array.setORM(ctx.ORM().getSymbol().getText());
//        }
//
//        return json_array;
//    }
}
