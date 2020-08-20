package com.javamultiplex.principle.solid.srp.example1.bad;

import java.util.Date;

/**
 * @author Rohit Agarwal on 20/08/20 8:02 pm
 * @copyright www.javamultiplex.com
 */
public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    public boolean isPromotionDueThisYear() {
        //promotion logic implementation
        return false;
    }

    public Double calcIncomeTaxForCurrentYear() {
        //income tax logic implementation
        return 0d;
    }

    //Getters & Setters
}