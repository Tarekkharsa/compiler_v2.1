package Java.AST.Visitor;

import Java.AST.DefAllObject;
import Java.AST.Expr.*;
import Java.AST.Function.*;
import Java.AST.Function.Array.Array_stmt;
import Java.AST.Function.If_stmt.Else;
import Java.AST.Function.If_stmt.Else_if;
import Java.AST.Function.If_stmt.If_stmt;
import Java.AST.Function.If_stmt.Inline_condition_stmt;
import Java.AST.Function.Json.*;
import Java.AST.Function.Loop.*;
import Java.AST.Function.Print.Def_print_stmt;
import Java.AST.Function.Print.Print_body;
import Java.AST.Function.Switch.Switch_stmt;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.AST.QueryStmt.AlterStatement.*;
import Java.AST.QueryStmt.ColumnConstraints.ColumnForeignKey;
import Java.AST.QueryStmt.ColumnConstraints.ColumnPrimaryKey;
import Java.AST.QueryStmt.DeleteStatement.DeleteStmt;
import Java.AST.QueryStmt.DeleteStatement.QualifiedTableName;
import Java.AST.QueryStmt.InsertStatement.InsertStmt;
import Java.AST.QueryStmt.SelectOrSubQuery.ResultColumn;
import Java.AST.QueryStmt.SelectOrSubQuery.SelectOrValues;
import Java.AST.QueryStmt.SelectOrSubQuery.TableOrSubQuery;
import Java.AST.QueryStmt.SelectStmt.*;
import Java.Main;
import Java.SymbolTable.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BaseASTVisitor implements ASTVisitor {
    private Scope currentScope;
    private String varName;
    private String varType;

    @Override
    public void visit(Parse p) {
//        System.out.println("ast parse ");
        for (Statement sqlStmt : p.getSqlStmts()) {
            visit(sqlStmt);
        }

    }

    @Override
    public void visit(DefAllObject defAllObject) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast DefAllObject ");
        if (defAllObject.getFunctionDeclarations() != null) {
            printFunctionDeclarations(defAllObject.getFunctionDeclarations());
        }
        if (defAllObject.getJson_stmt() != null) {
            printJsonStmt(defAllObject.getJson_stmt());
        }
        if (defAllObject.getVar_get_func() != null) {
            printVarGetFunc(defAllObject.getVar_get_func());
        }
        if (defAllObject.getHigherOrderStmt() != null) {
            printHigherOrderStmt(defAllObject.getHigherOrderStmt());
        }
        if (defAllObject.getFuncArgumentList() != null) {
            printFuncArgumentList(defAllObject.getFuncArgumentList());
        }
        if (defAllObject.getDef_function_default_value() != null) {
            printDefFunctionDefaultValue(defAllObject.getDef_function_default_value());
        }


    }

    private void printDefFunctionDefaultValue(DefFunctionDefaultValue def_function_default_value) {
//        System.out.println("ast def_function_default_value ");
        if (def_function_default_value.getK_function() != null) {
//            System.out.println(def_function_default_value.getK_function());
        }
        if (def_function_default_value.getAnyName() != null) {
            printAnyName(def_function_default_value.getAnyName());
        }
        if (def_function_default_value.getK_var() != null) {
            for (int i = 0; i < def_function_default_value.getK_var().size(); i++) {
//                System.out.println(def_function_default_value.getK_var().get(i));
            }
        }
        if (def_function_default_value.getBody() != null) {
            printBody(def_function_default_value.getBody());
        }
        if (def_function_default_value.getExprList() != null) {
            for (int i = 0; i < def_function_default_value.getExprList().size(); i++) {
                printExpr(def_function_default_value.getExprList().get(i));
            }
        }
    }


    private void printFuncArgumentList(Func_argument_list funcArgumentList) {
        if (funcArgumentList.getCurrentScope() != null){
            currentScope = funcArgumentList.getCurrentScope();
        }

        if (funcArgumentList.getAnyNames() != null) {
            boolean funcIsExist = false;
            String funcName = "";
            Scope funcScope = new Scope();

            for (int i = 0; i < funcArgumentList.getAnyNames().size(); i++) {
                if (i == 0){ // this is a func name
                    funcName = funcArgumentList.getAnyNames().get(i).getIDENTIFIER();
                    for (Scope scope : Main.symbolTable.getScopes()) {
                        if (scope.getTypeName().equals(Scope.FUNCTION)){
                            if (funcName.equals(scope.getFuncName())){
                                funcIsExist = true;
                                funcScope = scope;
                            }
                        }
                    }
                }
                else {
                    List<Symbol> symbols = new ArrayList<>();
                    printAnyNameExprIfAndJavaOther(funcArgumentList.getAnyNames().get(i),false,symbols ,funcArgumentList.getLine());
                }
            }

            if (!funcIsExist){
                System.err.println("Error in line: "+funcArgumentList.getLine()+" "+funcName+" function is not found");
            }
            else { // we will check params number
                int numOfParams = funcScope.getNumOfFuncParams();
                if (numOfParams != funcArgumentList.getAnyNames().size() -1){
                    System.err.println("Error in line: "+funcArgumentList.getLine()+" "+funcName+" params invalid");
                }
            }
        }
    }

    private void printHigherOrderStmt(HigherOrderStmt higherOrderStmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast higherOrderStmt ");
        if (higherOrderStmt.getK_var() != null) {
//            System.out.println(higherOrderStmt.getK_var());
        }
        if (higherOrderStmt.getK_function() != null) {
//            System.out.println(higherOrderStmt.getK_function());
        }
        if (higherOrderStmt.getIdentifier() != null) {
            for (int i = 0; i < higherOrderStmt.getIdentifier().size(); i++) {
//            System.out.println(higherOrderStmt.getIdentifier().get(i));
            }
        }
        if (higherOrderStmt.getAssign() != null) {
//            System.out.println(higherOrderStmt.getAssign());
        }
        if (higherOrderStmt.getAssign() != null) {
            printExpr(higherOrderStmt.getExpr());
        }
        if (higherOrderStmt.getK_return() != null) {
//            System.out.println(higherOrderStmt.getK_return());
        }

    }

    private void printVarGetFunc(Var_get_func var_get_func) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast var_get_func ");
        if (var_get_func.getK_var() != null) {
//            System.out.println(var_get_func.getK_var());
        }
        if (var_get_func.getFunctionn() != null) {
//            System.out.println(var_get_func.getFunctionn());
        }
        if (var_get_func.getIdentifier() != null) {
//            System.out.println(var_get_func.getIdentifier());
        }
        if (var_get_func.getAny_name() != null) {
            for (int i = 0; i < var_get_func.getAny_name().size(); i++) {
                printAnyName(var_get_func.getAny_name().get(i));

            }
        }
        if (var_get_func.getAssign() != null) {
//            System.out.println(var_get_func.getAssign());
        }
    }

    private void printJsonStmt(Json_stmt json_stmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast json_stmt ");
        if (json_stmt.getK_var() != null) {
//            System.out.println(json_stmt.getK_var());
        }
        if (json_stmt.getAnyName() != null) {
            printAnyName(json_stmt.getAnyName());
        }
        if (json_stmt.getAssign() != null) {
//            System.out.println(json_stmt.getAssign());
        }
        if (json_stmt.getJson_arrays() != null) {
            for (int i = 0; i < json_stmt.getJson_arrays().size(); i++) {
                printJsonArrays(json_stmt.getJson_arrays().get(i));
            }
        }
        if (json_stmt.getJson_attributes() != null) {
            for (int i = 0; i < json_stmt.getJson_attributes().size(); i++) {
                printJsonAttributes(json_stmt.getJson_attributes().get(i));
            }
        }
        if (json_stmt.getJson_objs() != null) {
            for (int i = 0; i < json_stmt.getJson_objs().size(); i++) {
                printJsonObjs(json_stmt.getJson_objs().get(i));
            }
        }

    }

    private void printJsonObjs(Json_obj json_obj) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast json_obj ");
        if (json_obj.getIdentifier() != null) {
//            System.out.println(json_obj.getIdentifier());
        }
        if (json_obj.getORM() != null) {
//            System.out.println(json_obj.getORM());
        }
        if (json_obj.getJson_arrays() != null) {
            for (int i = 0; i < json_obj.getJson_arrays().size(); i++) {
                printJsonArrays(json_obj.getJson_arrays().get(i));
            }
        }
        if (json_obj.getJson_attributes() != null) {
            for (int i = 0; i < json_obj.getJson_attributes().size(); i++) {
                printJsonAttributes(json_obj.getJson_attributes().get(i));
            }
        }
        if (json_obj.getJson_objs() != null) {
            for (int i = 0; i < json_obj.getJson_objs().size(); i++) {
                printJsonObjs(json_obj.getJson_objs().get(i));
            }
        }
    }

    private void printJsonAttributes(Json_attribute json_attribute) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast json_attribute");
        if (json_attribute.getIdentifier() != null) {
//            System.out.println(json_attribute.getIdentifier());
        }
        if (json_attribute.getORM() != null) {
//            System.out.println(json_attribute.getORM());
        }
        if (json_attribute.getExpr() != null) {
            printExpr(json_attribute.getExpr());
        }
    }

    private void printJsonArrays(Json_array json_array) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast json_array");
        if (json_array.getIdentifier() != null) {
//            System.out.println(json_array.getIdentifier());
        }
        if (json_array.getORM() != null) {
//            System.out.println(json_array.getORM());
        }
        if (json_array.getAnyNames() != null) {
            for (int i = 0; i < json_array.getAnyNames().size(); i++) {
                printAnyName(json_array.getAnyNames().get(i));
            }
        }
        if (json_array.getJson_objs() != null) {
            for (int i = 0; i < json_array.getJson_objs().size(); i++) {
                printJsonObjs(json_array.getJson_objs().get(i));
            }
        }
        if (json_array.getSignedNumbers() != null) {
            for (int i = 0; i < json_array.getSignedNumbers().size(); i++) {
                printSignedNumbers(json_array.getSignedNumbers().get(i));
            }
        }
    }

    private void printFunctionDeclarations(FunctionDeclaration functionDeclarations) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast functionDeclarations");
