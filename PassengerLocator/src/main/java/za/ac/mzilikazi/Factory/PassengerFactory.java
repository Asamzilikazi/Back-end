package za.ac.mzilikazi.Factory;

import za.ac.mzilikazi.Domain.Luggage;
import za.ac.mzilikazi.Domain.Passenger;
import za.ac.mzilikazi.Domain.Ticket;

import java.util.Map;

/**
 * Created by Asavela on 2017/08/13.
 */
public class PassengerFactory {
    public static Passenger getPassenger (Map<String, String> values, Luggage luggage, Ticket ticket)
    {
        Passenger passenger = new Passenger.Builder()
                .contactNumber(values.get("contactNumber"))
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .DOB(values.get("DOB"))
                .luggage(luggage)
                .ticket(ticket)
                .build();
        return passenger;
    }
}
