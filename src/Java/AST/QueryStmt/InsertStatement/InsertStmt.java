package Java.AST.QueryStmt.InsertStatement;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.SelectStmt.SelectStmt;
import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class InsertStmt extends Statement {

    private String DatabaseName;
    private String TableName;
    List<String> ColumnName = new ArrayList<>();
    private List<Expr> exprs = new ArrayList<>();
    private SelectStmt selectStmt;
    private String Values;

    public String getValues() {
        return Values;
    }

    public void setValues(String values) {
        Values = values;
    }

    public String getDatabaseName() {
        return DatabaseName;
    }

    public void setDatabaseName(String databaseName) {
        DatabaseName = databaseName;
    }

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }

    public List<String> getColumnName() {
        return ColumnName;
    }

    public void setColumnName(List<String> columnName) {
        ColumnName = columnName;
    }

    public List<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
