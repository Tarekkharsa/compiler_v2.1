package Java.AST.Function;

import Java.AST.Expr.Expr;
import Java.AST.Function.If_stmt.Inline_condition_stmt;
import Java.AST.Node;
import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.SignedNumber;
import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Scope;

import java.util.List;
public class VarInit extends Node {
    private AnyName anyName;
    private String Assign;
    private Expr expr;
    private String K_var;
    private Scope currentScope;

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

    public String getK_var() {
        return K_var;
    }

    public void setK_var(String k_var) {
        K_var = k_var;
    }
}