//        if (functionDeclarations.getK_var() != null) {
////            System.out.println(functionDeclarations.getK_var());
//        }
        if (functionDeclarations.getK_function() != null) {
//            System.out.println(functionDeclarations.getK_function());
        }
        if (functionDeclarations.getAnyNames() != null) {
            for (int i = 0; i < functionDeclarations.getAnyNames().size(); i++) {

                printAnyName(functionDeclarations.getAnyNames().get(i));
            }
        }
        if (functionDeclarations.getBody() != null) {
            printBody(functionDeclarations.getBody());
        }
    }

    private void printBody(Body body) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast Body");
        if (body.getVarInits() != null) {
            for (int i = 0; i < body.getVarInits().size(); i++) {
                printVarInits(body.getVarInits().get(i));
            }
        }
        if (body.getArray_stmt() != null) {
            for (int i = 0; i < body.getArray_stmt().size(); i++) {
                printArrayStmt(body.getArray_stmt().get(i));

            }
        }
        if (body.getCall_json() != null) {
            for (int i = 0; i < body.getCall_json().size(); i++) {
                printCallJson(body.getCall_json().get(i));

            }
        }
        if (body.getDef_print_stmt() != null) {
            for (int i = 0; i < body.getDef_print_stmt().size(); i++) {
                printDefPrintStmt(body.getDef_print_stmt().get(i));

            }
        }
        if (body.getdo_while_stmt() != null) {
            for (int i = 0; i < body.getdo_while_stmt().size(); i++) {
                printDoWhileStmt(body.getdo_while_stmt().get(i));

            }
        }
        if (body.getedit_json() != null) {
            for (int i = 0; i < body.getedit_json().size(); i++) {
                printEditJson(body.getedit_json().get(i));

            }
        }
        if (body.getfor_stmt() != null) {
            for (int i = 0; i < body.getfor_stmt().size(); i++) {
                printForStmt(body.getfor_stmt().get(i));

            }
        }
        if (body.getfunc_argument_list() != null) {
            for (int i = 0; i < body.getfunc_argument_list().size(); i++) {
                printFuncArgumentList(body.getfunc_argument_list().get(i));

            }
        }
        if (body.getif_stmt() != null) {
            for (int i = 0; i < body.getif_stmt().size(); i++) {
                printIfStmt(body.getif_stmt().get(i));

            }
        }
        if (body.getInline_condition_stmt() != null) {
            for (int i = 0; i < body.getInline_condition_stmt().size(); i++) {
                printInlineConditionStmt(body.getInline_condition_stmt().get(i));

            }
        }
        if (body.getJson_stmt() != null) {
            for (int i = 0; i < body.getJson_stmt().size(); i++) {
                printJsonStmt(body.getJson_stmt().get(i));

            }
        }
        if (body.getSwitch_stmt() != null) {
            for (int i = 0; i < body.getSwitch_stmt().size(); i++) {
                printSwitchStmt(body.getSwitch_stmt().get(i));

            }
        }
        if (body.getVar_get_func() != null) {
            for (int i = 0; i < body.getVar_get_func().size(); i++) {
                printVarGetFunc(body.getVar_get_func().get(i));
            }
        }
        if (body.getvar_operator() != null) {
            for (int i = 0; i < body.getvar_operator().size(); i++) {
                printVarOperator(body.getvar_operator().get(i));
            }
        }
        if (body.getwhile_stmt() != null) {
            for (int i = 0; i < body.getwhile_stmt().size(); i++) {
                printWhileStmt(body.getwhile_stmt().get(i));
            }
        }
        if (body.getStatements() != null) {
            for (int i = 0; i < body.getStatements().size(); i++) {
                visit(body.getStatements().get(i));
            }
        }
        if (body.getReturnStmt() != null) {
            for (int i = 0; i < body.getvar_operator().size(); i++) {
                printVarOperator(body.getvar_operator().get(i));
            }
        }
    }

