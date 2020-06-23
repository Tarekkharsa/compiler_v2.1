package Java.AST.QueryStmt;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.DeleteStatement.QualifiedTableName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class UpdateStmt extends Statement {
    private QualifiedTableName qualifiedTableName;
    List<String> columnName = new ArrayList<>();
    List<Expr> expr = new ArrayList<>();

    public QualifiedTableName getQualifiedTableName() {
        return qualifiedTableName;
    }

    public void setQualifiedTableName(QualifiedTableName qualifiedTableName) {
        this.qualifiedTableName = qualifiedTableName;
    }

    public List<String> getColumnName() {
        return columnName;
    }

    public void setColumnName(List<String> columnName) {
        this.columnName = columnName;
    }

    public List<Expr> getExpr() {
        return expr;
    }

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
