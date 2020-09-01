package com.javamultiplex.pattern.structural.decorator.example1;

public abstract class Pizza
{ 
    // it is an abstract pizza 
    String description = "Unkknown Pizza"; 
  
    public String getDescription() 
    { 
        return description; 
    } 
  
    public abstract int getCost(); 
} 