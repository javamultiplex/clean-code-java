package com.javamultiplex.pattern.structural.composite.example2;

/**
 * @author Rohit Agarwal on 01/09/20 9:27 pm
 * @copyright www.javamultiplex.com
 */
public class Developer implements Employee {
    private final String name;
    private final int empId;
    private final String position;

    public Developer(String name, int empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.printf("Name: %s, EmpId: %d, Position: %s\n", name, empId, position);
    }
}
