package com.javamultiplex.pattern.creational.builder.single.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 23/08/20 11:08 pm
 * @copyright www.javamultiplex.com
 */
public class CodeClient {
    @Test
    public void shouldBuildCode() {
        CodeBuilder codeBuilder = new CodeBuilder("Person");
        Code code = codeBuilder.addField("name", "String")
                .addField("age", "int")
                .build();
        String expected = "public class Person" + System.lineSeparator()+
        "{" + System.lineSeparator() +
                "  public String name;" + System.lineSeparator() +
                "  public int age;" + System.lineSeparator() +
                "}";
        Assertions.assertEquals(expected,code.toString());
    }
}
