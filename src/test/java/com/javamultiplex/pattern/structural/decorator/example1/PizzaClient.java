package com.javamultiplex.pattern.structural.decorator.example1;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 01/09/20 11:40 pm
 * @copyright www.javamultiplex.com
 */
public class PizzaClient {

    @Test
    public void shouldCreateSimplePizza() {
        Pizza pizza = new SimplePizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }


    @Test
    public void shouldCreateSimplePizzaWithPaneerTopping() {
        Pizza simplePizza = new SimplePizza();
        Pizza paneerPizza = new Paneer(simplePizza);
        System.out.println(paneerPizza.getDescription());
        System.out.println(paneerPizza.getCost());
    }

    @Test
    public void shouldCreateSimplePizzaWithPaneerAndFreshTomatoTopping() {
        Pizza simplePizza = new SimplePizza();
        Pizza paneerPizza = new Paneer(simplePizza);
        Pizza freshTomatoPaneerPizza = new FreshTomato(paneerPizza);
        System.out.println(freshTomatoPaneerPizza.getDescription());
        System.out.println(freshTomatoPaneerPizza.getCost());
    }
}
