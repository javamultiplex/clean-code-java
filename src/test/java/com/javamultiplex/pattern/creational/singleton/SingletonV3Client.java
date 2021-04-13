package com.javamultiplex.pattern.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * @author Rohit Agarwal on 28/08/20 12:04 am
 * @copyright www.javamultiplex.com
 */
public class SingletonV3Client {

    @Test
    public void shouldNotCreateTwoInstancesUsingCloning() {
        SingletonV3 singletonV3 = SingletonV3.getInstance();
        singletonV3.setValue(110);
        CloneNotSupportedException cloneNotSupportedException = Assertions.assertThrows(CloneNotSupportedException.class, () -> {
            SingletonV3 newInstance = (SingletonV3) singletonV3.clone();
            newInstance.setValue(30);
            assertNotSame(singletonV3, newInstance);
            assertEquals(110, singletonV3.getValue());
            assertEquals(30, newInstance.getValue());
        });
        Assertions.assertEquals("Object cloning not supported.", cloneNotSupportedException.getMessage());
    }
}
