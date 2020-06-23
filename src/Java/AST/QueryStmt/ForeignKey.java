package Java.AST.QueryStmt;

import Java.AST.QueryStmt.AlterStatement.ForeignKeyClause;

import java.util.List;

public class ForeignKey {
    private String name;
    private ForeignKeyClause foreignKeyClause;
    private List<String> fkOriginColumnName;

    public List<String> getFkOriginColumnName() {
        return fkOriginColumnName;
    }

    public void setFkOriginColumnName(List<String> fkOriginColumnName) {
        this.fkOriginColumnName = fkOriginColumnName;
    }

    public ForeignKeyClause getForeignKeyClause() {
        return foreignKeyClause;
    }

    public void setForeignKeyClause(ForeignKeyClause foreignKeyClause) {
        this.foreignKeyClause = foreignKeyClause;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
