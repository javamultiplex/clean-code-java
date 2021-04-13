package com.javamultiplex.pattern.creational.singleton;

/**
 * @author Rohit Agarwal on 27/08/20 11:59 pm
 * @copyright www.javamultiplex.com
 */
public class SingletonV3 implements Cloneable {
    private static final SingletonV3 INSTANCE = new SingletonV3();
    private int value;

    private SingletonV3() {
        if (INSTANCE != null) {
            throw new InstantiationError("Object Creation is not allowed.");
        }
    }

    public static SingletonV3 getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Object cloning not supported.");
    }
}
