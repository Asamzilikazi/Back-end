package za.ac.mzilikazi.Repository;

import za.ac.mzilikazi.Domain.Luggage;

/**
 * Created by Asavela on 2017/08/10.
 */
public interface LuggageRepository {
    Luggage save(Luggage luggage);
    Luggage findById (String luggageNumber);
    Luggage update(Luggage luggage);
    void delete(String luggageNumber);

}
