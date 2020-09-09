package com.javamultiplex.pattern.behavioral.state.example1;

public class OutForDelivery implements PackageState
{
    //Singleton
    private static OutForDelivery instance = new OutForDelivery();
 
    private OutForDelivery() {}
 
    public static OutForDelivery instance() {
        return instance;
    }
     
    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx) 
    {
        System.out.println("Package is out of delivery !!");
        ctx.setCurrentState(Delivered.instance());
    }
}