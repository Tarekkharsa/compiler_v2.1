package Java.AST.Function;

import java.util.ArrayList;
import java.util.List;

public class FunctionHeader  {

    private String Identifier;
    private List<String> params = new ArrayList<String>();

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }


}
