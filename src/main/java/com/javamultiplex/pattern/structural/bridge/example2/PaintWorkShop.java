package com.javamultiplex.pattern.structural.bridge.example2;

public class PaintWorkShop extends Workshop {
    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Painting... ");
        long timeToTake = 100 * vehicle.minWorkTime();
        try {
            Thread.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}