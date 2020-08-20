package com.javamultiplex.principle.solid.dip.good;

/**
 * @author Rohit Agarwal on 20/08/20 8:25 pm
 * @copyright www.javamultiplex.com
 */
public class FrontendDeveloper implements Developer{
    @Override
    public void develop() {
       writeJavascript();
    }

    public void writeJavascript(){
        System.out.println("I am write Javascript Code");
    }
}
