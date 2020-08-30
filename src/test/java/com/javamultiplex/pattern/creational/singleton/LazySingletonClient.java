package com.javamultiplex.pattern.creational.singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Rohit Agarwal on 29/08/20 8:54 pm
 * @copyright www.javamultiplex.com
 */
public class LazySingletonClient {

    @Test
    public void shouldCreateTwoInstance() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {
            LazySingleton lazySingleton = LazySingleton.getInstance1();
            System.out.println(lazySingleton);
        });
        executorService.execute(() -> {
            LazySingleton lazySingleton = LazySingleton.getInstance1();
            System.out.println(lazySingleton);
        });
    }

    @Test
    public void shouldNotCreateTwoInstanceUsingSynchronizedMethod() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {
            LazySingleton lazySingleton = LazySingleton.getInstance2();
            System.out.println(lazySingleton);
        });
        executorService.execute(() -> {
            LazySingleton lazySingleton = LazySingleton.getInstance2();
            System.out.println(lazySingleton);
        });
    }

    @Test
    public void shouldNotCreateTwoInstanceUsingDoubleLocking() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {
            LazySingleton lazySingleton = LazySingleton.getInstance3();
            System.out.println(lazySingleton);
        });
        executorService.execute(() -> {
            LazySingleton lazySingleton = LazySingleton.getInstance3();
            System.out.println(lazySingleton);
        });
    }
}
