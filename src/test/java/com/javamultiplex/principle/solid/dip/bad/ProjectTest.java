package com.javamultiplex.principle.solid.dip.bad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 20/08/20 8:29 pm
 * @copyright www.javamultiplex.com
 */
public class ProjectTest {
    private Project project;

    @BeforeEach
    void setUp() {
        BackendDeveloper backendDeveloper=new BackendDeveloper();
        FrontEndDeveloper frontEndDeveloper=new FrontEndDeveloper();
        project=new Project(backendDeveloper, frontEndDeveloper);
    }

    @Test
    public void shouldImplement(){
        project.implement();
    }
}
