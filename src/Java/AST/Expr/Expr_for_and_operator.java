package Java.AST.Expr;



import Java.AST.Function.ExprVarInit;
import Java.AST.Node;
import Java.AST.QueryStmt.AnyName;

import java.util.List;

public class Expr_for_and_operator extends Node {
    private LiteralValue literalValue;
    private AnyName anyName;
    //    private List<Expr_for_and_operator> expr_for_and_operators;
    private Expr_for_and_operator expr_for_and_operator;
    private List<String> operation;
    private ExprVarInit exprVarInit;

    public ExprVarInit getExprVarInit() {
        return exprVarInit;
    }

    public void setExprVarInit(ExprVarInit exprVarInit) {
        this.exprVarInit = exprVarInit;
    }

    public List<String> getOperation() {
        return operation;
    }

    public void setOperation(List<String> operation) {
        this.operation = operation;
    }

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }

    public AnyName getAnyName() {
        return anyName;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

//    public List<Expr_for_and_operator> getExpr_for_and_operators() {
//        return expr_for_and_operators;
//    }
//
//    public void setExpr_for_and_operators(List<Expr_for_and_operator> expr_for_and_operators) {
//        this.expr_for_and_operators = expr_for_and_operators;
//    }


    public Expr_for_and_operator getExpr_for_and_operator() {
        return expr_for_and_operator;
    }

    public void setExpr_for_and_operator(Expr_for_and_operator expr_for_and_operator) {
        this.expr_for_and_operator = expr_for_and_operator;
    }
}
