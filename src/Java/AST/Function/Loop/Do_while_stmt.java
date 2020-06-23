package Java.AST.Function.Loop;

import Java.AST.Function.Body;

public class Do_while_stmt {

    private Body body_do_while;
    private While_do_stmt While_do;
    private String K_do;

    public String getK_do() {
        return K_do;
    }

    public void setK_do(String k_do) {
        K_do = k_do;
    }

    public Body getBody_do_while() {
        return body_do_while;
    }

    public void setBody_do_while(Body body_do_while) {
        this.body_do_while = body_do_while;
    }

    public While_do_stmt getWhile_do() {
        return While_do;
    }

    public void setWhile_do(While_do_stmt while_do) {
        While_do = while_do;
    }
}
