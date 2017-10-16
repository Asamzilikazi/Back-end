package za.ac.mzilikazi.Services;

import za.ac.mzilikazi.Domain.Ticket;

/**
 * Created by Asavela on 2017/08/10.
 */
public interface TicketService {
    Ticket save(Ticket ticket);
    Ticket findById(String ticketingCode);
    Ticket update(Ticket ticket);
    void delete(String ticketingCode);
}
