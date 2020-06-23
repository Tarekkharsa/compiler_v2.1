package Java.AST.Function.Loop;

import Java.AST.Expr.Expr;
import Java.AST.Expr.Expr_for_and_operator;

import java.util.List;

public class For_rule {
    private List<Expr_for_and_operator> expr_for_and_operators;
    private String K_var;

    public String getK_var() {
        return K_var;
    }

    public void setK_var(String k_var) {
        K_var = k_var;
    }

    public List<Expr_for_and_operator> getExpr_for_and_operators() {
        return expr_for_and_operators;
    }

    public void setExpr_for_and_operators(List<Expr_for_and_operator> expr_for_and_operators) {
        this.expr_for_and_operators = expr_for_and_operators;
    }
}
