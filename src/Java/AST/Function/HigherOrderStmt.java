package Java.AST.Function;

import Java.AST.Expr.Expr;

import java.util.List;

public class HigherOrderStmt {
private Expr expr ;
private String K_function;

    public String getK_return() {
        return K_return;
    }

    public void setK_return(String k_return) {
        K_return = k_return;
    }

    private String K_return;
private String Assign;
private String K_var;
private List<String> Identifier;

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public String getK_function() {
        return K_function;
    }

    public void setK_function(String k_function) {
        K_function = k_function;
    }

    public String getAssign() {
        return Assign;
    }

    public void setAssign(String assign) {
        Assign = assign;
    }

    public String getK_var() {
        return K_var;
    }

    public void setK_var(String k_var) {
        K_var = k_var;
    }

    public List<String> getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(List<String> identifier) {
        Identifier = identifier;
    }
}
