package com.javamultiplex.principle.solid.isp.bad;

import com.javamultiplex.principle.solid.isp.Document;

/**
 * @author Rohit Agarwal on 19/08/20 11:37 pm
 * @copyright www.javamultiplex.com
 */
public class OldGenerationPrinter implements Machine {

    @Override
    public void print(Document d) {
        System.out.println("Printing Document : " + d);
    }

    @Override
    public void scan(Document d) {
        throw new UnsupportedOperationException("Scanning not supported");
    }

    @Override
    public void fax(Document d) {
        throw new UnsupportedOperationException("Fax operation not supported");
    }
}
