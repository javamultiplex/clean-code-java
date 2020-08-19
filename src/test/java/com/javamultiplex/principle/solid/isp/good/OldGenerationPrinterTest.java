package com.javamultiplex.principle.solid.isp.good;


import com.javamultiplex.principle.solid.isp.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 19/08/20 11:43 pm
 * @copyright www.javamultiplex.com
 */
public class OldGenerationPrinterTest {
    private OldGenerationPrinter oldGenerationPrinter;
    private Document document;

    @BeforeEach
    void setUp() {
        oldGenerationPrinter = new OldGenerationPrinter();
        document = new Document();
        document.setName("Sample.txt");
        document.setSize("123MB");
        document.setContent("Hello World".getBytes());
    }

    @Test
    public void shouldPrintDocument() {
        oldGenerationPrinter.print(document);
    }
}
