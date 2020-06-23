package Java.AST.Expr;

public class UnaryOperator {
    private String plus;
    private String minus;
    private String not;
    private String tilde;

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public String getMinus() {
        return minus;
    }

    public void setMinus(String minus) {
        this.minus = minus;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public String getTilde() {
        return tilde;
    }

    public void setTilde(String tilde) {
        this.tilde = tilde;
    }
}
