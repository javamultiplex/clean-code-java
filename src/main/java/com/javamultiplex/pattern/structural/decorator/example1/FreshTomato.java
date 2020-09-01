package com.javamultiplex.pattern.structural.decorator.example1;

public class FreshTomato extends ToppingsDecorator {
    public FreshTomato(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato ";
    }

    public int getCost() {
        return 40 + pizza.getCost();
    }
} 