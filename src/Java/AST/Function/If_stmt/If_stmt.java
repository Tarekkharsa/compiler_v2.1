package Java.AST.Function.If_stmt;

import Java.AST.Expr.Expr;
import Java.AST.Expr.Expr_if;
import Java.AST.Function.Body;
import Java.AST.Function.If_stmt.Else;
import Java.AST.Function.If_stmt.Else_if;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;
public class If_stmt extends Node {
    private String K_if;

    public String getK_if() {
        return K_if;
    }

    public void setK_if(String k_if) {
        K_if = k_if;
    }

    private Body body_if= new Body() ;
     private Expr_if expr_if = new Expr_if();
     private List <Else_if> else_ifList;
     private Else elsee=new Else();

    public Body getBody_if() {
        return body_if;
    }

    public void setBody_if(Body body_if) {
        this.body_if = body_if;
    }

    public Expr_if getExpr_if() {
        return expr_if;
    }

    public void setExpr_if(Expr_if expr_if) {
        this.expr_if = expr_if;
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
