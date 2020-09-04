package com.javamultiplex.testing.principles.example1;

import com.javamultiplex.testing.principles.example1.Adder;
import com.javamultiplex.testing.principles.example1.Calculator;
import com.javamultiplex.testing.principles.example1.Multiplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rohit Agarwal on 04/09/20 10:11 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorTestV4 {

    @Test
    public void shouldCalculateSumOf4IntegerNumbers() {
        Calculator<Integer> calculator = new Calculator<>();
        List<Integer> list = Arrays.asList(3, 4, 5, 7);
        Integer addition = calculator.addition(list, new Adder<Integer>() {
            @Override
            public Integer zero() {
                return 0;
            }

            @Override
            public Integer add(Integer number1, Integer number2) {
                return number1 + number2;
            }
        });
        Assertions.assertEquals(3 + 4 + 5 + 7, addition);
    }

    @Test
    public void shouldCalculateSumOf4DoubleNumbers() {
        Calculator<Double> calculator = new Calculator<>();
        List<Double> list = Arrays.asList(1.0, 2.4, 3.0, 4.5);
        Double addition = calculator.addition(list, new Adder<Double>() {
            @Override
            public Double zero() {
                return 0.0;
            }

            @Override
            public Double add(Double number1, Double number2) {
                return number1 + number2;
            }
        });
        Assertions.assertEquals(1.0 + 2.4 + 3.0 + 4.5, addition);
    }

    @Test
    public void shouldCalculateMultiplicationOf4IntegerNumbers() {
        Calculator<Integer> calculator = new Calculator<>();
        List<Integer> list = Arrays.asList(3, 4, 5, 7);
        Integer multiplication = calculator.multiply(list, new Multiplier<Integer>() {
            @Override
            public Integer one() {
                return 1;
            }

            @Override
            public Integer multiply(Integer number1, Integer number2) {
                return number1 * number2;
            }
        });
        Assertions.assertEquals(3 * 4 * 5 * 7, multiplication);
    }

    @Test
    public void shouldCalculateMultiplicationOf4DoubleNumbers() {
        Calculator<Double> calculator = new Calculator<>();
        List<Double> list = Arrays.asList(1.0, 2.4, 3.0, 4.5);
        Double multiplication = calculator.multiply(list, new Multiplier<Double>() {
            @Override
            public Double one() {
                return 1.0;
            }

            @Override
            public Double multiply(Double number1, Double number2) {
                return number1 * number2;
            }
        });
        Assertions.assertEquals(1.0 * 2.4 * 3.0 * 4.5, multiplication);
    }
}
