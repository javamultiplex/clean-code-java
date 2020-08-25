package com.javamultiplex.pattern.creational.builder.single.example1;

import com.javamultiplex.pattern.creational.builder.single.example1.Person;
import com.javamultiplex.pattern.creational.builder.single.example1.Person.PersonBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 23/08/20 7:24 pm
 * @copyright www.javamultiplex.com
 */
public class PersonClient {

    @Test
    public void shouldCreatePersonObjectWithAllAttributes() {
        PersonBuilder personBuilder = new PersonBuilder("Rohit", "Agarwal");
        Person person = personBuilder.withCity("Rudrapur").withAadhar(1234).build();
        assertEquals("Rohit", person.getFirstName());
        assertEquals("Agarwal", person.getLastName());
        assertEquals("Rudrapur", person.getCity());
        assertEquals(1234, person.getAadharId());
    }
}
