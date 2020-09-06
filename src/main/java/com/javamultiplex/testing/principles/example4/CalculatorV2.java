package com.javamultiplex.testing.principles.example4;

/**
 * @author Rohit Agarwal on 06/09/20 8:17 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorV2 {

    public Division division(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("/ by zero is not possible");
        }
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        return new Division(quotient, remainder);
    }
}
