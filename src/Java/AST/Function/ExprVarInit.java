package Java.AST.Function;

import Java.AST.Expr.Expr;
import Java.AST.Node;
import Java.AST.QueryStmt.AnyName;
import Java.SymbolTable.Scope;

public class ExprVarInit  extends Node {
    private AnyName anyName;
    private String Assign;
    private Expr expr;
    private Scope currentScope;
    private String K_var;

    public String getK_var() {
        return K_var;
    }

    public void setK_var(String k_var) {
        K_var = k_var;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }

    public AnyName getAnyName() {
        return anyName;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public String getAssign() {
        return Assign;
    }

    public void setAssign(String assign) {
        Assign = assign;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
}
