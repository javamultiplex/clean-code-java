package com.javamultiplex.pattern.creational.singleton;

/**
 * @author Rohit Agarwal on 27/08/20 11:59 pm
 * @copyright www.javamultiplex.com
 */
public class BasicSingleton {

    public static BasicSingleton INSTANCE = new BasicSingleton();
    private int value;

    private BasicSingleton() { }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }
}
