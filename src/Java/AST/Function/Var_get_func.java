package Java.AST.Function;

import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.Statement;
import org.stringtemplate.v4.ST;

import java.util.ArrayList;
import java.util.List;

public class Var_get_func {

    private String Identifier;
    private String K_var;
    private String Assign;
    private String functionn;
    private List<AnyName> any_name=new ArrayList<>();

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getK_var() {
        return K_var;
    }

    public void setK_var(String k_var) {
        K_var = k_var;
    }

    public String getAssign() {
        return Assign;
    }

    public void setAssign(String assign) {
        Assign = assign;
    }

    public String getFunctionn() {
        return functionn;
    }

    public void setFunctionn(String functionn) {
        this.functionn = functionn;
    }

    public List<AnyName> getAny_name() {
        return any_name;
    }

    public void setAny_name(List<AnyName> any_name) {
        this.any_name = any_name;
    }
}
