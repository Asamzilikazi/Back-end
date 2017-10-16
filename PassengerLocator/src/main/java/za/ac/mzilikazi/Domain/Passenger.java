package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Passenger implements Serializable {

    @Id
    private String passengerID;
    private String firstName;
    private String lastName;
    private String DOB;
    private String contactNumber;
    private Luggage luggage;
    private Ticket ticket;

    public Passenger()
    {

    }

    public Passenger(Builder builder) {

        this.passengerID = builder.passengerID;
        this.contactNumber = builder.contactNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.DOB = builder.DOB;


    }
    public static class Builder {

        private String passengerID;
        private String contactNumber;
        private String firstName;
        private String lastName;
        private String DOB;
        private Luggage luggage;
        private Ticket ticket;

        public Builder passengerID(String value) {
            this.passengerID = value;
            return this;
        }

        public Builder contactNumber(String value) {
            this.contactNumber = value;
            return this;
        }

        public Builder firstName(String value) {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            this.lastName = value;
            return this;
        }

        public Builder DOB(String value) {
            this.DOB = value;
            return this;
        }

        public Passenger build(){

            return new Passenger(this);
        }
        public Builder luggage(Luggage value) {
            this.luggage = value;
            return this;
        }

        public Builder ticket(Ticket value) {
            this.ticket = value;
            return this;
        }
    }
    public String getPassengerID() {return passengerID;}

    public String getContactNumber() {
        return contactNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public Ticket getTicket() {
        return ticket;
    }


}
