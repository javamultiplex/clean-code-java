package com.javamultiplex.pattern.creational.builder.multi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 23/08/20 9:24 pm
 * @copyright www.javamultiplex.com
 */
public class PersonTest {

    @Test
    public void shouldCreatePersonObject() {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .address().streetAddress("Adarsh Colony").city("Rudrapur").postcode("263153")
                .job().companyName("FIL").position("SAP").salary(1000)
                .build();
        assertEquals("Adarsh Colony", person.getStreetAddress());
        assertEquals("Rudrapur", person.getCity());
        assertEquals("263153", person.getPostcode());
        assertEquals("FIL", person.getCompanyName());
        assertEquals("SAP", person.getPosition());
        assertEquals(1000, person.getAnnualSalary());

    }
}
