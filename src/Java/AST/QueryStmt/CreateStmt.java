package Java.AST.QueryStmt;

import Java.AST.QueryStmt.AlterStatement.TableConstraint;
import Java.AST.QueryStmt.SelectOrSubQuery.SelectOrValues;
import Java.AST.QueryStmt.SelectStmt.SelectStmt;
import Java.AST.Visitor.ASTVisitor;

import java.util.List;

public class CreateStmt extends Statement {

    private String tableName;
    private String dataBaseName;
    List<TableConstraint> tableConstraints;

    private SelectStmt selectStmt;
    private List<ColumnDef> columnDefList;
    private String AS;

    public String getAS() {
        return AS;
    }

    public void setAS(String AS) {
        this.AS = AS;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public List<TableConstraint> getTableConstraints() {
        return tableConstraints;
    }

    public void setTableConstraints(List<TableConstraint> tableConstraints) {
        this.tableConstraints = tableConstraints;
    }

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }



    public List<ColumnDef> getColumnDefList() {
        return columnDefList;
    }

    public void setColumnDefList(List<ColumnDef> columnDefList) {
        this.columnDefList = columnDefList;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
