package com.javamultiplex.pattern.structural.bridge.example2;

public class Bus extends Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Bus");
        workshops.forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }

    @Override
    public int minWorkTime() {
        return 20;
    }
}