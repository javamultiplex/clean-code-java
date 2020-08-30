package com.javamultiplex.pattern.structural.bridge.example2;

public class ProduceWorkShop extends Workshop {
    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Producing... ");
        long timeToTake = 300 * vehicle.minWorkTime();
        try {
            Thread.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}