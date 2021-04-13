package com.javamultiplex.pattern.creational.singleton;

import org.junit.jupiter.api.Test;

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
    public void singletonTest() {
        BasicSingleton instance1 = BasicSingleton.getInstance();
        BasicSingleton instance2 = BasicSingleton.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        assertSame(instance1, instance2);
    }

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
}
