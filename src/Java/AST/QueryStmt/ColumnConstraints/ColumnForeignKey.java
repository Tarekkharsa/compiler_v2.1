package Java.AST.QueryStmt.ColumnConstraints;

import Java.AST.QueryStmt.AlterStatement.ForeignKeyClause;

public class ColumnForeignKey {
    private ForeignKeyClause foreignKeyClause;

    public ForeignKeyClause getForeignKeyClause() {
        return foreignKeyClause;
    }

    public void setForeignKeyClause(ForeignKeyClause foreignKeyClause) {
        this.foreignKeyClause = foreignKeyClause;
    }
}
