package com.javamultiplex.principle.solid.dip.good;

/**
 * @author Rohit Agarwal on 20/08/20 8:23 pm
 * @copyright www.javamultiplex.com
 */
public class BackendDeveloper implements Developer{
    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava(){
        System.out.println("I am writing JAVA code");
    }
}
