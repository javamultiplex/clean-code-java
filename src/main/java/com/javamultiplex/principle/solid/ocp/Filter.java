package com.javamultiplex.principle.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Rohit Agarwal on 16/08/20 2:38 pm
 * @copyright www.javamultiplex.com
 */
public interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> specification);
}
