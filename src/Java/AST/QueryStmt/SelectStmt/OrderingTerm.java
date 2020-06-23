package Java.AST.QueryStmt.SelectStmt;

import Java.AST.Expr.Expr;

public class OrderingTerm {
    private Expr expr;
    private String ASC;
    private String DESC;

    public String getASC() {
        return ASC;
    }

    public void setASC(String ASC) {
        this.ASC = ASC;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
}
