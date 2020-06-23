package Java.AST.Function.Json;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.SignedNumber;

import java.util.List;

public class Edit_json {
    private Expr expr;
    private SignedNumber signedNumber;
    private List<AnyName> anyNameList;
    private String Assin;

    public List<String> getDot() {
        return Dot;
    }

    public void setDot(List<String> dot) {
        Dot = dot;
    }

    private List<String> Dot;

    public List<AnyName> getAnyNameList() {
        return anyNameList;
    }

    public void setAnyNameList(List<AnyName> anyNameList) {
        this.anyNameList = anyNameList;
    }

    public String getAssin() {
        return Assin;
    }

    public void setAssin(String assin) {
        Assin = assin;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public SignedNumber getSignedNumber() {
        return signedNumber;
    }

    public void setSignedNumber(SignedNumber signedNumber) {
        this.signedNumber = signedNumber;
    }
}
