package com.javamultiplex.pattern.behavioral.state.example1;

public class Delivered implements PackageState 
{
    //Singleton
    private static Delivered instance = new Delivered();
 
    private Delivered() {}
 
    public static Delivered instance() {
        return instance;
    }
     
    //Business logic
    @Override
    public void updateState(DeliveryContext ctx) 
    {
        System.out.println("Package is delivered!!");
    }
}