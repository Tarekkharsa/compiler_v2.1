package Java.AST.Function.If_stmt;

import Java.AST.Expr.Expr;
import Java.AST.Expr.Expr_if;
import Java.AST.Function.Body;
import Java.AST.Function.If_stmt.If_stmt;

public class Else_if {
    private String K_if;
    private String K_else;
    private Expr_if expr_if;
    private Body body;

    public String getK_if() {
        return K_if;
    }

    public void setK_if(String k_if) {
        K_if = k_if;
    }

    public String getK_else() {
        return K_else;
    }

    public void setK_else(String k_else) {
        K_else = k_else;
    }

    public Expr_if getExpr_if() {
        return expr_if;
    }

    public void setExpr_if(Expr_if expr_if) {
        this.expr_if = expr_if;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
