package Java.AST.Function.Print;

import Java.AST.Expr.Expr;
import Java.AST.Expr.Expr_Print;
import Java.AST.Function.Json.Call_json;

import java.util.List;

public class Print_body {

    List<Expr_Print> expr_prints;
    Call_json call_json;

    public List<Expr_Print> getExpr_prints() {
        return expr_prints;
    }

    public void setExpr_prints(List<Expr_Print> expr_prints) {
        this.expr_prints = expr_prints;
    }

    public Call_json getCall_json() {
        return call_json;
    }

    public void setCall_json(Call_json call_json) {
        this.call_json = call_json;
    }
}
