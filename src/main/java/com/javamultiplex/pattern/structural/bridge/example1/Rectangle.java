package com.javamultiplex.pattern.structural.bridge.example1;

/**
 * @author Rohit Agarwal on 30/08/20 8:45 pm
 * @copyright www.javamultiplex.com
 */
public class Rectangle extends Shape {
    protected Rectangle(Color color) {
        super(color);
    }

    @Override
    protected void draw() {
        System.out.println("Draw Rectangle : " + color.fill());
    }
}
