package Java.AST.Expr;

import Java.AST.Function.If_stmt.Inline_condition_stmt;
import Java.AST.QueryStmt.SelectStmt.SelectStmt;
import Java.AST.QueryStmt.SignedNumber;
import Java.AST.QueryStmt.Statement;

import java.util.List;

public class Expr {
    private String databaseName;
    private String tableName;
    private String K_IN;
    private String columnName;
    private UnaryOperator unaryOperator;
    private LiteralValue literalValue;
    private String functionName;
    private List<Expr> exprs;
    private List<String> operation;
    private SelectStmt selectStmt;

    private List<Statement>  sql_stmt_list;
    private Inline_condition_stmt inline_condition_stmt;

    public String getK_IN() {
        return K_IN;
    }

    public void setK_IN(String k_IN) {
        K_IN = k_IN;
    }

    public List<Statement> getSql_stmt_list() {
        return sql_stmt_list;
    }

    public void setSql_stmt_list(List<Statement> sql_stmt_list) {
        this.sql_stmt_list = sql_stmt_list;
    }

    public Inline_condition_stmt getInline_condition_stmt() {
        return inline_condition_stmt;
    }

    public void setInline_condition_stmt(Inline_condition_stmt inline_condition_stmt) {
        this.inline_condition_stmt = inline_condition_stmt;
    }


    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public List<String> getOperation() {
        return operation;
    }

    public void setOperation(List<String> operation) {
        this.operation = operation;
    }
//    private List<Expr> exprRight;

    public String getDatabaseName() {
        return databaseName;
    }

    public List<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }

    //    public List<Expr> getExprLeft() {
//        return exprLeft;
//    }
//
//    public void setExprLeft(List<Expr> exprLeft) {
//        this.exprLeft = exprLeft;
//    }

//    public List<Expr> getExprRight() {
//        return exprRight;
//    }
//
//    public void setExprRight(List<Expr> exprRight) {
//        this.exprRight = exprRight;
//    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public UnaryOperator getUnaryOperator() {
        return unaryOperator;
    }

    public void setUnaryOperator(UnaryOperator unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
