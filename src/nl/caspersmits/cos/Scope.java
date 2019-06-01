package nl.caspersmits.cos;

import java.util.HashMap;

public class Scope {
    private HashMap<String, Symbol> symbolTable = new HashMap<>();
    private Scope parentScope;

    public Scope (){}

    private Scope(Scope parent) {
        this.parentScope = parent;
    }

    public Scope createChildScope() {
        return new Scope(this);
    }

    public void declareVariable(Symbol symbol) {
        symbolTable.put(symbol.name, symbol);
    }

    public Symbol lookupVariable(String name) {
        Symbol symbol = symbolTable.get(name);
        if (symbol == null) {
            if (parentScope != null) {
                return parentScope.lookupVariable(name);
            } else {
                return null;
            }
        }
        return symbol;
    }

    public Scope getParentScope() {
        return parentScope;
    }
}
