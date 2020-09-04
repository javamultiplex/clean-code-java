package com.javamultiplex.testing.tddbdd.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 22/08/20 8:45 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldPerformAddition() {
        int result = calculator.calculate(Operator.ADD, 12, 2);
        Assertions.assertEquals(14, result);
    }

    @Test
    public void shouldPerformSubtraction() {
        int result = calculator.calculate(Operator.SUB, 12, 2);
        Assertions.assertEquals(10, result);
    }
}
