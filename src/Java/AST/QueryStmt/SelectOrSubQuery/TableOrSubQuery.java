package Java.AST.QueryStmt.SelectOrSubQuery;

import Java.AST.Node;
import Java.AST.QueryStmt.JoinClause;

import java.util.List;

public class TableOrSubQuery extends Node {
    private String dataBaseName;
    private String tableName;
    private String indexName;
    private String tableAlias;
    private JoinClause joinClause;
    private SelectOrValues SelectOrValues;
    private ResultColumn resultColumn;
    private List<TableOrSubQuery> tableOrSubQueries;

    public String getDataBaseName() {
        return dataBaseName;
    }

    public List<TableOrSubQuery> getTableOrSubQueries() {
        return tableOrSubQueries;
    }

    public void setTableOrSubQueries(List<TableOrSubQuery> tableOrSubQueries) {
        this.tableOrSubQueries = tableOrSubQueries;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public JoinClause getJoinClause() {
        return joinClause;
    }

    public void setJoinClause(JoinClause joinClause) {
        this.joinClause = joinClause;
    }

    public Java.AST.QueryStmt.SelectOrSubQuery.SelectOrValues getSelectOrValues() {
        return SelectOrValues;
    }

    public void setSelectOrValues(Java.AST.QueryStmt.SelectOrSubQuery.SelectOrValues selectOrValues) {
        SelectOrValues = selectOrValues;
    }

    public ResultColumn getResultColumn() {
        return resultColumn;
    }

    public void setResultColumn(ResultColumn resultColumn) {
        this.resultColumn = resultColumn;
    }
}
