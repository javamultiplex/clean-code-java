package com.javamultiplex.pattern.behavioral.command.example2;

//Concrete Command
public class LightOnCommand implements Command {
    //reference to the light
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOn();
    }
}