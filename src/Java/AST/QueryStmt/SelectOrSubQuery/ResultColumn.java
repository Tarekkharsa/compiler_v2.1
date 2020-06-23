package Java.AST.QueryStmt.SelectOrSubQuery;

import Java.AST.Expr.Expr;

public class ResultColumn {
    private String star;
    private String tableName;
    private Expr expr;
    private String columnAlias;

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public String getColumnAlias() {
        return columnAlias;
    }

    public void setColumnAlias(String columnAlias) {
        this.columnAlias = columnAlias;
    }
}
