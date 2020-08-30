package com.javamultiplex.pattern.structural.bridge.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 30/08/20 9:07 pm
 * @copyright www.javamultiplex.com
 */
public abstract class Vehicle {
    protected List<Workshop> workshops = new ArrayList<>();

    public void joinWorkshop(Workshop workshop) {
        workshops.add(workshop);
    }

    protected abstract void manufacture();

    protected abstract int minWorkTime();
}
