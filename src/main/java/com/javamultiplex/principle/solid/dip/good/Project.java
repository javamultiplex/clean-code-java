package com.javamultiplex.principle.solid.dip.good;

import java.util.List;

/**
 * @author Rohit Agarwal on 20/08/20 8:26 pm
 * @copyright www.javamultiplex.com
 */
public class Project {
    private final List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement(){
        developers.forEach(Developer::develop);
    }
}
