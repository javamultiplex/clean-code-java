package com.javamultiplex.pattern.creational.builder.multi;

/**
 * @author Rohit Agarwal on 23/08/20 9:11 pm
 * @copyright www.javamultiplex.com
 */
public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder streetAddress(String streetAddress) {
        this.person.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder city(String city) {
        this.person.setCity(city);
        return this;
    }

    public PersonAddressBuilder postcode(String postcode) {
        this.person.setPostcode(postcode);
        return this;
    }
}
