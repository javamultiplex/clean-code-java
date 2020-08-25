package com.javamultiplex.pattern.creational.abstractfactory;

/**
 * @author Rohit Agarwal on 25/08/20 8:52 pm
 * @copyright www.javamultiplex.com
 */
public class ShapeFactory implements AbstractFactory<Shape> {
    @Override
    public Shape create(String type) {
        if ("rectangle".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if ("circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(type)) {
            return new Square();
        }
        throw new UnsupportedOperationException("Type : " + type + " not supported");
    }
}
