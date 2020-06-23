package Java.AST.Function.If_stmt;

import Java.AST.Expr.Expr;


import java.util.List;

public class Inline_condition_stmt {
    private List<Expr> expr ;
    private String qesM;
    private String orM;

    public String getQesM() {
        return qesM;
    }

    public void setQesM(String qesM) {
        this.qesM = qesM;
    }

    public String getOrM() {
        return orM;
    }

    public void setOrM(String orM) {
        this.orM = orM;
    }

    public List<Expr> getExpr() {
        return expr;
    }

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }
}
