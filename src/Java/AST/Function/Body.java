package Java.AST.Function;

import Java.AST.DefAllObject;
import Java.AST.Function.Array.Array_stmt;
import Java.AST.Function.If_stmt.If_stmt;
import Java.AST.Function.If_stmt.Inline_condition_stmt;
import Java.AST.Function.Json.Call_json;
import Java.AST.Function.Json.Edit_json;
import Java.AST.Function.Json.Json_stmt;
import Java.AST.Function.Loop.For_stmt;
import Java.AST.Function.Loop.While_stmt;
import Java.AST.Function.Loop.Do_while_stmt;

import Java.AST.Function.Print.Def_print_stmt;
import Java.AST.Function.Switch.Switch_stmt;
import Java.AST.QueryStmt.Statement;
import generated.SQLParser;

import java.util.ArrayList;
import java.util.List;

public class Body {
//    private VarInit varInit;
    private List<VarInit> varInits=new ArrayList<>();
    private List<If_stmt> if_stmt = new ArrayList<>();
    private List<While_stmt> while_stmt = new ArrayList<>();
    private List<For_stmt> for_stmt = new ArrayList<>();
    private List<Do_while_stmt> do_while_stmt = new ArrayList<>();
    private List<Def_print_stmt> def_print_stmt = new ArrayList<>();
    private List<Array_stmt> Array_stmt = new ArrayList<>();
    private List<Inline_condition_stmt> inline_condition_stmt = new ArrayList<>();
    private List<Switch_stmt> switch_stmt = new ArrayList<>();
    private List<Statement> statements = new ArrayList<>();
    private List<Var_get_func> var_get_func = new ArrayList<>();
    private List<Func_argument_list> func_argument_list = new ArrayList<>();
    private List<Call_json> call_json = new ArrayList<>();
    private List<Edit_json> edit_json = new ArrayList<>();
    private List<Var_operator> var_operator = new ArrayList<>();
    private List<Json_stmt> json_stmts = new ArrayList<>();
    private ReturnStmt returnStmt;

    public ReturnStmt getReturnStmt() {
        return returnStmt;
    }

    public void setReturnStmt(ReturnStmt returnStmt) {
        this.returnStmt = returnStmt;
    }

    public List<VarInit> getVarInits() {
        return varInits;
    }

    public void setVarInits(List<VarInit> varInits) {
        this.varInits = varInits;
    }

    public List<If_stmt> getif_stmt() { return if_stmt; }
    public void setif_stmt(List<If_stmt> if_stmt) {
        this.if_stmt = if_stmt;
    }

    public List<While_stmt> getwhile_stmt() { return while_stmt; }
    public void setwhile_stmt(List<While_stmt> while_stmt) {
        this.while_stmt = while_stmt;
    }

    public List<For_stmt> getfor_stmt() { return for_stmt; }
    public void setfor_stmt(List<For_stmt> for_stmt) {
        this.for_stmt = for_stmt;
    }

    public List<Do_while_stmt> getdo_while_stmt() { return do_while_stmt; }
    public void setdo_while_stmt(List<Do_while_stmt> do_while_stmt) {
        this.do_while_stmt = do_while_stmt;
    }

    public List<Def_print_stmt> getDef_print_stmt() { return def_print_stmt; }
    public void setDef_print_stmt(List<Def_print_stmt> def_print_stmt) {
        this.def_print_stmt = def_print_stmt;
    }

    public List<Array_stmt> getArray_stmt() { return Array_stmt; }
    public void setArray_stmt(List<Array_stmt> Array_stmt) {
        this.Array_stmt = Array_stmt;
    }

    public List<Inline_condition_stmt> getInline_condition_stmt() { return inline_condition_stmt; }
    public void setInline_condition_stmt(List<Inline_condition_stmt> inline_condition_stmt)
    { this.inline_condition_stmt = inline_condition_stmt; }

    public List<Switch_stmt> getSwitch_stmt() { return switch_stmt; }
    public void setSwitch_stmt(List<Switch_stmt> switch_stmt)
    { this.switch_stmt = switch_stmt; }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Var_get_func> getVar_get_func() { return var_get_func; }
    public void setVar_get_func(List<Var_get_func> var_get_func) { this.var_get_func = var_get_func; }

    public List<Func_argument_list> getfunc_argument_list() { return func_argument_list; }
    public void setfunc_argument_list(List<Func_argument_list> func_argument_list) { this.func_argument_list = func_argument_list; }

    public List<Call_json> getCall_json() { return call_json; }
    public void setcall_json(List<Call_json> call_json) { this.call_json = call_json; }

    public List<Edit_json> getedit_json() { return edit_json; }
    public void setedit_json(List<Edit_json> edit_json) { this.edit_json = edit_json; }

    public List<Var_operator> getvar_operator() { return var_operator; }
    public void setvar_operator(List<Var_operator> var_operator) { this.var_operator = var_operator; }


    public List<Json_stmt> getJson_stmt() { return json_stmts; }
    public void setJson_stmt(List<Json_stmt> json_stmts) { this.json_stmts = json_stmts; }

}
