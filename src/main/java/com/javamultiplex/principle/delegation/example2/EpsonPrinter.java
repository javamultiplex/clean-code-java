package com.javamultiplex.principle.delegation.example2;

/**
 * @author Rohit Agarwal on 22/08/20 1:22 pm
 * @copyright www.javamultiplex.com
 */
public class EpsonPrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println("Epson Printer with message : "+message);
    }
}
