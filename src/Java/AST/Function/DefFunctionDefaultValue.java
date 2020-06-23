package Java.AST.Function;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.AnyName;

import java.util.List;

public class DefFunctionDefaultValue {
    private String K_function;
    private List<String> K_var;
    private AnyName anyName;
    private List<Expr> exprList ;
    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getK_function() {
        return K_function;
    }

    public void setK_function(String k_function) {
        K_function = k_function;
    }

    public List<String> getK_var() {
        return K_var;
    }

    public void setK_var(List<String> k_var) {
        K_var = k_var;
    }

    public AnyName getAnyName() {
        return anyName;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public List<Expr> getExprList() {
        return exprList;
    }

    public void setExprList(List<Expr> exprList) {
        this.exprList = exprList;
    }
}
