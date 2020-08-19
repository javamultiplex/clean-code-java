package com.javamultiplex.principle.solid.lsp.good;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 19/08/20 6:52 pm
 * @copyright www.javamultiplex.com
 */

public class AreaCalculatorTest {

    @Test
    void shouldCalculateAreaOfRectangle() {
        Shape shape = new Rectangle(10, 20);
        int area = shape.calculateArea();
        Assertions.assertEquals(200, area);
    }


    @Test
    void shouldCalculateAreaOfSquare() {
        Shape shape = new Square(10);
        int area = shape.calculateArea();
        Assertions.assertEquals(100, area);
    }

}
