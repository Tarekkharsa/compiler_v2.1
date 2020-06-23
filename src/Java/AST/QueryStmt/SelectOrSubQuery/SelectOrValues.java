package Java.AST.QueryStmt.SelectOrSubQuery;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.JoinClause;

import java.util.ArrayList;
import java.util.List;

public class SelectOrValues {


     List<ResultColumn> resultColumns = new ArrayList<>();
    List<TableOrSubQuery> tableOrSubQueries = new ArrayList<>();
    private JoinClause joinClause;
    List<Expr> expr = new ArrayList<>();
    private String From;

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public List<ResultColumn> getResultColumns() {
        return resultColumns;
    }

    public void setResultColumns(List<ResultColumn> resultColumns) {
        this.resultColumns = resultColumns;
    }

    public List<TableOrSubQuery> getTableOrSubQueries() {
        return tableOrSubQueries;
    }

    public void setTableOrSubQueries(List<TableOrSubQuery> tableOrSubQueries) {
        this.tableOrSubQueries = tableOrSubQueries;
    }

    public JoinClause getJoinClause() {
        return joinClause;
    }

    public void setJoinClause(JoinClause joinClause) {
        this.joinClause = joinClause;
    }

    public List<Expr> getExpr() {
        return expr;
    }

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }
}
