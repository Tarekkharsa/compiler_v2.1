package Java.AST.Expr;

import Java.AST.Function.Json.Call_json;
import Java.AST.Node;
import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.SignedNumber;
import Java.AST.QueryStmt.TypeName;

import java.util.List;

public class Expr_if  extends Node {

    private LiteralValue literalValue;
    private List<AnyName> anyNames;
    private List<Expr_if> expr_ifs;
    private List<Expr> expr;
    private List<Call_json> call_jsons;
    private SignedNumber signedNumber;
    private TypeName typeName;
    private List<String> operation;

    public List<String> getOperation() {
        return operation;
    }

    public void setOperation(List<String> operation) {
        this.operation = operation;
    }

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }

    public List<AnyName> getAnyNames() {
        return anyNames;
    }

    public void setAnyNames(List<AnyName> anyNames) {
        this.anyNames = anyNames;
    }

    public List<Expr_if> getExpr_ifs() {
        return expr_ifs;
    }

    public void setExpr_ifs(List<Expr_if> expr_ifs) {
        this.expr_ifs = expr_ifs;
    }

    public List<Call_json> getCall_jsons() {
        return call_jsons;
    }

    public void setCall_jsons(List<Call_json> call_jsons) {
        this.call_jsons = call_jsons;
    }

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

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }
}
