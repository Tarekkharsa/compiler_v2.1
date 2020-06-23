package Java.AST.QueryStmt.AlterStatement;

public class AlterTableAdd {
    private TableConstraint tableConstraint ;
    private String Add;

    public String getAdd() {
        return Add;
    }

    public void setAdd(String add) {
        Add = add;
    }

    public TableConstraint getTableConstraint() {
        return tableConstraint;
    }

    public void setTableConstraint(TableConstraint tableConstraint) {
        this.tableConstraint = tableConstraint;
    }
}
