package Java.AST.Function;

import Java.AST.QueryStmt.AnyName;

import java.util.ArrayList;
import java.util.List;

public class Func_argument_list {

    private String K_function;
    private List<AnyName> anyNames ;

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
