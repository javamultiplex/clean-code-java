package com.javamultiplex.principle.solid.ocp.good;

import com.javamultiplex.principle.solid.ocp.Product;

/**
 * @author Rohit Agarwal on 16/08/20 2:49 pm
 * @copyright www.javamultiplex.com
 */
public class AndSpecification implements Specification<Product> {

    private final ColorSpecification colorSpecification;
    private final SizeSpecification sizeSpecification;

    public AndSpecification(ColorSpecification colorSpecification, SizeSpecification sizeSpecification) {
        this.colorSpecification = colorSpecification;
        this.sizeSpecification = sizeSpecification;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return colorSpecification.isSatisfied(item) && sizeSpecification.isSatisfied(item);
    }
}
