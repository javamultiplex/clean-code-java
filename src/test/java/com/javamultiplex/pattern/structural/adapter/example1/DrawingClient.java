package com.javamultiplex.pattern.structural.adapter.example1;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 30/08/20 7:21 pm
 * @copyright www.javamultiplex.com
 */
public class DrawingClient {

    @Test
    public void shouldCreateAndResizeDrawings() {
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));
        drawing.draw();
        drawing.resize();
    }
}
