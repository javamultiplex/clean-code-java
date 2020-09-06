package com.javamultiplex.testing.principles.example4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 06/09/20 8:20 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorV2Test {
    private CalculatorV2 calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorV2();
    }

    @Test
    public void shouldDivideTwoPositiveNumbers_CompletelyDivisible() {
        Division division = calculator.division(10, 5);
        assertQuotientAndRemainder(new Division(2, 0), division);
    }

    @Test
    public void shouldDivideTwoPositiveNumbers_CompletelyNotDivisible() {
        Division division = calculator.division(10, 6);
        assertQuotientAndRemainder(new Division(1, 4), division);
    }

    @Test
    public void shouldDivideTwoNegativeNumbers_CompletelyDivisible() {
        Division division = calculator.division(-10, -5);
        assertQuotientAndRemainder(new Division(2, 0), division);
    }

    @Test
    public void shouldDivideTwoNegativeNumbers_CompletelyNotDivisible() {
        Division division = calculator.division(-10, -6);
        assertQuotientAndRemainder(new Division(1, -4), division);
    }

    @Test
    public void shouldDivideNegativeDividendAndPositiveDivisor_CompletelyDivisible() {
        Division division = calculator.division(-10, 5);
        assertQuotientAndRemainder(new Division(-2, 0), division);
    }

    @Test
    public void shouldDivideNegativeDividendAndPositiveDivisor_CompletelyNotDivisible() {
        Division division = calculator.division(-10, 6);
        assertQuotientAndRemainder(new Division(-1, -4), division);
    }

    @Test
    public void shouldDividePositiveDividendAndNegativeDivisor_CompletelyDivisible() {
        Division division = calculator.division(10, -5);
        assertQuotientAndRemainder(new Division(-2, 0), division);
    }

    @Test
    public void shouldDividePositiveDividendAndNegativeDivisor_CompletelyNotDivisible() {
        Division division = calculator.division(10, -6);
        assertQuotientAndRemainder(new Division(-1, 4), division);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNum2IsZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.division(10, 0));
    }

    private void assertQuotientAndRemainder(Division expected, Division actual) {
        Assertions.assertEquals(expected.getQuotient(), actual.getQuotient());
        Assertions.assertEquals(expected.getRemainder(), actual.getRemainder());
    }
}
