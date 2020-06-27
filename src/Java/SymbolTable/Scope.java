package Java.SymbolTable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Scope {
    private String id;
    private Scope parent;
    private Map<String, Symbol> symbolMap = new LinkedHashMap<String, Symbol>();
    private List<Symbol> symbols = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Map<String, Symbol> getSymbolMap() {
        return symbolMap;
    }

    public void setSymbolMap(Map<String, Symbol> symbolMap) {
        this.symbolMap = symbolMap;
    }
    public void addSymbol(String name, Symbol symbol) {
        this.symbolMap.put(name,symbol);
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbol(Symbol symbol) {
        this.symbols.add(symbol);
    }
}
