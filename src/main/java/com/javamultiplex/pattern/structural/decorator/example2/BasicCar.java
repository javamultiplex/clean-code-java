package com.javamultiplex.pattern.structural.decorator.example2;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}