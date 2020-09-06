package com.javamultiplex.testing.principles.example4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 06/09/20 8:20 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorV1Test {
    private CalculatorV1 calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorV1();
    }

    @Test
    public void shouldDivideTwoNumbers() {
        Division result = calculator.division(10, 5);
        assertEquals(2, result.getQuotient());
        assertEquals(0, result.getRemainder());
    }
}
