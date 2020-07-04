package Java.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class ScopeChecker {
    private boolean isFound = false;
    private boolean isAssigned = false;
    private Symbol symbol;
    private List<Symbol> symbols = new ArrayList<>();

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public boolean isFound() {
        return isFound;
    }

    public void setFound(boolean found) {
        isFound = found;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }
}
