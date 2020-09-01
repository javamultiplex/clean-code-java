package com.javamultiplex.pattern.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 01/09/20 9:16 pm
 * @copyright www.javamultiplex.com
 */
public class HeadDepartment implements Department {

    private final List<Department> childDepartments;

    public HeadDepartment() {
        childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
