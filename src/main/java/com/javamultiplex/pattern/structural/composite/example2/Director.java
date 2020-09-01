package com.javamultiplex.pattern.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 01/09/20 9:30 pm
 * @copyright www.javamultiplex.com
 */
public class Director implements Employee {

    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        employees.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
