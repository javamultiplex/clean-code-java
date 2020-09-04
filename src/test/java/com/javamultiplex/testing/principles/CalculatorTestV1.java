package com.javamultiplex.testing.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rohit Agarwal on 04/09/20 10:11 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorTestV1 {

    @Test
    public void testCalculator() {
        Calculator<Integer> calculator1 = new Calculator<>();
        Calculator<Double> calculator2 = new Calculator<>();
        List<Integer> list1 = Arrays.asList(3, 4, 5, 7);
        Integer addition1 = calculator1.addition(list1, new Adder<Integer>() {
            @Override
            public Integer zero() {
                return 0;
            }

            @Override
            public Integer add(Integer number1, Integer number2) {
                return number1 + number2;
            }
        });

        Integer multiplication1 = calculator1.multiply(list1, new Multiplier<Integer>() {
            @Override
            public Integer one() {
                return 1;
            }

            @Override
            public Integer multiply(Integer number1, Integer number2) {
                return number1 * number2;
            }
        });

        List<Double> list2 = Arrays.asList(1.0, 2.4, 3.0, 4.5);
        Double addition2 = calculator2.addition(list2, new Adder<Double>() {
            @Override
            public Double zero() {
                return 0.0;
            }

            @Override
            public Double add(Double number1, Double number2) {
                return number1 + number2;
            }
        });

        Double multiplication2 = calculator2.multiply(list2, new Multiplier<Double>() {
            @Override
            public Double one() {
                return 1.0;
            }

            @Override
            public Double multiply(Double number1, Double number2) {
                return number1 * number2;
            }
        });
        Assertions.assertEquals(3 + 4 + 5 + 7, addition1);
        Assertions.assertEquals(3 * 4 * 5 * 7, multiplication1);
        Assertions.assertEquals(1.0 + 2.4 + 3.0 + 4.5, addition2);
        Assertions.assertEquals(1.0 * 2.4 * 3.0 * 4.5, multiplication2);
    }
}
