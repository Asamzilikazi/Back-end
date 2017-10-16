package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Coupon implements Serializable {

    @Id
    private String couponID;
    private Date dateOfRedemption;
    private String flightClass;
    private String standby;
    private String mealCode;

    public Coupon()
    {

    }

    public Coupon(Builder builder) {

        this.couponID = builder.couponID;
        this.dateOfRedemption = builder.dateOfRedemption;
        this.flightClass = builder.flightClass;
        this.standby = builder.standby;
        this.mealCode = builder.mealCode;

    }
    public static class Builder {

        private String couponID;
        private Date dateOfRedemption;
        private String flightClass;
        private String standby;
        private String mealCode;


        public Builder couponID(String value) {
            this.couponID = value;
            return this;
        }

        public Builder dateOfRedemption(Date value) {
            this.dateOfRedemption = value;
            return this;
        }

        public Builder flightClass(String value) {
            this.flightClass = value;
            return this;
        }

        public Builder standby(String value) {
            this.standby = value;
            return this;
        }

        public Builder mealCode(String value) {
            this.mealCode = value;
            return this;
        }

        public Coupon build(){

            return new Coupon(this);
        }
    }

    public String getCouponID() {

        return couponID;
    }

    public Date getDateOfRedemption() {
        return dateOfRedemption;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public String getStandby() {
        return standby;
    }
    public String getMealCode() {
        return mealCode;
    }



}

