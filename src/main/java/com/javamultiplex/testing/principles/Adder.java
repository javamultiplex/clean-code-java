package com.javamultiplex.testing.principles;

/**
 * @author Rohit Agarwal on 04/09/20 10:08 pm
 * @copyright www.javamultiplex.com
 */
public interface Adder<T extends Number> {
    T zero();
    T add(T number1, T number2);
}
