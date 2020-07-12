package CodeGeneration;

import Java.SymbolTable.AggregationFunction;

import java.util.List;

public class SelectClause {
    List<Column> columns ;
    List<AggregationFunction> aggregationFunctions;

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<AggregationFunction> getAggregationFunctions() {
        return aggregationFunctions;
    }

    public void setAggregationFunctions(List<AggregationFunction> aggregationFunctions) {
        this.aggregationFunctions = aggregationFunctions;
    }
}
