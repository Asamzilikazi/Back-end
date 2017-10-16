package za.ac.mzilikazi.Factory;

import za.ac.mzilikazi.Domain.Luggage;

import java.util.Map;

/**
 * Created by Asavela on 2017/08/10.
 */
public class LuggageFactory {
    public static Luggage getLuggage (Map<String, String> values)
    {
        Luggage luggage = new Luggage.Builder()
                .luggageNumber(values.get("luggageNumber"))
                .weight(values.get("weight"))
                .build();
        return luggage;
    }
}
