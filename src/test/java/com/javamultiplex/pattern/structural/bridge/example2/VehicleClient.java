package com.javamultiplex.pattern.structural.bridge.example2;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 30/08/20 9:20 pm
 * @copyright www.javamultiplex.com
 */
public class VehicleClient {

    @Test
    public void shouldManufactureBike() {
        Vehicle bike = new Bike();
        bike.joinWorkshop(new ProduceWorkShop());
        bike.joinWorkshop(new AssembleWorkShop());
        bike.joinWorkshop(new TestWorkShop());
        bike.manufacture();
    }

    @Test
    public void shouldManufactureCar() {
        Vehicle car = new Car();
        car.joinWorkshop(new ProduceWorkShop());
        car.joinWorkshop(new AssembleWorkShop());
        car.joinWorkshop(new PaintWorkShop());
        car.joinWorkshop(new TestWorkShop());
        car.manufacture();
    }

    @Test
    public void shouldManufactureBus() {
        Vehicle bus = new Bus();
        bus.joinWorkshop(new RepairWorkShop());
        bus.joinWorkshop(new AssembleWorkShop());
        bus.joinWorkshop(new TestWorkShop());
        bus.manufacture();
    }
}
