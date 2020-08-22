package com.javamultiplex.principle.delegation.example2;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 22/08/20 1:24 pm
 * @copyright www.javamultiplex.com
 */
public class PrinterControllerTest {
    @Test
    public void shouldPrintWithCanonPrinter() {
        Printer printer = new CanonPrinter();
        PrinterController printerController = new PrinterController(printer);
        printerController.print("Hello World");
    }

    @Test
    public void shouldPrintWithHPPrinter() {
        Printer printer = new HPPrinter();
        PrinterController printerController = new PrinterController(printer);
        printerController.print("Hello World");
    }

    @Test
    public void shouldPrintWithEpsonPrinter() {
        Printer printer = new EpsonPrinter();
        PrinterController printerController = new PrinterController(printer);
        printerController.print("Hello World");
    }
}
