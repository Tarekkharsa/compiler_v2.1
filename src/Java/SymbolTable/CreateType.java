package Java.SymbolTable;

import Java.AST.Node;
import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.ColumnDef;
import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.List;

public class CreateType extends Statement {

   private AnyName anyName ;
    private List<ColumnDef> columnDefList;
    private Type type;

    public List<ColumnDef> getColumnDefList() {
        return columnDefList;
    }

    public void setColumnDefList(List<ColumnDef> columnDefList) {
        this.columnDefList = columnDefList;
    }


    public AnyName getAnyName() {
        return anyName;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
