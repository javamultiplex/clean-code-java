package com.javamultiplex.pattern.behavioral.chainofresponsibility;

/**
 * @author Rohit Agarwal on 02/09/20 11:19 pm
 * @copyright www.javamultiplex.com
 */
public class Dollar20Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 20) {
            int num = amount / 20;
            int remainder = amount % 20;
            System.out.printf("Dispensing %d 20$ notes\n", num);
            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}
