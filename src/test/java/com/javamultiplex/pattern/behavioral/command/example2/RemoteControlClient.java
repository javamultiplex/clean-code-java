package com.javamultiplex.pattern.behavioral.command.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 03/09/20 11:15 pm
 * @copyright www.javamultiplex.com
 */
public class RemoteControlClient {

    @Test
    public void shouldSwitchOnLights() {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
        Assertions.assertTrue(light.isOn());
    }

    @Test
    public void shouldSwitchOffLights() {
        Light light = new Light();
        Command lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
        Assertions.assertFalse(light.isOn());
    }
}
