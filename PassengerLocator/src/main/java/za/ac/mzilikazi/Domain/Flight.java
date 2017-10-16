package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable {

    private String boardingTime;
    private Date flightDate;
    private String gate;
    private String checkInCounter;

    public Flight()
    {

    }

    public Flight(Builder builder) {

        this.boardingTime = builder.boardingTime;
        this.flightDate = builder.flightDate;
        this.gate = builder.gate;
        this.checkInCounter = builder.checkInCounter;

    }
    public static class Builder {

        private String boardingTime;
        private Date flightDate;
        private String gate;
        private String checkInCounter;

        public Builder boardingTime(String value) {
            this.boardingTime = value;
            return this;
        }

        public Builder flightDate(Date value) {
            this.flightDate = value;
            return this;
        }

        public Builder gate(String value) {
            this.gate = value;
            return this;
        }

        public Builder checkInCounter(String value) {
            this.checkInCounter = value;
            return this;
        }

        public Flight build(){

            return new Flight(this);
        }
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public String getGate() {
        return gate;
    }

    public String getCheckInCounter() {
        return checkInCounter;
    }



}

