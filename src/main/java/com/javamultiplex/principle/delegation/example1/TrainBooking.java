package com.javamultiplex.principle.delegation.example1;

/**
 * @author Rohit Agarwal on 21/08/20 11:56 pm
 * @copyright www.javamultiplex.com
 */
public class TrainBooking implements TravelBooking {
    @Override
    public void bookTicket() {
        System.out.println("Train ticket booked");
    }
}
