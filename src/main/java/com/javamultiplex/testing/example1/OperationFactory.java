package com.javamultiplex.testing.example1;

/**
 * @author Rohit Agarwal on 22/08/20 8:26 pm
 * @copyright www.javamultiplex.com
 */
public final class OperationFactory {
    public static Operation getInstance(final Operator operator) {
        Operation operation;
        switch (operator) {
            case ADD:
                operation = new Addition();
                break;
            case SUB:
                operation = new Subtraction();
                break;
            case MUL:
                operation = new Multiplication();
                break;
            default:
                throw new UnsupportedOperationException(operator + " not supported");
        }
        return operation;
    }
}
