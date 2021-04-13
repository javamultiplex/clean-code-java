package com.javamultiplex.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author Rohit Agarwal on 27/08/20 11:59 pm
 * @copyright www.javamultiplex.com
 */
public class SingletonV4 implements Cloneable, Serializable {
    private static final long serialVersionUID = -6942288218575793523L;
    private static final SingletonV4 INSTANCE = new SingletonV4();
    private int value;

    private SingletonV4() {
        if (INSTANCE != null) {
            throw new InstantiationError("Object Creation is not allowed.");
        }
    }

    public static SingletonV4 getInstance() {
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

    public Object readResolve() {
        return INSTANCE;
    }
}
