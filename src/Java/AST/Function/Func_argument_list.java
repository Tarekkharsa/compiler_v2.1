package Java.AST.Function;

import Java.AST.Node;
import Java.AST.QueryStmt.AnyName;
import Java.SymbolTable.Scope;

import java.util.ArrayList;
import java.util.List;

public class Func_argument_list extends Node {

    private String K_function;
    private List<AnyName> anyNames ;
    private Scope currentScope;

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
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
}
