package com.javamultiplex.principle.solid.ocp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 16/08/20 2:58 pm
 * @copyright www.javamultiplex.com
 */
public class OldProductFilterTest {

    private OldProductFilter oldProductFilter;
    private List<Product> products;

    @BeforeEach
    void setUp() {
        oldProductFilter = new OldProductFilter();
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        products = List.of(apple, tree, house);
    }

    @Test
    public void shouldFilterByColor() {
        List<Product> productList = oldProductFilter.filterByColor(products, Color.GREEN)
                .collect(Collectors.toList());
        assertEquals(2, productList.size());
        List<String> actual = productList.stream().map(Product::getName)
                .collect(Collectors.toList());
        assertEquals(List.of("Apple", "Tree"), actual);
    }

    @Test
    public void shouldFilterBySize() {
        List<Product> productList = oldProductFilter.filterBySize(products, Size.SMALL)
                .collect(Collectors.toList());
        assertEquals(1, productList.size());
        List<String> actual = productList.stream().map(Product::getName)
                .collect(Collectors.toList());
        assertEquals(List.of("Apple"), actual);
    }

    @Test
    public void shouldFilterByColorAndSize(){
        List<Product> productList = oldProductFilter.filterByColorAndSize(products, Color.GREEN, Size.LARGE)
                .collect(Collectors.toList());
        assertEquals(1, productList.size());
        List<String> actual = productList.stream().map(Product::getName)
                .collect(Collectors.toList());
        assertEquals(List.of("Tree"), actual);
    }

}
