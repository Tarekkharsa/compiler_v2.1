package Java.AST.QueryStmt.SelectStmt;

import CodeGeneration.WhereCondition;
import Java.AST.Expr.Expr;
import Java.AST.Node;
import Java.AST.QueryStmt.JoinClause;
import Java.AST.QueryStmt.SelectOrSubQuery.ResultColumn;
import Java.AST.QueryStmt.SelectOrSubQuery.TableOrSubQuery;
import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Scope;

import java.util.List;

public class SelectCore extends Node {
        private  List<ResultColumn> resultColumnList;
        private List<Expr> exprs;
        private List<TableOrSubQuery> tableOrSubQueries;
        private JoinClause joinClause;
        private String from;

    private String All;
    private String DISTINCT;
    GroupBy groupBy;
    private Having HAVING;
    private String SELECT;
    private String VALUES;
    private String Where;
    private Scope scope;

    private WhereCondition condition;

    public WhereCondition getWhereCondition() {
        return condition;
    }

    public void setCondition(WhereCondition condition) {
        this.condition = condition;
    }

    public GroupBy getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public String getAll() {
        return All;
    }

    public void setAll(String all) {
        All = all;
    }



    public String getDISTINCT() {
        return DISTINCT;
    }

    public void setDISTINCT(String DISTINCT) {
        this.DISTINCT = DISTINCT;
    }



    public Having getHAVING() {
        return HAVING;
    }

    public void setHAVING(Having HAVING) {
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
