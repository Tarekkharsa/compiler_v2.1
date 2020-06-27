package Java.AST.Function.If_stmt;

import Java.AST.Expr.Expr_if;
import Java.AST.Function.Body;

import Java.AST.Node;
import Java.SymbolTable.Scope;

import java.util.List;
public class If_stmt extends Node {
    private String K_if;
    private Scope parentScope;

    private Body body_if= new Body() ;
     private List<Expr_if> expr_ifs;
     private List<Else_if> else_ifList;
     private Else elsee=new Else();

    public Scope getParentScope() {
        return parentScope;
    }

    public void setParentScope(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public String getK_if() {
        return K_if;
    }

    public void setK_if(String k_if) {
        K_if = k_if;
    }

    public Body getBody_if() {
        return body_if;
    }

    public void setBody_if(Body body_if) {
        this.body_if = body_if;
    }

    public List<Expr_if> getExpr_ifs() {
        return expr_ifs;
    }

    public void setExpr_ifs(List<Expr_if> expr_ifs) {
        this.expr_ifs = expr_ifs;
    }

    public List<Else_if> getElse_ifList() {
        return else_ifList;
    }

    public void setElse_ifList(List<Else_if> else_ifList) {
        this.else_ifList = else_ifList;
    }

    public Else getElsee() {
        return elsee;
    }

    public void setElsee(Else elsee) {
        this.elsee = elsee;
    }
}
