package Java.AST.Function.Array;

import Java.AST.QueryStmt.AnyName;
import Java.AST.QueryStmt.SignedNumber;
import Java.AST.QueryStmt.Statement;

import java.util.List;

public class Array_stmt {
    private String name;
    private List<AnyName> any_name;
    private List<SignedNumber> signed_number;
    private List<Statement> sql_stmt_list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AnyName> getAny_name() {
        return any_name;
    }

    public void setAny_name(List<AnyName> any_name) {
        this.any_name = any_name;
    }

    public List<SignedNumber> getSigned_number() {
        return signed_number;
    }

    public void setSigned_number(List<SignedNumber> signed_number) {
        this.signed_number = signed_number;
    }

    public List<Statement> getSql_stmt_list() {
        return sql_stmt_list;
    }

    public void setSql_stmt_list(List<Statement> sql_stmt_list) {
        this.sql_stmt_list = sql_stmt_list;
    }
}
