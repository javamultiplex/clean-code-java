package com.javamultiplex.pattern.behavioral.visitor.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 10/09/20 11:54 pm
 * @copyright www.javamultiplex.com
 */
public class ShoppingCartClient {

    @Test
    public void shouldCalculateTotalPrice() {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"), new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        Assertions.assertEquals(160, total);

    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}

