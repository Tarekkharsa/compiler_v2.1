package Java.AST.Function;

import Java.AST.Function.If_stmt.If_stmt;
import Java.AST.Node;
import Java.AST.QueryStmt.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration extends Node {
    private String K_function;
    private List<String> K_var;
    private List<AnyName> anyNames ;
    private Body body;

    public List<String> getK_var() {
        return K_var;
    }

    public void setK_var(List<String> k_var) {
        K_var = k_var;
    }

    public String getK_function() {
        return K_function;
    }

    public void setK_function(String k_function) {
        K_function = k_function;
    }


    public List<AnyName> getAnyNames() {
        return anyNames;
    }

    public void setAnyNames(List<AnyName> anyNames) {
        this.anyNames = anyNames;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

//    @Override
//    public void accept(ASTVisitor astVisitor) {
//        astVisitor.visit(this);
//    }

}
