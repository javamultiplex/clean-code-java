package com.javamultiplex.pattern.behavioral.chainofresponsibility;

/**
 * @author Rohit Agarwal on 02/09/20 11:19 pm
 * @copyright www.javamultiplex.com
 */
public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 50) {
            int num = amount / 50;
            int remainder = amount % 50;
            System.out.printf("Dispensing %d 50$ notes\n", num);
            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}
