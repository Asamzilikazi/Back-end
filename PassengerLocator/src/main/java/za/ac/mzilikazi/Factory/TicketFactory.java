package za.ac.mzilikazi.Factory;

import za.ac.mzilikazi.Domain.Ticket;

import java.util.Map;

/**
 * Created by Asavela on 2017/08/10.
 */
public class TicketFactory {
    public static Ticket getTicket (Map<String, String> values, int number)
    {
        Ticket ticket = new Ticket.Builder()
                .ticketingCode(values.get("ticketingCode"))
                .number(number)
                .build();
        return ticket;
    }
}
