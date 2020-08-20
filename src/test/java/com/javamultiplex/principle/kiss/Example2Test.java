package com.javamultiplex.principle.kiss;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 20/08/20 9:07 pm
 * @copyright www.javamultiplex.com
 */
public class Example2Test {
    private static File file;
    private static List<String> input;
    private Example2 example2;

    @BeforeAll
    static void beforeAll() throws IOException {
        file = new File("todos.txt");
        input = Arrays.asList("Learn clean code", "Learn Driving");
        Files.write(file.toPath(), input);
    }

    @BeforeEach
    void setUp() {
        example2 = new Example2();
    }

    @Test
    public void shouldRead1() throws IOException {
        List<String> output = example2.read1(file);
        assertEquals(2, output.size());
        assertEquals(input, output);
    }

    @Test
    public void shouldRead2() throws IOException {
        List<String> output = example2.read2(file);
        assertEquals(2, output.size());
        assertEquals(input, output);
    }
}
