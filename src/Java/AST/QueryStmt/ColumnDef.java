package Java.AST.QueryStmt;

import java.util.List;

public class ColumnDef {
    private String columnName;
    private List<TypeName> TypeName;
    private List<ColumnConstraint> columnConstraint;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public List<Java.AST.QueryStmt.TypeName> getTypeName() {
        return TypeName;
    }

    public void setTypeName(List<Java.AST.QueryStmt.TypeName> typeName) {
        TypeName = typeName;
    }

    public List<ColumnConstraint> getColumnConstraint() {
        return columnConstraint;
    }

    public void setColumnConstraint(List<ColumnConstraint> columnConstraint) {
        this.columnConstraint = columnConstraint;
    }
}
