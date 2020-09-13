package com.javamultiplex.pattern.behavioral.observer.example2;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 13/09/20 11:14 am
 * @copyright www.javamultiplex.com
 */
public class NumberSystemClient {

    @Test
    public void shouldNotifyObservers() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
