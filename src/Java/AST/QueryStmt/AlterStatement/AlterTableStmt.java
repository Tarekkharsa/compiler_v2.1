package Java.AST.QueryStmt.AlterStatement;

import Java.AST.QueryStmt.ColumnDef;
import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

public class AlterTableStmt extends Statement {
    private String AlterTableName;
    private String DataBaseName;
    private ColumnDef columnDef;
    private AlterTableAdd alterTableAdd;
    private AlterTableAddConstraint alterTableAddConstraint;
    private String RenameTo;
    private String NewTableName;

    public String getRenameTo() {
        return RenameTo;
    }

    public void setRenameTo(String renameTo) {
        RenameTo = renameTo;
    }

    public String getNewTableName() {
        return NewTableName;
    }

    public void setNewTableName(String newTableName) {
        NewTableName = newTableName;
    }

    public String getDataBaseName() {
        return DataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        DataBaseName = dataBaseName;
    }

    public AlterTableAdd getAlterTableAdd() {
        return alterTableAdd;
    }

    public void setAlterTableAdd(AlterTableAdd alterTableAdd) {
        this.alterTableAdd = alterTableAdd;
    }

    public AlterTableAddConstraint getAlterTableAddConstraint() {
        return alterTableAddConstraint;
    }

    public void setAlterTableAddConstraint(AlterTableAddConstraint alterTableAddConstraint) {
        this.alterTableAddConstraint = alterTableAddConstraint;
    }

    public String getAlterTableName() {
        return AlterTableName;
    }

    public void setAlterTableName(String alterTableName) {
        AlterTableName = alterTableName;
    }



    public ColumnDef getColumnDef() {
        return columnDef;
    }

    public void setColumnDef(ColumnDef columnDef) {
        this.columnDef = columnDef;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
