package Java.AST.QueryStmt.AlterStatement;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.ForeignKey;
import Java.AST.QueryStmt.PrimaryKey;

public class TableConstraint {
    private String name;
    private PrimaryKey tableConstraintPrimaryKey;
    private TableConstraintKey tableConstraintKey;
    private TableConstraintUnique tableConstraintUnique;
    private String checkExpr;
    private ForeignKey foreignKeys;
    private Expr expr;
    private String Constraint;

    public String getConstraint() {
        return Constraint;
    }

    public void setConstraint(String constraint) {
        Constraint = constraint;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrimaryKey getTableConstraintPrimaryKey() {
        return tableConstraintPrimaryKey;
    }

    public void setTableConstraintPrimaryKey(PrimaryKey tableConstraintPrimaryKey) {
        this.tableConstraintPrimaryKey = tableConstraintPrimaryKey;
    }

    public TableConstraintKey getTableConstraintKey() {
        return tableConstraintKey;
    }

    public void setTableConstraintKey(TableConstraintKey tableConstraintKey) {
        this.tableConstraintKey = tableConstraintKey;
    }

    public TableConstraintUnique getTableConstraintUnique() {
        return tableConstraintUnique;
    }

    public void setTableConstraintUnique(TableConstraintUnique tableConstraintUnique) {
        this.tableConstraintUnique = tableConstraintUnique;
    }

    public String getCheckExpr() {
        return checkExpr;
    }

    public void setCheckExpr(String checkExpr) {
        this.checkExpr = checkExpr;
    }

    public ForeignKey getForeignKeys() {
        return foreignKeys;
    }

    public void setForeignKeys(ForeignKey foreignKeys) {
        this.foreignKeys = foreignKeys;
    }
}
