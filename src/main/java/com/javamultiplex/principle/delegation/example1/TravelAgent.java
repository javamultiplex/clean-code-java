package com.javamultiplex.principle.delegation.example1;

/**
 * @author Rohit Agarwal on 21/08/20 11:58 pm
 * @copyright www.javamultiplex.com
 */
public class TravelAgent implements TravelBooking {

    private final TravelBooking travelBooking;

    public TravelAgent(TravelBooking travelBooking) {
        this.travelBooking = travelBooking;
    }

    @Override
    public void bookTicket() {
        travelBooking.bookTicket();
    }
}
