package Java.AST.QueryStmt.DeleteStatement;

public class QualifiedTableName {
    private String DataBaseName;
    private String TableName;
    private  String IndexName ;

    public String getDataBaseName() {
        return DataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        DataBaseName = dataBaseName;
    }

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }

    public String getIndexName() {
        return IndexName;
    }

    public void setIndexName(String indexName) {
        IndexName = indexName;
    }
}
