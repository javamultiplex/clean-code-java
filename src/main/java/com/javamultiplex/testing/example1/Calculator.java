package com.javamultiplex.testing.example1;

/**
 * @author Rohit Agarwal on 22/08/20 5:38 pm
 * @copyright www.javamultiplex.com
 */
public class Calculator {

    public int calculate(final Operator operator, final int number1, final int number2) {
        return OperationFactory.getInstance(operator).operate(number1,number2);
    }

}
