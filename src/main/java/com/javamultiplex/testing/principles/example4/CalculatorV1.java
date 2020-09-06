package com.javamultiplex.testing.principles.example4;

/**
 * @author Rohit Agarwal on 06/09/20 8:17 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorV1 {

    public Division division(int number1, int number2) {
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        return new Division(quotient, remainder);
    }
}
