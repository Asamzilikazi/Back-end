package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import java.io.Serializable;

public class FlightNumber implements Serializable {

    private String departureTime;
    private String arrivalTime;
    private String description;
    private String type;
    private String airline;

    public FlightNumber()
    {

    }

    public FlightNumber(Builder builder) {

        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
        this.description = builder.description;
        this.type = builder.type;
        this.airline = builder.airline;

    }
    public static class Builder {

        private String departureTime;
        private String arrivalTime;
        private String description;
        private String type;
        private String airline;

        public Builder departureTime(String value) {
            this.departureTime = value;
            return this;
        }

        public Builder arrivalTime(String value) {
            this.arrivalTime = value;
            return this;
        }

        public Builder description(String value) {
            this.description = value;
            return this;
        }

        public Builder type(String value) {
            this.type = value;
            return this;
        }

        public Builder airline(String value) {
            this.airline = value;
            return this;
        }

        public FlightNumber build(){

            return new FlightNumber(this);
        }
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getAirline() {
        return airline;
    }



}
