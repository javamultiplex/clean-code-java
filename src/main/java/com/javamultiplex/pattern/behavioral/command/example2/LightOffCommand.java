package com.javamultiplex.pattern.behavioral.command.example2;

//Concrete Command
public class LightOffCommand implements Command {
    //reference to the light
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOff();
    }
}