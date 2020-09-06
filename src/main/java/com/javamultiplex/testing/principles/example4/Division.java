package com.javamultiplex.testing.principles.example4;

/**
 * @author Rohit Agarwal on 06/09/20 9:10 pm
 * @copyright www.javamultiplex.com
 */
public class Division {
    private final int quotient;
    private final int remainder;

    public Division(int quotient, int remainder) {
        this.quotient = quotient;
        this.remainder = remainder;
    }

    public int getQuotient() {
        return quotient;
    }

    public int getRemainder() {
        return remainder;
    }
}
