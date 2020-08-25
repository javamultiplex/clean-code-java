package com.javamultiplex.pattern.creational.prototype.cloneable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 25/08/20 11:37 pm
 * @copyright www.javamultiplex.com
 */
public class PersonClient {

    @Test
    public void shouldCreatePersonCopy() throws CloneNotSupportedException {
        Person rohit = new Person(new String[]{"Rohit", "Agarwal"},
                new Address("Adarsh Colony", 14));
        Person bhavna = (Person) rohit.clone();
        bhavna.getAddress().setHouseNumber(15);
        String[] names = bhavna.getNames();
        names[0] = "bhavna";
        bhavna.setNames(names);

        assertEquals("Rohit", rohit.getNames()[0]);
        assertEquals("Agarwal", rohit.getNames()[1]);
        assertEquals("Adarsh Colony", rohit.getAddress().getStreetAddress());
        assertEquals(14, rohit.getAddress().getHouseNumber());

        assertEquals("bhavna", bhavna.getNames()[0]);
        assertEquals("Agarwal", bhavna.getNames()[1]);
        assertEquals("Adarsh Colony", bhavna.getAddress().getStreetAddress());
        assertEquals(15, bhavna.getAddress().getHouseNumber());

    }
}
