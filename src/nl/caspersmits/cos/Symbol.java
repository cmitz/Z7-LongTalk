package nl.caspersmits.cos;

public class Symbol {
    public String name;
    public DataType type;
    public Integer slot;

    public Symbol(String name, DataType dataType) {
        this.name = name;
        this.type = dataType;
    }

    public Symbol(String name, DataType dataType, Integer slot) {
        this.name = name;
        this.type = dataType;
        this.slot = slot;
    }

    public String toString() {
        return String.format("<Name=%s; DataType=%s>", name, type.toString());
    }
}