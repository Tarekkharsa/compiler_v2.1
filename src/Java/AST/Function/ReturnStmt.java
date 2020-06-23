package Java.AST.Function;

import Java.AST.Expr.Expr;
import Java.AST.Function.If_stmt.Inline_condition_stmt;

public class ReturnStmt {
    private String K_return;
    private Expr expr;
    private Var_operator var_operator ;
    private Inline_condition_stmt inline_condition_stmt;

    public String getK_return() {
        return K_return;
    }

    public void setK_return(String k_return) {
        K_return = k_return;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Var_operator getVar_operator() {
        return var_operator;
    }

    public void setVar_operator(Var_operator var_operator) {
        this.var_operator = var_operator;
    }

    public Inline_condition_stmt getInline_condition_stmt() {
        return inline_condition_stmt;
    }

    public void setInline_condition_stmt(Inline_condition_stmt inline_condition_stmt) {
        this.inline_condition_stmt = inline_condition_stmt;
    }
}
