package com.javamultiplex.testing;

/**
 * @author Rohit Agarwal on 22/08/20 8:43 pm
 * @copyright www.javamultiplex.com
 */
public class Multiplication implements Operation {
    @Override
    public int operate(int num1, int num2) {
        return num1*num2;
    }
}
