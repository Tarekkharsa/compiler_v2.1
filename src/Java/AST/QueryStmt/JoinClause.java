package Java.AST.QueryStmt;

import Java.AST.QueryStmt.SelectOrSubQuery.TableOrSubQuery;

import java.util.List;

public class JoinClause {
    private List<TableOrSubQuery> tableOrSubQuery;
            List<JoinOperator> joinOperator;
    private List<JoinConstraint> joinConstraint;

    public List<TableOrSubQuery> getTableOrSubQuery() {
        return tableOrSubQuery;
    }

    public void setTableOrSubQuery(List<TableOrSubQuery> tableOrSubQuery) {
        this.tableOrSubQuery = tableOrSubQuery;
    }

    public List<JoinOperator> getJoinOperator() {
        return joinOperator;
    }

    public void setJoinOperator(List<JoinOperator> joinOperator) {
        this.joinOperator = joinOperator;
    }

    public List<JoinConstraint> getJoinConstraint() {
        return joinConstraint;
    }

    public void setJoinConstraint(List<JoinConstraint> joinConstraint) {
        this.joinConstraint = joinConstraint;
    }
}
