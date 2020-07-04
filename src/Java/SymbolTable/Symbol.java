package Java.SymbolTable;

public class Symbol {

    private String name;
    private Type type;
    private Scope scope;
    private boolean isParam;

    private boolean hasKeyVar;
    private boolean isAssigned;

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    public boolean isHasKeyVar() {
        return hasKeyVar;
    }

    public void setHasKeyVar(boolean hasKeyVar) {
        this.hasKeyVar = hasKeyVar;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Scope getScope() {
        return scope;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean getIsParam() {
        return isParam;
    }

    public void setIsParam(boolean param) {
        isParam = param;
    }
}
