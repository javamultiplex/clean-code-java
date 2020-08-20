package com.javamultiplex.principle.kiss;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 20/08/20 8:56 pm
 * @copyright www.javamultiplex.com
 */
public class Example1Test {
    private Example1 example1;

    @BeforeEach
    void setUp() {
        example1 = new Example1();
    }

    @Test
    public void shouldCalculateSum1() {
        int sum = example1.sum1(10);
        assertEquals(55, sum);
    }

    @Test
    public void shouldCalculateSum2() {
        int sum = example1.sum2(10);
        assertEquals(55, sum);
    }

    @Test
    public void shouldCalculateSum3() {
        int sum = example1.sum3(10);
        assertEquals(55, sum);
    }
}
