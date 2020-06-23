package Java.AST.QueryStmt;

public class JoinOperator {
    private String join;
    private String inner;
    private String outer;
    private String left;

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public String getInner() {
        return inner;
    }

    public void setInner(String inner) {
        this.inner = inner;
    }

    public String getOuter() {
        return outer;
    }

    public void setOuter(String outer) {
        this.outer = outer;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }
}
