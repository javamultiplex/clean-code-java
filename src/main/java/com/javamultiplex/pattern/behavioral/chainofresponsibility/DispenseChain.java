package com.javamultiplex.pattern.behavioral.chainofresponsibility;

/**
 * @author Rohit Agarwal on 02/09/20 11:17 pm
 * @copyright www.javamultiplex.com
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
