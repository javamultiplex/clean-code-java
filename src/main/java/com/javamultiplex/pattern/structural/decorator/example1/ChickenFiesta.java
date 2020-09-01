package com.javamultiplex.pattern.structural.decorator.example1;

public class ChickenFiesta extends Pizza {
    public ChickenFiesta() {
        description = "ChickenFiesta";
    }

    public int getCost() {
        return 200;
    }
} 