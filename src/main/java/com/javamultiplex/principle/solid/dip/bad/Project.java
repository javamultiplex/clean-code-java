package com.javamultiplex.principle.solid.dip.bad;

/**
 * @author Rohit Agarwal on 20/08/20 8:20 pm
 * @copyright www.javamultiplex.com
 */
public class Project {
    private final BackendDeveloper backendDeveloper;
    private final FrontEndDeveloper frontEndDeveloper;

    public Project(BackendDeveloper backendDeveloper, FrontEndDeveloper frontEndDeveloper) {
        this.backendDeveloper = backendDeveloper;
        this.frontEndDeveloper = frontEndDeveloper;
    }

    public void implement() {
        backendDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}
