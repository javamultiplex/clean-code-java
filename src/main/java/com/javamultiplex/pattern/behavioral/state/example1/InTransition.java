package com.javamultiplex.pattern.behavioral.state.example1;

public class InTransition implements PackageState
{
    //Singleton
    private static InTransition instance = new InTransition();
 
    private InTransition() {}
 
    public static InTransition instance() {
        return instance;
    }
     
    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx) 
    {
        System.out.println("Package is in transition !!");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}