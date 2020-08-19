package com.javamultiplex.principle.solid.lsp.good;

/**
 * @author Rohit Agarwal on 19/08/20 9:07 pm
 * @copyright www.javamultiplex.com
 */
public class Rectangle implements Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}
