package com.javamultiplex.testing;

/**
 * @author Rohit Agarwal on 22/08/20 4:56 pm
 * @copyright www.javamultiplex.com
 */
public class FizzBuzz {
    public String play(final int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
