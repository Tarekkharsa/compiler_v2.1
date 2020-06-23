package Java.AST;

import Java.AST.Function.*;
import Java.AST.Function.If_stmt.If_stmt;
import Java.AST.Function.Json.Json_stmt;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class DefAllObject extends Node {
    private FunctionDeclaration functionDeclarations ;
    private Json_stmt json_stmt;
    private HigherOrderStmt higherOrderStmt;
    private Var_get_func var_get_func;
    private Func_argument_list funcArgumentList;
    private DefFunctionDefaultValue def_function_default_value;

    public DefFunctionDefaultValue getDef_function_default_value() {
        return def_function_default_value;
    }

    public void setDef_function_default_value(DefFunctionDefaultValue def_function_default_value) {
        this.def_function_default_value = def_function_default_value;
    }

    public HigherOrderStmt getHigherOrderStmt() {
        return higherOrderStmt;
    }

    public void setHigherOrderStmt(HigherOrderStmt higherOrderStmt) {
        this.higherOrderStmt = higherOrderStmt;
    }

    public FunctionDeclaration getFunctionDeclarations() {
        return functionDeclarations;
    }

    public void setFunctionDeclarations(FunctionDeclaration functionDeclarations) {
        this.functionDeclarations = functionDeclarations;
    }

    public Json_stmt getJson_stmt() {
        return json_stmt;
    }

    public void setJson_stmt(Json_stmt json_stmt) {
        this.json_stmt = json_stmt;
    }

    public Var_get_func getVar_get_func() {
        return var_get_func;
    }

    public void setVar_get_func(Var_get_func var_get_func) {
        this.var_get_func = var_get_func;
    }

    public Func_argument_list getFuncArgumentList() {
        return funcArgumentList;
    }

    public void setFuncArgumentList(Func_argument_list funcArgumentList) {
        this.funcArgumentList = funcArgumentList;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
