package com.javamultiplex.pattern.structural.decorator.example1;

public class FarmHouse extends Pizza {
    public FarmHouse() {
        description = "FarmHouse";
    }

    public int getCost() {
        return 200;
    }
}