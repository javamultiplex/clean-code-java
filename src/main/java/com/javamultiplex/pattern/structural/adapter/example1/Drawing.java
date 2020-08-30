package com.javamultiplex.pattern.structural.adapter.example1;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    List<Shape> shapes = new ArrayList<>();

    public Drawing() {
        super();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }

    public void draw() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to draw!");
        } else {
            shapes.forEach(Shape::draw);
        }
    }

    public void resize() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to resize!");
        } else {
            shapes.forEach(Shape::resize);
        }
    }
}