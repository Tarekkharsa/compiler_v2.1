package Java.AST.QueryStmt.AlterStatement;

import java.util.ArrayList;
import java.util.List;

public class ForeignKeyClause {
    private String DatabaseName;
    private String ForeignTable;
    List<String> FkTargetColumnName = new ArrayList<>();

    public String getDatabaseName() {
        return DatabaseName;
    }

    public void setDatabaseName(String databaseName) {
        DatabaseName = databaseName;
    }

    public String getForeignTable() {
        return ForeignTable;
    }

    public void setForeignTable(String foreignTable) {
        ForeignTable = foreignTable;
    }

    public List<String> getFkTargetColumnName() {
        return FkTargetColumnName;
    }

    public void setFkTargetColumnName(List<String> fkTargetColumnName) {
        FkTargetColumnName = fkTargetColumnName;
    }
}
