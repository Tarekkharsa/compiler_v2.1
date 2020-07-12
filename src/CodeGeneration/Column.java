package CodeGeneration;

import Java.SymbolTable.Type;

public class Column {
    private String name;
    private Type  type;
    private SelectQuery query;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public SelectQuery getQuery() {
        return query;
    }

    public void setQuery(SelectQuery query) {
        this.query = query;
    }
}
