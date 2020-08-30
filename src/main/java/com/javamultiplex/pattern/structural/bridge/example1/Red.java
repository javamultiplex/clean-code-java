package com.javamultiplex.pattern.structural.bridge.example1;

/**
 * @author Rohit Agarwal on 30/08/20 8:42 pm
 * @copyright www.javamultiplex.com
 */
public class Red implements Color{
    @Override
    public String fill() {
        return "Color is Red.";
    }
}
