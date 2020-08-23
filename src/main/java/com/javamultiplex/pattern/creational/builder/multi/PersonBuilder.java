package com.javamultiplex.pattern.creational.builder.multi;

/**
 * @author Rohit Agarwal on 23/08/20 9:10 pm
 * @copyright www.javamultiplex.com
 */
public class PersonBuilder {
    protected Person person = new Person();

    public PersonAddressBuilder address() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder job() {
        return new PersonJobBuilder(person);
    }

    public Person build() {
        return person;
    }
}
