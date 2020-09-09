package com.javamultiplex.pattern.behavioral.state.example1;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 09/09/20 9:04 pm
 * @copyright www.javamultiplex.com
 */
public class CourierClient {

    @Test
    public void shouldDeliverPackage(){
        DeliveryContext deliveryContext=new DeliveryContext(null,"123");
        deliveryContext.update();
        deliveryContext.update();
        deliveryContext.update();
        deliveryContext.update();
        deliveryContext.update();

    }
}
