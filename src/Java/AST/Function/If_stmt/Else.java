package Java.AST.Function.If_stmt;

import Java.AST.Function.Body;
import Java.SymbolTable.Scope;

public class Else {
    private Body body ;
    private String K_else;
    private Scope currentScope;

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getK_else() {
        return K_else;
    }

    public void setK_else(String k_else) {
        K_else = k_else;
    }
}
