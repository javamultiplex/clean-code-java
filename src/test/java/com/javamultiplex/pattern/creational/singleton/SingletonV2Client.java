package com.javamultiplex.pattern.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author Rohit Agarwal on 28/08/20 12:04 am
 * @copyright www.javamultiplex.com
 */
public class SingletonV2Client {

    @Test
    public void shouldNotCreateTwoInstancesUsingReflection() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonV2 singletonV2 = SingletonV2.getInstance();
        singletonV2.setValue(110);
        Class<SingletonV2> singletonV2Class = SingletonV2.class;
        Constructor<?>[] constructors = singletonV2Class.getDeclaredConstructors();
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
        InvocationTargetException invocationTargetException = Assertions.assertThrows(InvocationTargetException.class, () ->
        {
            SingletonV2 newInstance = (SingletonV2) constructor.newInstance();
            newInstance.setValue(30);
        });
        Assertions.assertEquals(InstantiationError.class, invocationTargetException.getCause().getClass());
        Assertions.assertEquals("Object Creation is not allowed.", invocationTargetException.getCause().getMessage());
    }
}
