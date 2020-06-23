package Java.AST.QueryStmt;

import Java.AST.QueryStmt.ColumnConstraints.ColumnForeignKey;
import Java.AST.QueryStmt.ColumnConstraints.ColumnNotNull;
import Java.AST.QueryStmt.ColumnConstraints.ColumnNull;
import Java.AST.QueryStmt.ColumnConstraints.ColumnPrimaryKey;

import java.util.List;

public class ColumnConstraint {

    private ColumnPrimaryKey columnPrimaryKey;
    private ColumnNotNull columnNotNull;
    private ColumnNull columnNull;
    private ColumnForeignKey columnForeignKey;


    public ColumnPrimaryKey getColumnPrimaryKey() {
        return columnPrimaryKey;
    }

    public void setColumnPrimaryKey(ColumnPrimaryKey columnPrimaryKey) {
        this.columnPrimaryKey = columnPrimaryKey;
    }

    public ColumnNotNull getColumnNotNull() {
        return columnNotNull;
    }

    public void setColumnNotNull(ColumnNotNull columnNotNull) {
        this.columnNotNull = columnNotNull;
    }

    public ColumnNull getColumnNull() {
        return columnNull;
    }

    public void setColumnNull(ColumnNull columnNull) {
        this.columnNull = columnNull;
    }

    public ColumnForeignKey getColumnForeignKey() {
        return columnForeignKey;
    }

    public void setColumnForeignKey(ColumnForeignKey columnForeignKey) {
        this.columnForeignKey = columnForeignKey;
    }
}
