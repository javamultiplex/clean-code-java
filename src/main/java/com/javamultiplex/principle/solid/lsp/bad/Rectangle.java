package com.javamultiplex.principle.solid.lsp.bad;

/**
 * @author Rohit Agarwal on 18/08/20 11:48 pm
 * @copyright www.javamultiplex.com
 */
public class Rectangle {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return height * width;
    }
}
