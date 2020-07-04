package Java.AST.Function.If_stmt;

import Java.AST.Expr.Expr;
import Java.AST.Expr.Expr_for_and_operator;
import Java.AST.Expr.Expr_if;
import Java.SymbolTable.Scope;


import java.util.List;

public class Inline_condition_stmt {
    private List<Expr> expr;
    private List<Expr_for_and_operator> exprForAndOperators;
    private List<Inline_condition_stmt> inlineConditionStmts;
    private Expr_if exprIf;
    private String qesM;
    private String orM;
    private Scope currentScope;

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }

    public List<Expr_for_and_operator> getExprForAndOperators() {
        return exprForAndOperators;
    }

    public List<Inline_condition_stmt> getInlineConditionStmts() {
        return inlineConditionStmts;
    }

    public void setInlineConditionStmts(List<Inline_condition_stmt> inlineConditionStmts) {
        this.inlineConditionStmts = inlineConditionStmts;
    }

    public void setExprForAndOperators(List<Expr_for_and_operator> exprForAndOperators) {
        this.exprForAndOperators = exprForAndOperators;
    }

    public Expr_if getExprIf() {
        return exprIf;
    }

    public void setExprIf(Expr_if exprIf) {
        this.exprIf = exprIf;
    }

    public String getQesM() {
        return qesM;
    }

    public void setQesM(String qesM) {
        this.qesM = qesM;
    }

    public String getOrM() {
        return orM;
    }

    public void setOrM(String orM) {
        this.orM = orM;
    }

    public List<Expr> getExpr() {
        return expr;
    }

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }
}
