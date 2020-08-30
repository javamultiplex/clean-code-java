package com.javamultiplex.pattern.creational.singleton;

import com.javamultiplex.util.SerializationUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * @author Rohit Agarwal on 29/08/20 11:21 pm
 * @copyright www.javamultiplex.com
 */
public class EnumBasedSingletonClient {

    @Test
    public void shouldNotCreateTwoInstances() throws IOException, ClassNotFoundException {
        EnumBasedSingleton enumBasedSingleton = EnumBasedSingleton.INSTANCE;
        enumBasedSingleton.setValue(13);
        System.out.println(enumBasedSingleton.name());
        SerializationUtil.serialize(enumBasedSingleton, "enum-singleton.ser");
        EnumBasedSingleton another = (EnumBasedSingleton) SerializationUtil.deserialize("enum-singleton.ser");
        System.out.println(another.getValue());
    }
}
