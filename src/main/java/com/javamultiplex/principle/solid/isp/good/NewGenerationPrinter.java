package com.javamultiplex.principle.solid.isp.good;

import com.javamultiplex.principle.solid.isp.Document;

/**
 * @author Rohit Agarwal on 19/08/20 11:33 pm
 * @copyright www.javamultiplex.com
 */
public class NewGenerationPrinter implements Printer, Scanner, Fax {

    @Override
    public void print(Document d) {
        System.out.println("Printing Document : " + d);
    }

    @Override
    public void scan(Document d) {
        System.out.println("Scanning Document : " + d);
    }

    @Override
    public void fax(Document d) {
        System.out.println("Scanning Document : " + d);
    }
}
