package com.javamultiplex.pattern.creational.singleton;

/**
 * @author Rohit Agarwal on 27/08/20 11:59 pm
 * @copyright www.javamultiplex.com
 */
public class SingletonV2 {
    private static final SingletonV2 INSTANCE = new SingletonV2();
    private int value;

    private SingletonV2() {
        if (INSTANCE != null) {
            throw new InstantiationError("Object Creation is not allowed.");
        }
    }

    public static SingletonV2 getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
