package com.javamultiplex.principle.solid.isp.bad;

import com.javamultiplex.principle.solid.isp.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 19/08/20 11:39 pm
 * @copyright www.javamultiplex.com
 */
public class NewGenerationPrinterTest {

    private Machine machine;
    private Document document;

    @BeforeEach
    void setUp() {
        machine = new NewGenerationPrinter();
        document = new Document();
        document.setName("Sample.txt");
        document.setSize("123MB");
        document.setContent("Hello World".getBytes());
    }

    @Test
    public void shouldPrintDocument() {
        machine.print(document);
    }

    @Test
    public void shouldScanDocument() {
        machine.scan(document);
    }

    @Test
    public void shouldFaxDocument() {
        machine.fax(document);
    }

}