//    private void printStatements(Statement statement) {
//        if (statement.getName() != null) {
////            System.out.println();
//        }
//
//        ////////////////not Completed
//    }

    private void printWhileStmt(While_stmt while_stmt) {

        if (while_stmt.getCurrentScope() != null) {
            currentScope = while_stmt.getCurrentScope();
        }

        if (while_stmt.getK_while() != null) {
//            System.out.println(while_stmt.getK_while());
        }
        if (while_stmt.getExpr_whileList() != null) {
            List<Symbol> symbols = new ArrayList<>();
            for (int i = 0; i < while_stmt.getExpr_whileList().size(); i++) {
                ScopeChecker scopeChecker = printExprWhile(while_stmt.getExpr_whileList().get(i),new ScopeChecker(),symbols);
            }
            checkTypeOfExpr(symbols);
        }

        if (while_stmt.getBody_while() != null) {
            printBody(while_stmt.getBody_while());
        }


    }

    private void printVarOperator(Var_operator var_operator) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast var_operator");

        if (var_operator.getExpr_for_and_operator() != null) {
            printExprForAndOperator(var_operator.getExpr_for_and_operator(),false);
        }
    }

    private void printSwitchStmt(Switch_stmt switch_stmt) {
        ScopeChecker scopeChecker = new ScopeChecker();
        if (switch_stmt.getCurrentScope() != null){
            currentScope = switch_stmt.getCurrentScope();
        }

        if (switch_stmt.getAnyNames() != null) {
            for (int i = 0; i < switch_stmt.getAnyNames().size(); i++) {
                // 0 is index of anyName switch(anyName), so we will check if it was init
                if (i == 0) {
                    scopeChecker = printAnyNameExprIfAndJavaOther(switch_stmt.getAnyNames().get(i),false,new ArrayList<>(),0);
                }
                else{
                    System.err.println("Error in line: " +switch_stmt.getAnyNames().get(i).getLine()+" "+switch_stmt.getAnyNames().get(i).getIDENTIFIER()+" is not permitted");
                    printAnyName(switch_stmt.getAnyNames().get(i));
                }
            }
        }

        if (switch_stmt.getLiteralValues() != null) {
            for (int i = 0; i < switch_stmt.getLiteralValues().size(); i++) {
                printLiteralValue(switch_stmt.getLiteralValues().get(i));

                if (scopeChecker.getSymbol() != null) {
                    if (scopeChecker.getSymbol().getType() != null) {
                        if (!scopeChecker.getSymbol().getType().getName().equals(varType)) {
                            System.err.println("Error in line:" +switch_stmt.getLiteralValues().get(i).getLine()+" "+scopeChecker.getSymbol().getName() + " is another type");
                        }
                    }
                }
            }
        }
        if (switch_stmt.getSignedNumbers() != null) {
            for (int i = 0; i < switch_stmt.getSignedNumbers().size(); i++) {
                printSignedNumbers(switch_stmt.getSignedNumbers().get(i));
            }
        }
        if (switch_stmt.getBody_swich() != null) {
            for (int i = 0; i < switch_stmt.getBody_swich().size(); i++) {
                printBody(switch_stmt.getBody_swich().get(i));
            }
        }
        if (switch_stmt.getK_Break() != null) {
//            System.out.println(switch_stmt.getK_Break());
        }
        if (switch_stmt.getK_Default() != null) {
//            System.out.println(switch_stmt.getK_Default());
        }

    }

    private void printInlineConditionStmt(Inline_condition_stmt inlineStmt) {
        if (inlineStmt.getCurrentScope() != null){
            currentScope = inlineStmt.getCurrentScope();
        }

        if (inlineStmt.getExpr() != null) {
            for (int i = 0; i < inlineStmt.getExpr().size(); i++) {
                List<Symbol> symbols = new ArrayList<>();
                ScopeChecker scopeChecker = printExprInlineCond(inlineStmt.getExpr().get(i),new ScopeChecker(),symbols);

                checkTypeOfExpr(symbols);
            }
        }

        if (inlineStmt.getExprForAndOperators() != null) {
            for (int i = 0; i < inlineStmt.getExprForAndOperators().size(); i++) {
                printExprForAndOperator(inlineStmt.getExprForAndOperators().get(i),false);
            }
        }

        if (inlineStmt.getExprIf() != null) {
            List<Symbol> symbols = new ArrayList<>();
            ScopeChecker scopeChecker = printExprIf(inlineStmt.getExprIf(), false, new ScopeChecker(), symbols);

            checkTypeOfExpr(symbols);
        }

//        if (inlineStmt.getExprIf() != null) {
//            List<Symbol> symbols = new ArrayList<>();
//            for (int i = 0; i < inlineStmt.getExprIf().getExpr_ifs().size(); i++) {
//                ScopeChecker scopeChecker = printExprIf(inlineStmt.getExprIf().getExpr_ifs().get(i),false, new ScopeChecker());
//
//                if (scopeChecker.getSymbol() != null)
//                    symbols.add(scopeChecker.getSymbol());
//            }
//
//            checkTypeOfExpr(symbols);
//        }

        if (inlineStmt.getQesM() != null) {
//            System.out.println(inlineStmt.getQesM());
        }
        if (inlineStmt.getOrM() != null) {
//            System.out.println(inlineStmt.getOrM());
        }
    }

    private void printIfStmt(If_stmt if_stmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast if_stmt");

        if (if_stmt.getCurrentScope() != null) {
            currentScope = if_stmt.getCurrentScope();
        }

        if (if_stmt.getK_if() != null) {
//            System.out.println(if_stmt.getK_if());
        }
        if (if_stmt.getExpr_ifs() != null) {
            List<Symbol> symbols = new ArrayList<>();
            for (int i = 0; i < if_stmt.getExpr_ifs().size(); i++) {

                ScopeChecker scopeChecker = printExprIf(if_stmt.getExpr_ifs().get(i), false,new ScopeChecker(),symbols);

//                if (scopeChecker.getSymbol() != null)
//                    symbols.add(scopeChecker.getSymbol());
            }

            checkTypeOfExpr(symbols);

        }
        if (if_stmt.getBody_if() != null) {
            printBody(if_stmt.getBody_if());
        }
        if (if_stmt.getElse_ifList() != null) {
            for (int i = 0; i < if_stmt.getElse_ifList().size(); i++) {
                printElseIfList(if_stmt.getElse_ifList().get(i));
            }
        }
        if (if_stmt.getElsee() != null) {
            printElse(if_stmt.getElsee());
        }
    }

    private void checkTypeOfExpr(List<Symbol> symbols){
        // check this if(x == 15) and x is a string or number

//        if (!varType.isEmpty() && symbols.size() == 1) {
//            System.out.println("enter "+varType);
//            if (symbols.get(0).getType() != null) {
//                if (!symbols.get(0).getType().getName()
//                        .equals(varType)) {
//                    System.err.println("Type of first var doesn't equal type of second var");
//                    varType = "";
//                }
//            }
//        }else {  // check this if(x == y) and x is a string and y is a number
        if (symbols.size() > 1) {
            for (int i = 0; i < symbols.size(); i++) {
                if (i + 1 < symbols.size()) {
                    if (symbols.get(0).getType() != null && symbols.get(i + 1).getType() != null) {
                        if (!symbols.get(0).getType().getName().
                                equals(symbols.get(i + 1)
                                        .getType().getName())) {
                            System.err.println("Type of first var doesn't equal type of second var");
                            break;
                        }
                    }
                }
            }
        }
//        }
    }

    private void printElse(Else elsee) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast else");
        if (elsee.getK_else() != null) {
//            System.out.println(elsee.getK_else());
        }
        if (elsee.getBody() != null) {
            printBody(elsee.getBody());
        }
    }

    private void printElseIfList(Else_if else_if) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast else_if");
        if (else_if.getCurrentScope() != null) {
            currentScope = else_if.getCurrentScope();
        }

        if (else_if.getK_else() != null) {
//            System.out.println(else_if.getK_else());
        }
        if (else_if.getK_if() != null) {
//            System.out.println(else_if.getK_if());
        }
        if (else_if.getExpr_ifs() != null) {
            List<Symbol> symbols = new ArrayList<>();
            for (int i = 0; i < else_if.getExpr_ifs().size(); i++) {
                ScopeChecker scopeChecker = printExprIf(else_if.getExpr_ifs().get(i), false,new ScopeChecker(),symbols);

//                if (scopeChecker.getSymbol() != null)
//                    symbols.add(scopeChecker.getSymbol());
            }

            checkTypeOfExpr(symbols);
        }
        if (else_if.getBody() != null) {
            printBody(else_if.getBody());
        }
    }

    private void printForStmt(For_stmt for_stmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast for_stmt");
        if (for_stmt.getCurrentScope() != null) {
            currentScope = for_stmt.getCurrentScope();
        }

        if (for_stmt.getK_for() != null) {
//            System.out.println(for_stmt.getK_for());
        }
        if (for_stmt.getFor_rule() != null) {
            printForRule(for_stmt.getFor_rule());
        }
        if (for_stmt.getForeach_rule() != null) {
            printForeachRule(for_stmt.getForeach_rule());
        }
        if (for_stmt.getBody_for() != null) {
            printBody(for_stmt.getBody_for());
        }
    }

    private void printForRule(For_rule for_rule) {
        if (for_rule.getK_var() != null) {
//            System.out.println(for_rule.getK_var());
        }

        if (for_rule.getExpr_for_and_operators() != null) {
            for (int i = 0; i < for_rule.getExpr_for_and_operators().size(); i++) {
                if (i == 0 && for_rule.getK_var() != null){
                    printExprForAndOperator(for_rule.getExpr_for_and_operators().get(i),true);
                }else {
                    printExprForAndOperator(for_rule.getExpr_for_and_operators().get(i),false);
                }

            }
        }
        if (for_rule.getExpr_if() != null) {
            List<Symbol> symbols = new ArrayList<>();

            ScopeChecker scopeChecker = printExprIf(for_rule.getExpr_if(), true,new ScopeChecker(),symbols);

            if (scopeChecker.getSymbol() != null) {
                if (scopeChecker.isFound() && !scopeChecker.isAssigned()) {
                    System.err.println("Warning in line: "+for_rule.getExpr_if().getLine()+" " + scopeChecker.getSymbol().getName() + " is never assigned");
                }
            }

            checkTypeOfExpr(symbols);
        }

    }

    private void printForeachRule(Foreach_rule foreach_rule) {
        if (foreach_rule.getK_var() != null) {
        }
        if (foreach_rule.getAnyNames() != null) {
            for (int i = 0; i < foreach_rule.getAnyNames().size(); i++) {
                if (i == 1){
                    printAnyNameExprIfAndJavaOther(foreach_rule.getAnyNames().get(i),false,new ArrayList<>(),foreach_rule.getLine());
                }else {
                    printAnyName(foreach_rule.getAnyNames().get(i));
                }
            }
        }
    }

    private void printEditJson(Edit_json edit_json) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast edit_json");
        if (edit_json.getAnyNameList() != null) {
            for (int i = 0; i < edit_json.getAnyNameList().size(); i++) {
                printAnyName(edit_json.getAnyNameList().get(i));
            }
        }
        if (edit_json.getDot() != null) {
            for (int i = 0; i < edit_json.getDot().size(); i++) {
//                System.out.println(edit_json.getDot().get(i));
            }
        }
        if (edit_json.getAssin() != null) {
//            System.out.println(edit_json.getAssin());
        }
        if (edit_json.getSignedNumber() != null) {
            printSignedNumbers(edit_json.getSignedNumber());
        }
        if (edit_json.getExpr() != null) {
            printExpr(edit_json.getExpr());
        }

    }

    private void printDoWhileStmt(Do_while_stmt do_while_stmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast do_while_stmt");
        if (do_while_stmt.getK_do() != null) {
//            System.out.println(do_while_stmt.getK_do());
        }
        if (do_while_stmt.getBody_do_while() != null) {
            printBody(do_while_stmt.getBody_do_while());
        }
        if (do_while_stmt.getWhile_do() != null) {
            printWhileDo(do_while_stmt.getWhile_do());
        }
    }

    private void printWhileDo(While_do_stmt while_do) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast while_do");
        if (while_do.getK_while() != null) {
//            System.out.println(while_do.getK_while());
        }

        if (while_do.getExpr_while().getExpr_while() != null) {
            List<Symbol> symbols = new ArrayList<>();

            ScopeChecker scopeChecker = printExprWhile(while_do.getExpr_while(), new ScopeChecker(),symbols);

            checkTypeOfExpr(symbols);
        }

