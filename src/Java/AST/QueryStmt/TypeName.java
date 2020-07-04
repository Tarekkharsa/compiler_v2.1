package Java.AST.QueryStmt;

import Java.AST.Node;

import java.util.List;

public class TypeName extends Node {
    private String name;
    private List<SignedNumber> signedNumbers ;
    private List<AnyName> anyNames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SignedNumber> getSignedNumbers() {
        return signedNumbers;
    }

    public void setSignedNumbers(List<SignedNumber> signedNumbers) {
        this.signedNumbers = signedNumbers;
    }

    public List<AnyName> getAnyNames() {
        return anyNames;
    }

    public void setAnyNames(List<AnyName> anyNames) {
        this.anyNames = anyNames;
    }
}
