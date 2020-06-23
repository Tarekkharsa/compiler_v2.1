package Java.AST.QueryStmt.SelectStmt;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.List;

public class FactoredSelectStmt extends Statement {

    private SelectCore selectCore;
    private List<Expr> expr;
    private List<OrderingTerm> orderingTerm;
    private String Order;
    private String By;
    private String Limit;

    private String Offset;

    public String getOffset() {
        return Offset;
    }

    public void setOffset(String offset) {
        Offset = offset;
    }

    public String getLimit() {
        return Limit;
    }

    public void setLimit(String limit) {
        Limit = limit;
    }


    public String getOrder() {
        return Order;
    }

    public void setOrder(String order) {
        Order = order;
    }

    public String getBy() {
        return By;
    }

    public void setBy(String by) {
        By = by;
    }

    public SelectCore getSelectCore() {
        return selectCore;
    }

    public void setSelectCore(SelectCore selectCore) {
        this.selectCore = selectCore;
    }

    public List<Expr> getExpr() {
        return expr;
    }

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }

    public List<OrderingTerm> getOrderingTerm() {
        return orderingTerm;
    }

    public void setOrderingTerm(List<OrderingTerm> orderingTerm) {
        this.orderingTerm = orderingTerm;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
