package com.javamultiplex.pattern.structural.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 30/08/20 11:49 pm
 * @copyright www.javamultiplex.com
 */
public class ShopKeeperClient {
    private ShopKeeper shopKeeper;

    @BeforeEach
    void setUp() {
        shopKeeper = new ShopKeeper();
    }

    @Test
    public void shouldGetIphone() {
        shopKeeper.iphoneSale();
    }

    @Test
    public void shouldGetSamsung() {
        shopKeeper.samsungSale();
    }

    @Test
    public void shouldGetBlackberry() {
        shopKeeper.blackberrySale();
    }
}
