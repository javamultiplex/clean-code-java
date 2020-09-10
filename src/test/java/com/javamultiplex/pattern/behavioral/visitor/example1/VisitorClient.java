package com.javamultiplex.pattern.behavioral.visitor.example1;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 10/09/20 11:47 pm
 * @copyright www.javamultiplex.com
 */
public class VisitorClient {

    @Test
    public void shouldDisplayComputerParts(){
        ComputerPart computerPart=new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
