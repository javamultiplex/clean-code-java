package com.javamultiplex.pattern.creational.singleton;

import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Rohit Agarwal on 29/08/20 7:23 pm
 * @copyright www.javamultiplex.com
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (IOException e) {
            System.err.println("Error occurred in instance creation");
        }
    }

    private StaticBlockSingleton() throws IOException {
        Files.createTempFile(".", ".");
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
