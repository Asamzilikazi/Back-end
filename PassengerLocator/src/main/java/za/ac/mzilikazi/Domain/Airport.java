package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import java.io.Serializable;

public class Airport implements Serializable {

    private String airportName;
    private String location;


    public Airport()
    {

    }

    public Airport(Builder builder) {

        this.airportName = builder.airportName;
        this.location = builder.locaion;



    }
    public static class Builder {

        private String airportName;
        private String locaion;


        public Builder airportName(String value) {
            this.airportName = value;
            return this;
        }

        public Builder locaion(String value) {
            this.locaion = value;
            return this;
        }

        public Airport build(){

            return new Airport(this);
        }
    }

    public String getAirportName() {
        return airportName;
    }

    public String getLocation() {
        return location;
    }



}

