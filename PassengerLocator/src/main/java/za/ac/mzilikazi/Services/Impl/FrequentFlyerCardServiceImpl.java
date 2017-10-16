package za.ac.mzilikazi.Services.Impl;

import za.ac.mzilikazi.Domain.FrequentFlyerCard;
import za.ac.mzilikazi.Repository.Impl.FrequentFlyerCardRepositoryImpl;

/**
 * Created by Asavela on 2017/08/10.
 */
public class FrequentFlyerCardServiceImpl {
    public static FrequentFlyerCardServiceImpl frequentFlyerCardService = null;

    FrequentFlyerCardRepositoryImpl frequentFlyerCardRepository = FrequentFlyerCardRepositoryImpl.getInstance();

    public static FrequentFlyerCardServiceImpl getInstance()
    {
        if (frequentFlyerCardService == null)
            frequentFlyerCardService = new FrequentFlyerCardServiceImpl();
        return frequentFlyerCardService;
    }

    public FrequentFlyerCard save(FrequentFlyerCard frequentFlyerCard){
        return frequentFlyerCardRepository.save(frequentFlyerCard);    }

    public FrequentFlyerCard findById(String FFCNumber){
        return frequentFlyerCardRepository.findById(FFCNumber);    }

    public FrequentFlyerCard update(FrequentFlyerCard frequentFlyerCard){
        return frequentFlyerCardRepository.update(frequentFlyerCard);    }

    public void delete(String FFCNumber)
    {
        frequentFlyerCardRepository.delete(FFCNumber);
    }

}
