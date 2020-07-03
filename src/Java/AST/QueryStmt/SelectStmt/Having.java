package Java.AST.QueryStmt.SelectStmt;

import Java.AST.Expr.Expr;

public class Having {
    String K_Having ;
    Expr expr;

    public String getK_Having() {
        return K_Having;
    }

    public void setK_Having(String k_Having) {
        K_Having = k_Having;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
}
