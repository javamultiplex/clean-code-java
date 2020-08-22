package com.javamultiplex.principle.delegation.example2;

/**
 * @author Rohit Agarwal on 22/08/20 1:23 pm
 * @copyright www.javamultiplex.com
 */
public class PrinterController implements Printer {
    private final Printer printer;

    public PrinterController(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        printer.print(message);
    }
}
