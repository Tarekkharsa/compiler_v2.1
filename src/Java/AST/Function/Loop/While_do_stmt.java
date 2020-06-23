package Java.AST.Function.Loop;

import Java.AST.Expr.Expr;
import Java.AST.Expr.Expr_while;

public class While_do_stmt {

   private Expr_while expr_while;
   private String K_while;

    public String getK_while() {
        return K_while;
    }

    public void setK_while(String k_while) {
        K_while = k_while;
    }

    public Expr_while getExpr_while() {
        return expr_while;
    }

    public void setExpr_while(Expr_while expr_while) {
        this.expr_while = expr_while;
    }
}
