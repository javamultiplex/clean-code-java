package com.javamultiplex.pattern.creational.builder.single.example2;

/**
 * @author Rohit Agarwal on 23/08/20 9:57 pm
 * @copyright www.javamultiplex.com
 */
public class CodeBuilder {
    private Code code = new Code();

    public CodeBuilder(String className) {
        code.setClassName(className);
    }

    public CodeBuilder addField(String name, String type) {
        code.getList().add(new Field(name, type));
        return this;
    }

    public Code build() {
        return code;
    }
}
