package Java.AST.Expr;

import Java.AST.Function.Json.Call_json;
import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.SignedNumber;
import Java.AST.QueryStmt.TypeName;

import java.util.List;

public class Expr_while {
    private LiteralValue literalValue;
    private List<Expr_while> expr_while;
    private List<Expr> expr;
    private List<AnyName> anyNamesList;
    private List<Call_json> call_jsons;
    private SignedNumber signedNumber;
    private TypeName typeName;
    private List<String> operation;

    public SignedNumber getSignedNumber() {
        return signedNumber;
    }

    public void setSignedNumber(SignedNumber signedNumber) {
        this.signedNumber = signedNumber;
    }

    public List<Expr> getExpr() {
        return expr;
    }

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }


    public List<String> getOperation() {
        return operation;
    }

    public void setOperation(List<String> operation) {
        this.operation = operation;
    }

    public List<Expr_while> getExpr_while() {
        return expr_while;
    }

    public void setExpr_while(List<Expr_while> expr_while) {
        this.expr_while = expr_while;
    }

    public List<AnyName> getAnyNamesList() {
        return anyNamesList;
    }

    public void setAnyNamesList(List<AnyName> anyNamesList) {
        this.anyNamesList = anyNamesList;
    }

    public List<Call_json> getCall_jsons() {
        return call_jsons;
    }

    public void setCall_jsons(List<Call_json> call_jsons) {
        this.call_jsons = call_jsons;
    }


    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }
}
