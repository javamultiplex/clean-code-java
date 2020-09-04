package com.javamultiplex.testing.tddbdd.example2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 04/09/20 9:42 pm
 * @copyright www.javamultiplex.com
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnFizz_NumberIsMultipleOf3() {
        String result = fizzBuzz.play(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzz_NumberIsMultipleOf5() {
        String result = fizzBuzz.play(10);
        assertEquals("Buzz", result);
    }
}
