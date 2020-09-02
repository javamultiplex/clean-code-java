package com.javamultiplex.pattern.behavioral.chainofresponsibility;

/**
 * @author Rohit Agarwal on 02/09/20 11:19 pm
 * @copyright www.javamultiplex.com
 */
public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 10) {
            int num = amount / 10;
            int remainder = amount % 10;
            System.out.printf("Dispensing %d 10$ notes\n", num);
            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}
