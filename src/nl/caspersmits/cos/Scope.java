package nl.caspersmits.cos;

import java.util.HashMap;

public class Scope {
    private HashMap<String, Symbol> symbolTable = new HashMap<>();
    private Scope parentScope;

    private Checker checker;

    public Scope (Checker checker){
        this.checker = checker;
    }

    private Scope(Checker checker, Scope parent) {
        this.checker = checker;
        this.parentScope = parent;
    }

    public Scope createChildScope() {
        return new Scope(checker, this);
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
