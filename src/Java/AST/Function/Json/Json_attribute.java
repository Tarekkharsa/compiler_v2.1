package Java.AST.Function.Json;

import Java.AST.Expr.Expr;

public class Json_attribute {

    private Expr expr ;
    private String Identifier;
    private String ORM;

    public String getORM() {
        return ORM;
    }

    public void setORM(String ORM) {
        this.ORM = ORM;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }
}