//        if (while_do.getExpr_while().getExpr_while() != null) {
//            List<Symbol> symbols = new ArrayList<>();
//            for (int i = 0; i < while_do.getExpr_while().getExpr_while().size(); i++) {
//                ScopeChecker scopeChecker = printExprWhile(while_do.getExpr_while().getExpr_while().get(i), new ScopeChecker(),symbols);
//
//                if (scopeChecker.getSymbol() != null){
//                    symbols.add(scopeChecker.getSymbol());
//                }
//            }
//            checkTypeOfExpr(symbols);
//        }
    }

    private void printDefPrintStmt(Def_print_stmt def_print_stmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast def_print_stmt");
        if (def_print_stmt.getPrint() != null) {

//            System.out.println(def_print_stmt.getPrint());

        }
        if (def_print_stmt.getPrint_body() != null) {
            printPrintBody(def_print_stmt.getPrint_body());
        }
    }

    private void printPrintBody(Print_body print_body) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast print_body");
        if (print_body.getCall_json() != null) {
            printCallJson(print_body.getCall_json());
        }
        if (print_body.getExpr_prints() != null) {
            for (int i = 0; i < print_body.getExpr_prints().size(); i++) {
                printExpr(print_body.getExpr_prints().get(i));

            }
        }
    }

    private void printCallJson(Call_json call_json) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast call_json");
        if (call_json.getAnyName() != null) {
            for (int i = 0; i < call_json.getAnyName().size(); i++) {
                printAnyName(call_json.getAnyName().get(i));
            }
        }
    }

    private void printArrayStmt(Array_stmt array_stmt) {
//        System.out.println("--------------------------------------");
//        System.out.println(" ast array_stmt");
        if (array_stmt.getName() != null) {
//            System.out.println(array_stmt.getName());
        }
        if (array_stmt.getAny_name() != null) {
            for (int i = 0; i < array_stmt.getAny_name().size(); i++) {
                printAnyName(array_stmt.getAny_name().get(i));
            }
        }
        if (array_stmt.getSigned_number() != null) {
            for (int i = 0; i < array_stmt.getSigned_number().size(); i++) {
                printSignedNumbers(array_stmt.getSigned_number().get(i));
            }

        }
        if (array_stmt.getSql_stmt_list() != null) {
            for (int i = 0; i < array_stmt.getSql_stmt_list().size(); i++) {
                visit(array_stmt.getSql_stmt_list().get(i));

            }
        }

    }

    private void printVarInits(VarInit varInit) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast VarInit");
        Symbol varSymbol = new Symbol();
        if (varInit.getCurrentScope() != null){
            currentScope = varInit.getCurrentScope();
        }

        if (varInit.getK_var() != null) {
//            System.out.println(varInit.getK_var());
        }
        if (varInit.getAnyName() != null) {
            ScopeChecker scopeChecker = printAnyNameExprIfAndJavaOther(varInit.getAnyName(),true, new ArrayList<>(),varInit.getLine());
            varSymbol = scopeChecker.getSymbol();
        }

        if (varInit.getExpr() != null) {
            printExprVar(varInit.getExpr(),varSymbol);
        }
    }

    @Override
    public void visit(Statement stmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast Statement ");
        if (stmt.getAlterTableStmt() != null) {
            visit(stmt.getAlterTableStmt());
        }
        if (stmt.getCreateStmt() != null) {
            visit(stmt.getCreateStmt());
        }
        if (stmt.getDeleteStmt() != null) {
            visit(stmt.getDeleteStmt());
        }
        if (stmt.getDropStmt() != null) {
            visit(stmt.getDropStmt());
        }
        if (stmt.getFactoredSelectStmt() != null) {
            visit(stmt.getFactoredSelectStmt());
        }
        if (stmt.getInsertStmt() != null) {
            visit(stmt.getInsertStmt());
        }
        if (stmt.getUpdateStmt() != null) {
            visit(stmt.getUpdateStmt());
        }
        if (stmt.getCreateType() != null) {
            visit(stmt.getCreateType());
        }


    }

    @Override
    public void visit(SelectStmt selectStmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast selectStmt ");

    }

    @Override
    public void visit(CreateStmt createStmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast createStmt " );
        if (createStmt.getDataBaseName() != null) {
//            System.out.println("DataBaseName : "+createStmt.getDataBaseName());
        }
        if (createStmt.getTableName() != null) {
//            System.out.println("TableName : "+createStmt.getTableName());
        }
        if (createStmt.getColumnDefList() != null) {
            for (int i = 0; i < createStmt.getColumnDefList().size(); i++) {
                printColumnDefList(createStmt.getColumnDefList().get(i));
            }
        }
        if (createStmt.getTableConstraints() != null) {
            for (int i = 0; i < createStmt.getTableConstraints().size(); i++) {
                printTableConstraints(createStmt.getTableConstraints().get(i));
            }
        }
        if (createStmt.getAS() != null) {
//            System.out.println(createStmt.getAS());
        }
        if (createStmt.getSelectStmt() != null) {
            printSelectStmt(createStmt.getSelectStmt());
        }


//        System.out.println("===============Symbol Table ================");

        for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
//            System.out.println("Parent Type Name " + Main.symbolTable.getDeclaredTypes().get(i).getName());

            Main.symbolTable.getDeclaredTypes().get(i).getColumns().entrySet().forEach(entry -> {
//                System.out.println("Key : "+entry.getKey() + " | TypeName: "+entry.getValue().getName());
            });
        }

    }


    @Override
    public void visit(InsertStmt insertStmt) {
//        System.out.println("--------------------------------------");
//        System.out.println(" ast insert");
        if (insertStmt.getDatabaseName() != null) {
//            System.out.println("DatabaseName : "+insertStmt.getDatabaseName());;
        }
        if (insertStmt.getTableName() != null) {
//            System.out.println("TableName : "+insertStmt.getTableName());
        }
        if (insertStmt.getColumnName() != null) {
            for (int i = 0; i < insertStmt.getColumnName().size(); i++) {
//                System.out.println("ColumnName : "+insertStmt.getColumnName().get(i));
            }

        }
        if (insertStmt.getValues() != null) {
//            System.out.println(insertStmt.getValues());
        }
        if (insertStmt.getExprs() != null) {
            for (int i = 0; i < insertStmt.getExprs().size(); i++) {
                printExpr(insertStmt.getExprs().get(i));
            }
        }
        if (insertStmt.getSelectStmt() != null) {
            printSelectStmt(insertStmt.getSelectStmt());
        }
    }


    @Override
    public void visit(DropStmt dropStmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast drop");
        if (dropStmt.getDataBaseName() != null) {
//            System.out.println(dropStmt.getDataBaseName());
        }
        if (dropStmt.getTableName() != null) {
//            System.out.println(dropStmt.getTableName());
        }
        if (dropStmt.getOrderingTerm() != null) {
            for (int i = 0; i < dropStmt.getOrderingTerm().size(); i++) {
                printOrderingTerm(dropStmt.getOrderingTerm().get(i));

            }
        }
        if (dropStmt.getExpr() != null) {
            for (int i = 0; i < dropStmt.getExpr().size(); i++) {
                printExpr(dropStmt.getExpr().get(i));

            }
        }
        if (dropStmt.getFromItem() != null) {
//            System.out.println(dropStmt.getFromItem());
        }
        if (dropStmt.getSelectOrValues() != null) {
            printSelectOrValues(dropStmt.getSelectOrValues());
        }

    }

    @Override
    public void visit(DeleteStmt deleteStmt) {
//        System.out.println("--------------------------------------");
//        System.out.println(" ast delete");

        if (deleteStmt.getQualifiedTableName() != null) {
            printQualifiedTableName(deleteStmt.getQualifiedTableName());
        }
        if (deleteStmt.getWhere() != null) {
//            System.out.println(deleteStmt.getWhere());
        }
        if (deleteStmt.getExpr() != null) {
            printExpr(deleteStmt.getExpr());
        }

    }


    @Override
    public void visit(UpdateStmt updateStmt) {
//        System.out.println("--------------------------------------");

//        System.out.println("ast Update");
        if (updateStmt.getQualifiedTableName() != null) {
            printQualifiedTableName(updateStmt.getQualifiedTableName());
        }
        if (updateStmt.getColumnName() != null) {
            for (int i = 0; i < updateStmt.getColumnName().size(); i++) {
//                System.out.println(updateStmt.getColumnName().get(i));
            }
        }
        if (updateStmt.getExpr() != null) {
            for (int i = 0; i < updateStmt.getExpr().size(); i++) {
                printExpr(updateStmt.getExpr().get(i));
            }
        }
    }


    @Override
    public void visit(FactoredSelectStmt factoredSelectStmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast FactoredSelectStmt");

        if (factoredSelectStmt.getSelectCore() != null) {

            printSelectCore(factoredSelectStmt.getSelectCore());

        }
        if (factoredSelectStmt.getOrder() != null) {
//            System.out.println(factoredSelectStmt.getOrder());
        }
        if (factoredSelectStmt.getBy() != null) {
//            System.out.println(factoredSelectStmt.getBy());
        }
        if (factoredSelectStmt.getOffset() != null) {
//            System.out.println(factoredSelectStmt.getOffset());
        }
        if (factoredSelectStmt.getLimit() != null) {
//            System.out.println(factoredSelectStmt.getLimit());
        }
        if (factoredSelectStmt.getExpr() != null) {
            for (int i = 0; i < factoredSelectStmt.getExpr().size(); i++) {
                printExpr(factoredSelectStmt.getExpr().get(i));
            }
        }
        if (factoredSelectStmt.getOrderingTerm() != null) {
            for (int i = 0; i < factoredSelectStmt.getOrderingTerm().size(); i++) {
                printOrderingTerm(factoredSelectStmt.getOrderingTerm().get(i));
            }
        }

    }


    @Override
    public void visit(AlterTableStmt alterTableStmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast Alterable" );

        if (alterTableStmt.getDataBaseName() != null) {
//            System.out.println(alterTableStmt.getDataBaseName());
        }
        if (alterTableStmt.getAlterTableName() != null) {
//            System.out.println(alterTableStmt.getAlterTableName());
        }
        if (alterTableStmt.getNewTableName() != null) {
//            System.out.println(alterTableStmt.getNewTableName());
        }

        if (alterTableStmt.getColumnDef() != null) {
            printColumnDefList(alterTableStmt.getColumnDef());
        }
        if (alterTableStmt.getRenameTo() != null) {
//            System.out.println(alterTableStmt.getRenameTo());
        }
        if (alterTableStmt.getAlterTableAdd() != null) {
            printAlterTableAdd(alterTableStmt.getAlterTableAdd());
        }
        if (alterTableStmt.getAlterTableAddConstraint() != null) {
            printAlterTableAddConstraint(alterTableStmt.getAlterTableAddConstraint());
        }


    }

    @Override
    public void visit(CreateType createType) {

        if (createType.getAnyName() != null ) {
            printAnyName(createType.getAnyName());
        }

        if (createType.getColumnDefList() != null) {
            for (int i = 0; i < createType.getColumnDefList().size(); i++) {
                printColumnDefList(createType.getColumnDefList().get(i));
            }
        }
//        for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
////            System.out.println("Parent Type Name " + Main.symbolTable.getDeclaredTypes().get(i).getName());
//
//            Main.symbolTable.getDeclaredTypes().get(i).getColumns().entrySet().forEach(entry->{
////                System.out.println("Key : "+entry.getKey() + " | TypeName: "+entry.getValue().getName());
//            });
//        }

    }


    static String tableName;
     boolean HavingName;
     boolean OrderBy;
     boolean LiteralValueName;
     boolean GroupBy;
     int FunctionCount;
     boolean WhereIN;
     int Line;
     int Col;


    private void printSelectCore(SelectCore selectCore) {

        if (selectCore.getJoinClause() != null) {
            printJoinClause(selectCore.getJoinClause());
        }
        if (selectCore.getSELECT() != null) {
//            System.out.println(selectCore.getSELECT());
        }
        if (selectCore.getTableOrSubQueries() != null) {
            for (int i = 0; i < selectCore.getTableOrSubQueries().size(); i++) {
                printTableOrSubQueries(selectCore.getTableOrSubQueries().get(i));
            }
        }
        if (selectCore.getResultColumnList() != null) {
            for (int i = 0; i < selectCore.getResultColumnList().size(); i++) {
                printResultColumns(selectCore.getResultColumnList().get(i));
            }
        }
        if (selectCore.getFrom() != null) {
//            System.out.println(selectCore.getFrom());
        }


        if (selectCore.getWhere() != null) {
//            System.out.println(selectCore.getWhere());
        }

        if (selectCore.getGroupBy() != null ) {
            printGroupBy(selectCore.getGroupBy());
        }

        if (selectCore.getExprs() != null) {
            for (int i = 0; i < selectCore.getExprs().size(); i++) {
                printExpr(selectCore.getExprs().get(i));
            }
        }



        if (selectCore.getAll() != null) {
//            System.out.println(selectCore.getAll());
        }


        if (selectCore.getDISTINCT() != null) {
//            System.out.println(selectCore.getDISTINCT());
        }

        if (selectCore.getVALUES() != null) {
//            System.out.println(selectCore.getVALUES());
        }
        if (selectCore.getHAVING() != null) {
//            System.out.println(selectCore.getHAVING());
            printHaving(selectCore.getHAVING());


        }

        if (selectCore.getScope().getParent() != null && WhereIN) {
            if(selectCore.getResultColumnList().size() > 1 ){
                System.err.println("IN Clause if return more than one column");
            }
//            for (int i = 0; i < selectCore.getScope().getParent().getSymbols().size(); i++) {
//
//            System.out.println(selectCore.getScope().getParent().getSymbols().get(i).getName());
//            System.out.println(selectCore.getScope().getParent().getSymbols().get(i).getType().getName());
//            }
        }

        if(HavingName && !LiteralValueName){
            System.err.println("Error Having clause contains only grouping functions");
        }

        if(!OrderBy){
                if (GroupBy && HavingName ) {
                    if(FunctionCount == 2){
                        System.err.println(" Group by clause can’t contain aggregate function");
                    }
                }
                if(GroupBy && !HavingName){
                    if(FunctionCount > 0){
                        System.err.println(" Group by clause can’t contain aggregate function");

                    }
                }
            }


    }

    private void printGroupBy(Java.AST.QueryStmt.SelectStmt.GroupBy groupBy) {
        if(groupBy.getBy() != null){

        }
        if(groupBy.getGROUP() != null){
            GroupBy = true;
        }
        if(groupBy.getExpr() != null){
            printExpr(groupBy.getExpr());
        }
    }

    private void printHaving(Having having) {
        if(having.getK_Having() != null){
            HavingName = true;
        }
        if(having.getExpr() != null){
            printExpr(having.getExpr());
        }
    }
    private void printAlterTableAddConstraint(AlterTableAddConstraint alterTableAddConstraint) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast alterTableAddConstraint");
        if (alterTableAddConstraint.getName() != null) {
//            System.out.println(alterTableAddConstraint.getName());
        }

        if (alterTableAddConstraint.getAdd() != null) {
//            System.out.println(alterTableAddConstraint.getAdd());
        }
        if (alterTableAddConstraint.getConstraint() != null) {
//            System.out.println(alterTableAddConstraint.getConstraint());
        }
        if (alterTableAddConstraint.getTableConstraint() != null) {
            printTableConstraints(alterTableAddConstraint.getTableConstraint());
        }
    }

    private void printAlterTableAdd(AlterTableAdd alterTableAdd) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast alterTableAdd");
        if (alterTableAdd.getAdd() != null) {
//            System.out.println(alterTableAdd.getAdd());
        }
        if (alterTableAdd.getTableConstraint() != null) {
            printTableConstraints(alterTableAdd.getTableConstraint());
        }
    }

    private void printQualifiedTableName(QualifiedTableName qualifiedTableName) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast qualifiedTableName");
        if (qualifiedTableName.getDataBaseName() != null) {
//            System.out.println(qualifiedTableName.getDataBaseName());
        }
        if (qualifiedTableName.getTableName() != null) {
//            System.out.println(qualifiedTableName.getTableName());
        }
        if (qualifiedTableName.getIndexName() != null) {
//            System.out.println(qualifiedTableName.getIndexName());
        }

    }

    private void printExprVar(Expr expr, Symbol varSymbol) {
        if (expr == null) {
            return;
        }

        if (expr.getColumnName() != null) {
            AnyName anyName = new AnyName();
            anyName.setIDENTIFIER(expr.getColumnName());
            ScopeChecker scopeChecker = getAllParentScopes(currentScope,anyName,new ScopeChecker());
            if (!scopeChecker.isFound()) {
                System.err.println("Error in line: "+expr.getLine()+" "+anyName.getIDENTIFIER() + " is not found");
            }

            if (scopeChecker.isFound() && !scopeChecker.isAssigned()) {
                System.err.println("Warning in line: "+expr.getLine()+" "+ anyName.getIDENTIFIER() + " is never assigned");
            }

            if (scopeChecker.getSymbol() != null && varSymbol != null){
                if (varSymbol.getType() != null && scopeChecker.getSymbol().getType() != null) {
                    if (!scopeChecker.getSymbol().getType().getName()
                            .equals(varSymbol.getType().getName())) {
                        System.err.println("Error in line: "+expr.getLine()+ " Type of first var doesn't equal type of second var");
                    }
                }
            }
        }
        if (expr.getLiteralValue() != null) {
            printLiteralValue(expr.getLiteralValue());

            if(varSymbol != null) {
                if (varSymbol.getType() != null) {
                    if (!varSymbol.getType().getName()
                            .equals(varType)) {
                        System.err.println("Error in line: "+expr.getLine()+ " Type of first var doesn't equal type of second var");
                    }
                }
            }
        }

        if (expr.getSelectStmt() != null) {
            printSelectStmt(expr.getSelectStmt());
        }
        if (expr.getSql_stmt_list() != null) {
            for (int i = 0; i < expr.getSql_stmt_list().size(); i++) {
                visit(expr.getSql_stmt_list().get(i));
            }
        }
        if (expr.getExprs() != null) {
            for (int i = 0; i < expr.getExprs().size(); i++) {
                printExprVar(expr.getExprs().get(i),varSymbol);
            }
        }
    }

    List<String> list = new ArrayList<>();
    List<String> listKey = new ArrayList<>();
    private void printExpr(Expr expr) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast expr");
        if (expr == null) {
            return;
        }


        if (expr.getSql_stmt_list() != null) {
            for (int i = 0; i < expr.getSql_stmt_list().size(); i++) {
                visit(expr.getSql_stmt_list().get(i));
            }
        }
        if(expr.getDatabaseName() != null){
//            System.out.println("DatabaseName : "+expr.getDatabaseName());
        }
        if(expr.getTableName() != null){
//            System.out.println("TableName : "+expr.getTableName());
//            tableName = expr.getTableName();
            checkIfTableExists(expr.getTableName(),expr.getLine(),expr.getCol());
        }

        if(expr.getFunctionName() != null){

            if (GroupBy) {

                FunctionCount++;
            }
        }

        if (expr.getColumnName() != null) {

            if (WhereIN ) {
//            System.out.println(tableName+expr.getColumnName());
                for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                    String name = Main.symbolTable.getDeclaredTypes().get(i).getName();
                    Main.symbolTable.getDeclaredTypes().get(i).getColumns().forEach((key, value) -> {
                        if (key.equals(expr.getColumnName()) && name.equals(tableName) ) {
                            list.add(value.getName());
                            listKey.add(key);
                        }

                    });

                }

                if (list.size() == 2) {
                    if (!list.get(0).equals(list.get(1))){
                        System.err.println("Error in line "+expr.getLine()+" Also "+listKey.get(0)+" and "+listKey.get(1)+" should be from the same type");
                    }
                }


            }


        }

        if (expr.getLiteralValue() != null  ) {

            if(HavingName){

                LiteralValueName = true;
            }

            printLiteralValue(expr.getLiteralValue());


        }
        if(expr.getK_IN() != null){
            WhereIN = true;
        }

        if (expr.getUnaryOperator() != null ) {
            printUnaryOperator(expr.getUnaryOperator());
        }
        if (expr.getOperation() != null) {
//            for (int i = 0; i < expr.getOperation().size(); i++) {
////                System.out.println("Operation : " +expr.getOperation().get(i));
//            }
        }
        if (expr.getSelectStmt() != null) {
            printSelectStmt(expr.getSelectStmt());
        }
        if (expr.getExprs() != null ) {
            for (int i = 0; i < expr.getExprs().size(); i++) {
                printExpr(expr.getExprs().get(i));
            }
        }

        if ( expr.getColumnName() !=null && tableName != null) {

            if(Main.symbolTable.getDeclaredTypes().size() > 0){
                for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                    if (Main.symbolTable.getDeclaredTypes().get(i).getName().equals(tableName)) {
                        checkColInTable(expr.getColumnName() , tableName ,expr.getLine());//////////// test
                    }
                }
            }
        }


    }

    private ScopeChecker printExprInlineCond(Expr expr, ScopeChecker scopeChecker, List<Symbol> symbols) {
        if (expr == null) {
            return scopeChecker;
        }

        if (expr.getExprs() != null) {
            if (expr.getExprs().size() > 0) {
                for (int i = 0; i < expr.getExprs().size(); i++) {
                    scopeChecker = printExprInlineCond(expr.getExprs().get(i), scopeChecker,symbols);
                }
            }
        }

        if (expr.getColumnName() != null) {
            if (currentScope != null) {
                AnyName anyName = new AnyName();
                anyName.setIDENTIFIER(expr.getColumnName());
                scopeChecker = getAllParentScopes(currentScope, anyName,new ScopeChecker());
                if (!scopeChecker.isFound()) {
                    System.err.println("Error in line:"+expr.getLine()+" "+anyName.getIDENTIFIER() + " is not found");
                }

                if (scopeChecker.isFound()){
                    symbols.add(scopeChecker.getSymbol());
                }

                if (scopeChecker.isFound() && !scopeChecker.isAssigned()){
                    System.err.println("Warning in line:"+expr.getLine()+" "+anyName.getIDENTIFIER() + " is never assigned");
                }
            }
        }
        if (expr.getLiteralValue() != null) {
            printLiteralValue(expr.getLiteralValue(),symbols);
        }

        if (expr.getSelectStmt() != null) {
            printSelectStmt(expr.getSelectStmt());
        }

        return scopeChecker;
    }

    private void printExpr(Expr_Print expr) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast expr");
        if (expr == null) {
            return;
        }

        if (expr.getDatabaseName() != null) {
//            System.out.println("DatabaseName : "+expr.getDatabaseName());
        }
        if (expr.getTableName() != null) {
//            System.out.println("TableName : "+expr.getTableName());
        }
        if (expr.getFunctionName() != null) {
//            System.out.println("FunctionName : "+expr.getFunctionName());
        }

        if (expr.getColumnName() != null) {
//            System.out.println("Expr : "+expr.getColumnName());
            return;
        }
        if (expr.getLiteralValue() != null) {
            printLiteralValue(expr.getLiteralValue());
        }
        if (expr.getUnaryOperator() != null) {
            printUnaryOperator(expr.getUnaryOperator());
        }
        if (expr.getOperation() != null) {
            for (int i = 0; i < expr.getOperation().size(); i++) {
//                System.out.println("Operation : " +expr.getOperation().get(i));
            }
        }
        if (expr.getSelectStmt() != null) {
            printSelectStmt(expr.getSelectStmt());
        }
    }

    private void printExprForAndOperator(Expr_for_and_operator expr, boolean isKeyVarExist) {
        if (expr == null) {
            return;
        }

        if (expr.getLiteralValue() != null) {
            printLiteralValue(expr.getLiteralValue());
        }

        if (expr.getExpr_for_and_operator() != null) {
            printExprForAndOperator(expr.getExpr_for_and_operator(),isKeyVarExist);
        }

        if (expr.getAnyName() != null) {
            List<Symbol> symbols = new ArrayList<>();
            printAnyNameExprIfAndJavaOther(expr.getAnyName(),true,symbols, expr.getLine());
        }

        if (expr.getExprVarInit() != null){
            printExprForVarInit(expr.getExprVarInit(),isKeyVarExist);
        }
    }

    private void printExprForVarInit(ExprVarInit exprVarInit, boolean isKeyVarExist) {
        Symbol varSymbol = new Symbol();

        if (exprVarInit.getCurrentScope() != null) {
            currentScope = exprVarInit.getCurrentScope();
        }

        if (!isKeyVarExist) {
            if (exprVarInit.getAnyName() != null) {
                List<Symbol> symbols = new ArrayList<>();
                ScopeChecker scopeChecker = printAnyNameExprIfAndJavaOther(exprVarInit.getAnyName(), true,symbols,exprVarInit.getLine());
                varSymbol = scopeChecker.getSymbol();
            }

            if (exprVarInit.getExpr() != null) {
                printExprVar(exprVarInit.getExpr(), varSymbol);
            }
        }
    }


    private ScopeChecker printExprIf(Expr_if expr, boolean isInsideForStmt, ScopeChecker scopeChecker,List<Symbol> symbols) {
        if (expr == null) {
            return new ScopeChecker();
        }

        if (expr.getLiteralValue() != null) {
            printLiteralValue(expr.getLiteralValue(),symbols);
        }

        if (expr.getOperation() != null) {
            for (int i = 0; i < expr.getOperation().size(); i++) {
            }
        }

        if (expr.getExpr_ifs() != null){
            for (int i = 0; i < expr.getExpr_ifs().size(); i++) {
                scopeChecker = printExprIf(expr.getExpr_ifs().get(i),isInsideForStmt,scopeChecker,symbols);
            }
        }

        if (expr.getAnyNames() != null) {
            for (int i = 0; i < expr.getAnyNames().size(); i++) {
                if (isInsideForStmt)
                    scopeChecker = printAnyNameExprIfAndJavaOther(expr.getAnyNames().get(i),true,symbols,expr.getLine());
                else
                    scopeChecker = printAnyNameExprIfAndJavaOther(expr.getAnyNames().get(i),false,symbols,expr.getLine());
            }
        }
        return scopeChecker;
    }

    private ScopeChecker printExprWhile(Expr_while expr, ScopeChecker scopeChecker,List<Symbol> symbols ) {
        if (expr == null) {
            return new ScopeChecker();
        }

        if (expr.getLiteralValue() != null) {
            printLiteralValue(expr.getLiteralValue(),symbols);
        }

        if (expr.getExpr_while() != null) {
            for (int i = 0; i < expr.getExpr_while().size(); i++) {
                scopeChecker = printExprWhile(expr.getExpr_while().get(i),scopeChecker,symbols);
            }
        }

        if (expr.getAnyNamesList() != null) {
            for (int i = 0; i < expr.getAnyNamesList().size(); i++) {
                scopeChecker = printAnyNameExprIfAndJavaOther(expr.getAnyNamesList().get(i),false,symbols,expr.getLine());
            }
        }

        return scopeChecker;
    }

    private void printUnaryOperator(UnaryOperator unaryOperator) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast unaryOperator");
        if (unaryOperator.getNot() != null) {
//            System.out.println("Operator : "+ unaryOperator.getNot());
        }
        if (unaryOperator.getMinus() != null) {
//            System.out.println("Operator : "+ unaryOperator.getMinus());
        }
        if (unaryOperator.getPlus() != null) {
//            System.out.println("Operator : "+ unaryOperator.getPlus());
        }
        if (unaryOperator.getTilde() != null) {
//            System.out.println("Operator : "+ unaryOperator.getTilde());
        }
    }

    private void printLiteralValue(LiteralValue literalValue, List<Symbol> symbols) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast literalValue");
        if (literalValue.getCurrentTimeStamp() != null) {
//            System.out.println(literalValue.getCurrentTimeStamp());
        }
        if (literalValue.getCurrentTime() != null) {
//            System.out.println(literalValue.getCurrentTime() );
        }
        if (literalValue.getNullValue() != null) {
//            System.out.println(literalValue.getNullValue() );
        }
        if (literalValue.getBlobValue() != null) {
//            System.out.println(literalValue.getBlobValue() );
        }
        Symbol s = new Symbol();
        if (literalValue.getNumericalValue() != null) {
            varType = Type.NUMBER_CONST; // this for for_stmt
            Type type = new Type();
            type.setName(varType);
            s.setType(type);
            s.setName("literal number");
            symbols.add(s);
        }
        if (literalValue.getStringValue() != null) {
            varType = Type.STRING_CONST; // this for for_stmt
            Type type = new Type();
            type.setName(varType);
            s.setType(type);
            s.setName("literal string");
            symbols.add(s);
        }
    }

    private void printLiteralValue(LiteralValue literalValue) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast literalValue");
        if (literalValue.getCurrentTimeStamp() != null) {
//            System.out.println(literalValue.getCurrentTimeStamp());
        }
        if (literalValue.getCurrentTime() != null) {
//            System.out.println(literalValue.getCurrentTime() );
        }
        if (literalValue.getNullValue() != null) {
//            System.out.println(literalValue.getNullValue() );
        }
        if (literalValue.getBlobValue() != null) {
//            System.out.println(literalValue.getBlobValue() );
        }
        if (literalValue.getNumericalValue() != null) {
            varType = Type.NUMBER_CONST; // this for for_stmt
        }
        if (literalValue.getStringValue() != null) {
            varType = Type.STRING_CONST; // this for for_stmt
        }
    }

    private void printSelectOrValues(SelectOrValues selectOrValues) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast selectOrValues");
        if (selectOrValues.getResultColumns() != null) {
            for (int i = 0; i < selectOrValues.getResultColumns().size(); i++) {
                printResultColumns(selectOrValues.getResultColumns().get(i));

            }
        }
        if (selectOrValues.getFrom() != null) {
//            System.out.println(selectOrValues.getFrom());
        }
        if (selectOrValues.getJoinClause() != null) {
            printJoinClause(selectOrValues.getJoinClause());
        }
        if (selectOrValues.getTableOrSubQueries() != null) {
            for (int i = 0; i < selectOrValues.getTableOrSubQueries().size(); i++) {
                printTableOrSubQueries(selectOrValues.getTableOrSubQueries().get(i));
            }
        }
        if (selectOrValues.getExpr() != null) {
            for (int i = 0; i < selectOrValues.getExpr().size(); i++) {
                printExpr(selectOrValues.getExpr().get(i));
            }
        }

    }

    private void printTableOrSubQueries(TableOrSubQuery tableOrSubQuery) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast tableOrSubQuery");
        if (tableOrSubQuery == null) {
            return;
        }
        if (tableOrSubQuery.getDataBaseName() != null) {
//            System.out.println(tableOrSubQuery.getDataBaseName());
        }
        if (tableOrSubQuery.getTableName() != null) {
//            System.out.println("TableName : "+tableOrSubQuery.getTableName());
            tableName = tableOrSubQuery.getTableName();

            checkIfTableExists(tableOrSubQuery.getTableName() ,tableOrSubQuery.getLine() , tableOrSubQuery.getCol());
        }
        if (tableOrSubQuery.getIndexName() != null) {
//            System.out.println("IndexName : "+tableOrSubQuery.getIndexName());
        }
        if (tableOrSubQuery.getResultColumn() != null) {
            printResultColumns(tableOrSubQuery.getResultColumn());
        }
        if (tableOrSubQuery.getJoinClause() != null) {
            printJoinClause(tableOrSubQuery.getJoinClause());
        }
        if (tableOrSubQuery.getSelectOrValues() != null) {
            printSelectOrValues(tableOrSubQuery.getSelectOrValues());
        }
        if (tableOrSubQuery.getTableOrSubQueries() != null) {
            for (int i = 0; i < tableOrSubQuery.getTableOrSubQueries().size(); i++) {
                printTableOrSubQueries(tableOrSubQuery.getTableOrSubQueries().get(i));
            }
        }
        if (tableOrSubQuery.getTableAlias() != null) {
//            System.out.println(tableOrSubQuery.getTableAlias());
        }
    }

    private void checkIfTableExists(String table , int line , int col){
        AtomicBoolean checkTable = new AtomicBoolean(false);
        for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
            String name = Main.symbolTable.getDeclaredTypes().get(i).getName();
            if ( name.equals(table)) {
                checkTable.set(true);
            }

        }
        if(!checkTable.get()){
            System.err.println("Error in line:"+line +" col:"+col +" "+table+ " not found "  );
        }
    }

    private void printJoinClause(JoinClause joinClause) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast joinClause");
        if (joinClause.getJoinOperator() != null) {
            for (int i = 0; i < joinClause.getJoinOperator().size(); i++) {
                printJoinOperator(joinClause.getJoinOperator().get(i));
            }
        }
        if (joinClause.getTableOrSubQuery() != null) {
            for (int i = 0; i < joinClause.getTableOrSubQuery().size(); i++) {
                printTableOrSubQueries(joinClause.getTableOrSubQuery().get(i));
            }
        }

        if (joinClause.getJoinConstraint() != null) {
            for (int i = 0; i < joinClause.getJoinConstraint().size(); i++) {
                printJoinConstraint(joinClause.getJoinConstraint().get(i));
            }
        }

    }

    private void printJoinOperator(JoinOperator joinOperator) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast joinOperator");
