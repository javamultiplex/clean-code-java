package com.javamultiplex.pattern.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 03/09/20 9:33 pm
 * @copyright www.javamultiplex.com
 */
public class TemplateMethodClient {

    @Test
    public void shouldProcessOrderByInternet() {
        OrderProcessTemplate orderProcessTemplate=new NetOrder();
        orderProcessTemplate.processOrder(true);
    }

    @Test
    public void shouldProcessOrderByVisitingStore() {
        OrderProcessTemplate orderProcessTemplate=new StoreOrder();
        orderProcessTemplate.processOrder(false);
    }
}
