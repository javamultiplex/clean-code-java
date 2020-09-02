package com.javamultiplex.pattern.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 02/09/20 11:28 pm
 * @copyright www.javamultiplex.com
 */
public class ATMDispenserClient {

    @Test
    public void shouldDispenseCurrency() {
        DispenseChain c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);

        c1.dispense(new Currency(130));
    }
}
