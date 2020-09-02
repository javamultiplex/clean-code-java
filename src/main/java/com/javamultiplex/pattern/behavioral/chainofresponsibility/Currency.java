package com.javamultiplex.pattern.behavioral.chainofresponsibility;

/**
 * @author Rohit Agarwal on 02/09/20 11:16 pm
 * @copyright www.javamultiplex.com
 */
public class Currency {
    private final int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
