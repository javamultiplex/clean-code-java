package com.javamultiplex.pattern.behavioral.iterator;

/**
 * @author Rohit Agarwal on 09/09/20 9:52 pm
 * @copyright www.javamultiplex.com
 */
public interface Iterator<E> {
    E next();

    boolean hasNext();

    void reset();

    E currentItem();
}
