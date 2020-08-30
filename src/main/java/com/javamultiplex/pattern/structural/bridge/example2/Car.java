package com.javamultiplex.pattern.structural.bridge.example2;

public class Car extends Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Car");
        workshops.forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }

    @Override
    public int minWorkTime() {
        return 10;
    }
}