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

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
}
