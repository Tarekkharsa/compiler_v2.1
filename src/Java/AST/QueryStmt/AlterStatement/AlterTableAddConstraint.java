package Java.AST.QueryStmt.AlterStatement;

public class AlterTableAddConstraint {
    private String name;
    private TableConstraint tableConstraint;
    private String Add;
    private String Constraint;

    public String getAdd() {
        return Add;
    }

    public void setAdd(String add) {
        Add = add;
    }

    public String getConstraint() {
        return Constraint;
    }

    public void setConstraint(String constraint) {
        Constraint = constraint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableConstraint getTableConstraint() {
        return tableConstraint;
    }

    public void setTableConstraint(TableConstraint tableConstraint) {
        this.tableConstraint = tableConstraint;
    }
}
