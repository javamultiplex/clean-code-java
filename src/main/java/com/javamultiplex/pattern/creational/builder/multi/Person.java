package com.javamultiplex.pattern.creational.builder.multi;

/**
 * @author Rohit Agarwal on 23/08/20 9:05 pm
 * @copyright www.javamultiplex.com
 */
public class Person {
    //Address
    private String streetAddress;
    private String city;
    private String postcode;
    //Employment
    private String companyName;
    private String position;
    private int annualSalary;

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPosition() {
        return position;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
}
