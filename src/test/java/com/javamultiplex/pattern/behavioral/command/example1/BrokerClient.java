package com.javamultiplex.pattern.behavioral.command.example1;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 03/09/20 11:09 pm
 * @copyright www.javamultiplex.com
 */
public class BrokerClient {

    @Test
    public void brokerShouldPlaceOrders() {
        Stock abcStock = new Stock();
        Order buyStock = new BuyStock(abcStock);
        Order sellStock = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
