package com.javamultiplex.pattern.structural.flyweight;

class Terrorist implements Player
{ 
    // Intrinsic Attribute 
    private final String TASK; 
  
    // Extrinsic Attribute 
    private String weapon; 
  
    public Terrorist() 
    { 
        TASK = "PLANT A BOMB";
        System.out.println("Terrorist");
    } 
    public void assignWeapon(String weapon) 
    { 
        // Assign a weapon 
        this.weapon = weapon; 
    } 
    public void mission() 
    { 
        //Work on the Mission 
        System.out.println("Terrorist with weapon "
                           + weapon + "|" + " Task is " + TASK); 
    } 
}