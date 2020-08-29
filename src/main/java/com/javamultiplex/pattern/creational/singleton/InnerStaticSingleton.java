package com.javamultiplex.pattern.creational.singleton;

/**
 * @author Rohit Agarwal on 29/08/20 9:29 pm
 * @copyright www.javamultiplex.com
 */
public class InnerStaticSingleton {
    private InnerStaticSingleton() {
    }

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }
}
