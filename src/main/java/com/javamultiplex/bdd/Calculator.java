package com.javamultiplex.bdd;

/**
 * @author Rohit Agarwal on 22/08/20 5:38 pm
 * @copyright www.javamultiplex.com
 */
public class Calculator {

    public int calculate(final char operator, final int number1, final int number2) {
        int result = 0;
        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        }
        return result;
    }

}
