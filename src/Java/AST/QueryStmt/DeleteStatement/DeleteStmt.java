package Java.AST.QueryStmt.DeleteStatement;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

public class DeleteStmt extends Statement {
    private QualifiedTableName qualifiedTableName;
    private Expr expr;
    private String where;

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public QualifiedTableName getQualifiedTableName() {
        return qualifiedTableName;
    }

    public void setQualifiedTableName(QualifiedTableName qualifiedTableName) {
        this.qualifiedTableName = qualifiedTableName;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