//        if (joinOperator.getJoin() != null) {
////            System.out.println(joinOperator.getJoin());
//        }
        if (joinOperator.getInner() != null) {
//            System.out.println(joinOperator.getInner() );
        }
        if (joinOperator.getOuter() != null) {
//            System.out.println(joinOperator.getOuter());
        }

        if (joinOperator.getLeft() != null) {
//            System.out.println(joinOperator.getLeft());
        }
    }

    private void printJoinConstraint(JoinConstraint joinConstraint) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast joinConstraint");
        if (joinConstraint.getName() != null) {
//            System.out.println(joinConstraint.getName());
        }else{
            System.err.println("Error join doesn’t have ON statement with it");
        }
        if (joinConstraint.getExpr() != null) {
            printExpr(joinConstraint.getExpr());
        }
    }

    private void printResultColumns(ResultColumn resultColumn) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast resultColumn");
        if (resultColumn.getTableName() != null) {
//            System.out.println("TableName"+resultColumn.getTableName());
//            tableName = resultColumn.getTableName(); /////////////////////////////////////////////////////////////
        }
        if (resultColumn.getColumnAlias() != null) {
//            System.out.println("ColumnAlias : "+resultColumn.getColumnAlias());
        }
        if (resultColumn.getStar() != null) {
//            System.out.println(resultColumn.getStar());
            if(WhereIN){
                System.err.println("Error IN Clause if return more than one column");
            }
//            ResultColumn = true;
        }
        if (resultColumn.getExpr() != null) {
//                printExprResultColumn(resultColumn.getExpr());
            printExpr(resultColumn.getExpr());
        }


    }

    private void printExprResultColumn(Expr expr) {
        if (expr.getColumnName() != null) {
            AtomicBoolean check = new AtomicBoolean(false);
            AtomicBoolean checkTable = new AtomicBoolean(false);
//            System.out.println("Expr : "+expr.getColumnName());
//            System.out.println("table NAME : "+tableName);
            for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                String name = Main.symbolTable.getDeclaredTypes().get(i).getName();
                Main.symbolTable.getDeclaredTypes().get(i).getColumns().forEach((key, value) -> {

                    if ( name.equals(tableName)) {
                        checkTable.set(true);
                        if(expr.getColumnName().equals(key)){
                            check.set(true);
                        }
                    }

                });

            }
            if(tableName != null){
                if(!checkTable.get()){
//                   System.err.println(tableName+ " not found "  );
                }else {
                    if (!check.get()) {
                        System.err.println("Error In Line :" + expr.getLine() +" "+expr.getColumnName() + " undefined Column in " + tableName );

                    }
                }
            }


        }
    }

    private void checkColInTable( String columnName ,String table , int Line ){
        AtomicBoolean check = new AtomicBoolean(false);
        AtomicBoolean checkTable = new AtomicBoolean(false);
//            System.out.println("Expr : "+expr.getColumnName());
//            System.out.println("table NAME : "+tableName);
        for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
            String name = Main.symbolTable.getDeclaredTypes().get(i).getName();
            Main.symbolTable.getDeclaredTypes().get(i).getColumns().forEach((key, value) -> {

                if ( name.equals(table)) {
                    checkTable.set(true);
                    if(columnName.equals(key)){
                        check.set(true);
                    }
                }

            });

        }
        if(table != null){
            if(!checkTable.get()){
                System.err.println("Error in line "+Line +" "+table+ " not found "  );
            }else {
                if (!check.get()) {
                    System.err.println( "Error in line "+Line +" "+columnName + " undefined Column in " + table );

                }
            }
        }
    }

    private void printOrderingTerm(OrderingTerm orderingTerm) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast orderingTerm");
        if (orderingTerm.getExpr() != null) {
            printExpr(orderingTerm.getExpr());
        }
        if (orderingTerm.getASC() != null) {
//            System.out.println(orderingTerm.getASC());
        }
        if (orderingTerm.getDESC() != null) {
//            System.out.println(orderingTerm.getDESC());
        }
    }

    private void printColumnDefList(ColumnDef columnDef) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast columnDef");

        if (columnDef.getColumnName() != null) {
//            System.out.println("ColumnName : "+columnDef.getColumnName());
        }
        if (columnDef.getTypeName() != null) {
            for (int i = 0; i < columnDef.getTypeName().size(); i++) {
                printTypeName(columnDef.getTypeName().get(i));
            }
        }
        if (columnDef.getColumnConstraint() != null) {
            for (int i = 0; i < columnDef.getColumnConstraint().size(); i++) {
                printColumnConstraint(columnDef.getColumnConstraint().get(i));
            }
        }


    }

    private void printTypeName(TypeName typeName) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast typeName");
        if (typeName.getAnyNames() != null) {
            for (int i = 0; i < typeName.getAnyNames().size(); i++) {
                printAnyName(typeName.getAnyNames().get(i));

            }
        }
        if (typeName.getName() != null) {
            boolean check = false;
//            System.out.println("typeName : " +typeName.getName());
            for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
//            System.out.println("Parent Type Name " + Main.symbolTable.getDeclaredTypes().get(i).getName());
                if(typeName.getName().equals(Main.symbolTable.getDeclaredTypes().get(i).getName())){
                    check = true;
                }
                if(typeName.getName().equals(Type.NUMBER_CONST)){
                    check = true;
                }
                if(typeName.getName().equals(Type.STRING_CONST)){
                    check = true;
                }
                if(typeName.getName().equals(Type.BOOLEAN_CONST)){
                    check = true;
                }
            }
            if (!check) {
                System.err.println("Error in line: " + typeName.getLine()+" type " + typeName.getName() +" not Found");

            }
        }
        if (typeName.getSignedNumbers() != null) {
            for (int i = 0; i < typeName.getSignedNumbers().size(); i++) {
                printSignedNumbers(typeName.getSignedNumbers().get(i));
            }
        }

    }

    private void printSignedNumbers(SignedNumber signedNumber) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast signedNumber");
        if (signedNumber.getStar() != null) {
//            System.out.println(signedNumber.getStar());
        }
        if (signedNumber.getMinus() != null) {
//            System.out.println(signedNumber.getMinus());
        }
        if (signedNumber.getNumericLiteral() != null) {
//            System.out.println(signedNumber.getNumericLiteral());
        }
        if (signedNumber.getPlus() != null) {
//            System.out.println(signedNumber.getPlus());
        }


    }

    public static String typeName;
    private void printAnyName(AnyName anyName) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast anyName");
        if (anyName == null) {
            return;
        }
        if (anyName.getAnyName() != null) {
            printAnyName(anyName.getAnyName());
        }
        if (anyName.getIDENTIFIER() != null) {
//            System.out.println(anyName.getIDENTIFIER());
            typeName = anyName.getIDENTIFIER();

            if (anyName.getStrinagLiteral() != null) {
//                System.out.println(anyName.getStrinagLiteral());
            }
            if (anyName.getKeyword() != null) {
//                System.out.println(anyName.getKeyword());
            }
        }
    }


    private ScopeChecker printAnyNameExprIfAndJavaOther(AnyName anyName, boolean isForOrVar, List<Symbol> symbols ,int line ) {

        if (anyName == null) {
            return new ScopeChecker();
        }
        ScopeChecker scopeChecker = new ScopeChecker();
        if (anyName.getAnyName() != null) {
            printAnyNameExprIfAndJavaOther(anyName.getAnyName(),isForOrVar,symbols,line);
        }
        if (anyName.getIDENTIFIER() != null) {
            varName = anyName.getIDENTIFIER();

            if (currentScope != null) {
                scopeChecker = getAllParentScopes(currentScope, anyName,new ScopeChecker());
                if (!scopeChecker.isFound()) {
                    System.err.println("Error in line: " +line+" "+anyName.getIDENTIFIER() + " is not found");
                }

                if (scopeChecker.isFound()){
                    symbols.add(scopeChecker.getSymbol());
                }

                if (!isForOrVar) {
                    if (scopeChecker.isFound() && !scopeChecker.isAssigned()) {
                        System.err.println("Warning in line: " +line+" "+anyName.getIDENTIFIER() + " is never assigned");
                    }
                }
            }
        }

        if (anyName.getStrinagLiteral() != null) {
//            System.out.println(anyName.getStrinagLiteral());
        }
        if (anyName.getKeyword() != null) {
//            System.out.println(anyName.getKeyword());
        }

        return scopeChecker;
    }

    private ScopeChecker getAllParentScopes(Scope scope, AnyName anyName, ScopeChecker scopeChecker) {
        if (scope.getParent() != null) {

            for (Symbol symbol : scope.getParent().getSymbols()) {
                if (symbol.getName().equals(anyName.getIDENTIFIER()) && symbol.isHasKeyVar()) {
                    scopeChecker.setFound(true);
                    scopeChecker.setAssigned(symbol.isAssigned());
                    scopeChecker.setSymbol(symbol);
                    break;
                }
            }
            if (!scopeChecker.isFound()) {
                scopeChecker = getAllParentScopes(scope.getParent(), anyName,scopeChecker);
            }
        }

        return scopeChecker;
    }

    private void printColumnConstraint(ColumnConstraint columnConstraint) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast columnConstraint");
        if (columnConstraint.getColumnForeignKey() != null) {
            printColumnForeignKey(columnConstraint.getColumnForeignKey());
        }
        if (columnConstraint.getColumnNotNull() != null) {
            if (columnConstraint.getColumnNotNull().getNot() != null) {
//            System.out.println(columnConstraint.getColumnNotNull().getNot());
            }
            if (columnConstraint.getColumnNotNull().getNull() != null) {
//                System.out.println(columnConstraint.getColumnNotNull().getNull());
            }
        }
        if (columnConstraint.getColumnNull() != null) {
//            System.out.println(columnConstraint.getColumnNull().getNull());
        }
        if (columnConstraint.getColumnPrimaryKey() != null) {
            printColumnPrimaryKey(columnConstraint.getColumnPrimaryKey());
        }
    }

    private void printColumnPrimaryKey(ColumnPrimaryKey columnPrimaryKey) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast columnPrimaryKey");
        if (columnPrimaryKey.getPRIMARY() != null) {
//            System.out.println(columnPrimaryKey.getPRIMARY());
        }
        if (columnPrimaryKey.getKEY() != null) {
//            System.out.println(columnPrimaryKey.getKEY());
        }
        if (columnPrimaryKey.getASC() != null) {
//            System.out.println(columnPrimaryKey.getASC());
        }
        if (columnPrimaryKey.getDESC() != null) {
//            System.out.println(columnPrimaryKey.getDESC());
        }
        if (columnPrimaryKey.getAUTOINCREMENT() != null) {
//            System.out.println(columnPrimaryKey.getAUTOINCREMENT());
        }

    }

    private void printColumnForeignKey(ColumnForeignKey columnForeignKey) {
//        System.out.println("--------------------------------------");
//        System.out.println("columnForeignKey");
        if (columnForeignKey.getForeignKeyClause() != null) {
            printForeignKeyClause(columnForeignKey.getForeignKeyClause());
        }
    }

    private void printForeignKeyClause(ForeignKeyClause foreignKeyClause) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast foreignKeyClause");
        if (foreignKeyClause.getDatabaseName() != null) {
//            System.out.println(foreignKeyClause.getDatabaseName());
        }
        if (foreignKeyClause.getFkTargetColumnName() != null) {
            for (int i = 0; i < foreignKeyClause.getFkTargetColumnName().size(); i++) {
//                System.out.println(foreignKeyClause.getFkTargetColumnName().get(i));
            }
        }
        if (foreignKeyClause.getForeignTable() != null) {
//            System.out.println(foreignKeyClause.getForeignTable());
        }

    }

    private void printTableConstraints(TableConstraint tableConstraint) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast tableConstraint");
        if (tableConstraint.getName() != null) {
//            System.out.println(tableConstraint.getName());
        }
        if (tableConstraint.getForeignKeys() != null) {
            printForeignkeys(tableConstraint.getForeignKeys());
        }
        if (tableConstraint.getTableConstraintKey() != null) {
            printTableConstraintKey(tableConstraint.getTableConstraintKey());
        }
        if (tableConstraint.getTableConstraintPrimaryKey() != null) {
            printTableConstraintPrimaryKey(tableConstraint.getTableConstraintPrimaryKey());
        }
        if (tableConstraint.getTableConstraintUnique() != null) {
            printTableConstraintUnique(tableConstraint.getTableConstraintUnique());
        }
        if (tableConstraint.getCheckExpr() != null) {
//            System.out.println( tableConstraint.getCheckExpr());
        }
        if (tableConstraint.getExpr() != null) {
            printExpr(tableConstraint.getExpr());
        }
        if (tableConstraint.getConstraint() != null) {
//            System.out.println(tableConstraint.getConstraint());
        }
    }

    private void printTableConstraintUnique(TableConstraintUnique tableConstraintUnique) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast tableConstraintUnique");
        if (tableConstraintUnique.getUNIQUE() != null) {
//            System.out.println(tableConstraintUnique.getUNIQUE());
        }
        if (tableConstraintUnique.getKEY() != null) {
//            System.out.println(tableConstraintUnique.getKEY());
        }
        if (tableConstraintUnique.getIndexedColumn() != null) {
            for (int i = 0; i < tableConstraintUnique.getIndexedColumn().size(); i++) {
                printIndexedColumn(tableConstraintUnique.getIndexedColumn().get(i));
            }
        }
        if (tableConstraintUnique.getName() != null) {
//            System.out.println(tableConstraintUnique.getName());
        }
    }

    private void printTableConstraintPrimaryKey(PrimaryKey tableConstraintPrimaryKey) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast tableConstraintPrimaryKey");
        if (tableConstraintPrimaryKey.getName() != null) {
//            System.out.println(tableConstraintPrimaryKey.getName());
        }
        if (tableConstraintPrimaryKey.getIndexedColumn() != null) {
            for (int i = 0; i < tableConstraintPrimaryKey.getIndexedColumn().size(); i++) {
                printIndexedColumn(tableConstraintPrimaryKey.getIndexedColumn().get(i));
            }
        }


    }

    private void printIndexedColumn(IndexedColumn indexedColumn) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast indexedColumn");
        if (indexedColumn.getColumnName() != null) {
//            System.out.println("ColumnName : "+indexedColumn.getColumnName());
        }
        if (indexedColumn.getASC() != null) {
//            System.out.println(indexedColumn.getASC());
        }
        if (indexedColumn.getDESC() != null) {
//            System.out.println(indexedColumn.getDESC());
        }
        if (indexedColumn.getCOLLATE() != null) {
//            System.out.println(indexedColumn.getCOLLATE());
        }
        if (indexedColumn.getCollationName() != null) {
//            System.out.println("CollationName : "+indexedColumn.getCollationName());
        }

    }

    private void printTableConstraintKey(TableConstraintKey tableConstraintKey) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast tableConstraintKey");
        if (tableConstraintKey.getName() != null) {
//            System.out.println(tableConstraintKey.getName());
        }
    }

    private void printForeignkeys(ForeignKey foreignKeys) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast foreignKeys");
        if (foreignKeys.getForeignKeyClause() != null) {
            printForeignKeyClause(foreignKeys.getForeignKeyClause());
        }
    }

    private void printSelectStmt(SelectStmt selectStmt) {
//        System.out.println("--------------------------------------");
//        System.out.println("ast selectStmt");
        if (selectStmt.getExpr() != null) {
            for (int i = 0; i < selectStmt.getExpr().size(); i++) {
                printExpr(selectStmt.getExpr().get(i));
            }
        }
        if (selectStmt.getFromItem() != null) {
//            System.out.println("FromItem : "+selectStmt.getFromItem());
        }
        if (selectStmt.getSelectOrValues() != null) {
            printSelectOrValues(selectStmt.getSelectOrValues());
        }
        if (selectStmt.getOrderingTerm() != null) {
            for (int i = 0; i < selectStmt.getOrderingTerm().size(); i++) {
//                System.out.println(selectStmt.getOrderingTerm().get(i));
            }
        }
    }

}
