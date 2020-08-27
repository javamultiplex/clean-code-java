package com.javamultiplex.principle.delegation.example2;

/**
 * @author Rohit Agarwal on 22/08/20 1:23 pm
 * @copyright www.javamultiplex.com
 */
public class HPPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("HP Printer with message : " + message);
    }
}
