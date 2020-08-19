package com.javamultiplex.principle.solid.lsp.bad;

/**
 * @author Rohit Agarwal on 18/08/20 11:49 pm
 * @copyright www.javamultiplex.com
 */
public class Square extends Rectangle {

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);
    }
}
