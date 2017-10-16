package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import java.io.Serializable;

public class Seat implements Serializable {

    private int seatNumber;
    private int size;
    private String location;

    public Seat()
    {

    }

    public Seat(Builder builder) {

        this.seatNumber = builder.seatNumber;
        this.size = builder.size;
        this.location = builder.location;


    }
    public static class Builder {

        private int seatNumber;
        private int size;
        private String location;

        public Builder seatNumber(int value) {
            this.seatNumber = value;
            return this;
        }

        public Builder size(int value) {
            this.size = value;
            return this;
        }

        public Builder location(String value) {
            this.location = value;
            return this;
        }

        public Seat build(){

            return new Seat(this);
        }
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }





}
