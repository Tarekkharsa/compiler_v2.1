package Java.AST.QueryStmt.SelectStmt;

import Java.AST.Expr.Expr;
import Java.AST.Node;

public class GroupBy extends Node {
    private String By;
    private String GROUP;
    Expr expr;

    public String getBy() {
        return By;
    }

    public void setBy(String by) {
        By = by;
    }

    public String getGROUP() {
        return GROUP;
    }

    public void setGROUP(String GROUP) {
        this.GROUP = GROUP;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
}
