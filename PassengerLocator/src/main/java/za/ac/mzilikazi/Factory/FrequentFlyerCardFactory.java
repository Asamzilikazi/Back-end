package za.ac.mzilikazi.Factory;

import za.ac.mzilikazi.Domain.FrequentFlyerCard;

import java.util.Map;

/**
 * Created by Asavela on 2017/08/10.
 */
public class FrequentFlyerCardFactory {
    public static FrequentFlyerCard getFrequentFlyerCard (Map<String, String> values)
    {
        FrequentFlyerCard frequentFlyerCard = new FrequentFlyerCard.Builder()
                .FFCNumber(values.get("FFCNumber"))
                .miles(values.get("miles"))
                .lastmealCodeName(values.get("lastmealCodeName"))
                .build();
        return frequentFlyerCard;
    }
}
