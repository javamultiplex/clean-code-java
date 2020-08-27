package com.javamultiplex.pattern.creational.prototype.serializable;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 27/08/20 9:30 pm
 * @copyright www.javamultiplex.com
 */
public class PersonClient {

    @Test
    public void shouldCreatePersonCopy() throws IOException, ClassNotFoundException {
        Person rohit = new Person(new String[]{"Rohit", "Agarwal"},
                new Address("Adarsh Colony", 14));
        try (OutputStream outputStream = new FileOutputStream(new File("person.ser"));
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(rohit);
        }

        Person bhavna;
        try (InputStream inputStream = new FileInputStream(new File("person.ser"));
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            bhavna = (Person) objectInputStream.readObject();
        }
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
