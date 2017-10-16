package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Luggage implements Serializable {

    @Id
    private String luggageNumber;
    private String weight;


    public Luggage()
    {

    }

    public Luggage(Builder builder) {

        this.luggageNumber = builder.luggageNumber;
        this.weight = builder.weight;

    }
    public static class Builder {

        private String luggageNumber;
        private String weight;

        public Builder luggageNumber(String value) {
            this.luggageNumber = value;
            return this;
        }

        public Builder weight(String value) {
            this.weight = value;
            return this;
        }

        public Luggage build(){

            return new Luggage(this);
        }
    }

    public String getLuggageNumber() {
        return luggageNumber;
    }

    public String getWeight() {
        return weight;
    }





}

