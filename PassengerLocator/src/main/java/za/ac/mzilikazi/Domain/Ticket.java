package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Ticket implements Serializable {

    @Id
    private String ticketingCode;
    private int number;


    public Ticket()
    {

    }

    public Ticket(Builder builder) {

        this.ticketingCode = builder.ticketingCode;
        this.number = builder.number;


    }
    public static class Builder {

        private String ticketingCode;
        private int number;

        public Builder ticketingCode(String value) {
            this.ticketingCode = value;
            return this;
        }

        public Builder number(int value) {
            this.number = value;
            return this;
        }



        public Ticket build(){

            return new Ticket(this);
        }
    }

    public String getTicketingCode() {
        return ticketingCode;
    }

    public int getNumber() {
        return number;
    }




}
