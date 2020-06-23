package Java.AST.Function.Json;

import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.SignedNumber;

import java.util.ArrayList;
import java.util.List;

public class Json_array {
    private String Identifier;
    private String ORM;
    private List<Json_obj> json_objs;
    private List <AnyName> anyNames;
    private List <SignedNumber> signedNumbers ;

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getORM() {
        return ORM;
    }

    public void setORM(String ORM) {
        this.ORM = ORM;
    }

    public List<Json_obj> getJson_objs() {
        return json_objs;
    }

    public void setJson_objs(List<Json_obj> json_objs) {
        this.json_objs = json_objs;
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
}
