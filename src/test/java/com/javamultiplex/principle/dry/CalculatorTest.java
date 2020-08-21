package com.javamultiplex.principle.dry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 21/08/20 11:42 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoNumbers() {
        int num1 = 40;
        int num2 = 10;
        int addition = calculator.addition(num1, num2);
        assertEquals((num1 + num2), addition);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        int num1 = 40;
        int num2 = 10;
        int addition = calculator.subtraction(num1, num2);
        assertEquals((num1 - num2), addition);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        int num1 = 40;
        int num2 = 10;
        int addition = calculator.multiplication(num1, num2);
        assertEquals((num1 * num2), addition);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        int num1 = 40;
        int num2 = 10;
        int addition = calculator.division(num1, num2);
        assertEquals((num1 / num2), addition);
    }
}
