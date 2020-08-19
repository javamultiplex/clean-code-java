package com.javamultiplex.principle.solid.isp.good;

import com.javamultiplex.principle.solid.isp.Document;

/**
 * @author Rohit Agarwal on 19/08/20 11:37 pm
 * @copyright www.javamultiplex.com
 */
public class OldGenerationPrinter implements Printer {

    @Override
    public void print(Document d) {
        System.out.println("Printing Document : " + d);
    }
}
