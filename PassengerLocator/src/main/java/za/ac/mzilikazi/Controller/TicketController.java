package za.ac.mzilikazi.Controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.ac.mzilikazi.Domain.Ticket;
import za.ac.mzilikazi.Factory.TicketFactory;
import za.ac.mzilikazi.Services.Impl.TicketServiceImpl;

import java.util.Map;

/**
 * Created by Asavela on 2017/08/15.
 */

@Controller
@RequestMapping(path = "/PassangerLocator")
public class TicketController {
    @Autowired
    private TicketServiceImpl ticketService;

    @GetMapping(path = "/addTicket/{ticketingCode")
    public @ResponseBody
    String addTicket(@PathVariable Map<String, String> values, int number){
        Ticket ticket = TicketFactory.getTicket(values, number);
        ticketService.save(ticket);
        return new Gson().toJson(ticket);
    }

    @GetMapping(path="/readTicket/{ticketingCode}")
    public @ResponseBody String readCoupon(@PathVariable String ticketingCode )
    {
        Ticket ticket = ticketService.findById(ticketingCode);
        return new Gson().toJson(ticket);
    }

    @GetMapping(path = "/updateTicket/{ticketingCode}")
    public @ResponseBody String updatePassenger(@PathVariable Map<String, String> values, int number, String ticketingCode)
    {
        Ticket ticket = ticketService.findById(ticketingCode);

        if(ticket == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Ticket ticketInsert = TicketFactory.getTicket(values,number);

        ticketService.update(ticketInsert);
        return new Gson().toJson(ticketInsert);
    }

    @GetMapping(path = "deleteTicket/{ticketingCode}")
    public @ResponseBody void deleteTicket(@PathVariable String ticketingCode) {
        Ticket ticket = ticketService.findById(ticketingCode);
        if (ticket == null) {
            System.out.println("Record does not exist");
        } else {
            ticketService.delete(ticketingCode);
            System.out.println("Record deleted");
        }
    }
}
