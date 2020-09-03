package com.javamultiplex.pattern.behavioral.command.example2;

//Receiver
public class Light {
    private boolean on;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
