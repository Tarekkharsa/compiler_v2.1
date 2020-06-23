package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.QueryStmt.AlterStatement.AlterTableStmt;
import Java.AST.QueryStmt.DeleteStatement.DeleteStmt;
import Java.AST.QueryStmt.InsertStatement.InsertStmt;
import Java.AST.QueryStmt.SelectStmt.FactoredSelectStmt;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTable.CreateType;

public class Statement extends Node {

    private String name;
    private FactoredSelectStmt factoredSelectStmt;
    private InsertStmt insertStmt;
    private UpdateStmt updateStmt;
    private DropStmt dropStmt;
    private DeleteStmt deleteStmt;
    private AlterTableStmt alterTableStmt;
    private CreateStmt createStmt;
    private CreateType createType;

    public CreateType getCreateType() {
        return createType;
    }

    public void setCreateType(CreateType createType) {
        this.createType = createType;
    }

    public FactoredSelectStmt getFactoredSelectStmt() {
        return factoredSelectStmt;
    }

    public void setFactoredSelectStmt(FactoredSelectStmt factoredSelectStmt) {
        this.factoredSelectStmt = factoredSelectStmt;
    }

    public InsertStmt getInsertStmt() {
        return insertStmt;
    }

    public void setInsertStmt(InsertStmt insertStmt) {
        this.insertStmt = insertStmt;
    }

    public UpdateStmt getUpdateStmt() {
        return updateStmt;
    }

    public void setUpdateStmt(UpdateStmt updateStmt) {
        this.updateStmt = updateStmt;
    }

    public DropStmt getDropStmt() {
        return dropStmt;
    }

    public void setDropStmt(DropStmt dropStmt) {
        this.dropStmt = dropStmt;
    }

    public DeleteStmt getDeleteStmt() {
        return deleteStmt;
    }

    public void setDeleteStmt(DeleteStmt deleteStmt) {
        this.deleteStmt = deleteStmt;
    }

    public AlterTableStmt getAlterTableStmt() {
        return alterTableStmt;
    }

    public void setAlterTableStmt(AlterTableStmt alterTableStmt) {
        this.alterTableStmt = alterTableStmt;
    }

    public CreateStmt getCreateStmt() {
        return createStmt;
    }

    public void setCreateStmt(CreateStmt createStmt) {
        this.createStmt = createStmt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ASTVisitor astVisitor){}
}
