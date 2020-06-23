package Java.AST;

import Java.AST.Function.FunctionDeclaration;
//import Java.AST.QueryStmt.Join;
import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node {
    private List<Statement> sqlStmts = new ArrayList<Statement>();

//    public List<Join> getJoins() {
//        return joins;
//    }
//
//    public void setJoins(List<Join> joins) {
//        this.joins = joins;
//    }

//    private List<Join> joins = new ArrayList<>();
//    private List<FunctionDeclaration> functions = new ArrayList<FunctionDeclaration>();
    private  List<DefAllObject> defAllObject;

    public void addQuery(Statement query) {
        this.sqlStmts.add(query);
    }

    public void setSqlStmts(List<Statement> sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public List<DefAllObject> getDefAllObject() {
        return defAllObject;
    }

    public void setDefAllObject(List<DefAllObject> defAllObject) {
        this.defAllObject = defAllObject;
    }

//    public void setFunctions(List<FunctionDeclaration> functions) {
//        this.functions = functions;
//    }

    public List<Statement> getSqlStmts() {
        return sqlStmts;
    }

//    public List<FunctionDeclaration> getFunctions() {
//        return functions;
//    }

    @Override
    public String toString() {

//        if (!getSqlStmts().isEmpty()) {
//            return "sql stmts = " + getSqlStmts().get(0).getName();
//        }
////        if(!getJoins().isEmpty()){
////                if(getJoins().get(0).isInner()){
////                    return "inner = " + getJoins().get(0).getJoinOperator();
////                }else if(getJoins().get(0).isLeft()) {
////                    return "Left = " + getJoins().get(0).getJoinOperator();
////                }else if(getJoins().get(0).isOuter()) {
////                    return "Outer = " + getJoins().get(0).getJoinOperator();
////                }
////            }
//        if(!getDefAllObject().getFunctionDeclarations().isEmpty())
//        {
//            return "var : " + getDefAllObject().getFunctionDeclarations().get(0).getFunctionBody().getVarInit().getName();
//        }
        return "";
    }


        // return "sql stmts = "+ getSqlStmts().get(0).getName();


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
//        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
        for (int i = 0; i < this.sqlStmts.size(); i++) {
            this.sqlStmts.get(i).accept(astVisitor);
        }
//        for (int i = 0; i < this.defAllObject.getFunctionDeclarations().size(); i++) {
//            defAllObject.getFunctionDeclarations().get(i).accept(astVisitor);
//        }
//        for (int i = 0; i < this.joins.size(); i++) {
//            this.joins.get(i).accept(astVisitor);
//        }
        for (int i = 0; i < defAllObject.size(); i++) {

            defAllObject.get(i).accept(astVisitor);
        }

    }
}
