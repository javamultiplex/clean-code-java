package com.javamultiplex.pattern.structural.composite.example1;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 01/09/20 9:20 pm
 * @copyright www.javamultiplex.com
 */
public class DepartmentClient {

    @Test
    public void shouldCreateDepartments() {
        Department financeDepartment = new FinanceDepartment();
        Department salesDepartment = new SalesDepartment();
        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.addDepartment(financeDepartment);
        headDepartment.addDepartment(salesDepartment);
        headDepartment.printDepartmentName();
    }
}
