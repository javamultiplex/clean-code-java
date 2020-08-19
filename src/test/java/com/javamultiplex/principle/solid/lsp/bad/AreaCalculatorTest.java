package com.javamultiplex.principle.solid.lsp.bad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 19/08/20 6:52 pm
 * @copyright www.javamultiplex.com
 */

public class AreaCalculatorTest {

    @Test
    void shouldCalculateAreaOfRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        int area = rectangle.calculateArea();
        Assertions.assertEquals(200, area);
    }


    @Test
    void shouldCalculateAreaOfSquare() {
        Rectangle square = new Square();
        square.setWidth(10);
        square.setHeight(20);
        int area = square.calculateArea();
        Assertions.assertNotEquals(200, area);
    }

}
