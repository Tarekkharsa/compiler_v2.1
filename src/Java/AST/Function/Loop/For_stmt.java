package Java.AST.Function.Loop;
import Java.AST.Function.Body;

public class For_stmt {
    private String K_for;
    private Body body_for; ;
    private For_rule for_rule;
    private Foreach_rule foreach_rule;

    public Body getBody_for() {
        return body_for;
    }

    public void setBody_for(Body body_for) {
        this.body_for = body_for;
    }

    public For_rule getFor_rule() {
        return for_rule;
    }

    public void setFor_rule(For_rule for_rule) {
        this.for_rule = for_rule;
    }

    public Foreach_rule getForeach_rule() {
        return foreach_rule;
    }

    public void setForeach_rule(Foreach_rule foreach_rule) {
        this.foreach_rule = foreach_rule;
    }

    public String getK_for() {
        return K_for;
    }

    public void setK_for(String k_for) {
        K_for = k_for;
    }


}
