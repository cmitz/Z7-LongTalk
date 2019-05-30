package nl.caspersmits.cos;

public class Symbol {
    public String name;
    public DataType type;

    public Symbol(String name, DataType dataType) {
        this.name = name;
        this.type = dataType;
    }

    public String toString() {
        return String.format("<Name=%s; DataType=%s>", name, type.toString());
    }
}