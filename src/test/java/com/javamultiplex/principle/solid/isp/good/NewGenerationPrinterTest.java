package com.javamultiplex.principle.solid.isp.good;

import com.javamultiplex.principle.solid.isp.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 19/08/20 11:39 pm
 * @copyright www.javamultiplex.com
 */
public class NewGenerationPrinterTest {

    private NewGenerationPrinter newGenerationPrinter;
    private Document document;

    @BeforeEach
    void setUp() {
        newGenerationPrinter = new NewGenerationPrinter();
        document = new Document();
        document.setName("Sample.txt");
        document.setSize("123MB");
        document.setContent("Hello World".getBytes());
    }

    @Test
    public void shouldPrintDocument() {
        newGenerationPrinter.print(document);
    }

    @Test
    public void shouldScanDocument() {
        newGenerationPrinter.scan(document);
    }

    @Test
    public void shouldFaxDocument() {
        newGenerationPrinter.fax(document);
    }

}
