package za.ac.mzilikazi.Repository.Impl;

import za.ac.mzilikazi.Domain.Passenger;
import za.ac.mzilikazi.Repository.PassengerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asavela on 2017/08/10.
 */
public class PassengerRepositoryImpl implements PassengerRepository {
    public static PassengerRepositoryImpl passengerRepository = null;

    private Map<String, Passenger> passengerMap;

    private PassengerRepositoryImpl(){
        passengerMap = new HashMap<String, Passenger>();
    }

    public static PassengerRepositoryImpl getInstance()
    {
        if(passengerRepository == null)
            passengerRepository = new PassengerRepositoryImpl();
        return passengerRepository;
    }

    public Passenger save (Passenger passenger){
        passengerMap.put(passenger.getPassengerID(),passenger);
        Passenger savePassenger = passengerMap.get(passenger.getPassengerID());
        return savePassenger;
    }

    public Passenger findById (String passengerID){
        Passenger readPassenger = passengerMap.get(passengerID);
        return readPassenger;
    }

    public Passenger update (Passenger passenger){
        passengerMap.put(passenger.getPassengerID(),passenger);
        Passenger updatePassenger = passengerMap.get(passenger.getPassengerID());
        return updatePassenger;
    }

    public void delete (String passengerID){
        passengerMap.remove(passengerID);


    }

}
