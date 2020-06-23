package Java.AST.QueryStmt.ColumnConstraints;

public class ColumnPrimaryKey {
    private String PRIMARY;
    private String KEY;
    private String ASC;
    private String DESC;
    private String AUTOINCREMENT;

    public String getPRIMARY() {
        return PRIMARY;
    }

    public void setPRIMARY(String PRIMARY) {
        this.PRIMARY = PRIMARY;
    }

    public String getKEY() {
        return KEY;
    }

    public void setKEY(String KEY) {
        this.KEY = KEY;
    }

    public String getASC() {
        return ASC;
    }

    public void setASC(String ASC) {
        this.ASC = ASC;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    public String getAUTOINCREMENT() {
        return AUTOINCREMENT;
    }

    public void setAUTOINCREMENT(String AUTOINCREMENT) {
        this.AUTOINCREMENT = AUTOINCREMENT;
    }
}
