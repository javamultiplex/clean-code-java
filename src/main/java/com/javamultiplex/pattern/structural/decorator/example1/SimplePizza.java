package com.javamultiplex.pattern.structural.decorator.example1;

public class SimplePizza extends Pizza {
    public SimplePizza() {
        description = "SimplePizza";
    }

    public int getCost() {
        return 50;
    }
}