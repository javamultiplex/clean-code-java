package com.javamultiplex.testing;

/**
 * @author Rohit Agarwal on 22/08/20 8:25 pm
 * @copyright www.javamultiplex.com
 */
public class Addition implements Operation {
    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }
}
