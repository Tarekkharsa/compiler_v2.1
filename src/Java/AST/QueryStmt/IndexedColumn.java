package Java.AST.QueryStmt;

public class IndexedColumn {
    private String columnName;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    private String COLLATE;
    private String collationName;
    private String ASC;
    private String DESC;

    public String getCOLLATE() {
        return COLLATE;
    }

    public void setCOLLATE(String COLLATE) {
        this.COLLATE = COLLATE;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
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


}
