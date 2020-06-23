package Java.AST.QueryStmt.AlterStatement;

import Java.AST.QueryStmt.IndexedColumn;

import java.util.ArrayList;
import java.util.List;

public class TableConstraintKey {
    private String name;
    List<IndexedColumn> indexedColumn = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IndexedColumn> getIndexedColumn() {
        return indexedColumn;
    }

    public void setIndexedColumn(List<IndexedColumn> indexedColumn) {
        this.indexedColumn = indexedColumn;
    }
}
