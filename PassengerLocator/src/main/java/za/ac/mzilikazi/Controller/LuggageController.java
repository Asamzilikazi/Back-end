package za.ac.mzilikazi.Controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.ac.mzilikazi.Domain.Luggage;
import za.ac.mzilikazi.Factory.LuggageFactory;
import za.ac.mzilikazi.Services.Impl.LuggageServiceImpl;

import java.util.Map;

/**
 * Created by Asavela on 2017/08/15.
 */


@Controller
@RequestMapping(path = "/PassangerLocator")
public class LuggageController {

    @Autowired
    private LuggageServiceImpl luggageService;


    @GetMapping(path = "/addLuggage/{luggageNumber")
    public @ResponseBody
    String addLuggage(@PathVariable Map<String, String> values) {
        Luggage luggage = LuggageFactory.getLuggage(values);
        luggageService.save(luggage);
        return new Gson().toJson(luggage);
    }

    @GetMapping(path = "/readLuggage/{luggageNumber}")
    public @ResponseBody
    String readLuggage(@PathVariable String luggageNumber) {
        Luggage luggage = luggageService.findById(luggageNumber);
        return new Gson().toJson(luggage);
    }

    @GetMapping(path = "/updateLuggage/{luggageNumber}")
    public @ResponseBody String updateLuggage(@PathVariable Map<String, String> values, String luggageNumber )
    {
        Luggage luggage = luggageService.findById(luggageNumber);

        if(luggage == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Luggage luggageInsert = LuggageFactory.getLuggage(values);

        luggageService.update(luggageInsert);
        return new Gson().toJson(luggageInsert);
    }

    @GetMapping(path = "deleteLuggage/{luggageNumber}")
    public @ResponseBody void deleteLuggage(@PathVariable String luggageNumber) {
        Luggage luggage = luggageService.findById(luggageNumber);
        if (luggage == null) {
            System.out.println("Record does not exist");
        } else {
            luggageService.delete(luggageNumber);
            System.out.println("Record deleted");
        }
    }
}
