package Java.AST.Function.Loop;
import Java.AST.Expr.Expr;
import Java.AST.Expr.Expr_while;
import Java.AST.Function.Body;

public class While_stmt {

    private Body body_while; ;
    private Expr_while expr_while ;
    private String K_while;

    public String getK_while() {
        return K_while;
    }

    public void setK_while(String k_while) {
        K_while = k_while;
    }

    public Body getBody_while() {
        return body_while;
    }

    public void setBody_while(Body body_while) {
        this.body_while = body_while;
    }

    public Expr_while getExpr_while() {
        return expr_while;
    }

    public void setExpr_while(Expr_while expr_while) {
        this.expr_while = expr_while;
    }
}
