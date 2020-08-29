package com.javamultiplex.pattern.creational.singleton;

import com.javamultiplex.util.SerializationUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 28/08/20 12:04 am
 * @copyright www.javamultiplex.com
 */
public class BasicSingletonClient {

    @Test
    public void shouldCreateTwoInstancesUsingReflection() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.setValue(110);

        Class<BasicSingleton> basicSingletonClass = BasicSingleton.class;
        Constructor<?>[] constructors = basicSingletonClass.getDeclaredConstructors();
        Optional<Constructor<?>> privateConstructor = Arrays.stream(constructors)
                .filter(constructor -> !constructor.isAccessible())
                .findAny();
        Constructor<?> constructor;
        if (privateConstructor.isPresent()) {
            constructor = privateConstructor.get();
            constructor.setAccessible(true);
        } else {
            throw new NoSuchElementException("No private constructor found");
        }

        BasicSingleton newInstance = (BasicSingleton) constructor.newInstance();
        newInstance.setValue(30);

        assertNotSame(basicSingleton, newInstance);
        assertEquals(110, basicSingleton.getValue());
        assertEquals(30, newInstance.getValue());
    }

    @Test
    public void shouldNotCreateTwoInstancesUsingSerialization() throws IOException, ClassNotFoundException {
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.setValue(110);
        SerializationUtil.serialize(basicSingleton, "singleton.ser");
        BasicSingleton another = (BasicSingleton) SerializationUtil.deserialize("singleton.ser");
        another.setValue(11);
        assertSame(basicSingleton, another);
        assertEquals(11, basicSingleton.getValue());
        assertEquals(11, another.getValue());
    }
}
