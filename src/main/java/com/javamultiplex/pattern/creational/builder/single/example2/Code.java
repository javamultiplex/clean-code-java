package com.javamultiplex.pattern.creational.builder.single.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 23/08/20 9:58 pm
 * @copyright www.javamultiplex.com
 */
public class Code {
    private final List<Field> list;
    private String className;

    public Code() {
        this.list = new ArrayList<>();
    }

    public List<Field> getList() {
        return list;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        StringBuilder sb = new StringBuilder();
        sb.append("public class ").append(className)
                .append(newLine)
                .append("{")
                .append(newLine);
        list.forEach(sb::append);
        sb.append("}");
        return sb.toString();
    }
}
