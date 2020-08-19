package com.javamultiplex.principle.solid.ocp.good;

/**
 * @author Rohit Agarwal on 16/08/20 2:36 pm
 * @copyright www.javamultiplex.com
 */
public interface Specification<T> {
    boolean isSatisfied(T item);
}
