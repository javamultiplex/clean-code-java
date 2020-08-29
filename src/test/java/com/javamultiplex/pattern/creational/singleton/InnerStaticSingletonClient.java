package com.javamultiplex.pattern.creational.singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Rohit Agarwal on 29/08/20 9:34 pm
 * @copyright www.javamultiplex.com
 */
public class InnerStaticSingletonClient {
    @Test
    public void shouldNotCreateTwoInstances(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            InnerStaticSingleton innerStaticSingleton = InnerStaticSingleton.getInstance();
            System.out.println(innerStaticSingleton);
        });
        executorService.execute(()->{
            InnerStaticSingleton innerStaticSingleton = InnerStaticSingleton.getInstance();
            System.out.println(innerStaticSingleton);
        });
    }
}
