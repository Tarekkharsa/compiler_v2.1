package Java.AST.Function.Loop;
import Java.AST.Expr.Expr_while;
import Java.AST.Function.Body;
import Java.SymbolTable.Scope;

import java.util.List;

public class While_stmt {

    private Body body_while; ;
    private List<Expr_while> expr_whileList ;
    private String K_while;
    private Scope currentScope;

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }

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

    public List<Expr_while> getExpr_whileList() {
        return expr_whileList;
    }

    public void setExpr_whileList(List<Expr_while> expr_whileList) {
        this.expr_whileList = expr_whileList;
    }
}
