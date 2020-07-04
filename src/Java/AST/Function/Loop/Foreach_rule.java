package Java.AST.Function.Loop;

import Java.AST.Node;
import Java.AST.QueryStmt.AnyName;

import java.util.ArrayList;
import java.util.List;

public class Foreach_rule extends Node {
    private List<AnyName> anyNames;
    private String K_var;

    public List<AnyName> getAnyNames() {
        return anyNames;
    }

    public void setAnyNames(List<AnyName> anyNames) {
        this.anyNames = anyNames;
    }

    public String getK_var() {
        return K_var;
    }

    public void setK_var(String k_var) {
        K_var = k_var;
    }
}
