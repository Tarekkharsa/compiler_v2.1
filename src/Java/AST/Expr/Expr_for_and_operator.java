package Java.AST.Expr;

import Java.AST.QueryStmt.AnyName;

import java.util.List;

public class Expr_for_and_operator {
    private LiteralValue literalValue;
    private AnyName anyName;
    private List<Expr_for_and_operator> expr_for_and_operators;
    private List<String> operation;

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

    public List<Expr_for_and_operator> getExpr_for_and_operators() {
        return expr_for_and_operators;
    }

    public void setExpr_for_and_operators(List<Expr_for_and_operator> expr_for_and_operators) {
        this.expr_for_and_operators = expr_for_and_operators;
    }
}
