package com.javamultiplex.pattern.creational.factory.example1;

/**
 * @author Rohit Agarwal on 24/08/20 11:40 pm
 * @copyright www.javamultiplex.com
 */
public class Point {
    private final double x;
    private final double y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static class Factory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.sin(theta), rho * Math.cos(theta));
        }
    }
}
