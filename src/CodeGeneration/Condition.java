package CodeGeneration;

import Java.AST.Expr.LiteralValue;
import Java.AST.QueryStmt.SelectStmt.SelectCore;

public class Condition {
    Condition leftCon;
    Condition rightCon;
    String Operator;

    String tableName;
    String columnName;
    LiteralValue LiteralValue;
    String functionName;

    SelectCore selectCore;
    boolean sub_query = false;

    public Condition getLeftCon() {
        return leftCon;
    }

    public void setLeftCon(Condition leftCon) {
        this.leftCon = leftCon;
    }

    public Condition getRightCon() {
        return rightCon;
    }

    public void setRightCon(Condition rightCon) {
        this.rightCon = rightCon;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
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

    public LiteralValue getLiteralValue() {
        return LiteralValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        LiteralValue = literalValue;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public SelectCore getSelectCore() {
        return selectCore;
    }

    public void setSelectCore(SelectCore selectCore) {
        this.selectCore = selectCore;
    }

    public boolean isSub_query() {
        return sub_query;
    }

    public void setSub_query(boolean sub_query) {
        this.sub_query = sub_query;
    }
}
