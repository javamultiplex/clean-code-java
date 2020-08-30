package com.javamultiplex.pattern.structural.adapter.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 30/08/20 8:00 pm
 * @copyright www.javamultiplex.com
 */
public class VoltClient {

    @Test
    public void shouldGet3VoltSupply(){
        SocketAdapter socketAdapter=new SocketObjectAdapterImpl();
        Assertions.assertEquals(3, socketAdapter.get3Volt().getVolts());
    }

    @Test
    public void shouldGet12VoltSupply(){
        SocketAdapter socketAdapter=new SocketObjectAdapterImpl();
        Assertions.assertEquals(12, socketAdapter.get12Volt().getVolts());
    }


    @Test
    public void shouldGet120VoltSupply(){
        SocketAdapter socketAdapter=new SocketObjectAdapterImpl();
        Assertions.assertEquals(120, socketAdapter.get120Volt().getVolts());
    }
}
