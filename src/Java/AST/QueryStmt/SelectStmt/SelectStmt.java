package Java.AST.QueryStmt.SelectStmt;

//import Java.AST.QueryStmt.Join;
import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.SelectOrSubQuery.SelectOrValues;
import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.List;

public class SelectStmt extends Statement {

    private SelectOrValues selectOrValues;


    //    private Distinct distinct;
//    private List<SelectItem> selectItems;
//    private List<Table> intoTables;
    private String fromItem;
    private List<Expr> expr;
    private List<OrderingTerm> orderingTerm;

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
//    private List<Join> joins;
//    private Expression where;
//    private GroupByElement groupBy;
//    private List<OrderByElement> orderByElements;
//    private Expression having;
//    private Limit limit;
//    private Offset offset;

//
//    public List<Join> getJoins() {
//        return joins;
//    }
//
//    public void setJoins(List<Join> joins) {
//        this.joins = joins;
//    }


    public SelectOrValues getSelectOrValues() {
        return selectOrValues;
    }

    public void setSelectOrValues(SelectOrValues selectOrValues) {
        this.selectOrValues = selectOrValues;
    }

    public void setFromItem(String fromItem) {
        this.fromItem = fromItem;
    }

    public String getFromItem() {
        return fromItem;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
