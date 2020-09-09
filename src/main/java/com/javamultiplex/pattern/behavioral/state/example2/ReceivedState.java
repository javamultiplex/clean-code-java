package com.javamultiplex.pattern.behavioral.state.example2;

public class ReceivedState implements PackageState {
 
    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received by a client.");
    }
 
    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package is received by customer");
    }
}