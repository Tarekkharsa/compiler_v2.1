package Java.AST.QueryStmt.AlterStatement;

import Java.AST.QueryStmt.IndexedColumn;

import java.util.ArrayList;
import java.util.List;

public class TableConstraintUnique {
    private String name;
    List<IndexedColumn> indexedColumn ;
    private String UNIQUE;
    private String KEY;

    public String getUNIQUE() {
        return UNIQUE;
    }

    public void setUNIQUE(String UNIQUE) {
        this.UNIQUE = UNIQUE;
    }

    public String getKEY() {
        return KEY;
    }

    public void setKEY(String KEY) {
        this.KEY = KEY;
    }

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
