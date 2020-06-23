package Java.AST.QueryStmt;

import Java.AST.QueryStmt.SelectStmt.SelectStmt;
import Java.AST.Visitor.ASTVisitor;

public class DropStmt  extends SelectStmt {
    private String DataBaseName;
    private String TableName;


    public String getDataBaseName() {
        return DataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        DataBaseName = dataBaseName;
    }

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
