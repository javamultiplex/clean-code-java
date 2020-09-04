package com.javamultiplex.testing.principles;

import java.util.List;

/**
 * @author Rohit Agarwal on 04/09/20 9:56 pm
 * @copyright www.javamultiplex.com
 */
public class Calculator<T extends Number> {
    public T addition(List<T> numbers, Adder<T> adder) {
        T result = adder.zero();
        for (T number : numbers) {
            result = adder.add(result, number);
        }
        return result;
    }

    public T multiply(List<T> numbers, Multiplier<T> multiplier) {
        T result = multiplier.one();
        for (T number : numbers) {
            result = multiplier.multiply(result, number);
        }
        return result;
    }
}
