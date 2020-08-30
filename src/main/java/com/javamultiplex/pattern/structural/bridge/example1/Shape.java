package com.javamultiplex.pattern.structural.bridge.example1;

/**
 * @author Rohit Agarwal on 30/08/20 8:44 pm
 * @copyright www.javamultiplex.com
 */
public abstract class Shape {
    protected final Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    protected abstract void draw();
}
