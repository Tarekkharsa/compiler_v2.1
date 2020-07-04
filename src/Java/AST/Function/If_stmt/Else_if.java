package Java.AST.Function.If_stmt;

import Java.AST.Expr.Expr;
import Java.AST.Expr.Expr_if;
import Java.AST.Function.Body;
import Java.AST.Function.If_stmt.If_stmt;
import Java.SymbolTable.Scope;

import java.util.List;

public class Else_if {
    private String K_if;
    private String K_else;
    private List<Expr_if> expr_ifs;
    private Body body;
    private Scope currentScope;

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

    public List<Expr_if> getExpr_ifs() {
        return expr_ifs;
    }

    public void setExpr_ifs(List<Expr_if> expr_ifs) {
        this.expr_ifs = expr_ifs;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }
}
