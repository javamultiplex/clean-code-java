package com.javamultiplex.principle.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Rohit Agarwal on 16/08/20 2:22 pm
 * @copyright www.javamultiplex.com
 */
public class OldProductFilter {

    public Stream<Product> filterByColor(final List<Product> products, final Color color) {
        return products.stream().filter(product -> product.getColor() == color);
    }

    public Stream<Product> filterBySize(final List<Product> products, final Size size) {
        return products.stream().filter(product -> product.getSize() == size);
    }

    public Stream<Product> filterByColorAndSize(final List<Product> products, final Color color, final Size size) {
        return products.stream().filter(product -> product.getColor() == color && product.getSize() == size);
    }
}
