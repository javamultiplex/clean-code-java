package com.javamultiplex.pattern.structural.decorator.example1;

public class Margherita extends Pizza {
    public Margherita() {
        description = "Margherita";
    }

    public int getCost() {
        return 100;
    }
} 