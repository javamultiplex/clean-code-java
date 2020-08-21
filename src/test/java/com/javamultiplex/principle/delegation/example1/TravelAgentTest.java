package com.javamultiplex.principle.delegation.example1;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 22/08/20 12:01 am
 * @copyright www.javamultiplex.com
 */
public class TravelAgentTest {

    @Test
    public void shouldBookTrainTickets() {
        TravelBooking travelBooking = new TrainBooking();
        TravelAgent travelAgent = new TravelAgent(travelBooking);
        travelAgent.bookTicket();

    }

    @Test
    public void shouldBookAirTickets() {
        TravelBooking travelBooking = new AirBooking();
        TravelAgent travelAgent = new TravelAgent(travelBooking);
        travelAgent.bookTicket();

    }
}
