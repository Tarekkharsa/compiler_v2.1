package Java.AST.QueryStmt;

import Java.AST.Expr.Expr;

public class JoinConstraint {
    private String name;
    private Expr expr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
}
