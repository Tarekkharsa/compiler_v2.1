package Java.AST.Function.Switch;

import Java.AST.Expr.LiteralValue;
import Java.AST.Function.Body;
import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.SignedNumber;
import Java.SymbolTable.Scope;

import java.util.ArrayList;
import java.util.List;

public class Switch_stmt {
    private String name;
    private List<AnyName> anyNames;
    private AnyName anyName;
    private List<SignedNumber> signedNumbers;
    private List<LiteralValue> literalValues;
    private List<Body> body_swich;
    private String K_Switch;
    private String K_Case;
    private String K_Default;
    private String K_Break;
    private Scope currentScope;

    public AnyName getAnyName() {
        return anyName;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }

    public List<LiteralValue> getLiteralValues() {
        return literalValues;
    }

    public void setLiteralValues(List<LiteralValue> literalValues) {
        this.literalValues = literalValues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AnyName> getAnyNames() {
        return anyNames;
    }

    public void setAnyNames(List<AnyName> anyNames) {
        this.anyNames = anyNames;
    }

    public List<SignedNumber> getSignedNumbers() {
        return signedNumbers;
    }

    public void setSignedNumbers(List<SignedNumber> signedNumbers) {
        this.signedNumbers = signedNumbers;
    }

    public List<Body> getBody_swich() {
        return body_swich;
    }

    public void setBody_swich(List<Body> body_swich) {
        this.body_swich = body_swich;
    }

    public String getK_Switch() {
        return K_Switch;
    }

    public void setK_Switch(String k_Switch) {
        K_Switch = k_Switch;
    }

    public String getK_Case() {
        return K_Case;
    }

    public void setK_Case(String k_Case) {
        K_Case = k_Case;
    }

    public String getK_Default() {
        return K_Default;
    }

    public void setK_Default(String k_Default) {
        K_Default = k_Default;
    }

    public String getK_Break() {
        return K_Break;
    }

    public void setK_Break(String k_Break) {
        K_Break = k_Break;
    }
}
