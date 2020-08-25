package com.javamultiplex.pattern.creational.abstractfactory;

/**
 * @author Rohit Agarwal on 25/08/20 8:49 pm
 * @copyright www.javamultiplex.com
 */
public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String type) {
        if ("black".equalsIgnoreCase(type)) {
            return new Black();
        } else if ("white".equalsIgnoreCase(type)) {
            return new White();
        } else if ("red".equalsIgnoreCase(type)) {
            return new Red();
        }
        throw new UnsupportedOperationException("Type : " + type + " not supported.");
    }
}
