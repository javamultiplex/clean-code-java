package com.javamultiplex.pattern.creational.abstractfactory;

/**
 * @author Rohit Agarwal on 25/08/20 8:56 pm
 * @copyright www.javamultiplex.com
 */
public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if ("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        } else if ("shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        }
        throw new UnsupportedOperationException("Choice : " + choice + " not supported");
    }
}
