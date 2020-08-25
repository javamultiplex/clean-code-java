package com.javamultiplex.pattern.creational.prototype.copyconstructor;

/**
 * @author Rohit Agarwal on 25/08/20 11:52 pm
 * @copyright www.javamultiplex.com
 */
public class Address {
    private String streetAddress;
    private int houseNumber;

    public Address(String streetAddress, int houseNumber) {
        this.streetAddress = streetAddress;
        this.houseNumber = houseNumber;
    }

    public Address(Address other) {
        this(other.streetAddress, other.houseNumber);
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                '}';
    }
}
