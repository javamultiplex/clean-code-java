package com.javamultiplex.pattern.structural.facade;

public class Blackberry implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Blackberry Z10 ");
    }

    @Override
    public void price() {
        System.out.println(" Rs 55000.00 ");
    }
}  