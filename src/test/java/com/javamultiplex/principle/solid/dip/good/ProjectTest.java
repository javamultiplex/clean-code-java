package com.javamultiplex.principle.solid.dip.good;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Rohit Agarwal on 20/08/20 8:32 pm
 * @copyright www.javamultiplex.com
 */
public class ProjectTest {

    @Test
    public void shouldImplementWithFrontEndDeveloper(){
        Developer frontEndDeveloper=new FrontendDeveloper();
        List<Developer> developers = Collections.singletonList(frontEndDeveloper);
        Project project=new Project(developers);
        project.implement();
    }

    @Test
    public void shouldImplementWithBackEndDeveloper(){
        Developer backendDeveloper=new BackendDeveloper();
        List<Developer> developers = Collections.singletonList(backendDeveloper);
        Project project=new Project(developers);
        project.implement();
    }

    @Test
    public void shouldImplementWithBackEndAndFrontEndDeveloper(){
        Developer backendDeveloper=new BackendDeveloper();
        Developer frontEndDeveloper=new FrontendDeveloper();
        List<Developer> developers = Arrays.asList(backendDeveloper,frontEndDeveloper);
        Project project=new Project(developers);
        project.implement();
    }

}
