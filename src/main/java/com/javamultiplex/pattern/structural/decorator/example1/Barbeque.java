package com.javamultiplex.pattern.structural.decorator.example1;

public class Barbeque extends ToppingsDecorator {
    public Barbeque(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Barbeque ";
    }

    public int getCost() {
        return 90 + pizza.getCost();
    }
} 