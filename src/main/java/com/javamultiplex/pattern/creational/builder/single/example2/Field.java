package com.javamultiplex.pattern.creational.builder.single.example2;

/**
 * @author Rohit Agarwal on 23/08/20 9:54 pm
 * @copyright www.javamultiplex.com
 */
public class Field {
    private final String name;
    private final String type;

    public Field(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("  public %s %s;" + System.lineSeparator(), type, name);
    }
}
