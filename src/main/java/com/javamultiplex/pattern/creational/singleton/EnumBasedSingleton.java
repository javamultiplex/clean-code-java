package com.javamultiplex.pattern.creational.singleton;

/**
 * @author Rohit Agarwal on 29/08/20 11:19 pm
 * @copyright www.javamultiplex.com
 */

//enum is by default serializable
public enum EnumBasedSingleton {
    INSTANCE;

    private int value;

    EnumBasedSingleton() {
        value = 42;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
