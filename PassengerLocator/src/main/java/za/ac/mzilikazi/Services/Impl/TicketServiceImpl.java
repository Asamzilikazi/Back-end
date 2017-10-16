package za.ac.mzilikazi.Services.Impl;

import za.ac.mzilikazi.Domain.Ticket;
import za.ac.mzilikazi.Repository.Impl.TicketRepositoryImpl;

/**
 * Created by Asavela on 2017/08/10.
 */
public class TicketServiceImpl {
    public static TicketServiceImpl ticketService = null;

    TicketRepositoryImpl ticketRepository = TicketRepositoryImpl.getInstance();

    public static TicketServiceImpl getInstance()
    {
        if (ticketService == null)
            ticketService = new TicketServiceImpl();
        return ticketService;
    }

    public Ticket save(Ticket ticket){
        return ticketRepository.save(ticket);    }

    public Ticket findById(String ticketingCode){
        return ticketRepository.findById(ticketingCode);    }

    public Ticket update(Ticket ticket){
        return ticketRepository.update(ticket);    }

    public void delete(String ticketingCode)
    {
        ticketRepository.delete(ticketingCode);
    }

}
