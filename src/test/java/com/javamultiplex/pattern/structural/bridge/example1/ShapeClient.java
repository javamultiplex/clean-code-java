package com.javamultiplex.pattern.structural.bridge.example1;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 30/08/20 8:49 pm
 * @copyright www.javamultiplex.com
 */
public class ShapeClient {

    @Test
    public void shouldFillRectangleWithBlueColor() {
        Shape shape = new Rectangle(new Blue());
        shape.draw();
    }

    @Test
    public void shouldFillRectangleWithRedColor() {
        Shape shape = new Rectangle(new Red());
        shape.draw();
    }

    @Test
    public void shouldFillTriangleWithBlueColor() {
        Shape shape = new Triangle(new Blue());
        shape.draw();
    }

    @Test
    public void shouldFillTriangleWithRedColor() {
        Shape shape = new Triangle(new Red());
        shape.draw();
    }
}
