package com.javamultiplex.principle.delegation.example1;

/**
 * @author Rohit Agarwal on 21/08/20 11:57 pm
 * @copyright www.javamultiplex.com
 */
public class AirBooking implements TravelBooking {
    @Override
    public void bookTicket() {
        System.out.println("Air ticket booked");
    }
}
