package za.ac.mzilikazi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.mzilikazi.Domain.Luggage;
import za.ac.mzilikazi.Domain.Passenger;
import za.ac.mzilikazi.Domain.Ticket;
import za.ac.mzilikazi.Factory.LuggageFactory;
import za.ac.mzilikazi.Factory.PassengerFactory;
import za.ac.mzilikazi.Factory.TicketFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Asavela on 2017/08/14.
 */
public class PassengerFactoryTest {
    Passenger passenger;
    Map<String, String> track;

    Ticket ticket;
    Map<String, String> tickets;

    Luggage luggage;
    Map<String, String> luggages;

    @Before
    public void setUp() throws Exception {

        track = new HashMap<String, String>();
        track.put("passengerID", "001");
        track.put("firstName", "Asavela");
        track.put("lastName", "Mzilikazi");
        track.put("DOB", "19890818");
        track.put("ContactNumber", "0836749030");

        tickets = new HashMap<String, String>();
        tickets.put("ticketingCode","4864488");
        tickets.put("number","23");

        ticket = TicketFactory.getTicket(tickets, 5);
        luggages = new HashMap<String, String>();
        luggages.put("luggageNumber","2498");

        luggage = LuggageFactory.getLuggage(luggages);

    }
    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetPassenger() throws Exception {

        passenger = PassengerFactory.getPassenger(track,luggage,ticket);

        System.out.println(passenger.toString());
        assertEquals(true, passenger.equals(passenger));
    }
}
