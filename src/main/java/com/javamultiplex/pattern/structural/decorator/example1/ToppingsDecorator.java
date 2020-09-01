package com.javamultiplex.pattern.structural.decorator.example1;

abstract class ToppingsDecorator extends Pizza {
    protected final Pizza pizza;

    public ToppingsDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
} 
  