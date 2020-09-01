package com.javamultiplex.pattern.structural.decorator.example1;

public class PeppyPaneer extends Pizza {
    public PeppyPaneer() {
        description = "PeppyPaneer";
    }

    public int getCost() {
        return 100;
    }
} 