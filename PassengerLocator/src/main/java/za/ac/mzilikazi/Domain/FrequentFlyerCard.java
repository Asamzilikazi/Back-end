package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class FrequentFlyerCard implements Serializable {

    @Id
    private String FFCNumber;
    private String miles;
    private String mealCode;


    public FrequentFlyerCard()
    {

    }

    public FrequentFlyerCard(Builder builder) {

        this.FFCNumber = builder.FFCNumber;
        this.miles = builder.miles;
        this.mealCode = builder.mealCode;

    }
    public static class Builder {

        private String FFCNumber;
        private String miles;
        private String mealCode;

        public Builder FFCNumber(String value) {
            this.FFCNumber = value;
            return this;
        }

        public Builder miles(String value) {
            this.miles = value;
            return this;
        }

        public Builder lastmealCodeName(String value) {
            this.mealCode = value;
            return this;
        }

        public FrequentFlyerCard build(){

            return new FrequentFlyerCard(this);
        }
    }

    public String getFFCNumber() {
        return FFCNumber;
    }

    public String getMiles() {
        return miles;
    }

    public String getMealCode() {
        return mealCode;
    }




}
