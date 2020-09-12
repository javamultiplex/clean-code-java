package com.javamultiplex.pattern.behavioral.memento;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 12/09/20 9:03 pm
 * @copyright www.javamultiplex.com
 */
public class MementoClient {
    @Test
    public void shouldRestoreState() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
