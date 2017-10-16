package za.ac.mzilikazi.Controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.ac.mzilikazi.Domain.Luggage;
import za.ac.mzilikazi.Domain.Passenger;
import za.ac.mzilikazi.Domain.Ticket;
import za.ac.mzilikazi.Factory.PassengerFactory;
import za.ac.mzilikazi.Services.Impl.PassengerServiceImpl;

import java.util.Map;

/**
 * Created by Asavela on 2017/08/15.
 */

@Controller
@RequestMapping(path = "/PassangerLocator")
public class PassengerController {
    @Autowired
    private PassengerServiceImpl passengerService;

    @GetMapping(path = "/addPassenger/{passengerID")
    public @ResponseBody
    String addPassenger(@PathVariable Map<String, String> values, Luggage luggage, Ticket ticket){
        Passenger passenger = PassengerFactory.getPassenger(values, luggage, ticket);
        passengerService.save(passenger);
        return new Gson().toJson(passenger);
    }

    @GetMapping(path="/readPassenger/{passengerID}")
    public @ResponseBody String readPassenger(@PathVariable String passengerID )
    {
        Passenger passenger = passengerService.findById(passengerID);
        return new Gson().toJson(passenger);
    }

    @GetMapping(path = "/updatePassenger/{passengerID}")
    public @ResponseBody String updatePassenger(@PathVariable Map<String, String> values, Luggage luggage, Ticket ticket, String passengerID)
    {
        Passenger passenger = passengerService.findById(passengerID);

        if(passenger == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Passenger passengerInsert = PassengerFactory.getPassenger(values, luggage,ticket);

        passengerService.update(passengerInsert);
        return new Gson().toJson(passengerInsert);
    }

    @GetMapping(path = "deletePassenger/{passengerID}")
    public @ResponseBody void deletePassenger(@PathVariable String passengerID) {
        Passenger passenger = passengerService.findById(passengerID);
        if (passenger == null) {
            System.out.println("Record does not exist");
        } else {
            passengerService.delete(passengerID);
            System.out.println("Record deleted");
        }
    }

}
