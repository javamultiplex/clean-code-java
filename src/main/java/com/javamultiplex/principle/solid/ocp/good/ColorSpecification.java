package com.javamultiplex.principle.solid.ocp.good;

import com.javamultiplex.principle.solid.ocp.Color;
import com.javamultiplex.principle.solid.ocp.Product;

/**
 * @author Rohit Agarwal on 16/08/20 2:39 pm
 * @copyright www.javamultiplex.com
 */
public class ColorSpecification implements Specification<Product> {

    private final Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return color == item.getColor();
    }
}
