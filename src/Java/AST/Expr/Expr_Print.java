package Java.AST.Expr;

import Java.AST.Expr.LiteralValue;
import Java.AST.Expr.UnaryOperator;
import Java.AST.Function.Var_operator;
import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.SelectStmt.SelectStmt;

import java.util.List;

public class Expr_Print {
    private String databaseName;
    private String tableName;
    private String columnName;
    private UnaryOperator unaryOperator;
    private LiteralValue literalValue;
    private String functionName;
    private List<Expr_Print> expr_prints;
    private List<String> operation;
    private SelectStmt selectStmt;
    private AnyName anyName;
    private Var_operator var_operator;

    public String getDatabaseName() {
        return databaseName;
    }

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

    public List<Expr_Print> getExpr_prints() {
        return expr_prints;
    }

    public void setExpr_prints(List<Expr_Print> expr_prints) {
        this.expr_prints = expr_prints;
    }

    public List<String> getOperation() {
        return operation;
    }

    public void setOperation(List<String> operation) {
        this.operation = operation;
    }

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public AnyName getAnyName() {
        return anyName;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public Var_operator getVar_operator() {
        return var_operator;
    }

    public void setVar_operator(Var_operator var_operator) {
        this.var_operator = var_operator;
    }
}
