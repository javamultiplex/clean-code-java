package com.javamultiplex.pattern.structural.composite.example2;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 01/09/20 9:33 pm
 * @copyright www.javamultiplex.com
 */
public class EmployeeClient {

    @Test
    public void shouldCreateEmployee(){
        Developer dev1 = new Developer("Lokesh Sharma", 101,"Pro Developer");
        Developer dev2 = new Developer("Vinay Sharma", 102,"Developer");
        Director engDirectory = new Director();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager("Kushagra Garg", 200,"SEO Manager");
        Manager man2 = new Manager("Vikram Sharma ", 201, "Kushagra's Manager");

        Director accDirectory = new Director();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Director directory = new Director();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}
