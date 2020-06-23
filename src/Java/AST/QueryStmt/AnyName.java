package Java.AST.QueryStmt;

public class AnyName {
    private String IDENTIFIER;
    private String keyword;
    private String strinagLiteral;
    private AnyName anyName;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getStrinagLiteral() {
        return strinagLiteral;
    }

    public void setStrinagLiteral(String strinagLiteral) {
        this.strinagLiteral = strinagLiteral;
    }

    public AnyName getAnyName() {
        return anyName;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }
}
