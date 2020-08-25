package com.javamultiplex.pattern.creational.abstractfactory;

/**
 * @author Rohit Agarwal on 25/08/20 8:48 pm
 * @copyright www.javamultiplex.com
 */
public interface AbstractFactory<T> {

    T create(String type);
}
