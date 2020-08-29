package com.javamultiplex.pattern.creational.multiton;

import java.util.HashMap;

/**
 * @author Rohit Agarwal on 29/08/20 11:55 pm
 * @copyright www.javamultiplex.com
 */
public class Printer {
    private static HashMap<SubSystem, Printer> hashMap = new HashMap<>();

    private Printer() {

    }

    public static Printer get(SubSystem subSystem) {
        if (hashMap.containsKey(subSystem)) {
            return hashMap.get(subSystem);
        }
        Printer printer = new Printer();
        hashMap.put(subSystem, printer);
        return printer;
    }
}
