package Java.AST.QueryStmt.SelectStmt;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.JoinClause;
import Java.AST.QueryStmt.SelectOrSubQuery.ResultColumn;
import Java.AST.QueryStmt.SelectOrSubQuery.TableOrSubQuery;
import Java.AST.QueryStmt.Statement;

import java.util.List;

public class SelectCore   {
        private  List<ResultColumn> resultColumnList;
        private List<Expr> exprs;
        private List<TableOrSubQuery> tableOrSubQueries;
        private JoinClause joinClause;
        private String from;

    private String All;
    private String By;
    private String DISTINCT;
    private String GROUP;
    private String HAVING;
    private String SELECT;
    private String VALUES;
    private String Where;
    public String getAll() {
        return All;
    }

    public void setAll(String all) {
        All = all;
    }

    public String getBy() {
        return By;
    }

    public void setBy(String by) {
        By = by;
    }

    public String getDISTINCT() {
        return DISTINCT;
    }

    public void setDISTINCT(String DISTINCT) {
        this.DISTINCT = DISTINCT;
    }

    public String getGROUP() {
        return GROUP;
    }

    public void setGROUP(String GROUP) {
        this.GROUP = GROUP;
    }

    public String getHAVING() {
        return HAVING;
    }

    public void setHAVING(String HAVING) {
        this.HAVING = HAVING;
    }

    public String getSELECT() {
        return SELECT;
    }

    public void setSELECT(String SELECT) {
        this.SELECT = SELECT;
    }

    public String getVALUES() {
        return VALUES;
    }

    public void setVALUES(String VALUES) {
        this.VALUES = VALUES;
    }

    public String getWhere() {
        return Where;
    }

    public void setWhere(String where) {
        Where = where;
    }




    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<ResultColumn> getResultColumnList() {
        return resultColumnList;
    }

    public void setResultColumnList(List<ResultColumn> resultColumnList) {
        this.resultColumnList = resultColumnList;
    }

    public List<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
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
}
