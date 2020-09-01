package com.javamultiplex.pattern.structural.decorator.example2;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 01/09/20 11:50 pm
 * @copyright www.javamultiplex.com
 */
public class CarClient {
    @Test
    public void ShouldCreateBasicCar() {
        Car car = new BasicCar();
        car.assemble();
    }

    @Test
    public void ShouldCreateLuxuryCar() {
        Car basicCar = new BasicCar();
        Car luxuryCar = new LuxuryCar(basicCar);
        luxuryCar.assemble();
    }

    @Test
    public void ShouldCreateSportsLuxuryCar() {
        Car basicCar = new BasicCar();
        Car luxuryCar = new LuxuryCar(basicCar);
        Car sportsCar = new SportsCar(luxuryCar);
        sportsCar.assemble();
    }
}
