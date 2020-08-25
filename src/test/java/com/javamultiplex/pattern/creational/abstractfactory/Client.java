package com.javamultiplex.pattern.creational.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 25/08/20 8:59 pm
 * @copyright www.javamultiplex.com
 */
public class Client {
    
    @Test
    public void shouldCreateRedColorObject() {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("color");
        Color color = (Color) abstractFactory.create("red");
        Assertions.assertEquals("Red", color.getColor());
    }

    @Test
    public void shouldCreateBlackColorObject() {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("color");
        Color color = (Color) abstractFactory.create("black");
        Assertions.assertEquals("Black", color.getColor());
    }

    @Test
    public void shouldCreateCircleShapeObject() {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("shape");
        Shape shape = (Shape) abstractFactory.create("circle");
        Assertions.assertEquals("Circle", shape.getShape());
    }

    @Test
    public void shouldCreateRectangleShapeObject() {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("shape");
        Shape shape = (Shape) abstractFactory.create("rectangle");
        Assertions.assertEquals("Rectangle", shape.getShape());
    }
}
