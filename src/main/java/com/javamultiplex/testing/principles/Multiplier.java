package com.javamultiplex.testing.principles;

/**
 * @author Rohit Agarwal on 04/09/20 11:25 pm
 * @copyright www.javamultiplex.com
 */
public interface Multiplier<T extends Number> {
    T one();
    T multiply(T number1, T number2);
}
