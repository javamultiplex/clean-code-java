package com.javamultiplex.pattern.creational.singleton;

import com.javamultiplex.util.SerializationUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * @author Rohit Agarwal on 28/08/20 12:04 am
 * @copyright www.javamultiplex.com
 */
public class SingletonV4Client {

    @Test
    public void shouldNotCreateTwoInstancesUsingSerialization() throws IOException, ClassNotFoundException {
        SingletonV4 singletonV4 = SingletonV4.getInstance();
        singletonV4.setValue(110);
        SerializationUtil.serialize(singletonV4, "singleton.ser");
        SingletonV4 another = (SingletonV4) SerializationUtil.deserialize("singleton.ser");
        another.setValue(11);
        assertSame(singletonV4, another);
        assertEquals(11, singletonV4.getValue());
        assertEquals(11, another.getValue());
    }
}
