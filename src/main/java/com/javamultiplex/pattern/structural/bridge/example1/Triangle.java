package com.javamultiplex.pattern.structural.bridge.example1;

/**
 * @author Rohit Agarwal on 30/08/20 8:47 pm
 * @copyright www.javamultiplex.com
 */
public class Triangle extends Shape {
    protected Triangle(Color color) {
        super(color);
    }

    @Override
    protected void draw() {
        System.out.println("Draw Triangle : " + color.fill());
    }
}
