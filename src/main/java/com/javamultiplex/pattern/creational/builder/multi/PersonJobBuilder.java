package com.javamultiplex.pattern.creational.builder.multi;

/**
 * @author Rohit Agarwal on 23/08/20 9:18 pm
 * @copyright www.javamultiplex.com
 */
public class PersonJobBuilder extends PersonBuilder {
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder companyName(String companyName) {
        this.person.setCompanyName(companyName);
        return this;
    }

    public PersonJobBuilder position(String position) {
        this.person.setPosition(position);
        return this;
    }

    public PersonJobBuilder salary(int salary) {
        this.person.setAnnualSalary(salary);
        return this;
    }
}
