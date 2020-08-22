package com.javamultiplex.testing;

import com.javamultiplex.testing.example1.Calculator;
import com.javamultiplex.testing.example1.Operator;
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
    public void shouldPerformAddition(){
        int result = calculator.calculate(Operator.ADD, 12, 2);
        Assertions.assertEquals(14, result);
    }
}
