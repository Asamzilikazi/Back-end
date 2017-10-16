package za.ac.mzilikazi.Repository.Impl;

import za.ac.mzilikazi.Domain.FrequentFlyerCard;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asavela on 2017/08/10.
 */
public class FrequentFlyerCardRepositoryImpl {
    public static FrequentFlyerCardRepositoryImpl frequentFlyerCardRepository = null;

    private Map<String, FrequentFlyerCard> frequentFlyerCardMap;

    private FrequentFlyerCardRepositoryImpl(){
        frequentFlyerCardMap = new HashMap<String, FrequentFlyerCard>();
    }

    public static FrequentFlyerCardRepositoryImpl getInstance()
    {
        if(frequentFlyerCardRepository == null)
            frequentFlyerCardRepository = new FrequentFlyerCardRepositoryImpl();
        return frequentFlyerCardRepository;
    }

    public FrequentFlyerCard save (FrequentFlyerCard frequentFlyerCard){
        frequentFlyerCardMap.put(frequentFlyerCard.getFFCNumber(),frequentFlyerCard);
        FrequentFlyerCard saveFrequentFlyerCard = frequentFlyerCardMap.get(frequentFlyerCard.getFFCNumber());
        return saveFrequentFlyerCard;
    }

    public FrequentFlyerCard findById (String FFCNumber){
        FrequentFlyerCard readFrequentFlyerCard = frequentFlyerCardMap.get(FFCNumber);
        return readFrequentFlyerCard;
    }

    public FrequentFlyerCard update (FrequentFlyerCard frequentFlyerCard){
        frequentFlyerCardMap.put(frequentFlyerCard.getFFCNumber(),frequentFlyerCard);
        FrequentFlyerCard updateFrequentFlyerCard = frequentFlyerCardMap.get(frequentFlyerCard.getFFCNumber());
        return updateFrequentFlyerCard;
    }

    public void delete (String FFCNumber){
        frequentFlyerCardMap.remove(FFCNumber);


    }

}
