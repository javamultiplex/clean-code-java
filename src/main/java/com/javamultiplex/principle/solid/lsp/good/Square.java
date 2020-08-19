package com.javamultiplex.principle.solid.lsp.good;

/**
 * @author Rohit Agarwal on 19/08/20 9:09 pm
 * @copyright www.javamultiplex.com
 */
public class Square implements Shape {
    private final int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public int calculateArea() {
        return size * size;
    }
}
