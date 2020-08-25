package com.javamultiplex.pattern.creational.factory.example1;

import com.javamultiplex.pattern.creational.factory.example1.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 24/08/20 11:46 pm
 * @copyright www.javamultiplex.com
 */
public class PointClient {

    @Test
    public void shouldCreateCartesianPoint() {
        Point point = Point.Factory.newCartesianPoint(10, 20);
        Assertions.assertEquals(10, point.getX());
        Assertions.assertEquals(20, point.getY());
    }

    @Test
    public void shouldCreatePolarPoint() {
        Point point = Point.Factory.newPolarPoint(10, 20);
        Assertions.assertEquals(10 * Math.sin(20), point.getX());
        Assertions.assertEquals(10 * Math.cos(20), point.getY());
    }
}
