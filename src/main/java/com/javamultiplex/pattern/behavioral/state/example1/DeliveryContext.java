package com.javamultiplex.pattern.behavioral.state.example1;

public class DeliveryContext {
     
    private PackageState currentState;
    private String packageId;
     
    public DeliveryContext(PackageState currentState, String packageId) 
    {
        super();
        this.currentState = currentState;
        this.packageId = packageId;
         
        if(currentState == null) {
            this.currentState = Acknowledged.instance();
        }
    }
 
    public PackageState getCurrentState() {
        return currentState;
    }
 
    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }
     
    public String getPackageId() {
        return packageId;
    }
 
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }
 
    public void update() {
        currentState.updateState(this);
    }
}