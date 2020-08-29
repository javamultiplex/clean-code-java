package com.javamultiplex.pattern.creational.singleton;

/**
 * @author Rohit Agarwal on 29/08/20 8:48 pm
 * @copyright www.javamultiplex.com
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    /**
     * Initialized lazy but not thread safe
     *
     * @return
     */
    public static LazySingleton getInstance1() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * Initialized lazy , Thread safe but not recommended
     *
     * @return
     */
    public static synchronized LazySingleton getInstance2() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * Initialized lazy , Thread safe using Double locking
     *
     * @return
     */
    public static LazySingleton getInstance3() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
