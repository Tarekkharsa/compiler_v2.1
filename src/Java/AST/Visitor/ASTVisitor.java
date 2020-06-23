package Java.AST.Visitor;

import Java.AST.DefAllObject;
import Java.AST.Function.FunctionDeclaration;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.AST.QueryStmt.AlterStatement.AlterTableStmt;
import Java.AST.QueryStmt.DeleteStatement.DeleteStmt;
import Java.AST.QueryStmt.InsertStatement.InsertStmt;
import Java.AST.QueryStmt.SelectStmt.FactoredSelectStmt;
import Java.AST.QueryStmt.SelectStmt.SelectStmt;
import Java.SymbolTable.CreateType;

public interface ASTVisitor {
    public void visit(Parse p);
//    public void visit(FunctionDeclaration funcDec);
    public void visit(DefAllObject defAllObject);
    public void visit(Statement stmt);
    public void visit(SelectStmt selectStmt);
    public void visit(CreateStmt createStmt);
    public void visit(InsertStmt insertStmt);
    public void visit(DropStmt dropStmt);
    public void visit(DeleteStmt deleteStmt);
    public void visit(UpdateStmt updateStmt);
    public void visit(FactoredSelectStmt factoredSelectStmt);
    public void visit(AlterTableStmt alterTableStmt);
    public void visit(CreateType createType);
}
