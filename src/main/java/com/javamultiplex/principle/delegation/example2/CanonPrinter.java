package com.javamultiplex.principle.delegation.example2;

/**
 * @author Rohit Agarwal on 22/08/20 1:20 pm
 * @copyright www.javamultiplex.com
 */
public class CanonPrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println("Canon Printer with message : "+message);
    }
}
