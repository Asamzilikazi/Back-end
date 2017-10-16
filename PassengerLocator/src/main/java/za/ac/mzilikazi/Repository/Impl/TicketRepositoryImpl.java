package za.ac.mzilikazi.Repository.Impl;

import za.ac.mzilikazi.Domain.Ticket;
import za.ac.mzilikazi.Repository.TicketRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asavela on 2017/08/10.
 */
public class TicketRepositoryImpl implements TicketRepository {
    public static TicketRepositoryImpl ticketRepository = null;

    private Map<String, Ticket> ticketMap;

    private TicketRepositoryImpl(){
        ticketMap = new HashMap<String, Ticket>();
    }

    public static TicketRepositoryImpl getInstance()
    {
        if(ticketRepository == null)
            ticketRepository = new TicketRepositoryImpl();
        return ticketRepository;
    }

    public Ticket save (Ticket ticket){
        ticketMap.put(ticket.getTicketingCode(),ticket);
        Ticket saveTicket = ticketMap.get(ticket.getTicketingCode());
        return saveTicket;
    }

    public Ticket findById (String ticketingCode){
        Ticket readTicket = ticketMap.get(ticketingCode);
        return readTicket;
    }

    public Ticket update (Ticket ticket){
        ticketMap.put(ticket.getTicketingCode(),ticket);
        Ticket updateTicket = ticketMap.get(ticket.getTicketingCode());
        return updateTicket;
    }

    public void delete (String ticketingCode){
        ticketMap.remove(ticketingCode);


    }

}
