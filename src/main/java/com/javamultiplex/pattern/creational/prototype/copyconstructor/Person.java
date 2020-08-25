package com.javamultiplex.pattern.creational.prototype.copyconstructor;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 25/08/20 11:53 pm
 * @copyright www.javamultiplex.com
 */
public class Person {
    private String[] names;
    private Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    public Person(Person other) {
        this.names = new String[other.names.length];
        System.arraycopy(other.names, 0, this.names, 0, other.names.length);
        this.address = new Address(other.address);
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}
