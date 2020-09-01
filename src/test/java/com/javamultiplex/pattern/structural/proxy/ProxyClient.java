package com.javamultiplex.pattern.structural.proxy;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 01/09/20 9:58 pm
 * @copyright www.javamultiplex.com
 */
public class ProxyClient {

    @Test
    public void shouldCreateImage() {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
