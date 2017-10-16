package za.ac.mzilikazi.Controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.ac.mzilikazi.Domain.FrequentFlyerCard;
import za.ac.mzilikazi.Factory.FrequentFlyerCardFactory;
import za.ac.mzilikazi.Services.Impl.FrequentFlyerCardServiceImpl;

import java.util.Map;

/**
 * Created by Asavela on 2017/08/15.
 */

@Controller
@RequestMapping(path = "/PassangerLocator")
public class FrequentFlyerCardController {
    @Autowired
    private FrequentFlyerCardServiceImpl frequentFlyerCardService;

    @GetMapping(path = "/addFrequentFlyerCard/{FFCNumber")
    public @ResponseBody
    String addFrequentFlyerCard(@PathVariable Map<String, String> values){
        FrequentFlyerCard frequentFlyerCard = FrequentFlyerCardFactory.getFrequentFlyerCard(values);
        frequentFlyerCardService.save(frequentFlyerCard);
        return new Gson().toJson(frequentFlyerCard);
    }

    @GetMapping(path="/readFrequentFlyerCard/{FFCNumber}")
    public @ResponseBody String readFrequentFlyerCard(@PathVariable String FFCNumber )
    {
        FrequentFlyerCard frequentFlyerCard = frequentFlyerCardService.findById(FFCNumber);
        return new Gson().toJson(frequentFlyerCard);
    }

    @GetMapping(path = "/updateFrequentFlyerCard/{FFCNumber}")
    public @ResponseBody String updateFrequentFlyerCard(@PathVariable Map<String, String> values, String FFCNumber)
    {
        FrequentFlyerCard frequentFlyerCard = frequentFlyerCardService.findById(FFCNumber);

        if(frequentFlyerCard == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        FrequentFlyerCard frequentFlyerCardInsert = FrequentFlyerCardFactory.getFrequentFlyerCard(values);

        frequentFlyerCardService.update(frequentFlyerCardInsert);
        return new Gson().toJson(frequentFlyerCardInsert);
    }

    @GetMapping(path = "deleteFrequentFlyerCard/{FFCNumber}")
    public @ResponseBody void deleteFrequentFlyerCard(@PathVariable String FFCNumber) {
        FrequentFlyerCard frequentFlyerCard = frequentFlyerCardService.findById(FFCNumber);
        if (frequentFlyerCard == null) {
            System.out.println("Record does not exist");
        } else {
            frequentFlyerCardService.delete(FFCNumber);
            System.out.println("Record deleted");
        }
    }


}
